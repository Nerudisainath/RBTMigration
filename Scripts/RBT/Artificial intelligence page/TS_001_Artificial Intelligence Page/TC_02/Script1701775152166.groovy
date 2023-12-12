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

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Home'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Home'))

HomePageTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(HomePageTitle, 'AI, Dynamics 365 ERP & CRM, Kentico, Sitecore, Dell Boomi-RBT')

WebUI.back()

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Solutions'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Solutions'))

SolutionsTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(SolutionsTitle, 'Technology & IT Solutions - Ray Business Technologies')

WebUI.back()

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/span_Artificial Intelligence'), 
    'Artificial Intelligence')

WebUI.scrollToElement(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/strong_Major branches of AI'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Read More'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Read More'))

DataVisualizationTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(DataVisualizationTitle, 'Data Visualization - A definition, examples, and resources')

WebUI.back()

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Read More_1'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Read More_1'))

ForecastingTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(ForecastingTitle, 'Forecasting Methods in Data Science - RBT')

WebUI.back()

WebUI.scrollToElement(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Read More_1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Read More_1_2'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Read More_1_2'))

MeachineLearningTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(MeachineLearningTitle, 'Machine Learning Consulting & Development Services')

WebUI.back()

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Read More_1_2_3'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Read More_1_2_3'))

DataAnalyticsTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(DataAnalyticsTitle, 'Data Science and Advanced Analytics - Raybiztech')

WebUI.back()

WebUI.scrollToElement(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Read More_1_2_3'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Read More_1_2_3_4'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Read More_1_2_3_4'))

RPATitle = WebUI.getWindowTitle()

WebUI.verifyEqual(RPATitle, 'Robotic Process Automation | RPA Solutions | Benefits of RPA')

WebUI.back()

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Read More_1_2_3_4_5'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Read More_1_2_3_4_5'))

NLPTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(NLPTitle, 'Natural Language Processing | NLP with Python')

WebUI.back()

WebUI.scrollToElement(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Read More_1_2_3_4_5'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_View all'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_View all'))

VideosPageTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(VideosPageTitle, 'Know 5 Industries embracing New Technologies')

WebUI.closeBrowser()

