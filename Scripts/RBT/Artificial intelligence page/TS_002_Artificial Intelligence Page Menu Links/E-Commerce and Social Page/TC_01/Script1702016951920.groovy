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

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/a_ARTIFICIAL INTELLIGENCE'))

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/Page_Artificial Intelligence Services - Ray_4ca9e5/a_E-Commerce  Social'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/Page_E-Commerce and Social Media Solutions/h2_Integrating the power of Social Media to_7e228c'), 
    'Integrating the power of Social Media to your online business!')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/Page_E-Commerce and Social Media Solutions/img_Integrating the power of Social Media t_567645'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/Page_E-Commerce and Social Media Solutions/img_Integrating the power of Social Media t_567645'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/Page_E-Commerce and Social Media Solutions/a_Enterprise Resource Planning'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/Page_E-Commerce and Social Media Solutions/a_Enterprise Portal  Content Management'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/Page_E-Commerce and Social Media Solutions/a_E-Commerce  Social'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/Page_E-Commerce and Social Media Solutions/a_Customer Relationship Management'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/Page_E-Commerce and Social Media Solutions/div_Integrating the power of Social Media t_ba5e5f'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/Page_E-Commerce and Social Media Solutions/a_Data Science'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/Page_E-Commerce and Social Media Solutions/a_Artificial Intelligence'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/Page_E-Commerce and Social Media Solutions/a_Cloud Services'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/Page_E-Commerce and Social Media Solutions/a_Boomi - EAI'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/Page_E-Commerce and Social Media Solutions/a_Home'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/Page_E-Commerce and Social Media Solutions/a_Solutions'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/Page_E-Commerce and Social Media Solutions/span_E-Commerce  Social'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/Page_E-Commerce and Social Media Solutions/h1_E-Commerce  Social Media'), 
    'E-Commerce & Social Media')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/Page_E-Commerce and Social Media Solutions/p_2 min read'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/Page_E-Commerce and Social Media Solutions/button'))

WebUI.scrollToElement(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/Page_E-Commerce and Social Media Solutions/li_Social Media Application'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/Page_E-Commerce and Social Media Solutions/h3_What we offer'), 
    'What we offer:')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/Page_E-Commerce and Social Media Solutions/a_Magento eCommerce'), 
    'Magento eCommerce')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/Page_E-Commerce and Social Media Solutions/a_OpenCart eCommerce'), 
    'OpenCart eCommerce')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/Page_E-Commerce and Social Media Solutions/a_Social Media Applications'), 
    'Social Media Applications')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/Page_E-Commerce and Social Media Solutions/a_Facebook Applications'), 
    'Facebook Applications')

WebUI.callTestCase(findTestCase('RBT/Artificial intelligence page/TS_002_Artificial Intelligence Page Menu Links/E-Commerce and Social Page/TC_02'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

