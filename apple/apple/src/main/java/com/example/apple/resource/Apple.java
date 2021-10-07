package com.example.apple.resource;

import com.example.apple.model.Device;
import com.example.apple.model.Devices;
import com.example.apple.service.AppleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;
import java.util.List;

@RestController
@RequestMapping("/apple")
public class Apple {

    @Autowired
    AppleService service;

    @RequestMapping("/devices")
    public Devices getDevices() throws SQLException {

        List<Device> devices;
        devices = service.getAllDevices();

        Devices devicesList = new Devices(devices);
        return devicesList;
    }
}
