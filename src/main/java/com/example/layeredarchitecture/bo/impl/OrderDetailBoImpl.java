package com.example.layeredarchitecture.bo.impl;

import com.example.layeredarchitecture.bo.OrderDetailBo;
import com.example.layeredarchitecture.dao.custom.OrderDAO;
import com.example.layeredarchitecture.dao.custom.OrderDetailsDAO;
import com.example.layeredarchitecture.dao.custom.impl.OrderDetailsDAOImpl;
import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class OrderDetailBoImpl implements OrderDetailBo {

    OrderDetailsDAO orderDetailBo = new OrderDetailsDAOImpl();

    public boolean add(OrderDetailDTO detail) throws SQLException, ClassNotFoundException{
        return orderDetailBo.add(detail);
    }

    public ArrayList<OrderDetailDTO> getAll() throws SQLException, ClassNotFoundException {
        return null;
    }

    public boolean update(OrderDetailDTO dto) throws SQLException, ClassNotFoundException {
        return false;
    }

    public boolean exist(String id) throws SQLException, ClassNotFoundException {
        return false;
    }

    public String generateNewID() throws SQLException, ClassNotFoundException {
        return null;
    }

    public boolean delete(String id) throws SQLException, ClassNotFoundException {
        return false;
    }

    public OrderDetailDTO search(String id) throws SQLException, ClassNotFoundException {
        return null;
    }
}
