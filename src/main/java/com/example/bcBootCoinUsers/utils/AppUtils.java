package com.example.bcBootCoinUsers.utils;

import org.springframework.beans.BeanUtils;

import com.example.bcBootCoinUsers.dto.BootCoinUserDto;
import com.example.bcBootCoinUsers.entity.BootCoinUser;

import ch.qos.logback.core.joran.util.beans.BeanUtil;

public class AppUtils {
	public static BootCoinUserDto entityToDto(BootCoinUser bootCoinUser) {
		BootCoinUserDto bootCoinUserDto=new BootCoinUserDto();
		BeanUtils.copyProperties(bootCoinUser, bootCoinUserDto);
		return bootCoinUserDto;
	}
	
	public static BootCoinUser dtoToEntity(BootCoinUserDto bootCoinUserDto) {
		BootCoinUser bootCoinUser=new BootCoinUser();
		BeanUtils.copyProperties(bootCoinUserDto, bootCoinUser);
		return bootCoinUser;
	}
}
