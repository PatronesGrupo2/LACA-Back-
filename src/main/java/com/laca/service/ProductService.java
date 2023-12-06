package com.laca.service;
import com.laca.bl.entity.Product;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService{

    private final DataSource dataSource;

    public ProductService(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Transactional
    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();
        try (Connection connection = dataSource.getConnection()) {
            String query = "SELECT * FROM products";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Product product = new Product();
                product.setId(resultSet.getInt("id"));
                product.setName(resultSet.getString("name"));
                product.setDescription(resultSet.getString("description"));
                products.add(product);
            }
        } catch (SQLException e) {
            // Manejo de excepciones
        }
        return products;
    }

    @Transactional
    public Product saveProduct(Product product) {
        try (Connection connection = dataSource.getConnection()) {
            String query = "INSERT INTO products (name, description) VALUES (?, ?)";
            PreparedStatement statement = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            statement.setString(1, product.getName());
            statement.setString(2, product.getDescription());
            int affectedRows = statement.executeUpdate();
            if (affectedRows == 1) {
                ResultSet generatedKeys = statement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    product.setId(generatedKeys.getInt(1));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error saving new product");
        }
        return product;
    }

    @Transactional
    public Product updateProduct(int productId, Product updatedProduct) {
        try (Connection connection = dataSource.getConnection()) {
            String storedProcedureCall = "{call update_product(?, ?, ?)}";
            CallableStatement statement = connection.prepareCall(storedProcedureCall);

            statement.setInt(1, productId);
            statement.setString(2, updatedProduct.getName());
            statement.setString(3, updatedProduct.getDescription());

            boolean hasResults = statement.execute();

            if (!hasResults) {
                throw new RuntimeException("Error updating product: No results from the stored procedure.");
            }

            ResultSet resultSet = statement.getResultSet();

            if (resultSet.next()) {
                int updatedId = resultSet.getInt("id");
                String updatedName = resultSet.getString("name");
                String updatedDescription = resultSet.getString("description");

                // Crea un nuevo Product con los datos actualizados y devuélvelo
                updatedProduct.setId(updatedId);
                updatedProduct.setName(updatedName);
                updatedProduct.setDescription(updatedDescription);

                return updatedProduct;
            } else {
                throw new RuntimeException("Product not found by ID");
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error updating product: " + e.getMessage(), e);
        }
    }

    @Transactional
    public Product getProductById(int productId) {
        try (Connection connection = dataSource.getConnection()) {
            String query = "SELECT id, name, description FROM products WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, productId);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                Product product = new Product();
                product.setId(resultSet.getInt("id"));
                product.setName(resultSet.getString("name"));
                product.setDescription(resultSet.getString("description"));
                return product;
            } else {
                throw new RuntimeException("Product not found with ID: " + productId);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error retrieving product: " + e.getMessage(), e);
        }
    }

    @Transactional
    public Boolean deleteProduct(int productId) {
        try (Connection connection = dataSource.getConnection()) {
            String query = "DELETE FROM products where products.id  = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, productId);
            int rowsAffected = statement.executeUpdate();

            if (rowsAffected == 0) {
                return false;
            }

            return true;

        } catch (SQLException e) {
            throw new RuntimeException("Error deleting product: " + e.getMessage(), e);
        }
    }
}