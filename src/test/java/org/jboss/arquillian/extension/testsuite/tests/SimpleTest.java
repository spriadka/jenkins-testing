/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jboss.arquillian.extension.testsuite.tests;

import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.graphene.Graphene;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author spriadka
 */

@RunWith(Arquillian.class)
public class SimpleTest {
    
    @Drone
    private WebDriver browser;
    
    @FindBy(name = "q")
    private WebElement searchInput;
    
    @Test
    public void simpleTest(){
        String toWrite = "images are my hobby";
        browser.get("http://google.sk");
        Graphene.waitModel().until().element(searchInput).is().visible();
        searchInput.sendKeys(toWrite);
        
    }
    
}
