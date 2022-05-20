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

WebUI.navigateToUrl('https://news.detik.com/')

WebUI.setText(findTestObject('Object Repository/Page_detikNews - Berita hari ini di Indones_e9bcaf/input_CXO Media_query'), 
    'pasukan uk')

WebUI.click(findTestObject('Object Repository/Page_detikNews - Berita hari ini di Indones_e9bcaf/div_pasukan ukraina'))

WebUI.click(findTestObject('Object Repository/Page_detikNews - Berita hari ini di Indones_e9bcaf/button_CXO Media_dtkframebar__icons dtkfram_856c15'))

WebUI.click(findTestObject('Object Repository/Page_detiksearch/span_concat(, , pasukan ukraina, , )_ratiob_fc0e98'))

WebUI.click(findTestObject('Object Repository/Page_Ukraina Evakuasi Pasukan, Rusia Pegang_cc3ad6/a_SEA Games 2021 Susunan Pemain Indonesia V_04d0a6'))

WebUI.closeBrowser()

