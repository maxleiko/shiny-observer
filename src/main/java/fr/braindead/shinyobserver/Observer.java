package fr.braindead.shinyobserver;

/**
 * Observer
 * 
 * @author Leiko
 * 
 * @param <T extends Observable>
 */
public interface Observer<T extends Observable> {

	/**
	 * Called when the subject's state changes (which means, when the subject
	 * calls notifyObservers())
	 * 
	 * @param subject the observed subject
	 */
	public void update(T subject);
}
