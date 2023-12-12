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

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/a_ARTIFICIAL INTELLIGENCE'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_E-Commerce  Social'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_E-Commerce  Social'))

ECStitle = WebUI.getWindowTitle()

WebUI.verifyEqual(ECStitle, 'E-Commerce and Social Media Solutions')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/h2_Integrating the power of Social Media to_7e228c'), 
    'Integrating the power of Social Media to your online business!')

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/img_Integrating the power of Social Media t_567645'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/a_Enterprise Resource Planning'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/a_Enterprise Portal  Content Management'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/a_Customer Relationship Management'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/button'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/a_Data Science'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/a_Artificial Intelligence'), 
    'Artificial Intelligence')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/a_Cloud Services'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/a_Boomi - EAI'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/a_Home'), 
    'Home')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/a_Solutions'), 
    'Solutions')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/span_E-Commerce  Social'), 
    'E-Commerce & Social')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/h1_E-Commerce  Social Media'), 
    'E-Commerce & Social Media')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/p_2 min read'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/div_Integrating the power of Social Media t_ba5e5f'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/p_Ray Business Technologies understand the _90fdac'), 
    'Ray Business Technologies understand the value of Social Media and eCommerce relation well. From the very start, Ray Business Technologies has made strong IT Solutions teams working closely in Social Media and eCommerce space. The key factor to gaining a competitive edge in a successful eCommerce business is to ensure a great customer experience.The widespread acceptance of social media and networking has shifted the traditional online shopping model to incorporate consumers\' active participation in the marketing and selling of products. This includes an easy-to-use user interface, secure data management, a solid POS, rapid performance and the ability to handle large amounts of traffic.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/p_At Ray Business Technologies, we build st_9d5178'), 
    'At Ray Business Technologies, we build strong and secure online business for you. We value our clients and breathe life into their e-commerce shopping sites, so that they focus on delivery, while we perform exceptionally well to deliver brilliant IT Solutions.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/strong_Some of our capabilities include bui_24770c'), 
    'Some of our capabilities include building and supporting eCommerce and Social Media Solutions, such as:')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/li_Online storefronts, catalogs and shopping carts'), 
    'Online storefronts, catalogs and shopping carts')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/li_Web-based administration products for ma_2ca3cb'), 
    'Web-based administration products for managing inventory, coupon codes and gift certificates')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/li_Point of sales (POS) and payment process_09cc65'), 
    'Point of sales (POS) and payment processing solutions')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/li_Web portals for travel, ticketing and ev_14feba'), 
    'Web portals for travel, ticketing and event management')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/li_Online auction engines based on open sou_d04a7b'), 
    'Online auction engines based on open source libraries')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/li_Websites optimized for user content generation'), 
    'Websites optimized for user content generation')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/li_Location-based shopping services for mob_7a9777'), 
    'Location-based shopping services for mobile phones')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/li_Robust, scalable platforms for digital c_bfb31b'), 
    'Robust, scalable platforms for digital content delivery')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/li_Next-generation ad servers'), 
    'Next-generation ad servers')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/li_Social Media Application'), 
    'Social Media Application')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/li_Social Strategy and Management'), 
    'Social Strategy and Management')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/li_Collaboration Systems'), 
    'Collaboration Systems')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/li_Networking Software'), 
    'Networking Software')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/a_Magento eCommerce'), 
    'Magento eCommerce')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/a_OpenCart eCommerce'), 
    'OpenCart eCommerce')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/a_Social Media Applications'), 
    'Social Media Applications')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_E-Commerce and Social Media Solutions/a_Facebook Applications'), 
    'Facebook Applications')

WebUI.callTestCase(findTestCase('RBT/Artificial intelligence page/TS_002_Artificial Intelligence Page Menu Links/E-Commerce and Social Page/TC_02'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

