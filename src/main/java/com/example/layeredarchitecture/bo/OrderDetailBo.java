package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dao.custom.OrderDetailsDAO;
import com.example.layeredarchitecture.dao.custom.impl.OrderDetailsDAOImpl;
import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface OrderDetailBo {
    public boolean add(OrderDetailDTO detail) throws SQLException, ClassNotFoundException;

    public ArrayList<OrderDetailDTO> getAll() throws SQLException, ClassNotFoundException;

    public boolean update(OrderDetailDTO dto) throws SQLException, ClassNotFoundException;

    public boolean exist(String id) throws SQLException, ClassNotFoundException;

    public String generateNewID() throws SQLException, ClassNotFoundException;

    public boolean delete(String id) throws SQLException, ClassNotFoundException;

    public OrderDetailDTO search(String id) throws SQLException, ClassNotFoundException;
}
