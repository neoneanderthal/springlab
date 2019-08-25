package com.example.demo;

public class SoundAlarm implements Alarm {

	@Override
	public void activate() {
		System.out.println("SoundAlarm Activated");

	}

	@Override
	public void deactivate() {
		System.out.println("SoundAlarm De-Activated");

	}

}
