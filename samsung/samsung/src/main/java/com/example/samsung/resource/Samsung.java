package com.example.samsung.resource;

import com.example.samsung.model.Device;
import com.example.samsung.model.Devices;
import com.example.samsung.service.SamsungService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/samsung")
public class Samsung {

    @Autowired
    SamsungService service;

    @RequestMapping("/devices")
    public Devices getDevices() throws SQLException {

        List<Device> devices;
        devices = service.getAllDevices();

        Devices devicesList = new Devices(devices);
        return devicesList;
    }
}
