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

WebUI.click(findTestObject('null'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/h2_Providing Microsoft Dynamics 365 Develop_0fee42'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/img_Plot No. 204, Block B, Kavuri Hills, Ma_da7fab'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/a_Dynamics 365'), 
    'Dynamics 365')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/a_Microsoft Dynamics AX'), 
    'Microsoft Dynamics AX')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/a_Microsoft Dynamics NAV'), 
    'Microsoft Dynamics NAV')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/ol_Home                            Solution_b30dde'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/h1_Microsoft Dynamics 365'), 
    'Microsoft Dynamics 365')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/p_6 min read'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/img_Microsoft Dynamics 365_center dyn365_lo_1b0051'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/h2_Is Dynamics 365 an output of Repackaging_64a7a8'), 
    'Is Dynamics 365 an output of Repackaging or a Whole New Product?')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/div_Three Different Offerings of Microsoft _28d02a'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/div_Dynamics 365 for Talent'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/div_Dynamics 365 for Retail'), 
    0)

WebUI.scrollToElement(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/div_Dynamics 365 for Retail'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/a_Business Edition'), 
    'Business Edition')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/a_Enterprise Edition'), 
    'Enterprise Edition')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/div_The Business version has led to the evo_68a39a'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/a_Enterprise Edition'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/div_The Business version has led to the evo_68a39a'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/h2_License Schemes for Microsoft Dynamics 365'), 
    'License Schemes for Microsoft Dynamics 365')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/div_Full User PlanThe heavy users are attra_01c699'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/div_Light User PlanThis pattern is created _468f73'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/div_Per Device PlanThis type of licensing o_237aaf'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/h2_Benefits of Dynamics 365'), 
    'Benefits of Dynamics 365')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/h2_Microsoft Dynamics 365 for all the Indus_9e8826'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/h2_Microsoft Dynamics 365 for all the Indus_9e8826'), 
    'Microsoft Dynamics 365 for all the Industries mentioned below:')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/h3_Focused below are the Classified Industr_bdcf9e'), 
    'Focused below are the Classified Industries that embrace Dynamics 365')

WebUI.scrollToElement(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/h3_Focused below are the Classified Industr_bdcf9e'), 
    0)

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/img_Focused below are the Classified Indust_161be6'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/span_Dynamics 365 integration with Office 365'), 
    'Dynamics 365 integration with Office 365')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/p_There is a new Outlook integration that l_0bba17'), 
    'There is a new Outlook integration that looks promising and adds new features and improvements over the current Outlook client.')

WebUI.scrollToElement(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/span_Dynamics 365 integration with Office 365'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/a_togglePurpose for the Relationship Insights'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/a_togglePurpose for the Relationship Insights'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/p_This is an email engagement tool that is _6730ed'), 
    'This is an email engagement tool that is inserted with relationship assistant, email engagement and auto-capture for amplifying your business strengths. It generates instant-reminder alerts about your upcoming activities, phone calls, meetings and trace relevant messages from your exchange server.')

WebUI.scrollToElement(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/a_togglePurpose for the Relationship Insights'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/a_toggleCreating Custom Learning Path using_99b77a'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/p_Microsoft Dynamics CRM Online 2016 Update_c0b55f'), 
    '‘Microsoft Dynamics CRM Online 2016 Update allows you to create contextually-rich Learning Path for the enrichment of your employees. Learning Path provides great ways to help people become familiar with business forms. This helps in reducing the training time, costs and enable team productivity.')

WebUI.click(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/a_toggleConnected Field Service Model'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/p_Connected field service is the highly reg_925483'), 
    'Connected field service is the highly regarded released feature that remotely monitors the customers’ equipment. It assists the service organizations to navigate from the expensive break-fix model to a friendly one that combines monitoring/support elements with IoT and machine learning.')

