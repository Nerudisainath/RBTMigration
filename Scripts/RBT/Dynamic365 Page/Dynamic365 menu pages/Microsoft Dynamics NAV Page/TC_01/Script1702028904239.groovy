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

WebUI.click(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/a_Dynamics 365'))

WebUI.click(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/a_Microsoft Dynamics NAV'))

WebUI.getWindowTitle()

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/h2_Microsoft Dynamics NAV'), 
    'Microsoft Dynamics NAV')

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/img_Microsoft Dynamics NAV_img-responsive'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/a_Dynamics 365'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/a_Microsoft Dynamics AX'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/div_Home                            Solutio_20db39'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/a_ERP Architecture Planning'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/a_ERP Support Services'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/div_Microsoft Dynamics NAV_hamburger'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/a_ERP Testing and Validation'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/button'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/a_Home'), 
    'Home')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/a_Solutions'), 
    'Solutions')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/a_Enterprise Resource Planning'), 
    'Enterprise Resource Planning')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/span_Microsoft Dynamics NAV'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/h1_Microsoft Dynamics NAV'), 
    'Microsoft Dynamics NAV')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/p_5 min read'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/img_Microsoft Dynamics NAV_center img-responsive'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/h2_Benefits of Dynamics NAV'), 
    0)

WebUI.scrollToElement(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/h2_Why Dynamics NAV'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/div_Dynamics NAV Filled with Dosage of Discounts'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/a_Dynamics NAV Filled with Dosage of Discounts'), 
    'Dynamics NAV Filled with Dosage of Discounts')

WebUI.click(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/span_Dynamics NAV Filled with Dosage of Dis_0c7f54'))

WebUI.click(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/div_Liberty for User-privileged Pricing  Licensing'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/a_Liberty for User-privileged Pricing  Licensing'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/a_Liberty for User-privileged Pricing  Licensing'))

WebUI.click(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/div_Out-of-Office  Right-in-the-Fields for _1512e6'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/a_Out-of-Office  Right-in-the-Fields for Mobility'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/a_Out-of-Office  Right-in-the-Fields for Mobility'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/a_Right-sizing your In-house IT Team  Savin_3bca05'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/a_Right-sizing your In-house IT Team  Savin_3bca05'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/p_By outsourcing Dynamics NAV, you will ski_a4260d'), 
    'By outsourcing Dynamics NAV, you will skim your IT department to an optimal size. In this manner, your software specialists will be relieved from the day-to-day IT melodramas and rent off their worries to a dedicated Dynamics NAV vendor. Moreover, the self-serving solution frees up your space as it requires absolutely no additional hardware or software to support the new environment.')

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/img_Check the Grid of Industries Below to s_65b76d'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Microsoft Dynamics NAV  Dynamics NAV C_f4bdd0/a_Take Your NAV Projects to Pluto Join Ray _578901'), 
    0)

WebUI.callTestCase(findTestCase('RBT/Dynamic365 Page/Dynamic365 menu pages/Microsoft Dynamics NAV Page/TC_02'), [:], FailureHandling.CONTINUE_ON_FAILURE)

