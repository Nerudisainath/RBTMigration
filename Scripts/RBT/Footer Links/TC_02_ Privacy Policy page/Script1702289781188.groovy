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

WebUI.scrollToElement(findTestObject('Object Repository/RBT/Footer page objects/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/h3_Request for Quote'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Footer page objects/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/a_PRIVACY POLICY'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Privacy Policy - Ray Business Technologies/h2_Technology  People  Process'), 
    'Technology + People + Process')

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_Privacy Policy - Ray Business Technologies/img_Technology  People  Process_img-responsive'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_Privacy Policy - Ray Business Technologies/a_Blog'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_Privacy Policy - Ray Business Technologies/a_Careers'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_Privacy Policy - Ray Business Technologies/a_Contact'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_Privacy Policy - Ray Business Technologies/a_Industries'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_Privacy Policy - Ray Business Technologies/a_Products'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_Privacy Policy - Ray Business Technologies/a_Request for quote'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_Privacy Policy - Ray Business Technologies/a_Resources'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_Privacy Policy - Ray Business Technologies/a_Solutions'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Privacy Policy - Ray Business Technologies/a_Home'), 
    'Home')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Privacy Policy - Ray Business Technologies/h1_Privacy Policy'), 
    'Privacy Policy')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Privacy Policy - Ray Business Technologies/p_4 min read'), 
    '4 MIN READ')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Privacy Policy - Ray Business Technologies/p_Please read carefully'), 
    'Please read carefully...')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Privacy Policy - Ray Business Technologies/h3_Ray Business Technologies takes your pri_5c5759'), 
    'Ray Business Technologies takes your privacy very seriously.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Privacy Policy - Ray Business Technologies/p_In general, you can visit Ray Business Te_178ffc'), 
    'In general, you can visit Ray Business Technologies websites without telling us who you are and without revealing any information about yourself. There are times, however, when we may need information from you.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Privacy Policy - Ray Business Technologies/p_Ray Business Technologies does not rent, _a181a7'), 
    'Ray Business Technologies does not rent, sell, or share personal information about you with other people or nonaffiliated companies except to provide products or services you\'ve requested, when we have your permission, or under the following circumstances:')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Privacy Policy - Ray Business Technologies/p_We provide the information to trusted par_002714'), 
    'We provide the information to trusted partners who work on behalf of or with Ray Business Technologies under extremely strict confidentiality agreements. These companies may use your personal information to help Ray Business Technologies communicate with you about offers from Ray Business Technologies and our marketing partners. However, these companies do not have any independent right to share this information.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Privacy Policy - Ray Business Technologies/p_We have a parents permission to share the_52eade'), 
    'We have a parent\'s permission to share the information if the user is a child under age 13. We respond to subpoenas, court orders, or legal process, or to establish or exercise our legal rights or defend against legal claims.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Privacy Policy - Ray Business Technologies/p_We believe it is necessary to share infor_d56b35'), 
    'We believe it is necessary to share information in order to investigate, prevent, or take action regarding illegal activities, suspected fraud, situations involving potential threats to the physical safety of any person, or as otherwise required by law.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Privacy Policy - Ray Business Technologies/p_We transfer information about you if Ray _b28fb4'), 
    'We transfer information about you if Ray Business Technologies is acquired by or merged with another company. You may choose to give us personal information, such as your name and address or e-mail id that may be needed, for example, to correspond with you, to download our white papers or to provide you with a subscription. If you tell us that you do not want us to use this information as a basis for further contact with you, we will respect your wishes. We intend to protect the quality and integrity of your personally identifiable information.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Privacy Policy - Ray Business Technologies/p_We will make a sincere effort to respond _97ce87'), 
    'We will make a sincere effort to respond in a timely manner to your requests to correct inaccuracies in your personal information. To correct inaccuracies in your personal information please return the message containing the inaccuracies to the sender with details of the correction requested.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Privacy Policy - Ray Business Technologies/strong_Cookies and other technologies'), 
    'Cookies and other technologies')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Privacy Policy - Ray Business Technologies/p_Cookies and other technologiesWe sometime_ccd703'), 
    'Cookies and other technologies\nWe sometimes collect anonymous information from visits to our sites to help us provide better customer service. For example, we keep track of the domains from which people visit and we also measure visitor activity on Ray Business Technologies web sites, but we do so in ways that keep the information anonymous. Ray Business Technologies or its affiliates or vendors may use this data to analyze trends and statistics and to help us provide better customer service. We maintain the highest levels of confidentiality for this information, our affiliates and vendors follow the same high levels of confidentiality. This anonymous information is used and analyzed only at an aggregate level to help us understand trends and patterns. None of this information is reviewed at an individual level. If you do not want your transaction details used in this manner, you can either disable your cookies or opt-out at the download or request page. Check the complete Cookie Policy details here.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Privacy Policy - Ray Business Technologies/strong_Mailers'), 
    'Mailers')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Privacy Policy - Ray Business Technologies/p_MailersRay Business Technologies may, if _829d24'), 
    'Mailers\nRay Business Technologies may, if you so choose, send direct mailers to you at the address given by you. You have the option to \'opt-out\' of this direct mailer by way of links provided at the bottom of each mailer. We respect your privacy and in the event that you choose to not receive such mailers, we will take all steps to remove you from the list.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Privacy Policy - Ray Business Technologies/strong_AntiSpam policy'), 
    'AntiSpam policy')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Privacy Policy - Ray Business Technologies/p_AntiSpam policyRay Business Technologies _475943'), 
    'AntiSpam policy\nRay Business Technologies recognizes the receipt, transmission or distribution of spam emails (unsolicited bulk emails) as a major concern and has taken reasonable measures, to minimize the transmission and effect of spam emails in its computing environment. All emails received by Ray Business Technologies, are subject to spam check, in coordination with “SPAMHAUS” subscription service. Any email identified as spam will be rejected with sufficient information to the Sender for taking necessary action. With this measure, along with other technical spam reduction measures, Ray Business Technologies hopes to minimize the effect of spam emails. Ray Business Technologies reserves the right to reject and/or report any suspicious spam emails, to the authorities concerned, for necessary action, from time to time.')

