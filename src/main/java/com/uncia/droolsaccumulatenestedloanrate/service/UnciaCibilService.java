package com.uncia.droolsaccumulatenestedloanrate.service;

import java.util.List;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uncia.droolsaccumulatenestedloanrate.model.Account;
import com.uncia.droolsaccumulatenestedloanrate.model.Cibil;
import com.uncia.droolsaccumulatenestedloanrate.model.Participant;
import com.uncia.droolsaccumulatenestedloanrate.model.Rate;

@Service
public class UnciaCibilService {

	@Autowired
	private KieContainer kieContainer;
	Account account = new Account();

	public List<Account> getResponse(Cibil cibil) {
		List<Account> listOfAccount = cibil.getListOfAccount();
		KieSession kieSession = kieContainer.newKieSession();
		kieSession.insert(cibil);
		kieSession.fireAllRules();
		kieSession.dispose();
		return listOfAccount;
	}

	public Rate getRate(Participant applicantRequest) {
		Rate rate = new Rate();
		KieSession kieSession = kieContainer.newKieSession();
		kieSession.setGlobal("rate", rate);
		kieSession.insert(applicantRequest);
		kieSession.fireAllRules();
		kieSession.dispose();
		return rate;
	}
}
