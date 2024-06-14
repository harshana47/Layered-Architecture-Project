package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.CustomerDTO;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PlaceOrderDAOImpl {
    public ArrayList<CustomerDTO> getAllCustomerIds() throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getDbConnection().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("SELECT * FROM Customer");

        ArrayList<CustomerDTO> allCustomers = new ArrayList<CustomerDTO>();
        while (rst.next()){
            CustomerDTO customerDTO = new CustomerDTO
            (rst.getString("id"),
                rst.getString("name"),
                rst.getString("address"));
            allCustomers.add(customerDTO);
        }
        return allCustomers;
    }
}
