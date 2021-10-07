package com.example.samsung.service;

import com.example.samsung.DAO.SamsungDAO;
import com.example.samsung.model.Device;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class SamsungService {

    @Autowired
    SamsungDAO DAO;

    public ArrayList getAllDevices() throws SQLException {
        List<Device> devices = DAO.getAllDevices();
        return (java.util.ArrayList) devices;
    }
}
