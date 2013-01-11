package fr.braindead.shinyobserver.model;

import fr.braindead.shinyobserver.util.SimpleObservable;

public class Account extends SimpleObservable {

	private int value;
	
	public Account(int value) {
		this.value = value;
	}
	
	public void withdraw(int amount) {
		if (this.value - amount >= 0) {
			this.value -= amount;
			this.notifyObservers();
			
		} else {
			System.out.println("You are poor dude, that sucks we all know :/");
		}
	}
	
	public void put(int amount) {
		this.value += amount;
		this.notifyObservers();
	}
	
	public int getAmount() {
		return this.value;
	}
}
