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

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/a_ARTIFICIAL INTELLIGENCE'))

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Enterprise Portal  Content Management'))

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/a_Home'))

HomepageTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(HomepageTitle, 'AI, Dynamics 365 ERP & CRM, Kentico, Sitecore, Dell Boomi-RBT')

WebUI.back()

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/a_Solutions'))

SolutionsTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(SolutionsTitle, 'Technology & IT Solutions - Ray Business Technologies')

WebUI.back()

WebUI.scrollToElement(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/li_Portal setup, maintenance and support'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/a_Kentico CMS Solutions'))

KenticoCMSTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(KenticoCMSTitle, 'Kentico Xperience 13 | Kentico 13 | Kentico Xperience Solutions')

WebUI.back()

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/a_SharePoint 2007 Portal Solutions'))

SharePointTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(SharePointTitle, 'SharePoint Portal Solutions | Microsoft Gold Partner')

WebUI.back()

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/a_Sitecore CMS Solutions'))

SitecoreTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(SitecoreTitle, 'Sitecore CMS Development Solutions & Services, Developers Support')

WebUI.back()

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/a_Net EPCM Solutions'))

NetEPCMTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(NetEPCMTitle, 'DotNet Content Management | DOTNET Nuke CMS | Kentico CMS')

WebUI.back()

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/a_Open Source EPCM Solutions'))

OpenSourceTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(OpenSourceTitle, 'Open Source Content Management Solutions')

WebUI.back()

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/a_SharePoint Portal Solutions'))

SharepointPortalTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(SharepointPortalTitle, 'SharePoint Portal Solutions | Microsoft Gold Partner')

WebUI.back()

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/a_Kentico CMS'))

KenticoCMSTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(KenticoCMSTitle, 'Kentico Xperience 13 | Kentico 13 | Kentico Xperience Solutions')

WebUI.back()

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/a_Sitecore CMS Solutions_1'))

SitecoreTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(SitecoreTitle, 'Sitecore CMS Development Solutions & Services, Developers Support')

WebUI.back()

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/a_Sitefinity WCMS'))

SiteinfinityTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(SiteinfinityTitle, 'Sitefinity CMS Solution, Development, Support and Upgrade')

WebUI.back()

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/a_Drupal CMS Solutions'))

DrupalCMSTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(DrupalCMSTitle, 'Drupal CMS Development Solutions and Services, Developers Support')

WebUI.back()

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/a_Ektron CMS'))

EktronTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(EktronTitle, 'Ektron CMS Solutions and Services')

WebUI.back()

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/a_Liferay Portal Solutions'))

LiferayTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(LiferayTitle, 'Liferay Portal Solutions | Enterprise Portal Services')

WebUI.back()

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/a_Content Migration'))

ContentMigrationTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(ContentMigrationTitle, 'Content Migration Services - CMS, DAM, DMS')

WebUI.back()

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_Enterprise Portal and Content Manageme_3811c3/li_Digital Signage'))

DigitalSignageTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(DigitalSignageTitle, 'Enterprise Portal and Content Management - RBT')

WebUI.back()

WebUI.closeBrowser()

