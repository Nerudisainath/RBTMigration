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

WebUI.navigateToUrl('https://demo3xperience13.raybiztech.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Manual Objects/Visual tetsing/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/button_ARTIFICIAL INTELLIGENCE_js_main-menu-icon'))

WebUI.click(findTestObject('Object Repository/Manual Objects/Visual tetsing/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/a_RESOURCES(current)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Manual Objects/Visual tetsing/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/div_SOLUTIONS(current)                     _b681cf'), 
    0)

WebUI.takeElementScreenshotAsCheckpoint('Visualdemoimg', findTestObject('Manual Objects/img object'))

WebUI.verifyImagePresent(findTestObject(null))

WebUI.closeBrowser()

