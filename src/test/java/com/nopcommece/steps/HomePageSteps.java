package com.nopcommece.steps;// **** Created By Harshit Patel ****

import com.nopcommece.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class HomePageSteps {
    @Given("^I am on Home Page$")
    public void iAmOnHomePage() {
    }

    @And("^I click on Computers$")
    public void iClickOnComputers() {
    new HomePage().selectMenu("Computers");
    }

    @Then("^verify if computer tab open$")
    public void verifyIfComputerTabOpen() {
        String expText = "Computers";
        Assert.assertEquals("Not on Computer Page", expText, new HomePage().selectMenu("Computers") );
    }
}
