package com.tipstocode.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tipstocode.manager.ProfileManager;
import com.tipstocode.model.ProfileVO;

@RestController
public class ProfileController {
	
	
	@Autowired
	ProfileManager userManager;
	
	
	@RequestMapping(value = "/saveprofile", method = RequestMethod.POST )
	public ResponseEntity<ProfileVO> saveUser(@RequestBody ProfileVO userVO) {
		
		
		userVO = userManager.saveUser(userVO);
		
		return new ResponseEntity<ProfileVO>(userVO, HttpStatus.OK);
		
		
	}
	
	@RequestMapping(value = "/getprofilebyid", method = RequestMethod.GET )
	public ResponseEntity<ProfileVO> getUserById(@RequestParam("id") String id) {
		
		ProfileVO userVO = userManager.getUserById(id);
		
		return new ResponseEntity<ProfileVO>(userVO, HttpStatus.OK);
		
	}
	
	@RequestMapping(value = "/updateprofile", method = RequestMethod.POST )
	public ResponseEntity<ProfileVO> updateUser(@RequestBody ProfileVO userVO) {
		
		
		userVO = userManager.updateUser(userVO);
		
		return new ResponseEntity<ProfileVO>(userVO, HttpStatus.OK);
		
		
	}
	
	@RequestMapping(value = "/deleteprofilebyid", method = RequestMethod.GET )
	public ResponseEntity<String> deleteUserById(@RequestParam("id") String id) {
		
		String message = userManager.deleteUserById(id);
		
		return ResponseEntity.ok(message);		
		
	}
	
	

}
