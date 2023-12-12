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

WebUI.click(findTestObject('Manual Objects/Accept Cookies'))

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/a_ARTIFICIAL INTELLIGENCE'))

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/div_Technology  People  Process_hamburger'))

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Boomi - EAI'))

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects/Page_Dell Boomi cloud integration platform _c6d72b/a_Contact Us'))

ContactUsTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(ContactUsTitle, 'Contact Us - Ray Business Technologies')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects/Page_Contact Us - Ray Business Technologies/a_Home'), 
    'Home')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects/Page_Contact Us - Ray Business Technologies/span_Contact'), 
    'Contact')

WebUI.back()

WebUI.scrollToElement(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Dell Boomi cloud integration platform _c6d72b/li_Project sign-off along with post-impleme_1d175f'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects/Page_Dell Boomi cloud integration platform _c6d72b/a_Boomi Development'))

BoomiDevelopmentTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(BoomiDevelopmentTitle, 'Dell Boomi Development Services | Dell Boomi Developers')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Dell Boomi Development Services  Dell _63685e/a_Home'), 
    'Home')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Dell Boomi Development Services  Dell _63685e/a_Services'), 
    'Services')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Dell Boomi Development Services  Dell _63685e/a_Applications Integration'), 
    'Applications Integration')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Dell Boomi Development Services  Dell _63685e/a_Boomi Services'), 
    'Boomi Services')

WebUI.back()

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects/Page_Dell Boomi cloud integration platform _c6d72b/a_Boomi Consulting'))

BoomiConsultingTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(BoomiConsultingTitle, 'Dell Boomi Consulting Services - RBT')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Dell Boomi Consulting Services - RBT/a_Home'), 
    'Home')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Dell Boomi Consulting Services - RBT/a_Services'), 
    'Services')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Dell Boomi Consulting Services - RBT/a_Applications Integration'), 
    'Applications Integration')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Dell Boomi Consulting Services - RBT/a_Boomi Services'), 
    'Boomi Services')

WebUI.back()

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects/Page_Dell Boomi cloud integration platform _c6d72b/a_Boomi Implementation'))

BoomiImplimentationTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(BoomiImplimentationTitle, 'Dell Boomi Implementation Services - RBT')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Dell Boomi Implementation Services - RBT/a_Home'), 
    'Home')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Dell Boomi Implementation Services - RBT/a_Services'), 
    'Services')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Dell Boomi Implementation Services - RBT/a_Applications Integration'), 
    'Applications Integration')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Dell Boomi Implementation Services - RBT/a_Boomi Services'), 
    'Boomi Services')

WebUI.back()

WebUI.scrollToElement(findTestObject('Object Repository/RBT/AI inner page objects/Page_Dell Boomi cloud integration platform _c6d72b/a_Boomi Implementation'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects/Page_Dell Boomi cloud integration platform _c6d72b/a_Boomi Integration'))

BoomiIntegrationTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(BoomiIntegrationTitle, 'Dell Boomi Integration Services | Boomi Data Integration')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Dell Boomi Integration Services  Boomi_e97a59/a_Home'), 
    'Home')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Dell Boomi Integration Services  Boomi_e97a59/a_Services'), 
    'Services')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Dell Boomi Integration Services  Boomi_e97a59/a_Applications Integration'), 
    'Applications Integration')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Dell Boomi Integration Services  Boomi_e97a59/a_Boomi Services'), 
    'Boomi Services')

WebUI.back()

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects/Page_Dell Boomi cloud integration platform _c6d72b/a_Boomi   Migration'))

BoomiMigrationTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(BoomiMigrationTitle, 'Dell Boomi Migration Services - RBT')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Dell Boomi Migration Services - RBT/a_Home'), 
    'Home')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Dell Boomi Migration Services - RBT/a_Services'), 
    'Services')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Dell Boomi Migration Services - RBT/a_Applications Integration'), 
    'Applications Integration')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Dell Boomi Migration Services - RBT/a_Boomi Services'), 
    'Boomi Services')

WebUI.back()

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects/Page_Dell Boomi cloud integration platform _c6d72b/a_Boomi Developers and Consultants'))

BoomiDCTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(BoomiDCTitle, 'Certified Dell Boomi Developers and Consultants')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects/Page_Certified Dell Boomi Developers and Co_19c59b/a_Home'), 
    'Home')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects/Page_Certified Dell Boomi Developers and Co_19c59b/a_Services'), 
    'Services')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects/Page_Certified Dell Boomi Developers and Co_19c59b/a_Applications Integration'), 
    'Applications Integration')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects/Page_Certified Dell Boomi Developers and Co_19c59b/a_Boomi Services'), 
    'Boomi Services')

WebUI.back()

WebUI.scrollToElement(findTestObject('Object Repository/RBT/AI inner page objects/Page_Dell Boomi cloud integration platform _c6d72b/h2_BOOMI VIDEOS'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects/Page_Dell Boomi cloud integration platform _c6d72b/a_View all'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Know 5 Industries embracing New Technologies/a_Home'), 
    'Home')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Know 5 Industries embracing New Technologies/a_Videos'), 
    'Videos')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Know 5 Industries embracing New Technologies/a_Kentico CMS Videos'), 
    'Kentico CMS Videos')

WebUI.back()

WebUI.closeBrowser()

