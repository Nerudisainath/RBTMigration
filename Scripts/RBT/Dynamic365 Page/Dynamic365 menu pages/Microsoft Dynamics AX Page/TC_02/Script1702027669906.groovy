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

WebUI.navigateToUrl('https://demo19xperience13.raybiztech.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/a_Dynamics 365'))

WebUI.click(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/Page_Dynamics 365 Development  Integration _42dff4/a_Microsoft Dynamics AX'))

WebUI.click(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Home'))

HomePageTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(HomePageTitle, 'AI, Dynamics 365 ERP & CRM, Kentico, Sitecore, Dell Boomi-RBT')

WebUI.back()

WebUI.click(findTestObject('Object Repository/RBT/Artificial intelligence page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Solutions'))

SolutionsTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(SolutionsTitle, 'Technology & IT Solutions - Ray Business Technologies')

WebUI.back()

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/Page_MS Dynamics AX Development Solutions  _4caa36/a_Enterprise Resource Planning'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/Page_MS Dynamics AX Development Solutions  _4caa36/a_Enterprise Resource Planning'))

EPRTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(EPRTitle, 'ERP Services | Dynamics AX, NAV Solutions')

WebUI.back()

WebUI.scrollToElement(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/Page_MS Dynamics AX Development Solutions  _4caa36/h2_Microsoft Dynamics AX Development'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/Page_MS Dynamics AX Development Solutions  _4caa36/a_Having Barrage of Questions to Ask Contac_72c7ac'))

ContactUsTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(ContactUsTitle, 'Contact Us - Ray Business Technologies')

WebUI.back()

WebUI.closeBrowser()

