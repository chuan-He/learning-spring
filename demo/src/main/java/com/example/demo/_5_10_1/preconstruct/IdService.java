package com.example.demo._5_10_1.preconstruct;

import org.springframework.stereotype.Service;

@Service
public class IdService {

	private int count;

	public int generateId() {
		return ++count;
	}
}
