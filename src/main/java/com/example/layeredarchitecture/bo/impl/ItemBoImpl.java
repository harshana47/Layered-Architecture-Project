package com.example.layeredarchitecture.bo.impl;

import com.example.layeredarchitecture.bo.ItemBo;
import com.example.layeredarchitecture.dao.SQLUtil;
import com.example.layeredarchitecture.dao.custom.ItemDAO;
import com.example.layeredarchitecture.dao.custom.impl.ItemDAOImpl;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ItemBoImpl implements ItemBo {
    ItemDAO itemBo = new ItemDAOImpl();

    public ArrayList<ItemDTO> getAll() throws SQLException, ClassNotFoundException {
        return itemBo.getAll();
    }

    public boolean add(ItemDTO itemDTO) throws SQLException, ClassNotFoundException {
        return itemBo.add(itemDTO);
    }

    public boolean update(ItemDTO itemDTO) throws SQLException, ClassNotFoundException {
        return itemBo.update(itemDTO);
    }

    public boolean exist(String code) throws SQLException, ClassNotFoundException {
        return itemBo.exist(code);
    }

    public boolean delete(String code) throws SQLException, ClassNotFoundException {
        return itemBo.delete(code);
    }

    public String generateNewID() throws SQLException, ClassNotFoundException {
        return itemBo.generateNewID();
    }

    public ItemDTO search(String code) throws SQLException, ClassNotFoundException {
        return itemBo.search(code);
    }
}
