package com.example.demo.Repo;

import org.springframework.data.repository.CrudRepository;


import com.example.demo.models.Orderr;

public interface OrderRepo extends CrudRepository<Orderr, Integer> {

}
