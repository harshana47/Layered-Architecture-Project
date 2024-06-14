package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.CustomerDTO;
import com.example.layeredarchitecture.view.tdm.CustomerTM;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public interface CustomerDAO {

    public ArrayList<CustomerDTO> getAllCustomer() throws SQLException, ClassNotFoundException;

    public void save(String id, String name, String address) throws SQLException, ClassNotFoundException;

    public void update(String id, String name, String address) throws SQLException, ClassNotFoundException;

    public boolean exist(String id) throws SQLException, ClassNotFoundException;

    public void delete(String id) throws SQLException, ClassNotFoundException;


    public String newId() throws SQLException, ClassNotFoundException;

    public CustomerDTO searchCustomer(String newValue) throws SQLException, ClassNotFoundException;
}

