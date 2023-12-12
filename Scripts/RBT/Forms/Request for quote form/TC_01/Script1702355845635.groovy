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

WebUI.navigateToUrl('https://demo19xperience13.raybiztech.com/')

WebUI.scrollToElement(findTestObject('Object Repository/Forms/Request for quote form/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/h3_Request for Quote'), 
    0)

WebUI.click(findTestObject('Object Repository/Forms/Request for quote form/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/input_Message_btn_Submit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Forms/Request for quote form/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/span_Please enter name'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Forms/Request for quote form/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/span_Please enter valid Email'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Forms/Request for quote form/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/span_Please enter Phone Number'), 
    0)

WebUI.takeAreaScreenshot(RFQ_ERROR_MESSAGE_IMG)

WebUI.closeBrowser()

