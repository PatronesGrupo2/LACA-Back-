package com.laca.service;

import com.laca.bl.entity.Package.classes.Package;
import com.laca.bl.entity.Package.components.PackageSize;
import com.laca.bl.entity.Package.components.PackageWeight;
import com.laca.bl.entity.Package.instanceEnum.PackageType;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class PackageService {

    private final DataSource dataSource;

    @Autowired
    public PackageService(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Transactional
    public List<Package> getAllPackages() {
        List<Package> packages = new ArrayList<>();
        try (Connection connection = dataSource.getConnection()) {
            String query = "SELECT * FROM packages";
            try (PreparedStatement statement = connection.prepareStatement(query);
                 ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Package packageObj = new Package();
                    packageObj.setPackageID(resultSet.getInt("id"));
                    packageObj.setPackageType(PackageType.valueOf(resultSet.getString("packageType")));
                    packageObj.setPackageRecipientsName(resultSet.getString("packageRecipientsName"));
                    packageObj.setPackageDescription(resultSet.getString("packageDescription"));
                    packageObj.setPackagePrice(resultSet.getDouble("packagePrice"));
                    packageObj.setPackageSize((PackageSize) resultSet.getObject("packageSize"));
                    packageObj.setPackageWeight((PackageWeight) resultSet.getObject("packageWeight"));
                    packageObj.setWeightClassification(resultSet.getString("weightClassification"));

                    packages.add(packageObj);
                }
            }
        } catch (SQLException e) {
            // Manejo de excepciones
            e.printStackTrace();
        }
        return packages;
    }

    @Transactional
    public Package savePackage(Package packageObj) {
        try (Connection connection = dataSource.getConnection()) {
            String query = "INSERT INTO packages (packageType, packageRecipientsName, packageDescription, packagePrice, packageSize, packageWeight, weightClassification) VALUES (?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
                statement.setObject(1, packageObj.getPackageType());
                statement.setString(2, packageObj.getPackageRecipientsName());
                statement.setString(3, packageObj.getPackageDescription());
                statement.setDouble(4, packageObj.getPackagePrice());
                statement.setObject(5, packageObj.getPackageSize());
                statement.setObject(6, packageObj.getPackageWeight());
                statement.setString(7, packageObj.getWeightClassification());

                int affectedRows = statement.executeUpdate();
                if (affectedRows == 1) {
                    try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                        if (generatedKeys.next()) {
                            packageObj.setPackageID(generatedKeys.getInt(1));
                        }
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error saving new package", e);
        }
        return packageObj;
    }

    @Transactional
    public Package updatePackage(int packageID, Package updatedPackage) {
        try (Connection connection = dataSource.getConnection()) {
            String query = "UPDATE packages SET packageType = ?, packageRecipientsName = ?, packageDescription = ?, packagePrice = ?, packageSize = ?, packageWeight = ?, weightClassification = ? WHERE id = ?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setObject(1, updatedPackage.getPackageType());
                statement.setString(2, updatedPackage.getPackageRecipientsName());
                statement.setString(3, updatedPackage.getPackageDescription());
                statement.setDouble(4, updatedPackage.getPackagePrice());
                statement.setObject(5, updatedPackage.getPackageSize());
                statement.setObject(6, updatedPackage.getPackageWeight());
                statement.setString(7, updatedPackage.getWeightClassification());
                statement.setInt(8, packageID);

                int affectedRows = statement.executeUpdate();
                if (affectedRows == 0) {
                    throw new RuntimeException("Error updating package: No rows affected.");
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error updating package", e);
        }
        return updatedPackage;
    }

    @Transactional
    public Package getPackageById(int packageId) {
        try (Connection connection = dataSource.getConnection()) {
            String query = "SELECT * FROM packages WHERE id = ?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, packageId);
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        Package packageObj = new Package();
                        packageObj.setPackageID(resultSet.getInt("id"));
                        packageObj.setPackageType(PackageType.valueOf(resultSet.getString("packageType")));
                        packageObj.setPackageRecipientsName(resultSet.getString("packageRecipientsName"));
                        packageObj.setPackageDescription(resultSet.getString("packageDescription"));
                        packageObj.setPackagePrice(resultSet.getDouble("packagePrice"));
                        packageObj.setPackageSize((PackageSize) resultSet.getObject("packageSize"));
                        packageObj.setPackageWeight((PackageWeight) resultSet.getObject("packageWeight"));
                        packageObj.setWeightClassification(resultSet.getString("weightClassification"));
                        return packageObj;
                    } else {
                        throw new RuntimeException("Package not found with ID: " + packageId);
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error retrieving package", e);
        }
    }

    @Transactional
    public Boolean deletePackage(int packageID) {
        try (Connection connection = dataSource.getConnection()) {
            String query = "DELETE FROM packages WHERE id = ?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, packageID);
                int rowsAffected = statement.executeUpdate();
                return rowsAffected > 0;
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error deleting package", e);
        }
    }
}