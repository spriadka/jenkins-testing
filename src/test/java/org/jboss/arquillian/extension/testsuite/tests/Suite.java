/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jboss.arquillian.extension.testsuite.tests;

import org.junit.runner.RunWith;

/**
 *
 * @author spriadka
 */

@RunWith(org.junit.runners.Suite.class)
@org.junit.runners.Suite.SuiteClasses({AnotherTest.class,SimpleTest.class})
public class Suite {
    
}
