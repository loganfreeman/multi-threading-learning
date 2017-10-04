package com.czh.multi.lock.innerStatic;

import com.czh.multi.lock.innerStatic.PublicClass.PrivateClass;

public class Run {
	public static void main(String[] args) {
		PublicClass publicClass = new PublicClass();
		publicClass.setUsername("username");
		publicClass.setPassword("password");
		System.out.println(publicClass.getUsername() + "--------------"
				+ publicClass.getPassword());
		PrivateClass privateClass = new PrivateClass();
		privateClass.setAge("ageValue");
		privateClass.setAddress("addressValue");
		System.out.println(privateClass.getAge() + "--------------"
				+ privateClass.getAddress());
	}
}
