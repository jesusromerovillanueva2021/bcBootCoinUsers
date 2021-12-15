package com.example.bcBootCoinUsers.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.bcBootCoinUsers.dto.BootCoinUserDto;
import com.example.bcBootCoinUsers.repository.BootCoinUserRepository;
import com.example.bcBootCoinUsers.utils.AppUtils;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BootCoinUserService {
	@Autowired
	private BootCoinUserRepository repository;
	
	public Flux<BootCoinUserDto> getBootCoinUsers(){
		return repository.findAll()
				.map(AppUtils::entityToDto);
	}
	
	public Mono<BootCoinUserDto> getBootCoinUser(int id){
		return repository.findById(id)
				.map(AppUtils::entityToDto);
	}
	
	public Mono<BootCoinUserDto> saveBootCoinUser(@RequestBody Mono<BootCoinUserDto> bootCoinUserDtoMono) {
		return bootCoinUserDtoMono.map(AppUtils::dtoToEntity)
				.flatMap(repository::save)
				.map(AppUtils::entityToDto);
	}
	
	public Mono<BootCoinUserDto> updateBootCoinUser(@RequestBody Mono<BootCoinUserDto> bootCoinUserDtoMono, int id) {
		return repository.findById(id)
				.flatMap(b->bootCoinUserDtoMono.map(AppUtils::dtoToEntity)
						.doOnNext(e->e.setId(id)))
				.flatMap(repository::save)
				.map(AppUtils::entityToDto);
	}
	
	public Mono<Void> deleteBootCoinUser(int id){
		return repository.deleteById(id);
	}
}
