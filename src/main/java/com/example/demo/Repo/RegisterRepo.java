package com.example.demo.Repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.Register;

public interface RegisterRepo extends CrudRepository<Register,String > {

}
