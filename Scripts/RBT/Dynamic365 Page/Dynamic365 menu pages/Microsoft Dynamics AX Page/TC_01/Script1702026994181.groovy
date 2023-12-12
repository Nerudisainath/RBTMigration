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

WebUI.navigateToUrl('https://demo19xperience13.raybiztech.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/a_Dynamics 365'))

WebUI.click(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/Page_Dynamics 365 Development  Integration _42dff4/a_Microsoft Dynamics AX'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/Page_MS Dynamics AX Development Solutions  _4caa36/h2_Microsoft Dynamics AX'), 
    'Microsoft Dynamics AX')

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/Page_MS Dynamics AX Development Solutions  _4caa36/img_Microsoft Dynamics AX_img-responsive'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/Page_MS Dynamics AX Development Solutions  _4caa36/a_Dynamics 365'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/Page_MS Dynamics AX Development Solutions  _4caa36/a_Microsoft Dynamics AX'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/Page_MS Dynamics AX Development Solutions  _4caa36/a_Microsoft Dynamics NAV'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/Page_MS Dynamics AX Development Solutions  _4caa36/a_ERP Architecture Planning'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/Page_MS Dynamics AX Development Solutions  _4caa36/a_ERP Support Services'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/Page_MS Dynamics AX Development Solutions  _4caa36/button'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/Page_MS Dynamics AX Development Solutions  _4caa36/a_ERP Testing and Validation'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/Page_MS Dynamics AX Development Solutions  _4caa36/a_Home'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/Page_MS Dynamics AX Development Solutions  _4caa36/a_Solutions'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/Page_MS Dynamics AX Development Solutions  _4caa36/a_Enterprise Resource Planning'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/Page_MS Dynamics AX Development Solutions  _4caa36/span_Microsoft Dynamics AX'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/Page_MS Dynamics AX Development Solutions  _4caa36/button'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/Page_MS Dynamics AX Development Solutions  _4caa36/h1_Microsoft Dynamics AX'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/Page_MS Dynamics AX Development Solutions  _4caa36/p_4 min read'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/Page_MS Dynamics AX Development Solutions  _4caa36/img_Microsoft Dynamics AX_center axLogo img_7c34b4'))

WebUI.scrollToElement(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/Page_MS Dynamics AX Development Solutions  _4caa36/h2_Dynamics AX Benefits'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/Page_MS Dynamics AX Development Solutions  _4caa36/span_Amplify Your IT Funding  Investment'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/Page_MS Dynamics AX Development Solutions  _4caa36/span_Amplify Your IT Funding  Investment'))

WebUI.click(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/Page_MS Dynamics AX Development Solutions  _4caa36/p_Dynamics AX comes at a reduced licensing _b511b8'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/Page_MS Dynamics AX Development Solutions  _4caa36/p_Dynamics AX comes at a reduced licensing _b511b8'), 
    'Dynamics AX comes at a reduced licensing price and this makes the product generate rapid user adoption rate worldwide. The advantageous and cost-effective application is packed with performance to grant you with an improved cost of ownership on your IT infrastructure. Thus, investing on Dynamics AX is a fair deal.')

WebUI.click(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/Page_MS Dynamics AX Development Solutions  _4caa36/a_toggle Retail Point-of-Sale'))

WebUI.click(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/Page_MS Dynamics AX Development Solutions  _4caa36/p_Locating the versatile application in you_f00de6'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/Page_MS Dynamics AX Development Solutions  _4caa36/p_Locating the versatile application in you_f00de6'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/Page_MS Dynamics AX Development Solutions  _4caa36/a_toggle 100 Consumer-style Experience'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/Page_MS Dynamics AX Development Solutions  _4caa36/a_toggle 100 Consumer-style Experience'))

WebUI.click(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/Page_MS Dynamics AX Development Solutions  _4caa36/p_The evolution of Dynamics AX has resulted_b096f2'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/Page_MS Dynamics AX Development Solutions  _4caa36/p_The evolution of Dynamics AX has resulted_b096f2'), 
    'The evolution of Dynamics AX has resulted in a crystal clean, modern UI that puts the right information at your fingertips. The mission-critical Dynamics AX is for all those like you who follow the cloud-first approach. The Office-mix solution enables the end-users to enjoy the same quality of experience while they are browsing their desktop, laptop, tablet or mobile phone.')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/Page_MS Dynamics AX Development Solutions  _4caa36/a_toggle On-the-Fields  Off-the-Facility Services'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/Page_MS Dynamics AX Development Solutions  _4caa36/a_toggle On-the-Fields  Off-the-Facility Services'))

WebUI.click(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/Page_MS Dynamics AX Development Solutions  _4caa36/p_Figuratively, Ray Business Technologies m_0ee302'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/Page_MS Dynamics AX Development Solutions  _4caa36/p_Figuratively, Ray Business Technologies m_0ee302'), 
    'Figuratively, Ray Business Technologies manages twin service delivery models for conveying Dynamics AX services to its customers in the shortest possible time. We are committed to optimizing your work order lifecycle, scheduling, dispatch, resource management, contract management, and first-time fix requests. Thus, our pattern of connecting your Office-to-field and Field-to-office will lend smooth flow of information and processes.')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/Page_MS Dynamics AX Development Solutions  _4caa36/a_toggle Regulatory Compliance Management'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/Page_MS Dynamics AX Development Solutions  _4caa36/a_toggle Regulatory Compliance Management'))

WebUI.click(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/Page_MS Dynamics AX Development Solutions  _4caa36/a_toggle Regulatory Compliance Management'))

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/Page_MS Dynamics AX Development Solutions  _4caa36/img_Industries Relying on Dynamics AX for i_3e0aea'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/Page_MS Dynamics AX Development Solutions  _4caa36/a_Having Barrage of Questions to Ask Contac_72c7ac'), 
    0)

WebUI.callTestCase(findTestCase('RBT/Dynamic365 Page/Dynamic365 menu pages/Microsoft Dynamics AX Page/TC_02'), [:], FailureHandling.CONTINUE_ON_FAILURE)

