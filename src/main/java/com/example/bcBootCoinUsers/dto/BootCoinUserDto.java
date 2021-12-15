package com.example.bcBootCoinUsers.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BootCoinUserDto {
	private int id;
	private String name;
	private int idAccount;
	private int idYanquiUser;
}
