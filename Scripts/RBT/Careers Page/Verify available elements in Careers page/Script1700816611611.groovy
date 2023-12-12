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

WebUI.navigateToUrl('https://demo3xperience13.raybiztech.com/')

WebUI.click(findTestObject('Object Repository/RBT/Careers page objects/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/a_CAREERS'))

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/img_Exciting journey. We plan your progress_3767d0'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/h2_Exciting journey. We plan your progress _d1ed96'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/a_About Us'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/a_Contact Us'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/a_Mission  Vision'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/a_Clients'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/a_Technology Alliances'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/a_Leadership Team'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/a_Careers'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/a_CSR'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/a_RBT Partners'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/a_Home'), 
    'Home')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/a_About'), 
    'About')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/span_Careers'), 
    'Careers')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/h4_Search Jobs'), 
    'Search Jobs')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/input_Search Jobs_srch-term'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/button_Search Jobs_btn btn-default'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/h1_Careers'), 
    'Careers')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/a_Current Openings'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/img_Current Openings_img-responsive'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/img_Current Openings_mb16 img-responsive'))

WebUI.scrollToElement(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/img_Current Openings_mb16 img-responsive'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/h4_ASP.Net Developer Experience  3 to 7 years'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/h4_ASP.Net Developer Experience  3 to 7 years'))

WebUI.mouseOver(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/small_Experience  3 to 7 years'))

WebUI.click(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/i_Experience  3 to 7 years_fas fa-plus more_28f1af'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/li_Location - Hyderabad,India Philippines'), 
    'Location - Hyderabad, India & Philippines')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/li_3 to 7years or more experienced in ASP.Net'), 
    '3 to 7 years or more experienced in ASP.Net')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/li_Strong in .Net core, ASP.NET, MVC, C, SQ_4d8aee'), 
    'Strong in .Net core, ASP.NET, MVC, C#, SQL Server')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/li_Show More'), 
    0)

WebUI.scrollToElement(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/h4_ASP.Net Developer Experience  3 to 7 years'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/a_Experience  3 to 7 years_plus-icon collapsed'))

WebUI.scrollToElement(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/h4_ASP.Net Developer Experience  3 to 7 years'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/h4_Project Manager Experience  9 years'), 
    0)

WebUI.mouseOver(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/div_Project Manager Experience  9 years'))

WebUI.click(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/i_Experience  9 years_fas fa-plus more-less'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/li_Location - Hyderabad,India Philippines_1'), 
    'Location - Hyderabad, India & Philippines ')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/li_Strong in architecture and design'), 
    'Strong in architecture and design. ')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/li_Willing to own the product and work inde_764c94'), 
    'Willing to own the product and work independently.')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/li_Show More'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/i_Experience  9 years_fas more-less fa-minus'))

WebUI.scrollToElement(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/h4_Project Manager Experience  9 years'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/h4_Technical Project Manager  Experience  8 years'), 
    0)

WebUI.mouseOver(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/small_Experience  8 years'))

WebUI.click(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/a_Experience  8 years_plus-icon collapsed'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/li_The candidate needs to have a technical _d2c8a2'), 
    'The candidate needs to have a technical background and must have worked (or willing to work) on .Net related technologies and CMS platforms')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/li_Should have at least a basic understandi_72b492'), 
    'Should have at least a basic understanding of .Net and Azure')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/li_Shall be able to drive conversations wit_44f468'), 
    'Shall be able to drive conversations with technical client counterparts')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/li_Define and document project scope, goals_77ef3d'), 
    'Define and document project scope, goals, and deliverables that support business goals in collaboration with senior management and stakeholders')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/li_Develop full-scale project plans and ass_c6f763'), 
    'Develop full-scale project plans and associated communication documents')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/li_Effectively communicate project expectat_7e7c5c'), 
    'Effectively communicate project expectations to project team members and stakeholders in a timely and clear fashion')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/li_Estimate the resources and participants _0b75a9'), 
    'Estimate the resources and participants needed to achieve project goals')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/li_Draft and submit budget proposals, and r_f98469'), 
    'Draft and submit budget proposals, and recommend subsequent budget changes where necessary')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/li_Set and continually manage project expec_a66eb7'), 
    'Set and continually manage project expectations with team members and other stakeholders')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/li_Identify and manage project dependencies_a96feb'), 
    'Identify and manage project dependencies and critical path')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/li_Plan and schedule project timelines and _0d1a26'), 
    'Plan and schedule project timelines and milestones using appropriate tools')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/li_Work with various internal stakeholders _f8e561'), 
    'Work with various internal stakeholders to ensure project success')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/li_Support on hiring'), 
    'Support on hiring')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/li_Well versant with at least one project m_60377a'), 
    'Well versant with at least one project management tool')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/li_Good with Agile methodology'), 
    'Good with Agile methodology')

WebUI.scrollToElement(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/li_Support on hiring'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/a_Experience  8 years_plus-icon collapsed'))

WebUI.scrollToElement(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/h4_Technical Project Manager  Experience  8 years'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/h4_Technical Project Lead  Experience  4 to_b44591'), 
    0)

WebUI.mouseOver(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/h4_Technical Project Lead  Experience  4 to_b44591'))

WebUI.delay(2)

WebUI.click(findTestObject('Manual Objects/Plus icon'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/strong_Key Skills'), 
    'Key Skills:')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/li_Location - Hyderabad,India Philippines_1'), 
    'Location - Hyderabad, India & Philippines')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/li_Strong hands-on experience on Net tools _c42695'), 
    'Strong hands-on experience on Net tools using .NET 3.5, 4.0,4.5 and Visual Studio 2010/2012/2013 and MVC architecture.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/li_Must have rich experience in developing _b43736'), 
    'Must have rich experience in developing solutions using ASP.Net, C#, Ajax and Oracle/SQL Server and familiarity with best practices')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/li_Show More'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/p_Technical Skills'), 
    'Technical Skills:')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/li_C'), 
    'C#')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/li_ASP.NET, Windows forms, Web services'), 
    'ASP.NET, Windows forms, Web services')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/li_Sql ServerOracle'), 
    'Sql Server/Oracle')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/li_Show More'), 
    0)

WebUI.scrollToElement(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/p_Technical Skills'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Careers page objects/Page_Ray Business Technologies Careers - Di_673c04/i_Experience  9 years_fas more-less fa-minus'))

WebUI.closeBrowser()

