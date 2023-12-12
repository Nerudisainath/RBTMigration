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

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Enterprise Portal  Content Management'))

EPCMtitle = WebUI.getWindowTitle()

WebUI.verifyEqual(EPCMtitle, 'Enterprise Portal and Content Management - RBT')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/h2_Framework for aggregating and integratin_8a41d3'), 
    'Framework for aggregating and integrating information, people and processes across the organization')

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/img_Plot No. 204, Block B, Kavuri Hills, Ma_da7fab'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/a_Enterprise Resource Planning'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/a_Enterprise Portal  Content Management'), 
    'Enterprise Portal & Content Management')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/a_E-Commerce  Social'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/a_Customer Relationship Management'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/a_Data Science'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/a_Artificial Intelligence'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/a_Cloud Services'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/a_Boomi - EAI'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/a_Home'), 
    'Home')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/a_Solutions'), 
    'Solutions')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/span_Enterprise Portal  Content Management'), 
    'Enterprise Portal & Content Management')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/h1_Enterprise Portal  Content Management'), 
    'Enterprise Portal & Content Management')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/p_3 min read'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/p_Enterprise Portal and Content Management _ec8a0d'), 
    'Enterprise Portal and Content Management (EPCM) is the strategies, methods and software tools used to capture, manage, store, preserve, and deliver information and documents related to organizational processes. It enables knowledge sharing and expedite information search & retriving, crucial to organizaion\'s growth.')

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/img_Enterprise Portal  Content Management_i_31a827'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/p_An Enterprise Portal is a framework for a_d6335f'), 
    'An Enterprise Portal is a framework for aggregating and integrating information, people and processes across the organization. Internet, Intranet and Extranet sites can be enterprise portals. Portals usually have specific audience group (e.g. employees, customers, suppliers, etc) and can be personalized. Enterprise Portals provide a “gateway” to information and documents, provide security (authentication & authorization), and, have robust content management system, which allows many users to contribute and update the content. Portals can improve organizational effectiveness, they can accelerate/automate shared business processes, and they can facilitate information sharing across boundaries for better business insight.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/li_Difficulty in finding the right informat_ff24fa'), 
    'Difficulty in finding the right information at the right time')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/li_Trouble to make sense of content dispers_192942'), 
    'Trouble to make sense of content dispersed across many Internet an intranet portals')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/li_Wasting valuable resources and time in s_7c731d'), 
    'Wasting valuable resources and time in searching for the required information')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/li_Enterprise is unable to do leverage the _56bdad'), 
    'Enterprise is unable to do leverage the information and content assets spread across the organization')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/li_Enterprises spend too much time and effo_a613cd'), 
    'Enterprises spend too much time and effort on identifying and managing information')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/p_An effective enterprise content managemen_b8679e'), 
    'An effective enterprise content management solution enables the organization to address the challenges and provide users with right information at the right time.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/p_Ray Business Technologies offers comprehe_094df7'), 
    'Ray Business Technologies offers comprehensive Enterprise Portal and Content Management Solutions for all aspects of information management, including document management, Web content management, digital asset management, records management, imaging and Enterprise Content Integration. Our content management services can effectively help your enterprise optimize the value of its information at every point in the information lifecycle.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/h3_What We Offer'), 
    'What We Offer:')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/li_EPCM Strategy Assessment and Consulting'), 
    'EPCM Strategy Assessment and Consulting')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/li_Business Analysis and Architecture Design'), 
    'Business Analysis and Architecture Design')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/li_User Interface design and usability'), 
    'User Interface design and usability')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/li_End-to-end portal application programming'), 
    'End-to-end portal application programming')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/li_Database design and integration'), 
    'Database design and integration')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/li_Integration with third-party Systems'), 
    'Integration with third-party Systems')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/li_Integration with legacy business applica_23af46'), 
    'Integration with legacy business applications (like CRM, ERP, SCM, etc.)')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/li_Quality Assurance and Testing'), 
    'Quality Assurance and Testing')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/li_Portal performance optimization and fine tuning'), 
    'Portal performance optimization and fine tuning')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/li_Portal setup, maintenance and support'), 
    'Portal setup, maintenance and support')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/li_Version upgrades and new features enhancements'), 
    'Version upgrades and new features enhancements')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/h3_Learn more about our EPCM solutions'), 
    'Learn more about our EPCM solutions:')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/a_Kentico CMS Solutions'), 
    'Kentico CMS Solutions')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/a_SharePoint 2007 Portal Solutions'), 
    'SharePoint 2007 Portal Solutions')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/a_Sitecore CMS Solutions'), 
    'Sitecore CMS Solutions')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/a_Net EPCM Solutions'), 
    '.Net EPCM Solutions')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/a_Open Source EPCM Solutions'), 
    'Open Source EPCM Solutions')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/h3_List of EPCM Services we offer'), 
    'List of EPCM Services we offer:')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/a_SharePoint Portal Solutions'), 
    'SharePoint Portal Solutions')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/a_Kentico CMS'), 
    'Kentico CMS')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/a_Sitecore CMS Solutions_1'), 
    'Sitecore CMS Solutions')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/a_Sitefinity WCMS'), 
    'Sitefinity WCMS')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/a_Pimcore WCMS'), 
    'Pimcore WCMS')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/a_Drupal CMS Solutions'), 
    'Drupal CMS Solutions')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/a_Ektron CMS'), 
    'Ektron CMS')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/a_Liferay Portal Solutions'), 
    'Liferay Portal Solutions')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/a_Content Migration'), 
    'Content Migration')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/a_Digital Signage'), 
    'Digital Signage')

WebUI.callTestCase(findTestCase('RBT/Artificial intelligence page/TS_002_Artificial Intelligence Page Menu Links/Enterprise Portal and Content Management Page/TC_02'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

