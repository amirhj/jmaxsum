/*
 *  Copyright (C) 2011 Michele Roncalli <roncallim at gmail dot com>
 * 
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 * 
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 * 
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package messages;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michele Roncalli <roncallim at gmail dot com>
 */
public class MessageListTest {

    MessageList instance;
    Object c1,c2;
    Message value;


    public MessageListTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
        c1 = 1;
        c2 = 2;
        Double[] array = {new Double(1),new Double(2)};
        value = new MessageArrayDouble(null, null, array);
        instance = new MessageList();
        instance.setValue(c1, c2, value);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of setValue method, of class MessageList.
     */
    @Test
    public void testSetValue() {
        System.out.println("setValue");
        instance = new MessageList();
        Double[] array = {new Double(2),new Double(2)};
        value = new MessageArrayDouble(null, null, array);
        instance.setValue(2, 2, value);
    }

    /**
     * Test of getValue method, of class MessageList.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        
        Double[] array = {new Double(2),new Double(2)};
        Message expResult = new MessageArrayDouble(null, null, array);
        Message result = instance.getValue(1,2);
        assertEquals(true, result.equals(expResult));

    }

    /**
     * Test of containsKey method, of class MessageList.
     */
    @Test
    public void testContainsKey() {

        boolean expResult = false;
        boolean result = instance.containsKey(1, 2);
        assertEquals(expResult, result);

    }

}