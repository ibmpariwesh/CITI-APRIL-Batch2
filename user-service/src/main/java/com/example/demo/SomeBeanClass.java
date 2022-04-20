package com.example.demo;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("qa")
public class SomeBeanClass {
	public SomeBeanClass() {
		System.out.println("##########  init");
	}
}
