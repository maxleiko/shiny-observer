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
public class ObserverTest {
	
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
	 * Test method for {@link fr.braindead.shinyobserver.Observer#update(java.lang.Object)}.
	 */
	@Test
	public void testUpdate() {
		account.withdraw(2);
		// TODO Mock to know if the call to update has been made or not
	}

}
