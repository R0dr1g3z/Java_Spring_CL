package com.example.beans3;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class FileCustomerLogger implements CustomerLogger {

    @Override
    public void log() {
        try (FileWriter fileWriter = new FileWriter("log.txt", true)){
            fileWriter.append(LocalDateTime.now() + ": User log\n");
        } catch (IOException e){}
    }
    
}
