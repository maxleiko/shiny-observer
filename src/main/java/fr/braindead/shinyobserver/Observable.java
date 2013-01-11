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
package fr.braindead.shinyobserver;

/**
 * Observable (Subject)
 * 
 * @author Leiko
 * 
 */
public interface Observable {

	/**
	 * Calls update(T) on every registered observer
	 */
	public void notifyObservers();

	/**
	 * Adds an observer to be called when this observable object will call
	 * notifyObservers()
	 * 
	 * @param o Observer<T> to add
	 */
	public void addObserver(Observer<? extends Observable> o);

	/**
	 * Removes the given observer from this observable object observers list
	 * 
	 * @param o Observer<T> to remove
	 */
	public void removeObserver(Observer<? extends Observable> o);
}
