/**
 * 
 */
package fr.braindead.shinyobserver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fr.braindead.shinyobserver.model.Account;
import fr.braindead.shinyobserver.model.Client;

/**
 * @author Leiko
 *
 */
public class ObservableTest {
	
	private static final int DEFAULT_ACCOUNT_VALUE = 42;
	
	private Client client;
	private Account account;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		client = new Client();
		account = new Account(DEFAULT_ACCOUNT_VALUE);
		
		account.addObserver(client);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {}

	/**
	 * Test method for {@link fr.braindead.shinyobserver.Observable#notifyObservers()}.
	 */
	@Test
	public void testNotifyObservers() {
		
	}

	/**
	 * Test method for {@link fr.braindead.shinyobserver.Observable#addObserver(fr.braindead.shinyobserver.Observer)}.
	 */
	@Test
	public void testAddObserver() {
		
	}

	/**
	 * Test method for {@link fr.braindead.shinyobserver.Observable#removeObserver(fr.braindead.shinyobserver.Observer)}.
	 */
	@Test
	public void testRemoveObserver() {
		
	}

}
