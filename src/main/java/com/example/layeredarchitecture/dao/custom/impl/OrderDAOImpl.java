package com.example.layeredarchitecture.dao.custom.impl;

import com.example.layeredarchitecture.dao.SQLUtil;
import com.example.layeredarchitecture.dao.custom.OrderDAO;

import java.sql.*;
import java.time.LocalDate;

public class OrderDAOImpl implements OrderDAO {

    public String generateNewOrderIds() throws SQLException, ClassNotFoundException {
//        Connection connection = DBConnection.getDbConnection().getConnection();
//        Statement stm = connection.createStatement();
        ResultSet rst = SQLUtil.execute("SELECT oid FROM Orders ORDER BY oid DESC LIMIT 1;");

        return rst.next() ? String.format("OID-%03d", (Integer.parseInt(rst.getString("oid").replace("OID-", "")) + 1)) : "OID-001";
    }


    public boolean isOrderExist(Connection connection,String orderId) throws SQLException, ClassNotFoundException {
//        Connection connection = DBConnection.getDbConnection().getConnection();
//        PreparedStatement stm = connection.prepareStatement("SELECT oid FROM Orders WHERE oid=?");
//        stm.setString(1, orderId);
        try (ResultSet rs = SQLUtil.execute("SELECT oid FROM Orders WHERE oid=?",orderId)) {
            connection.setAutoCommit(false);
            return rs.next();
        }
    }


    public boolean saveOrder(String orderId, LocalDate orderDate, String customerId) throws SQLException, ClassNotFoundException {
//        Connection connection = DBConnection.getDbConnection().getConnection();
//        PreparedStatement stm = connection.prepareStatement("INSERT INTO Orders (oid, date, customerID) VALUES (?,?,?)");
//        stm.setString(1, orderId);
//        stm.setDate(2, Date.valueOf(orderDate));
//        stm.setString(3, customerId);
//        return stm.executeUpdate() == 1;
        return SQLUtil.execute("INSERT INTO Orders (oid, date, customerID) VALUES (?,?,?)",orderId,orderDate,customerId);
    }
}

