package com.laba.solvd.db.dao.Interfaces;

import com.laba.solvd.db.model.Credential;
import com.laba.solvd.db.model.Employee;

import java.util.List;

public interface IDAOCredential {
    void create(Credential credential);

    List<Credential> getAll();
}
