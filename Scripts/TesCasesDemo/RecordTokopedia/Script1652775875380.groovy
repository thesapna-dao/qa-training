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

WebUI.navigateToUrl('https://www.tokopedia.com/')

WebUI.setText(findTestObject('Object Repository/Page_Situs Jual Beli Online Terlengkap, Mud_c2d1e5/input_Kategori_css-ubsgp5 e110g5pc0'), 
    'sepatu olahraga ')

WebUI.sendKeys(findTestObject('Object Repository/Page_Situs Jual Beli Online Terlengkap, Mud_c2d1e5/input_Kategori_css-ubsgp5 e110g5pc0'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Jual sepatu olahraga  Tokopedia/div_Bisa pilih alamat pengirimanmu dulu_unf_c11ad3'))

WebUI.click(findTestObject('Object Repository/Page_Jual sepatu olahraga  Tokopedia/img_Cek Sekarang_css-1c345mg'))

WebUI.click(findTestObject('Object Repository/Page_Jual sepatu olahraga  Tokopedia/div_Larocking - Emperor Putih Abu  Sepatu S_7c95e7'))

WebUI.click(findTestObject('Object Repository/Page_Promo Larocking - Emperor Putih Abu  S_8b99ae/h2_Ulasan(1152)Larocking - Emperor Putih Ab_2e7356'))

WebUI.click(findTestObject('Object Repository/Page_Promo Larocking - Emperor Putih Abu  S_8b99ae/p_Terpilih Putih Abu, 44'))

WebUI.click(findTestObject('Object Repository/Page_Promo Larocking - Emperor Putih Abu  S_8b99ae/img'))

WebUI.click(findTestObject('Object Repository/Page_Promo Larocking - Emperor Putih Abu  S_8b99ae/label_44PROMO'))

WebUI.click(findTestObject('Object Repository/Page_Promo Larocking - Emperor Putih Abu  S_8b99ae/span_44'))

WebUI.click(findTestObject('Object Repository/Page_Promo Larocking - Emperor Putih Abu  S_8b99ae/button_44PROMO'))

WebUI.click(findTestObject('Object Repository/Page_Promo Larocking - Emperor Putih Abu  S_8b99ae/span_Keranjang'))

WebUI.click(findTestObject('Object Repository/Page_Promo Larocking - Emperor Putih Abu  S_8b99ae/button_Metode Lain'))

WebUI.click(findTestObject('Object Repository/Page_Promo Larocking - Emperor Putih Abu  S_8b99ae/button_Google'))

WebUI.switchToWindowTitle('Login - Akun Google')

WebUI.setText(findTestObject('Object Repository/Page_Login - Akun Google/input_Tokopedia_identifier'), 'thesapnadao@gmail.com')

WebUI.sendKeys(findTestObject('Object Repository/Page_Login - Akun Google/input_Tokopedia_identifier'), Keys.chord(Keys.ENTER))

WebUI.closeBrowser()

