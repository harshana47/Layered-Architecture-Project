package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public interface OrderDetailDAO {
    public String generateNextOrderID() throws SQLException, ClassNotFoundException;
}