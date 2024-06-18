package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dao.custom.OrderDAO;
import com.example.layeredarchitecture.dao.custom.impl.OrderDAOImpl;
import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface OrderBo {
    public ArrayList<OrderDTO> getAll() throws SQLException, ClassNotFoundException;

    public boolean update(OrderDTO dto) throws SQLException, ClassNotFoundException;

    public boolean exist(String id) throws SQLException, ClassNotFoundException;

    public String generateNewID() throws SQLException, ClassNotFoundException;

    public boolean delete(String id) throws SQLException, ClassNotFoundException;

    public OrderDTO search(String id) throws SQLException, ClassNotFoundException;

    public boolean add(OrderDTO dto) throws SQLException, ClassNotFoundException;
}
