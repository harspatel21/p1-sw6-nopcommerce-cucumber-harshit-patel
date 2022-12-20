package com.nopcommece.steps;

import com.nopcommece.pages.ElectronicsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ElectronicsPageTest {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I hover mouse on Electronics and Cell Phone and click$")
    public void iHoverMouseOnElectronicsAndCellPhoneAndClick() {
        new ElectronicsPage().clickOnElectronicsMenuAndCellPhone();
    }

    @Then("^I am on cell phone page$")
    public void iAmOnCellPhonePage() throws InterruptedException {
        String expectedText = "Cell phones";
        Assert.assertEquals("User is not on cell phone page", expectedText, new ElectronicsPage().getCellPhoneText());
    }


    @And("^I click on list view tab$")
    public void iClickOnListViewTab() {
        new ElectronicsPage().clickOnListTab();
    }


    @And("^I click on product Nokia Lumia link$")
    public void iClickOnProductNokiaLumiaLink() throws InterruptedException {
        new ElectronicsPage().clickOnNokiaLumia1020();

    }

    @And("^I am on \"([^\"]*)\" product page$")
    public void iAmOnProductPage(String text) {
        Assert.assertEquals("User has not selected right product", text, new ElectronicsPage().getNokiaLumiaText());

    }

    @And("^I verify the price is \"([^\"]*)\"$")
    public void iVerifyThePriceIs(String price) {
        Assert.assertEquals("User has not selected right product", price, new ElectronicsPage().getPriceForNokiaLumia());
    }


    @And("^I changed quantity to \"([^\"]*)\"$")
    public void iChangedQuantityTo(String qty) {
        new ElectronicsPage().updateQuantityTo2();

    }

    @And("^I click on add to cart button$")
    public void iClickOnAddToCartButton() {
        new ElectronicsPage().setAddToCart();
    }

    @And("^I verified the message \"([^\"]*)\" on top green bar$")
    public void iVerifiedTheMessageOnTopGreenBar(String message) {
        Assert.assertEquals("Quantity not added to cart", message, new ElectronicsPage().getAddedToCartMessage());

    }

    @And("^I close the green bar by clicking on the cross button$")
    public void iCloseTheGreenBarByClickingOnTheCrossButton() {
        new ElectronicsPage().closePopUpMessage();
    }

    @And("^I hover mouse on Shopping cart and click on GO TO CART$")
    public void iHoverMouseOnShoppingCartAndClickOnGOTOCART() {
        new ElectronicsPage().clickOnGoToCart();
    }

    @And("^I am on shopping cart page$")
    public void iAmOnShoppingCartPage() {
        String expText = "Shopping cart";
        Assert.assertEquals("User is not on shopping cart", expText, new ElectronicsPage().shoppingCartMessage());
    }

    @And("^I verified the quantity is \"([^\"]*)\"$")
    public void iVerifiedTheQuantityIs(String qty) {
        Assert.assertEquals("Quantity is not as expected", qty, new ElectronicsPage().updateQuantityMessage());
    }

    @And("^I verifeid the Total is \"([^\"]*)\"$")
    public void iVerifeidTheTotalIs(String total) {
        Assert.assertEquals("Total is not correct", total, new ElectronicsPage().verifyTotal());

    }

    @And("^I click on check box I agree with the terms of service$")
    public void iClickOnCheckBoxIAgreeWithTheTermsOfService() {
        new ElectronicsPage().clickOnCheckBox();
    }

    @And("^I click on checkout$")
    public void iClickOnCheckout() {
        new ElectronicsPage().setClickOnCheckoutBox();
    }

    @And("^I verified text \"([^\"]*)\"$")
    public void iVerifiedText(String text) {
        Assert.assertEquals("User is not on checkout page", text, new ElectronicsPage().verifyWelcomeText());
    }

    @And("^I click on Register button$")
    public void iClickOnRegisterButton() {
        new ElectronicsPage().clickOnRegisterLink();
    }

    @And("^I am on Register page$")
    public void iAmOnRegisterPage() {
        String expText = "Register";
        Assert.assertEquals("User is not on register page", expText, new ElectronicsPage().verifyRegisterText());
    }

    @And("^I select gender Male$")
    public void iSelectGenderMale() {
        new ElectronicsPage().selectRadioButton("selecting male", By.xpath("//label[@for='gender-male']"));
    }

    @And("^I enter First Name \"([^\"]*)\"$")
    public void iEnterFirstName(String name) {
        new ElectronicsPage().fillingMandatoryFields("Sending name", name, By.id("FirstName"));
    }

    @And("^I enter Last Name \"([^\"]*)\"$")
    public void iEnterLastName(String surname) {
        new ElectronicsPage().fillingMandatoryFields("Sending surname", surname, By.id("LastName"));

    }

    @And("^I select Date of Birth \"([^\"]*)\"$")
    public void iSelectDateOfBirth(String day) {
        new ElectronicsPage().selectByDropDown("Selecting Birth Date", By.name("DateOfBirthDay"), day);
    }

    @And("^I select Birth month \"([^\"]*)\"$")
    public void iSelectBirthMonth(String month) {
        new ElectronicsPage().selectByDropDown("Selecting Birth Month", By.name("DateOfBirthMonth"), month);
    }

    @And("^I select Birth year \"([^\"]*)\"$")
    public void iSelectBirthYear(String year) {
        new ElectronicsPage().selectByDropDown("Selecting Birth Year", By.name("DateOfBirthYear"), year);
    }

    @And("^I enter email$")
    public void iEnterEmail() {
        new ElectronicsPage().randomEmailGeneratorAndSendText(By.id("Email"), "naresh", "kanodia");
    }

    @And("^I enter Password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        new ElectronicsPage().passAndConfirmPass(By.id("Password"), password);

    }

    @And("^I confirm Password \"([^\"]*)\"$")
    public void iConfirmPassword(String confirmPass) {
        new ElectronicsPage().passAndConfirmPass(By.id("ConfirmPassword"), confirmPass);

    }

    @And("^I click on register button on register page$")
    public void iClickOnRegisterButtonOnRegisterPage() {
        new ElectronicsPage().selectPressButton("pressing register button", By.id("register-button"));
    }

    @And("^I Registered Successfully and verified$")
    public void iRegisteredSuccessfullyAndVerified() {
        String expText = "Your registration completed";
        new ElectronicsPage().assertAssert("Registration unsucessful", expText,
                new ElectronicsPage().actualTextToVerify(By.xpath("//div[@class='result' and text()='Your registration completed']")));
    }

    @And("^I click on continue tab$")
    public void iClickOnContinueTab() {
        new ElectronicsPage().selectPressButton("Click on CONTINUE tab", By.xpath("//a[contains(@class, 'continue-button')]"));
    }

    @And("^I verify the text Shopping cart$")
    public void iVerifyTheTextShoppingCart() {
        String expText = "Shopping cart";
        new ElectronicsPage().assertAssert("Verify the text Shopping card", expText,
                new ElectronicsPage().actualTextToVerify(By.xpath("//h1[text()='Shopping cart']")));
    }

//    @And("^I click on checkbox I agree with the terms of service$")
//    public void iClickOnCheckboxIAgreeWithTheTermsOfService2() {
//        new ElectronicsPage().selectCheckBox("click on checkbox I agree with the terms of service", By.id("termsofservice"));
//    }

//    @And("^I Click on CHECKOUT$")
//    public void iClickOnCHECKOUT1() {
//        new ElectronicsPage().selectPressButton("Click on CHECKOUT", By.id("checkout"));
//    }

    @And("^I Fill the Mandatory fields$")
    public void iFillTheMandatoryFields() {

    }

    @And("^I select billing country \"([^\"]*)\"$")
    public void iSelectBillingCountry(String billCountry) {
        new ElectronicsPage().selectByDropDown("Selecting Country", By.id("BillingNewAddress_CountryId"), billCountry);
    }

    @And("^I enter city \"([^\"]*)\"$")
    public void iEnterCity(String billCity) {
        new ElectronicsPage().fillingMandatoryFields("Entering city", billCity, By.id("BillingNewAddress_City"));
    }

    @And("^I enter address \"([^\"]*)\"$")
    public void iEnterAddress(String add1) {
        new ElectronicsPage().fillingMandatoryFields("Entering Address1", add1, By.id("BillingNewAddress_Address1"));
    }

    @And("^I enter postal code \"([^\"]*)\"$")
    public void iEnterPostalCode(String zip) {
        new ElectronicsPage().fillingMandatoryFields("Entering Zip Code", zip, By.id("BillingNewAddress_ZipPostalCode"));
    }

    @And("^I enter phone number \"([^\"]*)\"$")
    public void iEnterPhoneNumber(String phone) {
        new ElectronicsPage().fillingMandatoryFields("Entering Phone number", phone, By.id("BillingNewAddress_PhoneNumber"));
    }

    @And("^I click on Continue after phone$")
    public void iClickOnContinueAfterPhone() {

        new ElectronicsPage().selectPressButton("Click on CONTINUE", By.name("save"));
    }

    @And("^I click on Radio Button “(\\d+)nd Day Air \\(\\$(\\d+)\\.(\\d+)\\)”$")
    public void iClickOnRadioButtonNdDayAir$() {
        new ElectronicsPage().selectRadioButton("Click on Radio Button 2nd Day Air ($0.00)", By.id("shippingoption_2"));
    }

    @And("^I click on Continue after shipping$")
    public void iClickOnContinueAfterShipping() {
        new ElectronicsPage().selectPressButton("Click on CONTINUE", By.xpath("//button[@onclick='ShippingMethod.save()']"));
    }

    @And("^I select Radio Button “Credit Card”$")
    public void iSelectRadioButtonCreditCard() {
        new ElectronicsPage().selectRadioButton("Select Radio Button Credit Card", By.id("paymentmethod_1"));
    }

    @And("^I click continue after selecting payment method$")
    public void iClickContinueAfterSelectingPaymentMethod() {
        new ElectronicsPage().selectPressButton("click save", By.xpath("//button[@onclick='PaymentMethod.save()']"));
    }

    @And("^I select “Visa” From Select credit card dropdown$")
    public void iSelectVisaFromSelectCreditCardDropdown() {
        new ElectronicsPage().selectByDropDown("Select Visa From select credit card dropdown", By.id("CreditCardType"), "Visa");
    }

    @And("^I enter card holder name \"([^\"]*)\"$")
    public void iEnterCardHolderName(String name){
        new ElectronicsPage().fillingMandatoryFields("Enter card holder name", "Prime Testing", By.id("CardholderName"));

    }

    @And("^I enter credit card number \"([^\"]*)\"$")
    public void iEnterCreditCardNumber(String cardNo){
        new ElectronicsPage().fillingMandatoryFields("Enter card number", cardNo, By.id("CardNumber"));

    }

    @And("^I enter month of expiry \"([^\"]*)\"$")
    public void iEnterMonthOfExpiry(String expMth){
       new ElectronicsPage().selectByDropDown("Select expiry month", By.id("ExpireMonth"), expMth);

    }

    @And("^I enter year of expiry \"([^\"]*)\"$")
    public void iEnterYearOfExpiry(String expYr){
        new ElectronicsPage().selectByDropDown("Select expiry year", By.id("ExpireYear"), expYr);

    }

    @And("^I enter card code \"([^\"]*)\"$")
    public void iEnterCardCode(String ccCode){
        new ElectronicsPage().fillingMandatoryFields("Entering Credit Card Code", ccCode, By.id("CardCode"));

    }

    @And("^I click on payment continue button$")
    public void iClickOnPaymentContinueButton() {

        new ElectronicsPage().selectPressButton("Click Continue", By.id("payment-info-buttons-container"));
    }

    @And("^I am verifying payment method and is credit card$")
    public void iAmVerifyingPaymentMethodAndIsCreditCard() {

        new ElectronicsPage().assertAssert("Verify Payment Method is Credit Card", "Credit Card",
                new ElectronicsPage().actualTextToVerify(By.xpath("//span[contains(text(), 'Credit Card')]")));
    }

    @And("^I am verifying shipping method and is (\\d+)nd day air$")
    public void iAmVerifyingShippingMethodAndIsNdDayAir(int arg0) {

        new ElectronicsPage().assertAssert("Verify Shipping Method is 2nd Day Air", "2nd Day Air",
                new ElectronicsPage().actualTextToVerify(By.xpath("//span[contains(text(), '2nd Day Air')]")));
    }

    @And("^I am verifying final total \"([^\"]*)\"$")
    public void iAmVerifyingFinalTotal(String total){
        new ElectronicsPage().assertAssert("Verify Total is $698.00", total,
                new ElectronicsPage().actualTextToVerify(By.xpath("(//strong[text()='$698.00'])[2]")));

    }

    @And("^I am pressing confirm save button$")
    public void iAmPressingConfirmSaveButton() {
        new ElectronicsPage().selectPressButton("Click continue", By.xpath("//button[@onclick='ConfirmOrder.save()']"));
    }

    @And("^I am verifying message \"([^\"]*)\"$")
    public void iAmVerifyingMessage(String message){
        new ElectronicsPage().assertAssert("Verify the Text Thank You", message,
                new ElectronicsPage().actualTextToVerify(By.xpath("//h1[text()='Thank you']")));

    }

    @And("^I verify the order is successfull$")
    public void iVerifyTheOrderIsSuccessfull() {

        String message = "Your order has been successfully processed!";
        new ElectronicsPage().assertAssert("Verify the message Your order has been successfully processed!", message,
                new ElectronicsPage().actualTextToVerify(By.xpath("//strong[contains(text(), 'fully processed!')]")));
    }

    @And("^I press continue button at the end$")
    public void iPressContinueButtonAtTheEnd() {

        new ElectronicsPage().selectPressButton("Click continue", By.xpath("//button[@onclick='setLocation(\"/\")']"));
    }

    @And("^I am on welcome page again$")
    public void iAmOnWelcomePageAgain() {
        String message = "Welcome to our store";
        new ElectronicsPage().assertAssert("Verify the text Welcome to our store", message,
                new ElectronicsPage().actualTextToVerify(By.xpath("//h2[text()='Welcome to our store']")));

    }

    @And("^I press log out link$")
    public void iPressLogOutLink() {
        new ElectronicsPage().selectPressButton("Click on Logout link", By.linkText("Log out"));
    }

    @Then("^I verified URL$")
    public void iVerifiedURL() {

        new ElectronicsPage().verifyCurrentURL("https://demo.nopcommerce.com/");
    }

}
