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

WebUI.navigateToUrl('https://about.gitlab.com/')

WebUI.click(findTestObject('Object Repository/Page_The One DevOps Platform  GitLab/svg'))

WebUI.click(findTestObject('Object Repository/Page_The One DevOps Platform  GitLab/a_Register'))

WebUI.click(findTestObject('Object Repository/Page_Sign up  GitLab/span_GitHub'))

WebUI.setText(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/input_Username or email address_login'), 
    'thesapnadao@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/input_Password_password'), 'vqsWm2tcnI55KWI2Dvwx3g==')

WebUI.click(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/input_Password_commit'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/input_Password_password'), 'vqsWm2tcnI5CwY53BCeIqQ==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/input_Password_password'), Keys.chord(Keys.ENTER))

WebUI.closeBrowser()

