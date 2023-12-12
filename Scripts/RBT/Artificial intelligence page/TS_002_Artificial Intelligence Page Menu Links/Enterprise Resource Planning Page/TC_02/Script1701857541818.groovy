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

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/a_ARTIFICIAL INTELLIGENCE'))

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Enterprise Resource Planning'))

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/Page_ERP Services  Dynamics AX, NAV Solutions/a_Home'))

HomePageTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(HomePageTitle, 'AI, Dynamics 365 ERP & CRM, Kentico, Sitecore, Dell Boomi-RBT')

WebUI.back()

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/Page_ERP Services  Dynamics AX, NAV Solutions/a_Solutions'))

SolutionsTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(SolutionsTitle, 'Technology & IT Solutions - Ray Business Technologies')

WebUI.back()

WebUI.scrollToElement(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/Page_ERP Services  Dynamics AX, NAV Solutions/h3_What we offer'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/Page_ERP Services  Dynamics AX, NAV Solutions/a_Microsoft Dynamics 365'))

MicrosoftDynamic365Title = WebUI.getWindowTitle()

WebUI.verifyEqual(MicrosoftDynamic365Title, 'Dynamics 365 Development & Integration | Dynamics F & O')

WebUI.back()

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/Page_ERP Services  Dynamics AX, NAV Solutions/a_Microsoft Dynamics AX'))

MicrosoftDynamicAXTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(MicrosoftDynamicAXTitle, 'MS Dynamics AX Development Solutions & Consulting')

WebUI.back()

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/Page_ERP Services  Dynamics AX, NAV Solutions/a_Microsoft Dynamics NAV'))

MicrosoftDynamicNAVTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(MicrosoftDynamicNAVTitle, 'Microsoft Dynamics NAV | Dynamics NAV Consulting Services')

WebUI.back()

WebUI.scrollToElement(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/Page_ERP Services  Dynamics AX, NAV Solutions/a_Microsoft Dynamics 365'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/Page_ERP Services  Dynamics AX, NAV Solutions/a_ERP Architecture Planning'))

ERPArchitectureTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(ERPArchitectureTitle, 'ERP Architecture Planning')

WebUI.back()

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/Page_ERP Services  Dynamics AX, NAV Solutions/a_ERP Support Services'))

ERPSupportServiceTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(ERPSupportServiceTitle, 'ERP Support Services | ERP Consulting & Maintenance Services')

WebUI.back()

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/Page_ERP Services  Dynamics AX, NAV Solutions/a_ERP Testing and Validation'))

ERPTestingandValidationTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(ERPTestingandValidationTitle, 'ERP Testing and Validation')

WebUI.back()

WebUI.closeBrowser()

