package com.example.apple.DAO;

import com.example.apple.model.Device;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class AppleDAO {

    public List<Device> getAllDevices() throws SQLException {

        List<Device> devices = new ArrayList<>();

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/store", "YOUR_DB_USERNAME", "YOUR_DB_PASSWORD");

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM apple");

        while (resultSet.next()) {
            devices.add(new Device(resultSet.getString("name"), resultSet.getString("type")));
        }

        return devices;
    }
}
