package com.epam.service;

import com.epam.repository.RepositoryClass2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceClass2 {
    @Autowired
    RepositoryClass2 repositoryClass2;

    public String getSevice() {
        return repositoryClass2.getData();
    }
}
