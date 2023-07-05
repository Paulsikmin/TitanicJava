package com.kh.day08.oop.interfacepkg.zoo;

public class Bear extends Animal implements FoodInterface{
	@Override
	public String animalFood() {
		return "salmon";
	}

	@Override
	public String makeSound() {
		// TODO Auto-generated method stub
		return null;
	}
}
