package com.uncia.droolsaccumulatenestedloanrate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uncia.droolsaccumulatenestedloanrate.model.Account;
import com.uncia.droolsaccumulatenestedloanrate.model.Cibil;
import com.uncia.droolsaccumulatenestedloanrate.model.Participant;
import com.uncia.droolsaccumulatenestedloanrate.model.Rate;
import com.uncia.droolsaccumulatenestedloanrate.service.UnciaCibilService;

@RestController
@RequestMapping("/ruleservice")
@CrossOrigin(origins = "*")
public class UnciaCibilController {

	@Autowired
	private UnciaCibilService unciaCibilService;

//	@CrossOrigin(origins = "http://localhost:9090/")
	@PostMapping("/getOD")
	public ResponseEntity<List<Account>> getRate(@RequestBody Cibil guarantorDeviation) {
		 List<Account> response = unciaCibilService.getResponse(guarantorDeviation);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	 @PostMapping("/getrate")
	 public ResponseEntity<Rate> getRate(@RequestBody Participant request){
	  Rate rate = unciaCibilService.getRate(request);
	  return new ResponseEntity<>(rate, HttpStatus.OK);
	 }
}
