package com.example.apple.service;

import com.example.apple.DAO.AppleDAO;
import com.example.apple.model.Device;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class AppleService {

    @Autowired
    AppleDAO DAO;

    public ArrayList getAllDevices() throws SQLException {
        List<Device> devices = DAO.getAllDevices();
        return (ArrayList) devices;
    }
}
