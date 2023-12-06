package com.laca.service;

import com.laca.entity.Transporter;
import com.laca.entity.Transport.ConcreteProduct.MotorcycleUnit;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class MotorcycleUnitService {

    private final DataSource dataSource;

    @Autowired
    public MotorcycleUnitService(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Transactional
    public List<MotorcycleUnit> getAllMotorcycleUnits() {
        List<MotorcycleUnit> motorcycleUnits = new ArrayList<>();
        try (Connection connection = dataSource.getConnection()) {
            String query = "SELECT * FROM motorcycles";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                MotorcycleUnit motorcycleUnit = new MotorcycleUnit();
                motorcycleUnit.setMaxMeasureCapacity(resultSet.getDouble("max_measure_capacity"));
                motorcycleUnit.setName(resultSet.getString("name"));
                motorcycleUnit.setPlate(resultSet.getString("plate"));
                motorcycleUnit.setHeight(resultSet.getDouble("height"));
                motorcycleUnit.setWidth(resultSet.getDouble("width"));
                motorcycleUnit.setMaxWeigth(resultSet.getDouble("max_weight"));
                motorcycleUnits.add(motorcycleUnit);
            }
        } catch (SQLException e) {
            // Handle exceptions
            e.printStackTrace();
        }
        return motorcycleUnits;
    }

    @Transactional
    public MotorcycleUnit saveMotorcycleUnit(MotorcycleUnit motorcycleUnit) {
        try (Connection connection = dataSource.getConnection()) {
            String query = "INSERT INTO motorcycles (max_measure_capacity, name, plate, height, width, max_weight) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            statement.setDouble(1, motorcycleUnit.getMaxMeasureCapacity());
            statement.setString(2, motorcycleUnit.getName());
            statement.setString(3, motorcycleUnit.getPlate());
            statement.setDouble(4, motorcycleUnit.getHeight());
            statement.setDouble(5, motorcycleUnit.getWidth());
            statement.setDouble(6, motorcycleUnit.getMaxWeigth());
            int affectedRows = statement.executeUpdate();
            if (affectedRows == 1) {
                ResultSet generatedKeys = statement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    motorcycleUnit.setId(generatedKeys.getLong(1));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error saving new motorcycle unit");
        }
        return motorcycleUnit;
    }

// aqui
    public MotorcycleUnit updateMotorcycleUnit(Long motorcycleUnitId, MotorcycleUnit updatedMotorcycleUnit) {
        return updatedMotorcycleUnit;
    }

    public MotorcycleUnit getMotorcycleUnitById(Long motorcycleUnitId) {

        return null;
    }

    public boolean deleteMotorcycleUnit(Long motorcycleUnitId) {
        return false;
    }
}