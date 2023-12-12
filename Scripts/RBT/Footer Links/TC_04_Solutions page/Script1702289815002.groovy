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

WebUI.scrollToElement(findTestObject('Object Repository/RBT/Footer page objects/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/h3_Request for Quote'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Footer page objects/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/a_SOLUTIONS'))

WebUI.click(findTestObject('Object Repository/RBT/Footer page objects/Page_Technology  IT Solutions - Ray Busines_842ba1/h2_IT Solutions focused on innovation-led b_45d3bb'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Technology  IT Solutions - Ray Busines_842ba1/h2_IT Solutions focused on innovation-led b_45d3bb'), 
    'IT Solutions focused on innovation-led business growth for our clients')

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/Footer page objects/Page_Technology  IT Solutions - Ray Busines_842ba1/img_IT Solutions focused on innovation-led _bf999c'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_Technology  IT Solutions - Ray Busines_842ba1/a_Blog'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_Technology  IT Solutions - Ray Busines_842ba1/a_Careers'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_Technology  IT Solutions - Ray Busines_842ba1/a_Contact'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_Technology  IT Solutions - Ray Busines_842ba1/a_Industries'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_Technology  IT Solutions - Ray Busines_842ba1/a_Products'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_Technology  IT Solutions - Ray Busines_842ba1/a_Request for quote'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_Technology  IT Solutions - Ray Busines_842ba1/a_Resources'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_Technology  IT Solutions - Ray Busines_842ba1/a_Solutions'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Technology  IT Solutions - Ray Busines_842ba1/a_Home'), 
    'Home')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Technology  IT Solutions - Ray Busines_842ba1/span_Solutions'), 
    'Solutions')

WebUI.click(findTestObject('Object Repository/RBT/Footer page objects/Page_Technology  IT Solutions - Ray Busines_842ba1/h1_Solutions'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Technology  IT Solutions - Ray Busines_842ba1/h1_Solutions'), 
    'Solutions')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Technology  IT Solutions - Ray Busines_842ba1/p_1 min read'), 
    '1 MIN READ')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Technology  IT Solutions - Ray Busines_842ba1/a_Enterprise Resource Planning'), 
    'Enterprise Resource Planning')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Technology  IT Solutions - Ray Busines_842ba1/a_Microsoft Dynamics 365'), 
    'Microsoft Dynamics 365')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Technology  IT Solutions - Ray Busines_842ba1/a_Microsoft DynamicsAX'), 
    'Microsoft Dynamics AX')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Technology  IT Solutions - Ray Busines_842ba1/a_Microsoft DynamicsNAV'), 
    'Microsoft Dynamics NAV')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Technology  IT Solutions - Ray Busines_842ba1/a_ERP Architecture Planning'), 
    'ERP Architecture Planning')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Technology  IT Solutions - Ray Busines_842ba1/a_ERP Support Services'), 
    'ERP Support Services')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Technology  IT Solutions - Ray Busines_842ba1/a_ERP Testing and Validation'), 
    'ERP Testing and Validation')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Technology  IT Solutions - Ray Busines_842ba1/a_Enterprise Portal  Content Management'), 
    'Enterprise Portal & Content Management')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Technology  IT Solutions - Ray Busines_842ba1/a_Sharepoint Portal'), 
    'Sharepoint Portal')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Technology  IT Solutions - Ray Busines_842ba1/a_Kentico WCMS'), 
    'Kentico WCMS')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Technology  IT Solutions - Ray Busines_842ba1/a_Sitecore WCMS'), 
    'Sitecore WCMS')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Technology  IT Solutions - Ray Busines_842ba1/a_Sitefinity WCMS'), 
    'Sitefinity WCMS')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Technology  IT Solutions - Ray Busines_842ba1/a_Pimcore WCMS'), 
    'Pimcore WCMS')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Technology  IT Solutions - Ray Busines_842ba1/a_Drupal CMS'), 
    'Drupal CMS')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Technology  IT Solutions - Ray Busines_842ba1/a_Ektron CMS'), 
    'Ektron CMS')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Technology  IT Solutions - Ray Busines_842ba1/a_Liferay Portal'), 
    'Liferay Portal')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Technology  IT Solutions - Ray Busines_842ba1/a_Content Migration'), 
    'Content Migration')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Technology  IT Solutions - Ray Busines_842ba1/a_Digital Signage'), 
    'Digital Signage')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Technology  IT Solutions - Ray Busines_842ba1/a_Customer Relationship Management'), 
    'Customer Relationship Management')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Technology  IT Solutions - Ray Busines_842ba1/a_Microsoft Dynamics CRM'), 
    'Microsoft Dynamics CRM')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Technology  IT Solutions - Ray Busines_842ba1/a_Bpmonline'), 
    'Bpm\'online')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Technology  IT Solutions - Ray Busines_842ba1/a_GigyaCustomer Identity  Management'), 
    'Gigya Customer Identity & Management')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Technology  IT Solutions - Ray Busines_842ba1/a_vTiger CRM'), 
    'vTiger CRM')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Technology  IT Solutions - Ray Busines_842ba1/a_Customer Retention Management'), 
    'Customer Retention Management')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Technology  IT Solutions - Ray Busines_842ba1/a_Lead Management'), 
    'Lead Management')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Technology  IT Solutions - Ray Busines_842ba1/a_Marketing Resource Management'), 
    'Marketing Resource Management')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Technology  IT Solutions - Ray Busines_842ba1/a_Boomi - EAI'), 
    'Boomi - EAI')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Technology  IT Solutions - Ray Busines_842ba1/a_Digital Transformation'), 
    'Digital Transformation')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Technology  IT Solutions - Ray Busines_842ba1/a_BIServices'), 
    'BI Services')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Technology  IT Solutions - Ray Busines_842ba1/a_Cognos'), 
    'Cognos')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Technology  IT Solutions - Ray Busines_842ba1/a_Power BI'), 
    'Power BI')

