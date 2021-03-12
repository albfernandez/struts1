/*
 * Copyright 2004 The Apache Software Foundation.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.struts.config;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.apache.struts.mock.TestMockBase;

public class TestCVE20150899 extends TestMockBase {

    /**
     * Defines the testcase name for JUnit.
     *
     * @param theName the testcase's name.
     */
    public TestCVE20150899(String theName) {
        super(theName);
    }


    /**
     * @return a test suite (<code>TestSuite</code>) that includes all methods
     *         starting with "test"
     */
    public static Test suite() {
        // All methods starting with "test" will be executed in the test suite.
        return new TestSuite(TestCVE20150899.class);
    }

    public void setUp() {
        super.setUp();
    }

    public void tearDown() {
        super.tearDown();
    }

    /**
     * Test getter of acceptPage property.
     */
    public void testGetAcceptPage() {
        ActionConfig config = new ActionConfig();
        config.setAcceptPage(new Integer(0));
        Integer acceptPage = config.getAcceptPage();
        assertEquals(new Integer(0), acceptPage);
    }

    /**
     * Test setter of acceptPage property.
     */
    public void testSetAcceptPage() {
        ActionConfig config = new ActionConfig();
        config.setAcceptPage(new Integer(0));
        Integer acceptPage = config.getAcceptPage();
        assertEquals(new Integer(0), acceptPage);
    }

    /**
     * Test a String object representing the value of the ActionConfig object.
     */
    public void testToString() {
        ActionConfig config = new ActionConfig();
        Integer acceptPage = new Integer(0);
        config.setAcceptPage(acceptPage);
        String suffix = "acceptPage=0";
        assertTrue(config.toString().endsWith(suffix));
    }

}