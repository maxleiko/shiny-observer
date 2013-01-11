package fr.braindead.shinyobserver.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import fr.braindead.shinyobserver.Observable;
import fr.braindead.shinyobserver.Observer;

/**
 * Observable Helper class<br/>
 * Convenient abstract Observable class that handles every basic operation of
 * the Observable interface.<br/>
 * 
 * 
 * 
 * @author Leiko
 * 
 */
public abstract class SimpleObservable implements Observable {

	@SuppressWarnings("rawtypes")
	public Set<Observer> observers;

	@SuppressWarnings("rawtypes")
	public SimpleObservable() {
		this.observers = new HashSet<Observer>();
	}

	@SuppressWarnings("unchecked")
	@Override
	public void notifyObservers() {
		@SuppressWarnings("rawtypes")
		Iterator<Observer> it = observers.iterator();
		while (it.hasNext())
			it.next().update(this);
	}

	@Override
	public void addObserver(Observer<? extends Observable> o) {
		this.observers.add(o);
	}

	@Override
	public void removeObserver(Observer<? extends Observable> o) {
		this.observers.remove(o);
	}
}
