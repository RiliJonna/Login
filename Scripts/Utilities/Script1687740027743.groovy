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

WebUI.navigateToUrl('https://cmiti-dev.outsystemsenterprise.com/STOCKSADMINSYSTEMS/Login')

WebUI.setText(findTestObject('Object Repository/Utilities/Page_Login/input_Username_Input_UsernameVal'), 'Jonna123')

WebUI.setEncryptedText(findTestObject('Object Repository/Utilities/Page_Login/input_Password_Input_PasswordVal'), '/0uPZ2kQQXb3soOvO7ZBrA==')

WebUI.click(findTestObject('Object Repository/Utilities/Page_Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Utilities/Page_Dashboard/span_Utilities'))

WebUI.click(findTestObject('Object Repository/Utilities/Page_Dashboard/span_User Management'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Utilities/Page_UserManagement/select_----5--------10--------15--------20-_8e1c87'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Utilities/Page_UserManagement/select_----5--------10--------15--------20-_8e1c87'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Utilities/Page_UserManagement/select_----5--------10--------15--------20-_8e1c87'), 
    '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Utilities/Page_UserManagement/select_----5--------10--------15--------20-_8e1c87'), 
    '4', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Utilities/Page_UserManagement/select_----5--------10--------15--------20-_8e1c87'), 
    '5', true)

WebUI.click(findTestObject('Object Repository/Utilities/Page_UserManagement/div_Utilities'))

WebUI.click(findTestObject('Object Repository/Utilities/Page_UserManagement/a_Parameters'))

WebUI.click(findTestObject('Object Repository/Utilities/Page_Parameters/div_Utilities_osui-submenu__header__icon'))

WebUI.click(findTestObject('Object Repository/Utilities/Page_Parameters/a_Manage Roles'))

WebUI.click(findTestObject('Object Repository/Utilities/Page_ManageRoles/span_App Admin'))

WebUI.click(findTestObject('Object Repository/Utilities/Page_ManageRoles/span_Area Manager'))

WebUI.click(findTestObject('Object Repository/Utilities/Page_ManageRoles/span_Book Keeper'))

WebUI.click(findTestObject('Object Repository/Utilities/Page_ManageRoles/span_Compliance'))

WebUI.click(findTestObject('Object Repository/Utilities/Page_ManageRoles/span_Finance'))

WebUI.click(findTestObject('Object Repository/Utilities/Page_ManageRoles/span_Risk'))

WebUI.click(findTestObject('Object Repository/Utilities/Page_ManageRoles/span_Sec Admin'))

WebUI.click(findTestObject('Object Repository/Utilities/Page_ManageRoles/span_Stock Admin'))

WebUI.click(findTestObject('Object Repository/Utilities/Page_ManageRoles/i_StockCertificate_icon fa fa-power-off fa-2x'))

WebUI.click(findTestObject('Object Repository/Utilities/Page_ManageRoles/button_Logout'))

WebUI.closeBrowser()

