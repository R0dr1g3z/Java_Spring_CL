package com.example.beans3;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;

public class DbCustomerRepository implements CustomerRepository {
    @Autowired
    private DbCustomerLogger logger;

    @Override
    public void createCustomer(Customer customer) {
        String QUERY = "INSERT INTO customers (firstName, lastName) VALUES (?,?)";
        try (PreparedStatement ps = DbUtil.connect().prepareStatement(QUERY)) {
            ps.setString(1, customer.getFirstnName());
            ps.setString(2, customer.getLastName());
            ps.executeUpdate();
            logger.log();
        } catch (SQLException e) {
        }
    }

    @Override
    public void delCustomer(Customer customer) {
        String QUERY = "DELETE FROM customers WHERE id=?";
        try (PreparedStatement ps = DbUtil.connect().prepareStatement(QUERY)) {
            ps.setInt(1, customer.getId());
            ps.executeUpdate();
            logger.log();
        } catch (SQLException e) {
        }
    }

    @Override
    public void findCustomers() {
        String QUERY = "SELECT * FROM customers";
        try (PreparedStatement ps = DbUtil.connect().prepareStatement(QUERY)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String firstName = rs.getString("firstName");
                String lastName = rs.getString("lastName");
                System.out.println(String.format("Firstname: %s Lastname: %s", firstName, lastName));
            }
            logger.log();
        } catch (SQLException e) {
        }
    }

}
