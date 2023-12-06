package com.laca.service;

import com.laca.bl.entity.Routes.ConcretePrototype.ArrivalPoint;
import com.laca.bl.entity.Routes.ConcretePrototype.Route;
import com.laca.bl.entity.Routes.ConcretePrototype.StartPoint;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class RouteService {

    private final DataSource dataSource;

    public RouteService(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Transactional
    public List<Route> getAllRoutes() {
        List<Route> routes = new ArrayList<>();
        try (Connection connection = dataSource.getConnection()) {
            String query = "SELECT * FROM route";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Route route = new Route();
                route.setId(resultSet.getInt("routeID"));
                route.setType(resultSet.getString("routeType"));
                route.setName(resultSet.getString("routeName"));
                route.setDescription(resultSet.getString("routeDescription"));
                route.setStartPoint((StartPoint) resultSet.getObject("startPointID"));
                route.setArrivalPoint((ArrivalPoint) resultSet.getObject("arrivalPointID"));
                routes.add(route);
            }
        } catch (SQLException e) {
            // Manejo de excepciones
        }
        return routes;
    }

    @Transactional
    public Route saveRoute(Route routes) {
        try (Connection connection = dataSource.getConnection()) {
            String query = "INSERT INTO route (routeID, routeType, routeName, routeDescription," +
                    ", startPointID, arrivalPointID) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            statement.setInt(1, routes.getId());
            statement.setString(2, routes.getType());
            statement.setString(3, routes.getName());
            statement.setString(4, routes.getDescription());
            statement.setObject(5, routes.getStartPoint());
            statement.setObject(6, routes.getArrivalPoint());
            int affectedRows = statement.executeUpdate();
            if (affectedRows == 1) {
                ResultSet generatedKeys = statement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    routes.setId(generatedKeys.getInt(1));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error saving new route");
        }
        return routes;
    }

    @Transactional
    public Route updateRoute(int routeId, Route updatedRoute) {
        try (Connection connection = dataSource.getConnection()) {
            String storedProcedureCall = "{call update_route(?, ?, ?, ?, ?, ?)}";
            CallableStatement statement = connection.prepareCall(storedProcedureCall);

            statement.setInt(1, routeId);
            statement.setString(2, updatedRoute.getType());
            statement.setString(3, updatedRoute.getName());
            statement.setString(4, updatedRoute.getDescription());
            statement.setObject(5, updatedRoute.getStartPoint());
            statement.setObject(6, updatedRoute.getArrivalPoint());

            boolean hasResults = statement.execute();

            if (!hasResults) {
                throw new RuntimeException("Error updating route: No results from the stored procedure.");
            }

            ResultSet resultSet = statement.getResultSet();

            if (resultSet.next()) {
                int updatedId = resultSet.getInt("routeID");
                String updatedType = resultSet.getString("routeType");
                String updatedName = resultSet.getString("routeName");
                String updatedDescription = resultSet.getString("routeDescription");
                Object updatedStartPoint = resultSet.getObject("startPointID");
                Object updatedArrivalPoint = resultSet.getObject("arrivalPointID");

                // Crea un nuevo Transporter con los datos actualizados y devuélvelo
                updatedRoute.setId( updatedId);
                updatedRoute.setType(updatedType);
                updatedRoute.setName(updatedName);
                updatedRoute.setDescription(updatedDescription);
                updatedRoute.setStartPoint((StartPoint) updatedStartPoint);
                updatedRoute.setArrivalPoint((ArrivalPoint) updatedArrivalPoint);

                return updatedRoute;
            } else {
                throw new RuntimeException("Route not found by ID");
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error updating route: " + e.getMessage(), e);
        }
    }

    @Transactional
    public Route getRouteById(int routeID) {
        try (Connection connection = dataSource.getConnection()) {
            String query = "SELECT routeID, routeType, routeName, routeDescription, startPoint, arrivalPoint FROM transporters WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setLong(1, routeID);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                Route route = new Route();
                route.setId(resultSet.getInt("routeID"));
                route.setType(resultSet.getString("routeType"));
                route.setName(resultSet.getString("routeName"));
                route.setDescription(resultSet.getString("routeDescription"));
                route.setStartPoint((StartPoint) resultSet.getObject("startPointID"));
                route.setArrivalPoint((ArrivalPoint) resultSet.getObject("arrivalPointID"));

                return route;
            } else {
                throw new RuntimeException("Route not found with ID: " + routeID);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error retrieving route: " + e.getMessage(), e);
        }
    }


    @Transactional
    public Boolean deleteRoute(int routeID) {
        try (Connection connection = dataSource.getConnection()) {
            String query = "DELETE FROM route where routeID  = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, routeID);
            int rowsAffected = statement.executeUpdate();

            if (rowsAffected == 0) {
                return false;
            }

            return true;

        } catch (SQLException e) {
            throw new RuntimeException("Error deleting route: " + e.getMessage(), e);
        }
    }

}