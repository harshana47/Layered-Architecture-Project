package com.example.layeredarchitecture.bo.impl;

import com.example.layeredarchitecture.bo.CustomerBo;
import com.example.layeredarchitecture.dao.SQLUtil;
import com.example.layeredarchitecture.dao.custom.CustomerDAO;
import com.example.layeredarchitecture.dao.custom.impl.CustomerDAOImpl;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerBoImpl implements CustomerBo {
    CustomerDAO customerBo = new CustomerDAOImpl();

    public ArrayList<CustomerDTO> getAll() throws SQLException, ClassNotFoundException {
        return customerBo.getAll();
    }

    public boolean add(CustomerDTO dto) throws SQLException, ClassNotFoundException {
        return customerBo.add(dto);
    }

    public boolean update(CustomerDTO dto) throws SQLException, ClassNotFoundException {
        return customerBo.update(dto);
    }

    public boolean exist(String id) throws SQLException, ClassNotFoundException {
        return customerBo.exist(id);
    }

    public String generateNewID() throws SQLException, ClassNotFoundException {
        return customerBo.generateNewID();
    }


    public boolean delete(String id) throws SQLException, ClassNotFoundException {
        return customerBo.delete(id);
    }


    public CustomerDTO search(String id) throws SQLException, ClassNotFoundException {
        return customerBo.search(id);
    }

}