WebUI.click(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/a_toggleUniversal Resource Scheduling (URS)'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/p_Resource scheduling optimization enables _0cead4'), 
    'Resource scheduling optimization enables the system to schedule several items on a recurring basis. The schedulable resource optimizer takes account of the constraints while optimizing schedules such as the presence of the resource, skills, task priority, and time windows.')

WebUI.click(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/a_toggleCommon Scheduling Solution (CSS)'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/p_With CSS, you can schedule just about any_86f3ce'), 
    'With CSS, you can schedule just about anything such as scheduling your prospective marketing visits, booking time to work on a particular case, work orders, and more. Those organizations that use Field Service capabilities will enjoy fully integrated scheduling experience.')

WebUI.click(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/a_toggleAdd-ons for Dynamics 365 Microsoft Project'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/p_With the collaboration of new Project Ser_a6a25b'), 
    'With the collaboration of new Project Service Automation, you can perform project planning in Microsoft Project, and publish the same into Dynamics 365.')

WebUI.click(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/a_toggleConsolidated Calendar View'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/p_Office 365 Exchange Calendar provides con_78ba04'), 
    'Office 365 Exchange Calendar provides consolidated snapshots of your forthcoming appointments, assignments, bookings, field service work orders for you to cope with your time and agenda.')

WebUI.click(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/a_toggleDynamics 365 Copy Functionality'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/p_Users can copy information from the oppor_e6f952'), 
    'Users can copy information from the opportunity, quotes, project contracts, and forms with the clicking of the Copy button on the command bar.')

WebUI.click(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/a_toggleEstimated Tax Amount Field'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/p_With this, you can have an edge over the _b1544c'), 
    'With this, you can have an edge over the accurate project pricing information. This field can be spotted on the Contract line, Contract line detail records, Quote line, Quote line details records.')

WebUI.click(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/a_toggleEditable Grids'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/p_The versatile grids provide inline editin_9cd39c'), 
    'The versatile grids provide inline editing, clustering, grouping, filtering, and sorting of the columns. They are located at the entity level within sub-grids inside a form/dashboard.')

WebUI.click(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/a_toggleLive Assist for Dynamics 365'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/p_Live Assistant is powered by CafX third-p_c2b497'), 
    'Live Assistant is powered by CaféX third-party solution. The administrators configure Live Assist from within Microsoft Dynamics 365 or Unified Service Desk. It provides an immersive experience of the presence control, chat indicators, and visual engagement of the agents with customers while browsing.')

WebUI.click(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/a_toggleApp Stores for Microsoft Dynamics 365'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/p_The App Store called as AppSource for Mic_51e249'), 
    'The App Store called as AppSource for Microsoft Dynamics 365 takes you to analyze, compare, evaluate, and finally purchase the product. The provision extensions are similar to the Office Store or Google Play in Office 365.')

WebUI.click(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/a_toggleIs the Enterprise Software Customizable'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/p_The corporate software rests over the bed_a588d2'), 
    'The corporate software rests over the bed of complicated databases that are customized for different organizations. Microsoft has been struggling to drift away from the complexities of customizations. Necessity is the mother of invention, this phraseology gels well with Microsoft that has forced CDM to tightly integrate with Office 365 and other apps with a standardized API.')

WebUI.scrollToElement(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/a_toggleCommon Scheduling Solution (CSS)'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/a_toggleIs Dynamics 365 built on the Azure _10a4af'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Dyanamic365 Page Objects/Page_Dynamics 365 Development  Integration _42dff4/p_Microsoft Azure is the focal point that d_3ddb60'), 
    'Microsoft Azure is the focal point that drives creative innovation in Dynamics 365. Presently, Microsoft continues to leverage all the existing apps outside of Azure.')

WebUI.callTestCase(findTestCase('RBT/Dynamic365 Page/Dynamic365 main page/TC_02'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('RBT/Dynamic365 Page/Dynamic365 main page/TC_03'), [:], FailureHandling.CONTINUE_ON_FAILURE)

