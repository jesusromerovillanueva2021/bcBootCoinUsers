package com.example.bcBootCoinUsers.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.example.bcBootCoinUsers.entity.BootCoinUser;

public interface BootCoinUserRepository extends ReactiveCrudRepository<BootCoinUser, Integer>{

}
