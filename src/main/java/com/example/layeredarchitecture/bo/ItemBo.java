package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dao.custom.ItemDAO;
import com.example.layeredarchitecture.dao.custom.impl.ItemDAOImpl;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ItemBo {
    public ArrayList<ItemDTO> getAll() throws SQLException, ClassNotFoundException;

    public boolean add(ItemDTO itemDTO) throws SQLException, ClassNotFoundException;

    public boolean update(ItemDTO itemDTO) throws SQLException, ClassNotFoundException;

    public boolean exist(String code) throws SQLException, ClassNotFoundException;

    public boolean delete(String code) throws SQLException, ClassNotFoundException;

    public String generateNewID() throws SQLException, ClassNotFoundException;

    public ItemDTO search(String code) throws SQLException, ClassNotFoundException;
}
