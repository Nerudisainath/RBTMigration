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

WebUI.click(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/a_Dynamics 365'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/a_Dynamics 365'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/a_Microsoft Dynamics AX'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/a_Microsoft Dynamics AX'))

MicrosoftDynamicsAXTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(MicrosoftDynamicsAXTitle, 'MS Dynamics AX Development Solutions & Consulting')

WebUI.back()

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/a_Microsoft Dynamics NAV'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/a_Microsoft Dynamics NAV'))

MicrosoftDynamicsNAVTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(MicrosoftDynamicsNAVTitle, 'Microsoft Dynamics NAV | Dynamics NAV Consulting Services')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/a_ERP Architecture Planning'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/a_ERP Architecture Planning'))

ERPArchitecturePlanningTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(ERPArchitecturePlanningTitle, 'ERP Architecture Planning')

WebUI.back()

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/a_ERP Support Services'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/a_ERP Support Services'))

ERPSupportServicesTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(ERPSupportServicesTitle, 'ERP Support Services | ERP Consulting & Maintenance Services')

WebUI.back()

WebUI.click(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/button'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/a_ERP Testing and Validation'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/a_ERP Testing and Validation'))

ERPTestingandValidationTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(ERPTestingandValidationTitle, 'ERP Testing and Validation')

