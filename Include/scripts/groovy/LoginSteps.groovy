import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

import org.openqa.selenium.WebDriver

import com.kms.katalon.core.webui.driver.DriverFactory

import org.openqa.selenium.By

import org.openqa.selenium.WebElement

import org.openqa.selenium.interactions.Actions

import com.kms.katalon.core.webui.common.WebUiCommonHelper

import org.openqa.selenium.JavascriptExecutor

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class LoginSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */


	/*
	 @Given("User navigates to Login Page")
	 def navigatetologinpagebdd() {
	 println("User navigates to Login Page")
	 }
	 @When("User enters (.*) and (.*)")
	 def entersusernameandpasswordbdd(String username, String password) {
	 println("User enters username and password")
	 println("Username is " + username)
	 println("Password is " + password)
	 }
	 @And("click on login button")
	 def clickonloginbuttonbdd() {
	 println("click on login button")
	 }
	 @Then("User is navigated to the Home Page")
	 def Uuserisnavigatedtothehomepagebdd() {
	 println("User is navigated to the Home Page")
	 }
	 */

	@Given("User is on Facebook Login Page in Bahasa Indonesia")
	def user_is_on_facebook_login_page_in_bahasa_indonesia() {
		println("User navigates to Login Page")
		WebUI.openBrowser('https://id-id.facebook.com/login/web/')
		WebUI.maximizeWindow()
		WebUI.waitForElementPresent(findTestObject('Login/textbox_email'), 120)
		WebUI.waitForElementPresent(findTestObject('Login/textbox_password'), 120)
		WebUI.waitForElementPresent(findTestObject('Login/button_login'), 120)
		WebUI.waitForElementPresent(findTestObject('Login/button_create_new_account'), 120)
	}

	@When("User clicks on Buat akun baru button on Facebook Login Page in Bahasa Indonesia")
	def user_clicks_on_buat_akun_baru_button_on_facebook_login_page_in_bahasa_indonesia() {
		WebUI.click(findTestObject('Login/button_create_new_account'))
	}

	@Then("User is on Facebook Registration Page in Bahasa Indonesia")
	def user_is_on_facebook_registration_page_in_bahasa_indonesia() {
		WebUI.waitForElementPresent(findTestObject('Register/button_sign_up'), 120)
		WebUI.verifyElementPresent(findTestObject('Register/button_sign_up'), 120)
		WebUI.closeBrowser()
	}

	@When("User clicks on Lupa akun button on Facebook Login Page in Bahasa Indonesia")
	def user_clicks_on_lupa_akun_button_on_facebook_login_page_in_bahasa_indonesia() {
		WebUI.click(findTestObject('Login/link_lupa_akun'))
	}

	@Then("User is on Facebook Find Your Account Page in Bahasa Indonesia")
	def user_is_on_facebook_find_your_account_page_in_bahasa_indonesia() {
		WebUI.waitForElementPresent(findTestObject('Find Your Account/header'), 120)
		WebUI.verifyElementPresent(findTestObject('Find Your Account/header'), 120)
		String result = WebUI.getText(findTestObject('Find Your Account/header'))
		println(result)
		assert result == "Find Your Account"
		WebUI.closeBrowser()
	}

	@When("User enter the (.*) and (.*) on Facebook Login Page in Bahasa Indonesia")
	public void user_enter_the_and_on_facebook_login_page_in_bahasa_indonesia(String string, String string2) {
		println("User enters email and password on Facebook Login Page in Bahasa Indonesia")
		println("Email is " + string)
		println("Password is " + string2)
		WebUI.setText(findTestObject('Login/textbox_email'), string)
		WebUI.setText(findTestObject('Login/textbox_password'), string2)
	}

	@When("User click the Log in button on Facebook Login Page in Bahasa Indonesia")
	def user_click_the_log_in_button_on_facebook_login_page_in_bahasa_indonesia() {
		println("User click the Log in button on Facebook Login Page in Bahasa Indonesia")
		WebUI.click(findTestObject('Login/button_login'))
	}

	@Then("pesan (.*) appears on Facebook Login Page in Bahasa Indonesia1")
	def pesan_appears_on_facebook_login_page_in_bahasa_indonesia_then1(String string) {
		println(string)
		WebUI.waitForElementPresent(findTestObject('Login/pesan1'), 120)
		WebUI.verifyElementPresent(findTestObject('Login/pesan1'), 120)
		String result2 = WebUI.getText(findTestObject('Login/pesan1'))
		println(result2)
		assert result2 == "Email atau nomor ponsel yang Anda masukkan tidak terhubung ke akun. Cari akun Anda dan login."
		WebUI.closeBrowser()
	}

	//@Then("pesan (.*) appears on Facebook Login Page in Bahasa Indonesia2")
	//def pesan_appears_on_facebook_login_page_in_bahasa_indonesia_then2(String string) {
	//println(string)
	//*[@id="mount_0_0_yJ"]/div/div[1]/div/div[2]/div/div/div[1]/div[1]/div/div[1]/div/div/div/div/div/div/div[1]/div/h2/span
	//*[@id="mount_0_0_5K"]/div/div[1]/div/div[2]/div/div/div[1]/div[1]/div/div[1]/div/div/div/div/div/div/div[1]/div/h2/span
	//WebUI.waitForElementPresent(findTestObject('Verification/header'), 120)
	//WebUI.verifyElementPresent(findTestObject('Verification/header'), 120)
	//String result2 = WebUI.getText(findTestObject('Verification/header'))
	//println(result2)
	//String url = WebUI.getUrl()
	//println(url)
	//assert result2 == "Masukkan karakter yang Anda lihat"
	//https://id-id.facebook.com/two_step_verification/authentication
	//}
	@Then("User is directed to captcha verification page")
	def pesan_appears_on_facebook_login_page_in_bahasa_indonesia_then2(String string) {
		WebUI.waitForElementPresent(findTestObject('Verification/header'), 120)
		WebUI.verifyElementPresent(findTestObject('Verification/header'), 120)
		String result2 = WebUI.getText(findTestObject('Verification/header'))
		println(result2)
		assert result2 == "Masukkan karakter yang Anda lihat"
		WebUI.closeBrowser()
	}

	@Then("User is successfully logged in on Facebook in Bahasa Indonesia")
	public void user_is_successfully_logged_in_on_facebook_in_bahasa_indonesia() {
		WebUI.waitForElementPresent(findTestObject('Profile/Name'), 120)
		WebUI.verifyElementPresent(findTestObject('Profile/Name'), 120)
		String result2 = WebUI.getText(findTestObject('Profile/Name'))
		println(result2)
		assert result2 == "Jonathan"
		WebUI.closeBrowser()
	}

	//@Given("User is success opening google chrome")
	//public void user_is_success_opening_google_chrome() {
	//WebUI.openBrowser('https://id-id.facebook.com/login/web/')
	//WebUI.openBrowser('http://demoaut.katalon.com/')
	//}

	//@When("User types google chrome")
	//public void user_types_google_chrome() {
	//WebUI.navigateToUrl('https://id-id.facebook.com/login/web/')
	//}

	//@Then("User is successful")
	//public void user_is_successful() {
	//WebUI.closeBrowser()
	//}
}