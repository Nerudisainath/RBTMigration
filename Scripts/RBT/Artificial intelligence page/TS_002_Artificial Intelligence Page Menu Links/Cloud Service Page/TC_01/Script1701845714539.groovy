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

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/a_ARTIFICIAL INTELLIGENCE'))

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/button'))

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Cloud Services'))

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects/Page_Cloud Application Development  Cloud Services/h2_Get in the cloud Get ahead in the competition'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects/Page_Cloud Application Development  Cloud Services/h2_Get in the cloud Get ahead in the competition'), 
    'Get in the cloud! Get ahead in the competition!')

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/AI inner page objects/Page_Cloud Application Development  Cloud Services/img_Get in the cloud Get ahead in the compe_5d02bd'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects/Page_Cloud Application Development  Cloud Services/a_Home'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Home'))

HomePageTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(HomePageTitle, 'AI, Dynamics 365 ERP & CRM, Kentico, Sitecore, Dell Boomi-RBT')

WebUI.back()

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects/Page_Cloud Application Development  Cloud Services/a_Solutions'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Solutions'))

SolutionsTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(SolutionsTitle, 'Technology & IT Solutions - Ray Business Technologies')

WebUI.back()

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects/Page_Cloud Application Development  Cloud Services/span_Cloud Services'), 
    'Cloud Services')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects/Page_Cloud Application Development  Cloud Services/p_1 min read'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects/Page_Cloud Application Development  Cloud Services/h1_Cloud Services'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects/Page_Cloud Application Development  Cloud Services/h1_Cloud Services'), 
    'Cloud Services')

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/AI inner page objects/Page_Cloud Application Development  Cloud Services/img_Cloud Services_inner-img-right col-lg-5_76b6be'))

WebUI.scrollToElement(findTestObject('Object Repository/RBT/AI inner page objects/Page_Cloud Application Development  Cloud Services/img_Cloud Services_inner-img-right col-lg-5_76b6be'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects/Page_Cloud Application Development  Cloud Services/a_Microsoft Azure Solutions'))

MicrosoftWindowsTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(MicrosoftWindowsTitle, 'Microsoft Windows Azure Solutions, Mobile apps and Services')

WebUI.back()

WebUI.closeBrowser()

