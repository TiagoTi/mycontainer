/*
 * Copyright 2008 Whohoo Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable
 * law or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 */

package com.googlecode.mycontainer.test.ejb;

import static org.junit.Assert.assertNotNull;

import javax.naming.InitialContext;

import org.junit.Test;

import com.googlecode.mycontainer.test.MailService;

public class MailServiceBeanTest extends AbstractTestCase {

	@Test
	public void testSession() throws Exception {
		InitialContext ic = new InitialContext();
		MailService service = (MailService) ic.lookup("MailServiceBean/local");
		assertNotNull(service.getSession());
	}

}
