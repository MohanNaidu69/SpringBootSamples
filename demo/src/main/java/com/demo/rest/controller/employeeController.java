package com.demo.rest.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class employeeController {
	
	
	@GetMapping("/getEemployeeNames")
    public ResponseEntity<List<String>> getEmployee() {
        List<String> students = Arrays.asList("mohan","sai","naga","venkata","Lakshmi","narayana");
        return new ResponseEntity<>(students, HttpStatus.OK);
    }
	
	@PostMapping(value = "/contacts")
    public ResponseEntity<String> addContact(@RequestBody String contact)  {
      return null;
    }
    
    @PutMapping(value = "/contacts/{contactId}")
    public ResponseEntity<String> updateContact(@RequestBody String contact, 
            @PathVariable long contactId) {
    	return null;
    }
    
    @PatchMapping("/contacts/{contactId}")
    public ResponseEntity<Void> updateAddress(@PathVariable long contactId,
        @RequestBody String address) {
    	return null;
    }
    
    @DeleteMapping(path="/contacts/{contactId}")
    public ResponseEntity<Void> deleteContactById(@PathVariable long contactId) {
    	return null;
    }

}
