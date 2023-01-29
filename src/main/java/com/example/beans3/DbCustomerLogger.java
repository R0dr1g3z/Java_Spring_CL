package com.example.beans3;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class DbCustomerLogger implements CustomerLogger{

    @Override
    public void log() {
        try (PreparedStatement preparedStatement = DbUtil.connect().prepareStatement("INSERT INTO log (log) VALUES (?)")){
            preparedStatement.setString(1, LocalDateTime.now() + ": User log");
            preparedStatement.executeUpdate();
        } catch (SQLException e){}
    }
    
}
