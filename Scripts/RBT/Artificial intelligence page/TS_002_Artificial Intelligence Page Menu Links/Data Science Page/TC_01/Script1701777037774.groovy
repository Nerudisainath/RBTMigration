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

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Data Science'))

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects/Page_Data Science and Advanced Analytics - _f9f38b/h2_Unlock the next level of Performance for_c2500a'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects/Page_Data Science and Advanced Analytics - _f9f38b/h2_Unlock the next level of Performance for_c2500a'), 
    'Unlock the next level of Performance for your Organization.')

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/AI inner page objects/Page_Data Science and Advanced Analytics - _f9f38b/img_Unlock the next level of Performance fo_70e1b3'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects/Page_Data Science and Advanced Analytics - _f9f38b/a_Home'), 
    'Home')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects/Page_Data Science and Advanced Analytics - _f9f38b/a_Solutions'), 
    'Solutions')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects/Page_Data Science and Advanced Analytics - _f9f38b/span_Data Science'), 
    'Data Science')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects/Page_Data Science and Advanced Analytics - _f9f38b/p_2 min read'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects/Page_Data Science and Advanced Analytics - _f9f38b/h1_Data Science'), 
    'Data Science')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects/Page_Data Science and Advanced Analytics - _f9f38b/img_Data Science_center img-responsive'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects/Page_Data Science and Advanced Analytics - _f9f38b/p_The concept of leveraging data and inform_bdc4c6'), 
    'The concept of leveraging data and information across a wide range of applications and tools that can drive or automate processes and functions is classified as Data Sciences. Ray Business Technologies has been contributing to Data Science by working with a pool of resources well-versed in engineering and high-end technology, as well as finding the idealsolution for data-driven software and applications.')

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/AI inner page objects/Page_Data Science and Advanced Analytics - _f9f38b/img_Data Science_img-responsive'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects/Page_Data Science and Advanced Analytics - _f9f38b/a_Shiny R App'), 
    'Shiny R App')

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/AI inner page objects/Page_Data Science and Advanced Analytics - _f9f38b/img_Statistical Techniques driven by advanc_92a68f'))

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/AI inner page objects/Page_Data Science and Advanced Analytics - _f9f38b/img_Read More_img-responsive'))

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/AI inner page objects/Page_Data Science and Advanced Analytics - _f9f38b/img_Read More_img-responsive_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects/Page_Data Science and Advanced Analytics - _f9f38b/a_Read More'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects/Page_Data Science and Advanced Analytics - _f9f38b/a_Read More_1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects/Page_Data Science and Advanced Analytics - _f9f38b/a_Read More_1_2'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/AI inner page objects/Page_Data Science and Advanced Analytics - _f9f38b/img_Read More_img-responsive_1_2'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects/Page_Data Science and Advanced Analytics - _f9f38b/a_Machine learning'), 
    'Machine learning')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects/Page_Data Science and Advanced Analytics - _f9f38b/a_Read More_1_2_3'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/AI inner page objects/Page_Data Science and Advanced Analytics - _f9f38b/img_Read More_img-responsive_1_2_3'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects/Page_Data Science and Advanced Analytics - _f9f38b/a_Read More_1_2_3_4'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/AI inner page objects/Page_Data Science and Advanced Analytics - _f9f38b/img_Read More_img-responsive_1_2_3_4'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects/Page_Data Science and Advanced Analytics - _f9f38b/a_Python'), 
    'Python')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects/Page_Data Science and Advanced Analytics - _f9f38b/a_Read More_1_2_3_4_5'), 
    0)

WebUI.callTestCase(findTestCase('RBT/Artificial intelligence page/TS_002_Artificial Intelligence Page Menu Links/Data Science Page/TC_02'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

