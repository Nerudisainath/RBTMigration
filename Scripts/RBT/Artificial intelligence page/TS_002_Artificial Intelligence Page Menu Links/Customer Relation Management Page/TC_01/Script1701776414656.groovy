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

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects/Page_Customer Relationship Management  CRM _12588b/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/a_ARTIFICIAL INTELLIGENCE'))

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects/Page_Customer Relationship Management  CRM _12588b/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Customer Relationship Management'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects/Page_Customer Relationship Management  CRM _12588b/Page_Customer Relationship Management  CRM _12588b/h2_Engage your leads and clients in the mos_a28ec6'), 
    'Engage your leads and clients in the most efficient and cost-effective way and get ahead in the competition')

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/AI inner page objects/Page_Customer Relationship Management  CRM _12588b/Page_Customer Relationship Management  CRM _12588b/img_Plot No. 204, Block B, Kavuri Hills, Ma_da7fab'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects/Page_Customer Relationship Management  CRM _12588b/Page_Customer Relationship Management  CRM _12588b/a_Enterprise Resource Planning'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects/Page_Customer Relationship Management  CRM _12588b/Page_Customer Relationship Management  CRM _12588b/a_Enterprise Portal  Content Management'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects/Page_Customer Relationship Management  CRM _12588b/Page_Customer Relationship Management  CRM _12588b/a_E-Commerce  Social'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects/Page_Customer Relationship Management  CRM _12588b/Page_Customer Relationship Management  CRM _12588b/a_Customer Relationship Management'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects/Page_Customer Relationship Management  CRM _12588b/Page_Customer Relationship Management  CRM _12588b/button'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects/Page_Customer Relationship Management  CRM _12588b/Page_Customer Relationship Management  CRM _12588b/a_Data Science'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects/Page_Customer Relationship Management  CRM _12588b/Page_Customer Relationship Management  CRM _12588b/a_Artificial Intelligence'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects/Page_Customer Relationship Management  CRM _12588b/Page_Customer Relationship Management  CRM _12588b/a_Cloud Services'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects/Page_Customer Relationship Management  CRM _12588b/Page_Customer Relationship Management  CRM _12588b/a_Boomi - EAI'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects/Page_Customer Relationship Management  CRM _12588b/Page_Customer Relationship Management  CRM _12588b/button'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects/Page_Customer Relationship Management  CRM _12588b/Page_Customer Relationship Management  CRM _12588b/a_Home'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects/Page_Customer Relationship Management  CRM _12588b/Page_Customer Relationship Management  CRM _12588b/a_Solutions'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects/Page_Customer Relationship Management  CRM _12588b/Page_Customer Relationship Management  CRM _12588b/span_Customer Relationship Management'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects/Page_Customer Relationship Management  CRM _12588b/Page_Customer Relationship Management  CRM _12588b/h1_Customer Relationship Management'), 
    'Customer Relationship Management')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects/Page_Customer Relationship Management  CRM _12588b/Page_Customer Relationship Management  CRM _12588b/p_2 min read'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/AI inner page objects/Page_Customer Relationship Management  CRM _12588b/Page_Customer Relationship Management  CRM _12588b/img_Customer Relationship Management_img-re_8635d0'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects/Page_Customer Relationship Management  CRM _12588b/Page_Customer Relationship Management  CRM _12588b/h3_What we offer'), 
    'What we offer:')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects/Page_Customer Relationship Management  CRM _12588b/Page_Customer Relationship Management  CRM _12588b/a_Microsoft Dynamics CRM'), 
    'Microsoft Dynamics CRM')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects/Page_Customer Relationship Management  CRM _12588b/Page_Customer Relationship Management  CRM _12588b/a_Bpmonline CRM Development'), 
    'Bpm\'online CRM Development')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects/Page_Customer Relationship Management  CRM _12588b/Page_Customer Relationship Management  CRM _12588b/a_Gigya Customer Identity Management'), 
    'Gigya Customer Identity Management')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects/Page_Customer Relationship Management  CRM _12588b/Page_Customer Relationship Management  CRM _12588b/a_vTiger CRM Solutions'), 
    'vTiger CRM Solutions')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects/Page_Customer Relationship Management  CRM _12588b/Page_Customer Relationship Management  CRM _12588b/a_Customer Retention Management'), 
    'Customer Retention Management')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects/Page_Customer Relationship Management  CRM _12588b/Page_Customer Relationship Management  CRM _12588b/a_Lead Management'), 
    'Lead Management')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects/Page_Customer Relationship Management  CRM _12588b/Page_Customer Relationship Management  CRM _12588b/a_Marketing Resource Management'), 
    'Marketing Resource Management')

WebUI.callTestCase(findTestCase('RBT/Artificial intelligence page/TS_002_Artificial Intelligence Page Menu Links/Customer Relation Management Page/TC_02'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

