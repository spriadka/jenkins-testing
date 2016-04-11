/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jboss.arquillian.extension.testsuite.tests;

import java.util.concurrent.TimeUnit;
import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.graphene.Graphene;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author spriadka
 */

@RunWith(Arquillian.class)
public class AnotherTest {
    
    @Drone
    private WebDriver browser;
    
    @FindBy(name = "q")
    private WebElement searchInput;
   
    @Test
    @RunAsClient
    public void testGoogleAndTypeSomething() {
        String toWrite = "Ahojdy";
        browser.get("http://www.google.com");
        searchInput.sendKeys(toWrite);
    }
    
    @Test
    @RunAsClient
    public void testSeznamAndTypeSomething(){
        browser.get("http://www.seznam.cz");
        searchInput = browser.findElement(By.name("q"));
        searchInput.sendKeys("baab");
        
    }
    
    
    
}
