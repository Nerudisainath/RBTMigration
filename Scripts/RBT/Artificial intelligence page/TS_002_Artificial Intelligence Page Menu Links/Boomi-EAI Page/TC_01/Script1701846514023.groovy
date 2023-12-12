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

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Boomi - EAI'))

BoomiEAITitle = WebUI.getWindowTitle()

WebUI.verifyEqual(BoomiEAITitle, 'Dell Boomi cloud integration platform services & solutions')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Dell Boomi cloud integration platform _c6d72b/img_ARTIFICIAL INTELLIGENCE_img-responsive'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects/Page_Dell Boomi cloud integration platform _c6d72b/h1_BOOMI - EAI'), 
    'BOOMI - EAI')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects/Page_Dell Boomi cloud integration platform _c6d72b/a_Contact Us'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Dell Boomi cloud integration platform _c6d72b/img_BOOMI - EAI_img-responsive laptop'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects/Page_Dell Boomi cloud integration platform _c6d72b/h2_BOOMI SERVICES  SOLUTIONS'), 
    'BOOMI SERVICES & SOLUTIONS')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Dell Boomi cloud integration platform _c6d72b/h2_EXPLORE BOOMI CAPABILITIES WITH RAY BUSI_998900'), 
    'EXPLORE BOOMI CAPABILITIES WITH RAY BUSINESS TECHNOLOGIES')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects/Page_Dell Boomi cloud integration platform _c6d72b/div_Request for Quote                      _c7788e'), 
    0)

WebUI.scrollToElement(findTestObject('Object Repository/RBT/AI inner page objects/Page_Dell Boomi cloud integration platform _c6d72b/div_Dell Boomi Development'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects/Page_Dell Boomi cloud integration platform _c6d72b/a_Boomi Development'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/AI inner page objects/Page_Dell Boomi cloud integration platform _c6d72b/div_Dell Boomi Consulting'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects/Page_Dell Boomi cloud integration platform _c6d72b/a_Boomi Consulting'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/AI inner page objects/Page_Dell Boomi cloud integration platform _c6d72b/div_Dell Boomi eCommerce'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects/Page_Dell Boomi cloud integration platform _c6d72b/a_Boomi eCommerce'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/AI inner page objects/Page_Dell Boomi cloud integration platform _c6d72b/div_Dell Boomi Implementation'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects/Page_Dell Boomi cloud integration platform _c6d72b/a_Boomi Implementation'), 
    0)

WebUI.scrollToElement(findTestObject('Object Repository/RBT/AI inner page objects/Page_Dell Boomi cloud integration platform _c6d72b/a_Boomi Implementation'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/AI inner page objects/Page_Dell Boomi cloud integration platform _c6d72b/div_Dell Boomi Integration'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects/Page_Dell Boomi cloud integration platform _c6d72b/a_Boomi Integration'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/AI inner page objects/Page_Dell Boomi cloud integration platform _c6d72b/div_Dell Boomi Migration'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects/Page_Dell Boomi cloud integration platform _c6d72b/a_Boomi   Migration'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/AI inner page objects/Page_Dell Boomi cloud integration platform _c6d72b/div_Dell Boomi Deployment'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects/Page_Dell Boomi cloud integration platform _c6d72b/a_Boomi Deployment Services'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/AI inner page objects/Page_Dell Boomi cloud integration platform _c6d72b/div_Dell Boomi Developers and Consultants'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects/Page_Dell Boomi cloud integration platform _c6d72b/a_Boomi Developers and Consultants'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects/Page_Dell Boomi cloud integration platform _c6d72b/a_Contact Us'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Dell Boomi cloud integration platform _c6d72b/img_Contact Us_img-responsive cont_mng-img'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Dell Boomi cloud integration platform _c6d72b/span_Boomi Offerings and Services'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects/Page_Dell Boomi cloud integration platform _c6d72b/h2_BOOMI VIDEOS'), 
    'BOOMI VIDEOS')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Dell Boomi cloud integration platform _c6d72b/span_BOOMI VIDEOS_y-gn-img'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Dell Boomi cloud integration platform _c6d72b/span_BOOMI VIDEOS_y-gn-img'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects/Page_Dell Boomi cloud integration platform _c6d72b/a_View all'), 
    0)

WebUI.callTestCase(findTestCase('RBT/Artificial intelligence page/TS_002_Artificial Intelligence Page Menu Links/Boomi-EAI Page/TC_02'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

