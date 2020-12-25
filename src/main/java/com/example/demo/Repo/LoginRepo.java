package com.example.demo.Repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.Login;

public interface LoginRepo extends CrudRepository<Login, String> {

	List<Login> findByEmail(String email);
}
