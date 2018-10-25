package com.telecom.tel.RestApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telecom.tel.Model.Customer;
import com.telecom.tel.Service.CustomerService;

@RestController
@RequestMapping("/cust")
@CrossOrigin(origins ={"http://localhost:4200"})
public class CustomerApi {

	@Autowired
	CustomerService custServ;
	
	@GetMapping
	public ResponseEntity<List<Customer>> getAllCustomers(){
		return new ResponseEntity<>(custServ.getAllCustomers(),HttpStatus.OK);
	}
	
	@PostMapping
	public void addCustomer(@RequestBody Customer cust) {
		custServ.addCustomer(cust);
	}
	/*
	@DeleteMapping("/delete/{id}")
	public void deleteCustomer(@PathVariable("id") int id) {
			custServ.deleteCustomer(id);
	}
	
	@PutMapping("/edit")
	public void editCustomer(@RequestBody Customer cust) {
		custServ.editCustomer(cust);
		
	}
	
	@GetMapping("/getOne/{id}")
	public Optional<Customer> getCustomer(@PathVariable("id") int id){
		return custServ.getCustomer(id);
	}
	*/
	
}
