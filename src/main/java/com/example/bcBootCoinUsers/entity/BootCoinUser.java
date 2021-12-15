package com.example.bcBootCoinUsers.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.example.bcBootCoinUsers.dto.BootCoinUserDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("bootcoinuser")
public class BootCoinUser {
	@Id
	private int id;
	private String name;
	private int idAccount;
	private int idYanquiUser;
}
