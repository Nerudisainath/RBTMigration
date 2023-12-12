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

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/a_TERMS OF USE'), 
    0)

WebUI.click(findTestObject('Object Repository/RBT/Footer page objects/Page_AI, Dynamics 365 ERP  CRM, Kentico, Si_bac1b0/a_TERMS OF USE'))

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Terms of Use - Ray Business Technologies/h2_Terms of Use for www.raybiztech.com'), 
    'Terms of Use for www.raybiztech.com')

WebUI.verifyElementVisible(findTestObject('Object Repository/RBT/Footer page objects/Page_Terms of Use - Ray Business Technologies/img_Terms of Use for www.raybiztech.com_img_cc91e5'))

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_Terms of Use - Ray Business Technologies/a_Blog'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_Terms of Use - Ray Business Technologies/a_Careers'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_Terms of Use - Ray Business Technologies/a_Contact'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_Terms of Use - Ray Business Technologies/a_Industries'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_Terms of Use - Ray Business Technologies/a_Products'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_Terms of Use - Ray Business Technologies/a_Request for quote'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_Terms of Use - Ray Business Technologies/a_Resources'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/RBT/Footer page objects/Page_Terms of Use - Ray Business Technologies/a_Solutions'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Terms of Use - Ray Business Technologies/a_Home'), 
    'Home')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Terms of Use - Ray Business Technologies/span_Terms of Use'), 
    'Terms of Use')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Terms of Use - Ray Business Technologies/h1_Terms of Use'), 
    'Terms of Use')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Terms of Use - Ray Business Technologies/p_5 min read'), 
    '5 MIN READ')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Terms of Use - Ray Business Technologies/p_This Web Site is provided by Ray Business_d5ddb1'), 
    'This Web Site is provided by Ray Business Technologies, a company incorporated under the Companies Act, 1956 of India, having its registered office at Plot 204, Kavuri Hills, Hyderabad-500033. India and shall be used for informational purposes only.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Terms of Use - Ray Business Technologies/p_The User shall be deemed to have accepted_07f7b2'), 
    'The User shall be deemed to have accepted and agreed to the following terms and conditions upon the Users usage of the website www.raybiztech.com')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Terms of Use - Ray Business Technologies/li_The term User means the User who is brow_30abcb'), 
    'The term "User" means the User who is browsing the website www.raybiztech.com (Internet Website).')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Terms of Use - Ray Business Technologies/li_The domain address www.raybiztech.com is_39bf70'), 
    'The domain address www.raybiztech.com is owned by Ray Business Technologies. All content on this Site, including all the software, text, images, graphics, video and audio used on this Site, is exclusive and proprietary material owned by Ray Business Technologies.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Terms of Use - Ray Business Technologies/li_Ray Business Technologiesname and logo b_2ab0d4'), 
    'Ray Business Technologies name and logo belongs to and are owned by Ray Business Technologies. These name and logo may not be used in any manner whatsoever without prior written consent from Ray Business Technologies.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Terms of Use - Ray Business Technologies/li_No material from this site may be copied_369777'), 
    'No material from this site may be copied, modified, reproduced, republished, uploaded, transmitted, posted or distributed in any form without prior written permission from Ray Business Technologies. All rights not expressly granted herein are reserved.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Terms of Use - Ray Business Technologies/li_Unauthorized use of the materials appear_3d3d88'), 
    'Unauthorized use of the materials appearing on this Site may violate copyright, trademark and other applicable laws, and could result in criminal or civil penalties. Ray Business Technologies may monitor access to the Site.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Terms of Use - Ray Business Technologies/li_Ray Business Technologiesmay terminate t_b7db81'), 
    'Ray Business Technologies may terminate the User\'s access to the Site at any time for any reason. The provisions regarding disclaimer of warranty, accuracy of information, and indemnification shall survive such termination.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Terms of Use - Ray Business Technologies/li_Ray Business Technologies makes no warra_b8db76'), 
    'Ray Business Technologies makes no warranties, express or implied, including, without limitation, those of merchantability and fitness for a particular purpose, with respect to any information, data, statements or products made available on the Site.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Terms of Use - Ray Business Technologies/li_The Site, and all content, materials, in_45a435'), 
    'The Site, and all content, materials, information, software, products and services provided on the Site, are provided on an "as is" and "as available" basis.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Terms of Use - Ray Business Technologies/li_Ray Business Technologies shall have no _0ffe03'), 
    'Ray Business Technologies shall have no responsibility for any damage to User\'s computer system or loss of data that results from the download of any content, materials, information from the Site.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Terms of Use - Ray Business Technologies/li_Ray Business Technologies may unilateral_77422e'), 
    'Ray Business Technologies may unilaterally change or discontinue any aspect of the Site at any time, including, its content or features.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Terms of Use - Ray Business Technologies/li_Ray Business Technologies will not be li_1bf559'), 
    'Ray Business Technologies will not be liable for damages of any kind, including without limitation, direct, indirect, incidental or consequential damages (including, but not limited to, damages for lost profits, business interruption and loss of programs or information) arising out of the use of or inability to use the Site, or any information provided on the Site, or for any other reason whatsoever.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Terms of Use - Ray Business Technologies/li_The User agrees to indemnify, defend and_98d27c'), 
    'The User agrees to indemnify, defend and hold Ray Business Technologies  harmless from and against all losses, expenses, damages and costs, including reasonable attorneys\' fees, arising out of or relating to any misuse by the User of the content and services provided on the Site.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Terms of Use - Ray Business Technologies/li_The information contained in the Site ha_c4df02'), 
    'The information contained in the Site has been obtained from sources believed to be reliable. Ray Business Technologies disclaims all warranties as to the accuracy, completeness or adequacy of such information.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Terms of Use - Ray Business Technologies/li_The Site provides links to web sites and_3ff084'), 
    'The Site provides links to web sites and access to content, products and services from third parties, including users, advertisers, affiliates and sponsors of the Site. The User agrees that Ray Business Technologies is not responsible for the availability of, and content provided on, third party web sites. The User is requested to peruse the policies posted by other web sites regarding privacy and other topics before use. Ray Business Technologies is not responsible for third party content accessible through the Site, including opinions, advice, statements and advertisements, and the User shall bear all risks associated with the use of such content. Ray Business Technologies is not responsible for any loss or damage of any sort that the User may incur from dealing with any third party.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Terms of Use - Ray Business Technologies/li_Ray Business Technologiesmakes no warran_24f2e2'), 
    'Ray Business Technologies makes no warranty that: (a) the Site will meet your requirements; (b) the Site will be available on an uninterrupted, timely, secure, or error-free basis; (c) the results that may be obtained from the use of the Site or any services offered through the Site will be accurate or reliable.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Terms of Use - Ray Business Technologies/strong_BLOGS'), 
    'BLOGS')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Terms of Use - Ray Business Technologies/p_This is to inform and clarify that indivi_412d79'), 
    'This is to inform and clarify that individuals (including but not limited to employees of Ray Business Technologies and referred to as “Individuals” hereafter) may contribute articles and opinions on this Web Site entirely at the sole discretion of Ray Business Technologies, in the form of “blogs”, as such term is generally understood. You hereby acknowledge and agree that these blogs constitute the opinion of the Individuals in their personal capacity, and may not represent official positions of Ray Business Technologies in any manner.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Terms of Use - Ray Business Technologies/p_You may be permitted to post comments and_0d0a91'), 
    'You may be permitted to post comments and feedback to these blogs. By doing so, You expressly agree and acknowledge to abide by the following:')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Terms of Use - Ray Business Technologies/li_You shall not defame, abuse, harass or t_d5f1bc'), 
    'You shall not defame, abuse, harass or threaten Ray Business Technologies or any third party, or otherwise violate the legal rights of Ray Business Technologies or any third party.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Terms of Use - Ray Business Technologies/li_You shall not contribute any content or _86d903'), 
    'You shall not contribute any content or take any action that may in any manner adversely affect the reputation of Ray Business Technologies or that is otherwise detrimental to Ray Business Technologies.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Terms of Use - Ray Business Technologies/li_You shall not in any manner publish or p_cb92b8'), 
    'You shall not in any manner publish or post any inappropriate, defamatory, infringing, obscene, racist, terrorist, politically slanted, indecent or unlawful topic, name, material or information.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Terms of Use - Ray Business Technologies/li_You shall not use profane and objectiona_9c4e76'), 
    'You shall not use profane and objectionable language or abbreviations. You shall not use any character(s) as a substitute for objectionable language.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Terms of Use - Ray Business Technologies/li_You shall not defame, abuse, harass, sta_1507f4'), 
    'You shall not defame, abuse, harass, stalk, threaten or otherwise violate the legal rights (such as rights of privacy and publicity but not limited to the foregoing) of any other party including Ray Business Technologies.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Terms of Use - Ray Business Technologies/li_You shall not upload or otherwise make a_1d7aa8'), 
    'You shall not upload or otherwise make available, files that contain images, photographs, software or other material protected by intellectual property laws, including, by way of example, and not as limitation, copyright or trademark laws (or by rights of privacy or publicity) unless You own or control the rights thereto or have received all necessary consent to do the same.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Terms of Use - Ray Business Technologies/li_You shall not upload files that contain _7a0a36'), 
    'You shall not upload files that contain viruses, trojan horses, worms, time bombs, cancelbots, corrupted files, or any other similar software or programs that may damage the operation of another\'s computer or property of another.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Terms of Use - Ray Business Technologies/li_You shall not create a false identity fo_26dab2'), 
    'You shall not create a false identity for the purpose of misleading others.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Terms of Use - Ray Business Technologies/li_You shall not in any way deface or vanda_18079d'), 
    'You shall not in any way deface or vandalize this Web Site, or prevent or restrict others from using this Web Site.')

WebUI.verifyElementText(findTestObject('Object Repository/RBT/Footer page objects/Page_Terms of Use - Ray Business Technologies/li_You acknowledge that Ray Business Techno_7058b4'), 
    'You acknowledge that Ray Business Technologies may, at its sole discretion, monitor, remove or edit any content that you contribute. Ray Business Technologies may also pursue remedies available to it under law for any violation of these terms and conditions.')

WebUI.closeBrowser()

