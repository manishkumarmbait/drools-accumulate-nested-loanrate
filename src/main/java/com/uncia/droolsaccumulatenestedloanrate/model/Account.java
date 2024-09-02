package com.uncia.droolsaccumulatenestedloanrate.model;

import java.util.List;

public class Account {

	private List<AccountDtls> listOfAccountDtls;

	private Double Indi_Joint_No_Gold_agri_Loan_OD;
	private Double Indi_Joint_Gold_agri_Loan_OD;
	private Double All_Guarantor_OD;
	private Double All_Indi_Joint_OD;
	private Double All_All_OD;

	public Account() {
	}

	public Account(List<AccountDtls> listOfAccountDtls, Double indi_Joint_No_Gold_agri_Loan_OD,
			Double indi_Joint_Gold_agri_Loan_OD, Double all_Guarantor_OD, Double all_Indi_Joint_OD, Double all_All_OD) {
		super();
		this.listOfAccountDtls = listOfAccountDtls;
		Indi_Joint_No_Gold_agri_Loan_OD = indi_Joint_No_Gold_agri_Loan_OD;
		Indi_Joint_Gold_agri_Loan_OD = indi_Joint_Gold_agri_Loan_OD;
		All_Guarantor_OD = all_Guarantor_OD;
		All_Indi_Joint_OD = all_Indi_Joint_OD;
		All_All_OD = all_All_OD;
	}

	public List<AccountDtls> getListOfAccountDtls() {
		return listOfAccountDtls;
	}

	public void setListOfAccountDtls(List<AccountDtls> listOfAccountDtls) {
		this.listOfAccountDtls = listOfAccountDtls;
	}

	public Double getIndi_Joint_No_Gold_agri_Loan_OD() {
		return Indi_Joint_No_Gold_agri_Loan_OD;
	}

	public void setIndi_Joint_No_Gold_agri_Loan_OD(Double indi_Joint_No_Gold_agri_Loan_OD) {
		Indi_Joint_No_Gold_agri_Loan_OD = indi_Joint_No_Gold_agri_Loan_OD;
	}

	public Double getIndi_Joint_Gold_agri_Loan_OD() {
		return Indi_Joint_Gold_agri_Loan_OD;
	}

	public void setIndi_Joint_Gold_agri_Loan_OD(Double indi_Joint_Gold_agri_Loan_OD) {
		Indi_Joint_Gold_agri_Loan_OD = indi_Joint_Gold_agri_Loan_OD;
	}

	public Double getAll_Guarantor_OD() {
		return All_Guarantor_OD;
	}

	public void setAll_Guarantor_OD(Double all_Guarantor_OD) {
		All_Guarantor_OD = all_Guarantor_OD;
	}

	public Double getAll_Indi_Joint_OD() {
		return All_Indi_Joint_OD;
	}

	public void setAll_Indi_Joint_OD(Double all_Indi_Joint_OD) {
		All_Indi_Joint_OD = all_Indi_Joint_OD;
	}

	public Double getAll_All_OD() {
		return All_All_OD;
	}

	public void setAll_All_OD(Double all_All_OD) {
		All_All_OD = all_All_OD;
	}

}
