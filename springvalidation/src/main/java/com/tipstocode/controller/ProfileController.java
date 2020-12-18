package com.tipstocode.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

import org.apache.commons.lang3.StringUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tipstocode.model.Profile;

@RestController
@Validated
public class ProfileController {
	
	
	@RequestMapping(value = "/saveprofile", method = RequestMethod.POST )
	public ResponseEntity<String> saveProfile(@Valid @RequestBody Profile profile,HttpSession session) {
		
		
		
		return ResponseEntity.ok("valid");
		
		
	}
	
	@RequestMapping(value = "/getprofilebyid", method = RequestMethod.GET )
	public ResponseEntity<String> getProfileById(@RequestParam("id") @NotBlank String id) throws Exception {	
	
		return ResponseEntity.ok("valid");		
		
	}

}
