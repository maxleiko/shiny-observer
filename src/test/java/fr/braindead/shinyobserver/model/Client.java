package fr.braindead.shinyobserver.model;

import fr.braindead.shinyobserver.Observer;

public class Client implements Observer<Account> {

	@Override
	public void update(Account subject) {
		System.out.println("Amount: "+subject.getAmount());
	}
}
