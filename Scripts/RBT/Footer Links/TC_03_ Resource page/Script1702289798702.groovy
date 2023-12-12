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

WebUI.scrollToElement(findTestObject('Object Repository/RBT/Footer page objects/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/h3_Request for Quote'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Footer page objects/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/a_RESOURCES'))

WebUI.click(findTestObject('Object Repository/RBT/Footer page objects/Page_Resources - Ray Business Technologies/h2_Technology  People  Process'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Resources - Ray Business Technologies/h2_Technology  People  Process'), 
    'Technology + People + Process')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_Resources - Ray Business Technologies/img_Technology  People  Process_img-responsive'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_Resources - Ray Business Technologies/a_Blog'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_Resources - Ray Business Technologies/a_Careers'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_Resources - Ray Business Technologies/a_Contact'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_Resources - Ray Business Technologies/a_Industries'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_Resources - Ray Business Technologies/a_Products'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_Resources - Ray Business Technologies/a_Request for quote'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_Resources - Ray Business Technologies/a_Resources'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_Resources - Ray Business Technologies/a_Solutions'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_Resources - Ray Business Technologies/a_Home'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_Resources - Ray Business Technologies/span_Resources'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Footer page objects/Page_Resources - Ray Business Technologies/h1_Resources'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Resources - Ray Business Technologies/h1_Resources'), 
    'Resources')

WebUI.click(findTestObject('Object Repository/RBT/Footer page objects/Page_Resources - Ray Business Technologies/p_1 min read'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Resources - Ray Business Technologies/p_1 min read'), 
    '1 MIN READ')

WebUI.click(findTestObject('Object Repository/RBT/Footer page objects/Page_Resources - Ray Business Technologies/p_Ray Business Technologies offers comprehe_62a502'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Resources - Ray Business Technologies/p_Ray Business Technologies offers comprehe_62a502'), 
    'Ray Business Technologies offers comprehensive end-to-end IT Services and Solutions for Enterprise Resource Planning (ERP), Enterprise Portals and Content Management (EPCM), Customer Relationship Management (CRM), and Enterprise Mobility including Product Development. Check out more about us and about our work, whitepapers, our partners and so on.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Resources - Ray Business Technologies/a_Case Studies'), 
    'Case Studies')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Resources - Ray Business Technologies/a_Whitepapers'), 
    'Whitepapers')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Resources - Ray Business Technologies/a_Thought Leadership'), 
    'Thought Leadership')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Resources - Ray Business Technologies/a_Webinars'), 
    'Webinars')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Resources - Ray Business Technologies/a_Media Kit'), 
    'Media Kit')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Resources - Ray Business Technologies/a_Blogs'), 
    'Blogs')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Resources - Ray Business Technologies/a_RBT Partners'), 
    'RBT Partners')

