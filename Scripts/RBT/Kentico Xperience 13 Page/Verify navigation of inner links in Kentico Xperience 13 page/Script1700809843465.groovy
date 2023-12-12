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

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.maximizeWindow()

WebUI.delay(3)

WebUI.click(findTestObject('Manual Objects/Kentico Xperience 13 home page'))

WebUI.scrollToElement(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/h1_Kentico Xperience 13'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Contact Us'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Contact Us'))

ContactUsTitle = WebUI.getWindowTitle()

WebUI.back()

WebUI.scrollToElement(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Contact Us'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Consulting'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Consulting'))

KenticoXperience13ConsultingTitle = WebUI.getWindowTitle()

WebUI.back()

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Contact Us'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Migration And Upgrade'), 
    0)

WebUI.click(findTestObject('Manual Objects/Kentico Xperience 13 Migration And Upgrade'), FailureHandling.CONTINUE_ON_FAILURE)

KenticoXperience13MigrationTitle = WebUI.getWindowTitle()

WebUI.back()

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Contact Us'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Development'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Development'))

KenticoXperience13DevelopementTitle = WebUI.getWindowTitle()

WebUI.back()

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Contact Us'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Ecommerce Solutions'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Ecommerce Solutions'))

KenticoXperience13EcommerceTitle = WebUI.getWindowTitle()

WebUI.back()

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Contact Us'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Integration Solutions'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Integration Solutions'))

WebUI.back()

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Contact Us'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Maintenance  Support'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Maintenance  Support'))

KenticoXperience13MaintenanceTitle = WebUI.getWindowTitle()

WebUI.back()

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/h2_Kentico Solutions'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Consulting Services'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Consulting Services'))

KenticoXperience13ConsultingServiceTitle = WebUI.getWindowTitle()

WebUI.back()

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Development Services'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Development Services'))

KenticoXperience13DevelopementServiceTitle = WebUI.getWindowTitle()

WebUI.back()

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Ecommerce Solutions_1'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Ecommerce Solutions_1'))

KenticoXperience13EcommerceServiceTitle = WebUI.getWindowTitle()

WebUI.back()

WebUI.scrollToElement(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Migration And Upgrade'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Integration Services'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Integration Services'))

KenticoXperience13IntegrationServiceTitle = WebUI.getWindowTitle()

WebUI.back()

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Implementation'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Implementation'))

KenticoXperience13ImplementationTitle = WebUI.getWindowTitle()

WebUI.back()

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Maintenance Services'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Maintenance Services'))

KenticoXperience13MaintenanceServiceTitle = WebUI.getWindowTitle()

WebUI.back()

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Certified Developers_6c5bde'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Certified Developers_6c5bde'))

KenticoXperience13CertifiedDevTitle = WebUI.getWindowTitle()

WebUI.back()

WebUI.scrollToElement(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Shopping Cart'), 
    0)

WebUI.click(findTestObject('Manual Objects/Contact us'))

ContactUsTitle = WebUI.getWindowTitle()

WebUI.back()

WebUI.scrollToElement(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/h2_Kentico Xperience'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_View all'))

ViewAllTitle = WebUI.getWindowTitle()

WebUI.back()

WebUI.closeBrowser()

