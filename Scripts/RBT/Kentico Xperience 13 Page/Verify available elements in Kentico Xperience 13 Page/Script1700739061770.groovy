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

WebUI.click(findTestObject('Manual Objects/Kentico Xperience 13 home page'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/h1_Kentico Xperience 13'), 
    'KENTICO XPERIENCE 13')

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/img_KENTICO Xperience 13_img-responsive'))

WebUI.verifyElementClickable(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Contact Us'))

WebUI.scrollToElement(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Contact Us'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/h2_KENTICO XPERIENCE SOLUTIONS'), 
    'KENTICO XPERIENCE SOLUTIONS')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/p_4 min read'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Consulting'), 
    'Kentico Xperience 13 Consulting')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Development'), 
    'Kentico Xperience 13 Development')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Ecommerce Solutions'), 
    'Kentico Xperience 13 Ecommerce Solutions')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Integration Solutions'), 
    'Kentico Xperience 13 Integration Solutions')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Maintenance  Support'), 
    'Kentico Xperience 13 Maintenance & Support')

WebUI.scrollToElement(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Maintenance  Support'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/h2_Unlimited Kentico Opportunities with Ray_d74653'), 
    'UNLIMITED KENTICO OPPORTUNITIES WITH RAY BUSINESS TECHNOLOGIES')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/h3_Request for Quote'), 
    'REQUEST FOR QUOTE')

WebUI.verifyElementClickable(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/input_Message_btn_Submit1'))

WebUI.scrollToElement(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/input_Message_btn_Submit1'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/h2_Kentico Solutions'), 
    'KENTICO SOLUTIONS')

WebUI.scrollToElement(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/h2_Kentico Solutions'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Consulting Services'), 
    'KENTICO XPERIENCE 13 CONSULTING SERVICES')

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/div_Kentico Consulting Services'))

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/div_Kentico Development Services'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Development Services'), 
    'KENTICO XPERIENCE 13 DEVELOPMENT SERVICES')

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/div_Kentico Ecommerce Solutions'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Ecommerce Solutions_1'), 
    'KENTICO XPERIENCE 13 ECOMMERCE SOLUTIONS')

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/div_Kentico Migration and Upgrade'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Migration and Upgrade (1)'), 
    'KENTICO XPERIENCE 13 MIGRATION AND UPGRADE')

WebUI.scrollToElement(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Migration and Upgrade (1)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/div_Kentico Integration Services'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Integration Services'), 
    'KENTICO XPERIENCE 13 INTEGRATION SERVICES')

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/div_Kentico Implementation'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/h4_Kentico Xperience 13 Implementation'), 
    'KENTICO XPERIENCE 13 IMPLEMENTATION')

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/div_Kentico Maintenance Services'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Maintenance Services'), 
    'KENTICO XPERIENCE 13 MAINTENANCE SERVICES')

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/div_Kentico Certified Developers and Consultants'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Certified Developers_6c5bde'), 
    'KENTICO XPERIENCE 13 CERTIFIED DEVELOPERS AND CONSULTANTS')

WebUI.scrollToElement(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Certified Developers_6c5bde'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Technical Guide'), 
    'Kentico Technical Guide')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_FAQs'), 
    'FAQ\'s')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Technical Support Services'), 
    'Kentico Xperience 13 Technical Support Services')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Knowledge Base'), 
    'Knowledge Base')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Technical Support Desk'), 
    'Kentico Xperience 13 Technical Support Desk')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 License Price List'), 
    'Kentico Xperience 13 License Price List')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Administrator Demo'), 
    'Kentico Xperience 13 Administrator Demo')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Support Services'), 
    'Kentico Xperience 13 Support Services')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Consulting Services_1'), 
    'Kentico Xperience 13 Consulting Services')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Site Architecture Planning'), 
    'Site Architecture Planning')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Integration Services_1'), 
    'Kentico Xperience 13 Integration Services')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Templates Development'), 
    'Kentico Xperience 13 Templates Development')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Document Management'), 
    'Kentico Xperience 13 Document Management')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Performance optimization'), 
    'Kentico Xperience 13 Performance optimization')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Reporting'), 
    'Kentico Xperience 13 Reporting')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Experienced Kentico Certified Developers'), 
    'Experienced Kentico Certified Developers')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Leading Kentico Xperience Gold Partner'), 
    'Leading Kentico Xperience Gold Partner')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Training'), 
    'Kentico Xperience 13 Training')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Interface'), 
    'Kentico Xperience 13 Interface')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Web parts'), 
    'Kentico Xperience 13 Web parts')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Custom Modules Development'), 
    'Custom Modules Development')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Server Hosting'), 
    'Kentico Xperience 13 Server Hosting')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Code review'), 
    'Kentico Xperience 13 Code review')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Analytics'), 
    'Kentico Xperience 13 Analytics')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Xperience 13 Testing'), 
    'Kentico Xperience 13 Testing')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Web2Print'), 
    'Kentico Web2Print')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Workflows Development'), 
    'Kentico Workflows Development')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Shopping Cart'), 
    'Kentico Shopping Cart')

WebUI.scrollToElement(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Kentico Shopping Cart'), 
    0)

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/i_Reach out to us with your Xperience by Ke_7f7269'), 
    'Reach out to us with your Xperience by Kentico Requirements. Our Certified Xperience Professionals will respond at the earliest.')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/button_Contact Us'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_Contact Us'), 
    'CONTACT US')

WebUI.verifyElementClickable(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/button_Contact Us'))

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/img_Contact Us_img-responsive cont_mng-img'))

WebUI.scrollToElement(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/img_Contact Us_img-responsive cont_mng-img'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_View all'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/RBT/Kentico Xperience 13 Page Objects/Page_Kentico Xperience 13  Kentico 13  Kent_7cc940/a_View all'))

WebUI.callTestCase(findTestCase('RBT/Kentico Xperience 13 Page/Verify navigation of inner links in Kentico Xperience 13 page'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

