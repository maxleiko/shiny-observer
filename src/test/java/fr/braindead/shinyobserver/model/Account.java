/**
 * Copyright (C) 2013 leiko <leiko@braindead.fr>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 		http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
