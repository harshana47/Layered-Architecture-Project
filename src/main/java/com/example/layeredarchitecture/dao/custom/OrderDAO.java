package com.example.layeredarchitecture.dao.custom;

import com.example.layeredarchitecture.model.ItemDTO;
import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public  interface OrderDAO {
    public String generateNewOrderIds() throws SQLException, ClassNotFoundException;

    public boolean isOrderExist(Connection connection,String orderId) throws SQLException, ClassNotFoundException;
    public boolean saveOrder( String orderId, LocalDate orderDate, String customerId) throws SQLException, ClassNotFoundException;
}