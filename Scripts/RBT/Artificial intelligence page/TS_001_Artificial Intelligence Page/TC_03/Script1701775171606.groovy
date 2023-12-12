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

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.click(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/a_ARTIFICIAL INTELLIGENCE'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Enterprise Resource Planning'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Enterprise Resource Planning'))

ERPtitle = WebUI.getWindowTitle()

WebUI.verifyEqual(ERPtitle, 'ERP Services | Dynamics AX, NAV Solutions')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Enterprise Portal  Content Management'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Enterprise Portal  Content Management'))

EPCMtitle = WebUI.getWindowTitle()

WebUI.verifyEqual(EPCMtitle, 'Enterprise Portal and Content Management - RBT')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_E-Commerce  Social'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_E-Commerce  Social'))

ECStitle = WebUI.getWindowTitle()

WebUI.verifyEqual(ECStitle, 'E-Commerce and Social Media Solutions')

WebUI.delay(4)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Customer Relationship Management'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Customer Relationship Management'))

CRMtitle = WebUI.getWindowTitle()

WebUI.verifyEqual(CRMtitle, 'Customer Relationship Management | CRM Services | Sales CRM')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/div_Technology  People  Process_hamburger'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Data Science'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Data Science'))

DataScienceTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(DataScienceTitle, 'Data Science and Advanced Analytics - Raybiztech')

WebUI.click(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/div_Technology  People  Process_hamburger'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Artificial Intelligence'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Artificial Intelligence'))

AItitle = WebUI.getWindowTitle()

WebUI.verifyEqual(AItitle, 'Artificial Intelligence Services - Ray Business Technologies')

WebUI.click(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/div_Technology  People  Process_hamburger'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Cloud Services'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Cloud Services'))

CloudServicesTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(CloudServicesTitle, 'Cloud Application Development | Cloud Services')

