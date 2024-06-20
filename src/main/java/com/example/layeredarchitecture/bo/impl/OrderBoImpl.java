package com.example.layeredarchitecture.bo.impl;

import com.example.layeredarchitecture.bo.OrderBo;
import com.example.layeredarchitecture.dao.SQLUtil;
import com.example.layeredarchitecture.dao.custom.OrderDAO;
import com.example.layeredarchitecture.dao.custom.impl.OrderDAOImpl;
import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

public class OrderBoImpl implements OrderBo {
    OrderDAO orderBo = new OrderDAOImpl();

    public ArrayList<OrderDTO> getAll() throws SQLException, ClassNotFoundException {
        return null;
    }

    public boolean update(OrderDTO dto) throws SQLException, ClassNotFoundException {
        return false;
    }

    public boolean exist(String id) throws SQLException, ClassNotFoundException {
        return orderBo.exist(id);
    }

    public String generateNewID() throws SQLException, ClassNotFoundException {
        return orderBo.generateNewID();
    }

    public boolean delete(String id) throws SQLException, ClassNotFoundException {
        return false;
    }

    public OrderDTO search(String id) throws SQLException, ClassNotFoundException {
        return null;
    }

    public boolean add(OrderDTO dto) throws SQLException, ClassNotFoundException {
        return orderBo.add(dto);
    }
}
