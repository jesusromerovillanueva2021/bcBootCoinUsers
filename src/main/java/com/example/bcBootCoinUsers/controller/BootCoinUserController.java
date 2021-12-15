package com.example.bcBootCoinUsers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bcBootCoinUsers.dto.BootCoinUserDto;
import com.example.bcBootCoinUsers.service.BootCoinUserService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/bootcoinusers")
public class BootCoinUserController {
	@Autowired
	private BootCoinUserService service;
	
	@GetMapping
	Flux<BootCoinUserDto> getBootCoinUsers(){
		return service.getBootCoinUsers();
	}
	
	@GetMapping("/{id}")
	Mono<BootCoinUserDto> getBootCoinUser(@PathVariable int id){
		return service.getBootCoinUser(id);
	}
	
	@PostMapping
	Mono<BootCoinUserDto> saveBootCoinUser(@RequestBody Mono<BootCoinUserDto> bootCoinUserDtoMono){
		return service.saveBootCoinUser(bootCoinUserDtoMono);
	}
	
	@PutMapping("/update/{id}")
	Mono<BootCoinUserDto> updateBootCoinUser(@RequestBody Mono<BootCoinUserDto> bootCoinUserDtoMono, @PathVariable int id){
		return service.updateBootCoinUser(bootCoinUserDtoMono, id);
	}
	
	@DeleteMapping("/delete/{id}")
	Mono<Void> deleteBootCoinUser(@PathVariable int id){
		return service.deleteBootCoinUser(id);
	}
	
}
