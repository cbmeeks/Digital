/*
 * Copyright (c) 2018 Helmut Neemann
 * Use of this source code is governed by the GPL v3 license
 * that can be found in the LICENSE file.
 */
package de.neemann.digital.fsm;

import junit.framework.TestCase;

import java.util.TreeMap;

public class ValueParserTest extends TestCase {

    public void testValues() throws FiniteStateMachineException {
        TreeMap<String, Integer> v = new ValueParser("A=1").parse();
        assertEquals(1, v.size());
        assertEquals(1, (long) v.get("A"));

        v = new ValueParser("A=1, B=X").parse();
        assertEquals(2, v.size());
        assertEquals(1, (long) v.get("A"));
        assertEquals(2, (long) v.get("B"));
    }


}