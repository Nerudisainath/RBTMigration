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

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects/Page_Data Science and Advanced Analytics - _f9f38b/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/a_ARTIFICIAL INTELLIGENCE'))

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects/Page_Data Science and Advanced Analytics - _f9f38b/Page_Artificial Intelligence Services - Ray_4ca9e5/button'))

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects/Page_Data Science and Advanced Analytics - _f9f38b/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Data Science'))

WebUI.click(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Home'))

HomePageTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(HomePageTitle, 'AI, Dynamics 365 ERP & CRM, Kentico, Sitecore, Dell Boomi-RBT')

WebUI.back()

WebUI.click(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Solutions'))

SolutionsTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(SolutionsTitle, 'Technology & IT Solutions - Ray Business Technologies')

WebUI.back()

WebUI.scrollToElement(findTestObject('Object Repository/RBT/AI inner page objects/Page_Data Science and Advanced Analytics - _f9f38b/Page_Data Science and Advanced Analytics - _f9f38b/span_Statistical Techniques driven by advan_97fd52'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects/Page_Data Science and Advanced Analytics - _f9f38b/Page_Data Science and Advanced Analytics - _f9f38b/a_Shiny R App'))

ShinyRAppTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(ShinyRAppTitle, 'Create and Deploy a Shiny R App - Raybiztech')

WebUI.back()

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects/Page_Data Science and Advanced Analytics - _f9f38b/Page_Data Science and Advanced Analytics - _f9f38b/a_Data Visualization'))

DataVisualizationTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(DataVisualizationTitle, 'Data Visualization - A definition, examples, and resources')

WebUI.back()

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects/Page_Data Science and Advanced Analytics - _f9f38b/Page_Data Science and Advanced Analytics - _f9f38b/a_Forecasting'))

ForecastingTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(ForecastingTitle, 'Forecasting Methods in Data Science - RBT')

WebUI.back()

WebUI.scrollToElement(findTestObject('Object Repository/RBT/AI inner page objects/Page_Data Science and Advanced Analytics - _f9f38b/Page_Data Science and Advanced Analytics - _f9f38b/a_Forecasting'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects/Page_Data Science and Advanced Analytics - _f9f38b/Page_Data Science and Advanced Analytics - _f9f38b/a_Machine learning'))

MachineLearningTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(MachineLearningTitle, 'Machine Learning Consulting & Development Services')

WebUI.back()

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects/Page_Data Science and Advanced Analytics - _f9f38b/Page_Data Science and Advanced Analytics - _f9f38b/a_Python'))

PythonTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(PythonTitle, 'Artificial Intelligence Services - Ray Business Technologies')

WebUI.back()

WebUI.closeBrowser()

