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

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects/Page_Customer Relationship Management  CRM _12588b/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Customer Relationship Management'))

WebUI.click(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Home'))

HomePageTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(HomePageTitle, 'AI, Dynamics 365 ERP & CRM, Kentico, Sitecore, Dell Boomi-RBT')

WebUI.back()

WebUI.click(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Solutions'))

SolutionsTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(SolutionsTitle, 'Technology & IT Solutions - Ray Business Technologies')

WebUI.back()

WebUI.scrollToElement(findTestObject('Manual Objects/text'), 0)

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects/Page_Customer Relationship Management  CRM _12588b/Page_Customer Relationship Management  CRM _12588b/a_Microsoft Dynamics CRM'))

MicrosoftDynamicsCRMTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(MicrosoftDynamicsCRMTitle, 'Microsoft Dynamics CRM Development Solutions & Implementation')

WebUI.back()

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects/Page_Customer Relationship Management  CRM _12588b/Page_Customer Relationship Management  CRM _12588b/a_Bpmonline CRM Development'))

BpmonlineCRMTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(BpmonlineCRMTitle, 'Bpm\'online CRM Development - Ray Business Technologies')

WebUI.back()

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects/Page_Customer Relationship Management  CRM _12588b/Page_Customer Relationship Management  CRM _12588b/a_Gigya Customer Identity Management'))

GigyaCustomerIdentityManagementTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(GigyaCustomerIdentityManagementTitle, 'Gigya Customer Identity Management - Ray Business Technologies')

WebUI.back()

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects/Page_Customer Relationship Management  CRM _12588b/Page_Customer Relationship Management  CRM _12588b/a_vTiger CRM Solutions'))

vTigerSolutionsTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(vTigerSolutionsTitle, 'vTiger Solutions')

WebUI.back()

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects/Page_Customer Relationship Management  CRM _12588b/Page_Customer Relationship Management  CRM _12588b/a_Customer Retention Management'))

CustomerRetentionManagementTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(CustomerRetentionManagementTitle, 'Customer Retention Management | Retention Program | Customer Retention Strategy')

WebUI.back()

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects/Page_Customer Relationship Management  CRM _12588b/Page_Customer Relationship Management  CRM _12588b/a_Lead Management'))

LeadManagementTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(LeadManagementTitle, 'Lead Management Services | Sales Lead Generation | Lead Management Solution')

WebUI.back()

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects/Page_Customer Relationship Management  CRM _12588b/Page_Customer Relationship Management  CRM _12588b/a_Marketing Resource Management'))

MarketingResourceManagementTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(MarketingResourceManagementTitle, 'Marketing Resource Management | Management Software')

WebUI.back()

WebUI.closeBrowser()

