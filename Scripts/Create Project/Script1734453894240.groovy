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

WebUI.callTestCase(findTestCase('Login Test'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_MCGM/button_Projects'))

WebUI.click(findTestObject('Object Repository/Page_MCGM/a_Create New Project'))

WebUI.click(findTestObject('Object Repository/Page_MCGM/a_Save Plot Details'))

WebUI.click(findTestObject('Object Repository/Page_MCGM/input_Planning Authority for the project_rd_c3a9de'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MCGM/select_SelectBP Special CellCityEastern Sub_1ec836'), 
    '2008', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MCGM/select_SelectA WardB WardC WardD WardE Ward_7fcc4c'), 
    '2009', true)

WebUI.click(findTestObject('Object Repository/Page_MCGM/input_This plot belongs to_rdbIsThisPlotHaving'))

WebUI.setText(findTestObject('Object Repository/Page_MCGM/textarea_Proposed CTS No. for this project_arrCTS'), '101')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MCGM/select_SelectCOLABAFORT'), '2027', true)

WebUI.setText(findTestObject('Object Repository/Page_MCGM/input__txtGrossPlotArea'), '100')

WebUI.setText(findTestObject('Object Repository/Page_MCGM/input_SAC No_txtSACNO'), '5678')

WebUI.setText(findTestObject('Object Repository/Page_MCGM/input_Road  Street Name_txtRoadStreetNm'), 'Test')

WebUI.setText(findTestObject('Object Repository/Page_MCGM/input_DP Zone_txtPlotDPZone'), '')

WebUI.click(findTestObject('Object Repository/Page_MCGM/input_DP Zone_txtPlotDPZone'))

WebUI.setText(findTestObject('Object Repository/Page_MCGM/input_Lattitude_txtLattitude'), '50')

WebUI.setText(findTestObject('Object Repository/Page_MCGM/input_Longitude_txtLongitude'), '51')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MCGM/select_----------General Category-------Res_152c44'), 
    'Residential', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MCGM/select_SelectBungalowDwellingSemi-Detached _384c95'), 
    '249', true)

WebUI.setText(findTestObject('Object Repository/Page_MCGM/input__txtPlotNo'), '101')

WebUI.click(findTestObject('Object Repository/Page_MCGM/input_Yes_rdoRoadPresent'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MCGM/select_----- Select ----NarrowRegular'), 'NARROW', 
    true)

WebUI.click(findTestObject('Object Repository/Page_MCGM/input__addRow'))

WebUI.click(findTestObject('Object Repository/Page_MCGM/button_OK'))

WebUI.click(findTestObject('Object Repository/Page_MCGM/input_CTS No_rdbIsThisPlotHaving'))

WebUI.click(findTestObject('Object Repository/Page_MCGM/a_Project Info'))

WebUI.click(findTestObject('Object Repository/Page_MCGM/input_Proposal is as per_rdbDPPlan'))

WebUI.setText(findTestObject('Object Repository/Page_MCGM/textarea_(Note , , - characters are not all_98720d'), 'Test')

WebUI.setText(findTestObject('Object Repository/Page_MCGM/textarea__txtPropertyAddress'), 'Test1')

WebUI.setText(findTestObject('Object Repository/Page_MCGM/input__txtLandmark'), 'Test2')

WebUI.setText(findTestObject('Object Repository/Page_MCGM/input__txtPincode'), '')

WebUI.click(findTestObject('Object Repository/Page_MCGM/input__txtPincode'))

WebUI.doubleClick(findTestObject('Object Repository/Page_MCGM/input__txtPincode'))

WebUI.setText(findTestObject('Object Repository/Page_MCGM/input__txtPincode'), '500000')

WebUI.setText(findTestObject('Object Repository/Page_MCGM/input__txtFullNameofApplicant'), '')

WebUI.click(findTestObject('Object Repository/Page_MCGM/input__txtFullNameofApplicant'))

WebUI.doubleClick(findTestObject('Object Repository/Page_MCGM/input__txtFullNameofApplicant'))

WebUI.setText(findTestObject('Object Repository/Page_MCGM/input__txtFullNameofApplicant'), 'Test1')

WebUI.setText(findTestObject('Object Repository/Page_MCGM/input__txtAddressofApplicant'), '')

WebUI.click(findTestObject('Object Repository/Page_MCGM/input__txtAddressofApplicant'))

WebUI.doubleClick(findTestObject('Object Repository/Page_MCGM/input__txtAddressofApplicant'))

WebUI.setText(findTestObject('Object Repository/Page_MCGM/input__txtAddressofApplicant'), 'Test2')

WebUI.click(findTestObject('Object Repository/Page_MCGM/input_Project Info_btnsaveCAF'))

WebUI.click(findTestObject('Object Repository/Page_MCGM/button_OK_1'))

WebUI.click(findTestObject('Object Repository/Page_MCGM/a_Save Plot Details'))

WebUI.click(findTestObject('Object Repository/Page_MCGM/input_Have Paid Latest Current Year Propert_a6f2fc'))

WebUI.click(findTestObject('Object Repository/Page_MCGM/button_OK_1_2'))

WebUI.click(findTestObject('Object Repository/Page_MCGM/a_Applicant Details'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MCGM/select_SelectOwner as per Revenue recordLic_a77879'), 
    '8', true)

WebUI.click(findTestObject('Object Repository/Page_MCGM/div_Plumbing Consultant                    _6ac1c5'))

WebUI.click(findTestObject('Object Repository/Page_MCGM/span_Select'))

WebUI.click(findTestObject('Object Repository/Page_MCGM/li_Acharekar Avdhut B'))

WebUI.setText(findTestObject('Object Repository/Page_MCGM/textarea__txtResidentialAddress'), ' Test')

WebUI.setText(findTestObject('Object Repository/Page_MCGM/input_Aadhar No_txtAadharNo'), '')

WebUI.click(findTestObject('Object Repository/Page_MCGM/input_Aadhar No_txtAadharNo'))

WebUI.doubleClick(findTestObject('Object Repository/Page_MCGM/input_Aadhar No_txtAadharNo'))

WebUI.setText(findTestObject('Object Repository/Page_MCGM/input_Aadhar No_txtAadharNo'), '222222222222')

WebUI.click(findTestObject('Object Repository/Page_MCGM/input_Aadhar No_btnAdd'))

WebUI.click(findTestObject('Object Repository/Page_MCGM/button_OK_1_2_3'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MCGM/select_SelectOwner as per Revenue recordLic_a77879'), 
    '2', true)

WebUI.doubleClick(findTestObject('Object Repository/Page_MCGM/span_Select'))

WebUI.click(findTestObject('Object Repository/Page_MCGM/li_1)  KALPANA V. DOSHI  2) VIJAY K. DOSHI'))

WebUI.setText(findTestObject('Object Repository/Page_MCGM/textarea__txtResidentialAddress'), ' Test')

WebUI.setText(findTestObject('Object Repository/Page_MCGM/input_Aadhar No_txtAadharNo'), '')

WebUI.click(findTestObject('Object Repository/Page_MCGM/input_Aadhar No_txtAadharNo'))

WebUI.doubleClick(findTestObject('Object Repository/Page_MCGM/input_Aadhar No_txtAadharNo'))

WebUI.setText(findTestObject('Object Repository/Page_MCGM/input_Aadhar No_txtAadharNo'), '222222222222')

WebUI.click(findTestObject('Object Repository/Page_MCGM/input_Aadhar No_btnAdd'))

WebUI.click(findTestObject('Object Repository/Page_MCGM/button_OK_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Page_MCGM/a_Building Details'))

WebUI.setText(findTestObject('Object Repository/Page_MCGM/input_Name_Addbuildingtxt_BuildingName'), 'Test')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MCGM/select_selectR1R2C1C2I1I2I3Green ZoneSpecia_ce9c43'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MCGM/select_Select UseResidentialcommercialResic_5da3ea'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MCGM/select_Select SubUseResi. ApartmentsRooming_32f189'), 
    '13', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MCGM/select_SelectRow HouseDetached HouseSemi-De_831e64'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Page_MCGM/input_Height  (Mtr.)_AddbuildingtxtHeight'))

WebUI.doubleClick(findTestObject('Object Repository/Page_MCGM/input_Height  (Mtr.)_AddbuildingtxtHeight'))

WebUI.setText(findTestObject('Object Repository/Page_MCGM/input_Height  (Mtr.)_AddbuildingtxtHeight'), '5')

WebUI.setText(findTestObject('Object Repository/Page_MCGM/input_FSI Built up Area (Sq. mtrs.)_Addbuil_32c922'), '')

WebUI.doubleClick(findTestObject('Object Repository/Page_MCGM/input_FSI Built up Area (Sq. mtrs.)_Addbuil_32c922'))

WebUI.setText(findTestObject('Object Repository/Page_MCGM/input_FSI Built up Area (Sq. mtrs.)_Addbuil_32c922'), '100')

WebUI.setText(findTestObject('Object Repository/Page_MCGM/input_Gross Construction Area (Sq. mtrs.)_A_a70d88'), '')

WebUI.click(findTestObject('Object Repository/Page_MCGM/input_Gross Construction Area (Sq. mtrs.)_A_a70d88'))

WebUI.setText(findTestObject('Object Repository/Page_MCGM/input_Gross Construction Area (Sq. mtrs.)_A_a70d88'), '150')

WebUI.click(findTestObject('Object Repository/Page_MCGM/input_Gross Construction Area (Sq. mtrs.)_A_7285a7'))

WebUI.click(findTestObject('Object Repository/Page_MCGM/button_OK_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Page_MCGM/a_Area Details'))

WebUI.setText(findTestObject('Object Repository/Page_MCGM/input_Area Details_ucAreaRptAreaDetailsctl0_e62e63'), 'Test')

WebUI.click(findTestObject('Object Repository/Page_MCGM/input_Least Area_ucAreaRptAreaDetailsctl01b_d89a03'))

WebUI.setText(findTestObject('Object Repository/Page_MCGM/input_Least Area_ucAreaRptAreaDetailsctl01r_823ecd'), '5')

WebUI.click(findTestObject('Object Repository/Page_MCGM/div_Area Details                           _e76596'))

WebUI.doubleClick(findTestObject('Object Repository/Page_MCGM/input_Area Details_ucAreaRptAreaDetailsctl0_6bc619'))

WebUI.doubleClick(findTestObject('Object Repository/Page_MCGM/input_Area Details_ucAreaRptAreaDetailsctl0_6bc619'))

WebUI.doubleClick(findTestObject('Object Repository/Page_MCGM/input_Area Details_ucAreaRptAreaDetailsctl0_6bc619'))

WebUI.setText(findTestObject('Object Repository/Page_MCGM/input_Area Details_ucAreaRptAreaDetailsctl0_6bc619'), 'Tets3')

WebUI.click(findTestObject('Object Repository/Page_MCGM/input_Total_ucAreaRptAreaDetailsctl01btnSave'))

WebUI.click(findTestObject('Object Repository/Page_MCGM/button_OK_1_2_3_4_5_6'))

WebUI.click(findTestObject('Object Repository/Page_MCGM/a_Project Library'))

WebUI.click(findTestObject('Object Repository/Page_MCGM/td_'))

WebUI.switchToWindowTitle('Attach File')

WebUI.click(findTestObject('Object Repository/Page_Attach File/input_Attachments_btnAttached'))

WebUI.click(findTestObject('Object Repository/Page_Attach File/button_Submit'))

WebUI.switchToWindowTitle('MCGM')

WebUI.click(findTestObject('Object Repository/Page_MCGM/td__1'))

WebUI.switchToWindowTitle('Attach File')

WebUI.click(findTestObject('Object Repository/Page_Attach File/input_Attachments_btnAttached'))

WebUI.click(findTestObject('Object Repository/Page_Attach File/button_Submit'))

WebUI.switchToWindowTitle('MCGM')

WebUI.click(findTestObject('Object Repository/Page_MCGM/td__1_2'))

WebUI.switchToWindowTitle('Attach File')

WebUI.click(findTestObject('Object Repository/Page_Attach File/input_Attachments_btnAttached'))

WebUI.click(findTestObject('Object Repository/Page_Attach File/button_Submit'))

WebUI.click(findTestObject('Object Repository/Page_Attach File/button_Submit'))

WebUI.switchToWindowTitle('MCGM')

WebUI.click(findTestObject('Object Repository/Page_MCGM/td__1_2_3'))

WebUI.switchToWindowTitle('Attach File')

WebUI.click(findTestObject('Object Repository/Page_Attach File/input_Attachments_btnAttached'))

WebUI.click(findTestObject('Object Repository/Page_Attach File/button_Submit'))

WebUI.switchToWindowTitle('MCGM')

WebUI.click(findTestObject('Object Repository/Page_MCGM/td__1_2_3_4'))

WebUI.switchToWindowTitle('Attach File')

WebUI.click(findTestObject('Object Repository/Page_Attach File/input_Attachments_btnAttached'))

WebUI.click(findTestObject('Object Repository/Page_Attach File/button_Submit'))

WebUI.switchToWindowTitle('MCGM')

WebUI.click(findTestObject('Object Repository/Page_MCGM/a_BG Details'))

WebUI.setText(findTestObject('Object Repository/Page_MCGM/input_BG Number_ctl00PageContenttxtBGNumber'), '67856758')

WebUI.setText(findTestObject('Object Repository/Page_MCGM/input_BG Date_ctl00PageContenttxtBGDate'), '')

WebUI.click(findTestObject('Object Repository/Page_MCGM/input_BG Date_ctl00PageContenttxtBGDate'))

WebUI.click(findTestObject('Object Repository/Page_MCGM/input_BG Date_ctl00PageContenttxtBGDate'))

WebUI.click(findTestObject('Object Repository/Page_MCGM/td_1'))

WebUI.click(findTestObject('Object Repository/Page_MCGM/td_1'))

WebUI.setText(findTestObject('Object Repository/Page_MCGM/input_Bank Name_ctl00PageContenttxtBankNumber'), 'Test')

WebUI.setText(findTestObject('Object Repository/Page_MCGM/input_Branch Name_ctl00PageContenttxtBranchName'), '')

WebUI.click(findTestObject('Object Repository/Page_MCGM/input_Branch Name_ctl00PageContenttxtBranchName'))

WebUI.doubleClick(findTestObject('Object Repository/Page_MCGM/input_Branch Name_ctl00PageContenttxtBranchName'))

WebUI.setText(findTestObject('Object Repository/Page_MCGM/input_Branch Name_ctl00PageContenttxtBranchName'), 'Test1')

WebUI.setText(findTestObject('Object Repository/Page_MCGM/input_Amount_ctl00PageContenttxtAmount'), '100000')

WebUI.setText(findTestObject('Object Repository/Page_MCGM/input_BG Valid Date_ctl00PageContenttxtBGValidDate'), '')

WebUI.click(findTestObject('Object Repository/Page_MCGM/input_BG Valid Date_ctl00PageContenttxtBGValidDate'))

WebUI.click(findTestObject('Object Repository/Page_MCGM/input_BG Valid Date_ctl00PageContenttxtBGValidDate'))

WebUI.click(findTestObject('Object Repository/Page_MCGM/td_31'))

WebUI.doubleClick(findTestObject('Object Repository/Page_MCGM/input_BG Bank Email_ctl00PageContenttxtBGBankEmail'))

WebUI.setText(findTestObject('Object Repository/Page_MCGM/input_BG Bank Email_ctl00PageContenttxtBGBankEmail'), 'gh@dfg.com')

WebUI.click(findTestObject('Object Repository/Page_MCGM/input_Close_ctl00PageContentbtnSave'))

WebUI.click(findTestObject('Object Repository/Page_MCGM/button_OK_1_2_3_4_5_6_7'))

WebUI.click(findTestObject('Object Repository/Page_MCGM/input_Close_ctl00PageContentbtnSubmit'))

WebUI.click(findTestObject('Object Repository/Page_MCGM/button_OK_1_2_3_4_5_6_7_8'))

WebUI.click(findTestObject('Object Repository/Page_MCGM/input_CREATE PROJECT_ctl00nav_leftbtnsubmitproject'))

WebUI.click(findTestObject('Object Repository/Page_MCGM/button_OK_1_2_3_4_5_6_7_8_9'))

WebUI.click(findTestObject('Object Repository/Page_MCGM/span_Licensed Surveyor'))

WebUI.click(findTestObject('Object Repository/Page_MCGM/a_Log Out'))

WebUI.closeBrowser()

