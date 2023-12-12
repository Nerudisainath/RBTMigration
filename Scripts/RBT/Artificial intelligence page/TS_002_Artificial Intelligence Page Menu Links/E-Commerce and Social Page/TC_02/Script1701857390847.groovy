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

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/a_ARTIFICIAL INTELLIGENCE'))

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_E-Commerce  Social'))

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/a_Home'), 
    FailureHandling.CONTINUE_ON_FAILURE)

HomePageTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(HomePageTitle, 'AI, Dynamics 365 ERP & CRM, Kentico, Sitecore, Dell Boomi-RBT')

WebUI.back()

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/a_Solutions'), 
    FailureHandling.CONTINUE_ON_FAILURE)

SolutionsTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(SolutionsTitle, 'Technology & IT Solutions - Ray Business Technologies')

WebUI.back()

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/span_E-Commerce  Social'), 
    'E-Commerce & Social')

WebUI.scrollToElement(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/h3_What we offer'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/a_Magento eCommerce'))

MagentoeCommerceTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(MagentoeCommerceTitle, 'Magento Development Services - Ray Business Technologies')

WebUI.back()

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/a_OpenCart eCommerce'))

OpenCartTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(OpenCartTitle, 'OpenCart eCommerce for Powerful and Robust Online store')

WebUI.back()

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/a_Social Media Applications'))

SocialMediaTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(SocialMediaTitle, 'Social Media Applications Management by Raybiztech')

WebUI.back()

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/a_Facebook Applications'))

FacebookApplicationTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(FacebookApplicationTitle, 'Expertise Facebook Applications by Ray Business Technologies')

WebUI.back()

WebUI.closeBrowser()

