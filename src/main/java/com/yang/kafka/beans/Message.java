package com.yang.kafka.beans;

import java.util.Date;

import lombok.Data;

@Data
public class Message {
	private Long id;
	
	private String msg;
	
	private Date sendTime;
}
