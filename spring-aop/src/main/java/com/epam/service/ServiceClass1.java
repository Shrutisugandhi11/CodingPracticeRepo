package com.epam.service;

import com.epam.repository.RepositoryClass1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class ServiceClass1 {
    @Autowired
    RepositoryClass1 repositoryClass1;

    public String getSevice() {
        return repositoryClass1.getData();
    }
}
