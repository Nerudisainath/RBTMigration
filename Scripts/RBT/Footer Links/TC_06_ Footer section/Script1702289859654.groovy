import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.maximizeWindow()

WebUI.scrollToElement(findTestObject('Object Repository/RBT/Footer page objects/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/h3_Request for Quote'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/a_ABOUT US'), 
    0)

ABOUTUS = WebUI.getText(findTestObject('Object Repository/RBT/Footer page objects/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/a_ABOUT US'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyEqual(ABOUTUS, 'ABOUT US')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/a_SOLUTIONS'), 
    0)

SOLUTIONS = WebUI.getText(findTestObject('Object Repository/RBT/Footer page objects/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/a_SOLUTIONS'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyEqual(SOLUTIONS, 'SOLUTIONS')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/a_RESOURCES'), 
    0)

RESOURCES = WebUI.getText(findTestObject('Object Repository/RBT/Footer page objects/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/a_RESOURCES'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyEqual(RESOURCES, 'RESOURCES')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/a_NEWS  EVENTS'), 
    0)

NEWSANDEVENTS = WebUI.getText(findTestObject('Object Repository/RBT/Footer page objects/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/a_NEWS  EVENTS'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyEqual(NEWSANDEVENTS, 'NEWS & EVENTS')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/a_PRIVACY POLICY'), 
    0)

PRIVACYPOLICY = WebUI.getText(findTestObject('Object Repository/RBT/Footer page objects/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/a_PRIVACY POLICY'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyEqual(PRIVACYPOLICY, 'PRIVACY POLICY')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/a_TERMS OF USE'), 
    0)

TERMSOFUSE = WebUI.getText(findTestObject('Object Repository/RBT/Footer page objects/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/a_TERMS OF USE'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyEqual(TERMSOFUSE, 'TERMS OF USE')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/a_CAREERS'), 
    0)

CAREERS = WebUI.getText(findTestObject('Object Repository/RBT/Footer page objects/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/a_CAREERS'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyEqual(CAREERS, 'CAREERS')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/a_Contact Us'), 
    0)

CONTACTUS = WebUI.getText(findTestObject('Object Repository/RBT/Footer page objects/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/a_Contact Us'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyEqual(CONTACTUS, 'CONTACT US')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/h6_Quick Contact'), 
    0)

QUICKCONTACT = WebUI.getText(findTestObject('Object Repository/RBT/Footer page objects/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/h6_Quick Contact'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyEqual(QUICKCONTACT, 'QUICK CONTACT')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/a_salesraybiztech.com'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/a_1 650 670 7605'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/h6_Social Media'), 
    0)

SOCIALMEDIA = WebUI.getText(findTestObject('Object Repository/RBT/Footer page objects/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/h6_Social Media'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyEqual(SOCIALMEDIA, 'SOCIAL MEDIA')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/a'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/a_1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/a_1_2'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/i_Social Media_fab fa-youtube'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/i_Social Media_fab fa-instagram'), 
    0)

WebUI.callTestCase(findTestCase('RBT/Footer Links/TC_01_ About us page'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('RBT/Footer Links/TC_04_Solutions page'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('RBT/Footer Links/TC_03_ Resource page'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('RBT/Footer Links/TC_02_ Privacy Policy page'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('RBT/Footer Links/TC_05_ Terms of use page'), [:], FailureHandling.CONTINUE_ON_FAILURE)

