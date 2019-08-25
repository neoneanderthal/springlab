package com.example.demo;

public class VisualAlarm implements Alarm {

	@Override
	public void activate() {
		System.out.println("VisualAlarm Activated");

	}

	@Override
	public void deactivate() {
		System.out.println("VisualAlarm DeActivated");

	}

}
