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

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Enterprise Resource Planning'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/AI inner page objects/Page_Artificial Intelligence Services - Ray_4ca9e5/a_Enterprise Resource Planning'))

ERPtitle = WebUI.getWindowTitle()

WebUI.verifyEqual(ERPtitle, 'ERP Services | Dynamics AX, NAV Solutions')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/h2_Next generation ERP 2.0 Technology Solut_a8772b'), 
    'Next generation ERP 2.0 Technology Solution for automating and integrating business activities')

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/img_Next generation ERP 2.0 Technology Solu_997bf8'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/a_Enterprise Resource Planning'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/a_Enterprise Portal  Content Management'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/a_E-Commerce  Social'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/a_Customer Relationship Management'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/a_Data Science'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/a_Artificial Intelligence'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/a_Cloud Services'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/a_Boomi - EAI'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/a_Home'), 
    'Home')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/a_Solutions'), 
    'Solutions')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/span_Enterprise Resource Planning'), 
    'Enterprise Resource Planning')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/h1_Enterprise Resource Planning'), 
    'Enterprise Resource Planning')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/p_10 min read'), 
    '10 MIN READ')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/p_The implementation of the legendary Enter_71ca27'), 
    'The implementation of the legendary Enterprise resource planning (ERP) or Business Process Management Software is very crucial for the decision-empowered entrepreneurs and their organizations. The integrated applications in an ERP can manage your business while automating endless functions including Manufacturing Execution Systems (MES), Warehouse Management Systems (WMS), Transportation Management Systems (TMS), Supply Chain Management (SCM), Sales, Marketing, Customer Relationship Management (CRM), Business Intelligence (BI), Corporate Performance Management (CPM), Human Resource Management (HRM), Information Technology (IT), Accounting, Financial Planning and Analysis (FP&A), Product Development, and Advance Planning and Scheduling (APS) using a single database application and user interface.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/strong_Why ERP Implementation Important for_52b3e5'), 
    'Why ERP Implementation Important for your Company?')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/p_ERP is the central nervous system of the _a59df2'), 
    'ERP is the central nervous system of the dynamic organizations like yours. The full-scale organizational ERP systems are the magical mascots that empower your string of business processes while skimming down your business cycle time to an incredible level. The sooner you realize that you are encountered with slurry of software issues, you must wake your senses up to bring about the kinetic change in your redundant system. The management leadership and the decision makers apply a Fast-forward approach for adapting an exceedingly marketable ERP that has the horsepower to consolidate your business processes within the shortest span of time. Hence, it is evident that in the absence of the core enterprise competency, you will be pulled off from the winning race to face multiple disappointments and conflicting business challenges of great intensity.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/strong_What Challenges are faced by Customers'), 
    'What Challenges are faced by Customers?')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/p_The ghost of all the problems is the orth_05671b'), 
    'The ghost of all the problems is the orthodox management who blindly remain all-time-loyal to its faulty system that failed to champion on the challenges faced by the corporation. An utterly crashed ERP can\'t take you to becoming a Fortune 500 company. Such an ERP installed out of the poor decision of the jury will affect all the angles your organization. Therefore, you need to designate a dedicated line-up of software architects for floating the Off-the-Radar ERP back to its place. The IT team should be able to battle for recognizing loop-holes that has set the ERP to explode during the preliminary phases of implementation. The technical leaders with right attitude should be able to merge with the processes of migrating, testing, connecting, and deployment of the new system into the company’s ecosystem.   ')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/h3_What we offer'), 
    'What we offer:')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/a_Microsoft Dynamics 365'), 
    'Microsoft Dynamics 365')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/a_Microsoft Dynamics AX'), 
    'Microsoft Dynamics AX')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/a_Microsoft Dynamics NAV'), 
    'Microsoft Dynamics NAV')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/a_ERP Architecture Planning'), 
    'ERP Architecture Planning')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/a_ERP Support Services'), 
    'ERP Support Services')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/a_ERP Testing and Validation'), 
    'ERP Testing and Validation')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/p_Some of the technology leaders disregard _fea909'), 
    'Some of the technology leaders disregard the locally installed on-premise solutions that are managed by the in-house IT department while many others rely on cloud ERP that is provided as a service and managed by the ERP vendor. Companies often combine the best of both technologies and make them highly operable in the hybrid environment.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/strong_Major Difference between Cloud  On-p_dd63bd'), 
    'Major Difference between Cloud & On-premise ERP:')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/strong_Scalability  Flexibility'), 
    'Scalability & Flexibility')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/p_Cloud ERP allows you to add more users as_677313'), 
    'Cloud ERP allows you to add more users as the business progresses, while the on-site ERP fails to offer you with the same.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/strong_Saving on the Hard Dollars  TCO'), 
    'Saving on the Hard Dollars & TCO')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/p_Lowering of the implementation cost of th_fce1d3'), 
    'Lowering of the implementation cost of the ERP in the cloud can automatically lower the initial cost of ownership by 50%.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/p_ERP on the Cloud is available on recurrin_1b3ad5'), 
    'ERP on the Cloud is available on recurring subscription plan to free up your liquid capital.\nCloud ERP liberates the IT department from the routine maintenance, support, and application upgrades.  The end-users are destined to receive complementary services sponsored by the cloud vendors from remote.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/strong_Hardware  Software Provision'), 
    'Hardware & Software Provision')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/p_Cloud ERP in specific, saves you from add_327c10'), 
    'Cloud ERP in specific, saves you from additional hardware and software hangovers while the on-site option makes it mandatory for you to bear the upfront investments for purchasing and managing the system, hardware, servers, and large IT department.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/strong_Customization, System Performance'), 
    'Customization, System Performance')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/p_In contrast to the onsite ERP software, c_912269'), 
    'In contrast to the onsite ERP software, cloud ERP are continually customized and upgraded by your provider. Few of the other companies hesitate updating their software onsite because the process is compounded with complications.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/strong_Anytime Anywhere Access'), 
    'Anytime Anywhere Access')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/p_Cloud-based, SaaS, ERP solution provides _c0b2b1'), 
    'Cloud-based, SaaS, ERP solution provides real-time data accessibility over the laptop, smartphone, tablet, and other devices without incurring an extra setup cost. Accessing the system from remote will remain a dream for those companies with on-premise ERP that restricts them to expand geographically.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/strong_Deployment Speed'), 
    'Deployment Speed')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/p_Cloud ERP assures speedy deployment as it_135c6b'), 
    'Cloud ERP assures speedy deployment as it is independent of any additional software or hardware elements. Its implementation usually takes 3-6 months while the latter typically consumes more than 12 months.  ')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/strong_Business Process Reengineering (BPR)'), 
    'Business Process Reengineering (BPR)')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/p_Cloud ERP radically invites BPR for enhan_6261f1'), 
    'Cloud ERP radically invites BPR for enhancing productivity, quality and standardization. The on-premise deployment solution may not be able to help the clients in standardizing their business processes in accord with the technology.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/strong_Decision Support System (DSS)'), 
    'Decision Support System (DSS)')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/p_ERP cloud facilitates proactive monitorin_1c15e5'), 
    'ERP cloud facilitates proactive monitoring through role-based dashboards. It facilitates better decision-making through contextual intelligence, expense management and analytics that helps the approving body to review the reports and make approval instantly. The on-premise solution is less proactive and inferior to work like the one on the cloud.  ')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/strong_Rapid Implementation Cycle'), 
    'Rapid Implementation Cycle')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/p_Unlike the on-premise model, clouds short_8225e3'), 
    'Unlike the on-premise model, cloud’s short implementation methodology is underpinned by a pool of certified workforce and other business accelerators to facilitate fast installation.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/strong_What Benefits Customers Get'), 
    'What Benefits Customers Get?')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/p_It is your reliable solution on cloud tha_7092a1'), 
    'It is your reliable solution on cloud that will spur the scope of your business without shaking your operating costs. Therefore, having all your applications stacked on the cloud will help you grab multiple benefits. Undoubtedly, any new cloud ERP in a newer environment is subjected to Temporary-teething problems but once it safely takes off the ground; your organizations will thrust into 100% business endowment.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/strong_Highlighted below are the Batches of_23f273'), 
    'Highlighted below are the Batches of Benefits associated with ERP:')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/strong_Future-proof ERP, Fully Functional'), 
    'Future-proof ERP, Fully Functional')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/p_Lack of flexibility and functionality of _f31fe1'), 
    'Lack of flexibility and functionality of your current ERP systems can add up frustration.  Nevertheless, an expedient enterprise system can resourcefully align your outright business functions to achieve flexibility. ERP systematically controls your company’s metadata, security profiles, and work functions in a relatively simpler manner. ')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/strong_Defining your Business Blueprints'), 
    'Defining your Business Blueprints')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/p_Your super-efficient Enterprise Resource _79c446'), 
    'Your super-efficient Enterprise Resource Planning needs to be scrupulously aligned with your continuously evolving business frameworks. Organizations should clearly spell out their business needs for bringing clarity in the roles, responsibilities, and performance measures. Additionally, your productivity speaks that you are actually installed with a befitting ERP.  ')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/strong_Optimizing the Organizational Change'), 
    'Optimizing the Organizational Change')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/p_The Next-gen ERP application can stage th_571d0d'), 
    'The Next-gen ERP application can stage the stipulated changes in the healthier organizations like yours. With this, your trained workforce can get accustomed to performing different functions in a dexterous fashion. ')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/strong_Alignment  Aesthetics'), 
    'Alignment & Aesthetics')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/p_An Every-day-ERP is said to be one that i_1b5ea9'), 
    'An Every-day-ERP is said to be one that is assembled with the objectives of the firm. The empirical objectives are desired to be in symmetrical order with that of the technology initiatives. Furthermore, the corporate dignitaries should synchronize themselves with the strategies so as to prevent the ongoing projects from misalignment.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/strong_Laying Leapfrog Improvements in Your_a7b10c'), 
    'Laying Leapfrog Improvements in Your Business Grid')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/p_Business process improvement is a critica_4134ba'), 
    'Business process improvement is a critical success factor that permits the managers to steer the organization in the direction of growth. With a high yielding ERP solution, you are committed to move your business graph towards the direction of growth.  ')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/strong_Hybrid ERP is the Barometer for Capt_c7d019'), 
    'Hybrid ERP is the Barometer for Capturing Competition  ')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/p_You are standing at the right page as thi_1defed'), 
    'You are standing at the right page as this will evacuate you from the outdated ERP that had been emitting bad business outcomes. Your one-time capital investment made on the ERP will save you from many problems that keep rising with the tick of the business clock. Thus, its advisable to transform your environment with a sound system for tapping all those opportunities that your long-time rivals had been robbing away from you for so long.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/strong_On-budget ERP for Cost Crunching'), 
    'On-budget ERP for Cost Crunching')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/p_Its a fact to believe that a quantum ERP _a03536'), 
    'It’s a fact to believe that a quantum ERP can pledge to diminish your organization\'s administrative, operational and miscellaneous expenses by 45%. It federates your fragmented systems for creating a cost-efficient business processes. As all the users will be trained using a single system, you’ll be cutting the associated costs while adding capital appreciation in your annual balance sheets.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/strong_Cross-functional Collaboration for T_2e0611'), 
    'Cross-functional Collaboration for Transparent Results')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/p_The unified ERP structure effortlessly in_5562c7'), 
    'The unified ERP structure effortlessly intersects with all the concentrated departments for maintaining transparency of the workflow. Inter and intra organizational networks within the enterprise are coherently connected by the ERP system for eliminating technical gaps.   ')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/strong_Web-based ERP Favors IoT Devices for_b81a60'), 
    'Web-based ERP Favors IoT Devices for Mobility')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/p_By installing the cloud-based ERP in your_d5812e'), 
    'By installing the cloud-based ERP in your premise, you’ll get direct access to the condensed database even from the remote terminals such as home, onsite, offsite, onshore, off-shore and so on using the smart Internet of things (IoT) devices.  ')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/strong_On-demand ERP for Rapid Reporting As_9ac58e'), 
    'On-demand ERP for Rapid Reporting Assistance')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/p_A dedicated ERP can undertake your report_14559b'), 
    'A dedicated ERP can undertake your reporting tasks as never before.  With the enhanced reporting capabilities, your company can fast react and respond to the data requests. Users can systematically generate and run secured crystal reports on their own without depending on the busy IT panel.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/strong_On-Time ERP, a Potential Point-of-Pr_0d433e'), 
    'On-Time ERP, a Potential Point-of-Productivity')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/p_Implementing a secured ERP suite will not_aedbd3'), 
    'Implementing a secured ERP suite will not only encourage outrageous business outputs but consequently results in the over-howling of the heterogeneous business processes from time to time. With your complicated business processes fully converged, you can now have substantial time to work on the most pressing projects priority. ')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/strong_User-centric ERP for User Compatibility'), 
    'User-centric ERP for User Compatibility ')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/p_Powerful ERP solutions are rolled up with_d40ef8'), 
    'Powerful ERP solutions are rolled up with the regulatory compliance of any organization for keeping track of the regulations within the industry while monitoring the amendments every now and then.  ')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/strong_Data Protection  Information Privacy'), 
    'Data Protection & Information Privacy')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/p_By hosting an ideal ERP in your premise, _5728c1'), 
    'By hosting an ideal ERP in your premise, you will be relieved from the horrific nightmares you often get on data security. The built-in resources and firewall in the new system will bet to offer confidentiality of the data from the unauthorized parties thereby saving your sensitive information from pilferage.  ')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/strong_Major Forecasting for Major Business_830df3'), 
    'Major Forecasting for Major Business Progress ')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/p_Our family of ERP solutions allows the wh_694d1e'), 
    'Our family of ERP solutions allows the white collar analysts to access best of the tools they need for predicting the current marketing conditions. Since the information sources and channels within the ERP are genuine, the dynamic businesses units can make realistic prediction for taking preventive step ahead in the future.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/strong_Hyperactive ERP offers Round-the-Clo_433d99'), 
    'Hyperactive ERP offers Round-the-Clock Troubleshooting')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/p_Your cloud powered business unit stacked _2194ff'), 
    'Your cloud powered business unit stacked with a dedicated ERP system requires a highly dedicated ERP service as well. The customers are entitled to maintenance and support services without having to face uncalled technical situations.  This way, you can maximize the value of your ERP and take complete advantage of the practical business models. Indeed, its your ERP that persuade you to keep your business performance to the peak.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/strong_How Ray Business Technologies is pro_fb26c5'), 
    'How Ray Business Technologies is providing Proven ERP Services & Solutions?')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/p_With the wake of the rising sun, our cert_bd3a48'), 
    'With the wake of the rising sun, our certified and honor-bound software developers begin resolving your hourly hinges and hypothetical hub situations from our Global Network Operations & Delivery Base in Hyderabad, India. Our domain experts deployed in our state-of-the-art facility performs majestic ERP implementations many of our clients scattered across hundreds of territories across the world.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/strong_Ray Business Technologies High Quali_7db7a4'), 
    'Ray Business Technologies High Quality Matrix ERP Services: ')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/p_Our ERP competencies are ergonomically de_d2eac1'), 
    'Our ERP competencies are ergonomically designed to enhance the performance of your system.\nWe make it obligatory to upgrade our spate of ERP services with prudential functionalities to benefit your business. You can trust us as our quintessential services are superior to any of our Rivals-in-the-Ring.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/strong_Our Proprietary ERP Services Offerings'), 
    'Our Proprietary ERP Services Offerings:')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/li_ERP Consulting'), 
    'ERP Consulting')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/li_Vulnerability Testing  Validation'), 
    'Vulnerability Testing & Validation')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/li_Design Optimization'), 
    'Design Optimization')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/li_Implementation  Risk Management'), 
    'Implementation & Risk Management')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/li_Lifecycle Management'), 
    'Lifecycle Management')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/li_Architectural Scheduling'), 
    'Architectural Scheduling')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/li_Third-party ERP Integrations'), 
    'Third-party ERP Integrations')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/li_Reporting  Analytics'), 
    'Reporting & Analytics')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/li_ERP Check, Calibration  Custodial Service'), 
    'ERP Check, Calibration & Custodial Service')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/li_Application Security, Control  Assessments'), 
    'Application Security, Control & Assessments')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/li_ERP Governance, Risk  Compliance Solution'), 
    'ERP Governance, Risk & Compliance Solution')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/strong_Ray Business Technologies Repertoire_1a6b54'), 
    'Ray Business Technologies Repertoire of Heterogeneous ERP Solutions: ')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/p_What we have for you in our hallway is Mi_145d84'), 
    'What we have for you in our hallway is Microsoft Dynamics, the Master ERP that has the horsepower capacity to beat the core competition. Thus, building a digital empire using Microsoft Dynamics is the order of the day. Today, more than 85% of the organizations are connecting to Microsoft Dynamics as these solutions ensure data aggregation, intelligence, financial reporting, strong backup, disaster recovery so on and so forth.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/strong_Our Extensive ERP Product Boilerplate'), 
    'Our Extensive ERP Product Boilerplate:')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/strong_Microsoft Dynamics AX'), 
    'Microsoft Dynamics AX')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/p_Charting on the Microsoft Dynamics AX wil_950780'), 
    'Charting on the Microsoft Dynamics AX will pave a silky road against all the technical obstacles. The ruling ERP is embedded with characteristic capabilities to assist the global enterprises with outstanding business solutions. Dynamics AX is suitably exploited by mixed industrial domains including Budget Planning, e-procurement, Demand forecasting and more.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/strong_Dynamics AX Services Capsule'), 
    'Dynamics AX Services Capsule:')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/li_Dynamics AX Technology Consultancy'), 
    'Dynamics AX Technology Consultancy')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/li_Dynamics AX Development'), 
    'Dynamics AX Development')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/li_Dynamics AX Reporting  Analytics'), 
    'Dynamics AX Reporting & Analytics')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/li_Dynamics AX Integration  Upgrade'), 
    'Dynamics AX Integration & Upgrade')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/li_Dynamics AX Administration'), 
    'Dynamics AX Administration')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/strong_Microsoft Dynamics NAV'), 
    'Microsoft Dynamics NAV')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/p_With a sustainable Microsoft Dynamics NAV_01fc03'), 
    'With a sustainable Microsoft Dynamics NAV in the stream, the aspiring organizations like yours can visualize the positive prospects across Project Management, Manufacturing, Distribution, Public, Retail and other industries. Using Dynamics NAV, your company can harvest impeccable gains by managing core financial and non-financial operations with a great propensity.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/strong_Dynamics NAV Services Capsule'), 
    'Dynamics NAV Services Capsule:')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/li_Dynamics NAV Technology Consultancy'), 
    'Dynamics NAV Technology Consultancy')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/li_Dynamics NAV Development'), 
    'Dynamics NAV Development')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/li_Dynamics NAV Master Maintenance  Support'), 
    'Dynamics NAV Master Maintenance & Support')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/li_Dynamics NAV Knowledge  End-user Training'), 
    'Dynamics NAV Knowledge & End-user Training')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/li_Dynamics NAV Reporting  Analytics'), 
    'Dynamics NAV Reporting & Analytics')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/li_Dynamics NAV Integration  Upgrade'), 
    'Dynamics NAV Integration & Upgrade')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/strong_What Industrial Verticals We Have Worked on'), 
    'What Industrial Verticals We Have Worked on?')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/li_Research  Development'), 
    'Research & Development')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/li_Healthcare'), 
    'Healthcare')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/li_Fast Moving Consumer Goods'), 
    'Fast Moving Consumer Goods')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/li_Biotechnology'), 
    'Biotechnology')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/li_Government'), 
    'Government')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/li_Energy, Crude Oil  Natural Gas'), 
    'Energy, Crude Oil & Natural Gas')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/li_Banking  Financial Service Institutions'), 
    'Banking & Financial Service Institutions')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/AI inner page objects (1)/Page_ERP Services  Dynamics AX, NAV Solutions/li_Semiconductor'), 
    'Semiconductor')

WebUI.callTestCase(findTestCase('RBT/Artificial intelligence page/TS_002_Artificial Intelligence Page Menu Links/Enterprise Resource Planning Page/TC_02'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

