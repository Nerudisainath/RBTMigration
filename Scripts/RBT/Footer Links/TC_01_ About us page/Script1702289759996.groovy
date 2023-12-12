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

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/a_ABOUT US'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Footer page objects/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/a_ABOUT US'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_Global IT Services and Solutions Compa_f9723f/h2_Solution-driven approach  Strategic part_6bbdad'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/Footer page objects/Page_Global IT Services and Solutions Compa_f9723f/img_Solution-driven approach  Strategic par_7a361d'))

WebUI.delay(2)

WebUI.verifyImagePresent(findTestObject('Manual Objects/About page image'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_Global IT Services and Solutions Compa_f9723f/a_About Us'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_Global IT Services and Solutions Compa_f9723f/a_Contact Us'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_Global IT Services and Solutions Compa_f9723f/a_Mission  Vision'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_Global IT Services and Solutions Compa_f9723f/a_Clients'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_Global IT Services and Solutions Compa_f9723f/a_Technology Alliances'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_Global IT Services and Solutions Compa_f9723f/a_Leadership Team'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_Global IT Services and Solutions Compa_f9723f/a_Careers'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_Global IT Services and Solutions Compa_f9723f/a_CSR'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_Global IT Services and Solutions Compa_f9723f/a_RBT Partners'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Global IT Services and Solutions Compa_f9723f/a_Home'), 
    'Home')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Global IT Services and Solutions Compa_f9723f/a_About'), 
    'About')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Global IT Services and Solutions Compa_f9723f/span_About Us'), 
    'About Us')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Global IT Services and Solutions Compa_f9723f/h1_13 Years of Technology Leadership'), 
    '13 Years of Technology Leadership')

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/Footer page objects/Page_Global IT Services and Solutions Compa_f9723f/img_About Us_inner-img-left col-lg-4 col-md_8a1a5b'))

WebUI.scrollToElement(findTestObject('Object Repository/RBT/Footer page objects/Page_Global IT Services and Solutions Compa_f9723f/img_About Us_inner-img-left col-lg-4 col-md_8a1a5b'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/Footer page objects/Page_Global IT Services and Solutions Compa_f9723f/img_About Us_inner-img-right col-lg-5 col-m_6b94c3'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Global IT Services and Solutions Compa_f9723f/h2_Case Studies'), 
    'Case Studies')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_Global IT Services and Solutions Compa_f9723f/div_Annual Financial Reporting Automation, amplif'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_Global IT Services and Solutions Compa_f9723f/div_Automating media conversion and share to gene'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_Global IT Services and Solutions Compa_f9723f/div_Bazaar voice integration for agricultural co-'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/RBT/Footer page objects/Page_Global IT Services and Solutions Compa_f9723f/a_View all_1'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Global IT Services and Solutions Compa_f9723f/h2_Blogs'), 
    'Blogs')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_Global IT Services and Solutions Compa_f9723f/div_10 Reasons to use Kentico Xperience 13 as you'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_Global IT Services and Solutions Compa_f9723f/div_6 Ways to Speed Up Your Kentico Website'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_Global IT Services and Solutions Compa_f9723f/div_6 Benefits of Headless CMS  What your Busine'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/RBT/Footer page objects/Page_Global IT Services and Solutions Compa_f9723f/a_View all_1_2'))

