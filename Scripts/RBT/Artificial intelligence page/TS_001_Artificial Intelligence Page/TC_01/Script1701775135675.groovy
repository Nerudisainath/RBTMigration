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

WebUI.click(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/a_ARTIFICIAL INTELLIGENCE'))

WebUI.delay(3)

AIheader = WebUI.getText(findTestObject('RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/h2_Technology  People  Process'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyEqual(AIheader, 'Technology + People + Process')

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/img_Technology  People  Process_img-responsive'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Enterprise Resource Planning'), 
    0)

ERPmenu = WebUI.getText(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Enterprise Resource Planning'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyEqual(ERPmenu, 'Enterprise Resource Planning')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Enterprise Portal  Content Management'), 
    0)

EPCMmenu = WebUI.getText(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Enterprise Portal  Content Management'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyEqual(EPCMmenu, 'Enterprise Portal & Content Management')

ECSmenu = WebUI.getText(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_E-Commerce  Social'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyEqual(ECSmenu, 'E-Commerce & Social')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Customer Relationship Management'), 
    0)

ECRMmenu = WebUI.getText(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Customer Relationship Management'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyEqual(ECRMmenu, 'Customer Relationship Management')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/button'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/div_Technology  People  Process_hamburger'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Data Science'), 
    0)

DataSciencemenu = WebUI.getText(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Data Science'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyEqual(DataSciencemenu, 'Data Science')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Artificial Intelligence'), 
    0)

AImenu = WebUI.getText(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Artificial Intelligence'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyEqual(AImenu, 'Artificial Intelligence')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Cloud Services'), 
    0)

CSmenu = WebUI.getText(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Cloud Services'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyEqual(CSmenu, 'Cloud Services')

WebUI.click(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/div_Technology  People  Process_hamburger'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Home'), 
    'Home')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Solutions'), 
    'Solutions')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/span_Artificial Intelligence'), 
    'Artificial Intelligence')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/h1_Artificial Intelligence'), 
    'Artificial Intelligence')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/p_3 min read'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/p_Ray Business Technologies has been contri_5f3bc7'), 
    'Ray Business Technologies has been contributing to innovation and advanced research in Artificial Intelligence by working with a pool of resources well-versed in learning models and languages that are used in coding intelligent bots and assistants. Our team is capable of understanding client requirements to develop best-in-class AI solutions that can fulfill client requirements in addition to consulting and support services around Artificial Intelligence.')

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/img_Artificial Intelligence_center img-responsive'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/strong_Artificial Intelligence offers'), 
    'Artificial Intelligence offers:')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/img_Artificial Intelligence offers_img-responsive'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/strong_Major branches of AI'), 
    'Major branches of AI:')

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/img_Major branches of AI_img-responsive'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Data Visualization'), 
    0)

DataVisualization = WebUI.getText(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Data Visualization'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyEqual(DataVisualization, ' Data Visualization')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Read More'), 
    'READ MORE')

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/img_Read More_img-responsive'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Forecasting'), 
    'Forecasting')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Read More_1'), 
    'READ MORE')

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/img_Read More_img-responsive_1'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Machine learning'), 
    'Machine learning')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Read More_1_2'), 
    'READ MORE')

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/img_Read More_img-responsive_1_2'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Data Analytics'), 
    'Data Analytics')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Read More_1_2_3'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/img_Read More_img-responsive_1_2_3'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/h4_RPA'), 
    'RPA')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Read More_1_2_3_4'), 
    'READ MORE')

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/img_Read More_img-responsive_1_2_3_4'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_NLP'), 
    'NLP')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Read More_1_2_3_4_5'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/h1_Artificial Intelligence Videos'), 
    'Artificial Intelligence Videos')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/div_AI can Transform Travel Industry post C_931b2e'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/div_AI Reshaping the Insurance sector  AI i_5286e7'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/div_Artificial Intelligence in Automation -_01340d'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_View all'), 
    0)

WebUI.callTestCase(findTestCase('RBT/Artificial intelligence page/TS_001_Artificial Intelligence Page/TC_02'), [:], FailureHandling.STOP_ON_FAILURE)

