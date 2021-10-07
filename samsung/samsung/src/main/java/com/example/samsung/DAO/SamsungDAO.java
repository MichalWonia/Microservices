package com.example.samsung.DAO;

import com.example.samsung.model.Device;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class SamsungDAO {

    public List<Device> getAllDevices() throws SQLException {

        List<Device> devices = new ArrayList<>();

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/store", "YOUR_DB_USERNAME", "YOUR_DB_PASSWORD");

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM samsung");

        while (resultSet.next()) {
            devices.add(new Device(resultSet.getString("name"), resultSet.getString("type")));
        }
        return devices;
    }
}
