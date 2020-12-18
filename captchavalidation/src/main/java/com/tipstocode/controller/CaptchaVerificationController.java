package com.tipstocode.controller;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CaptchaVerificationController {
	
	@RequestMapping(value = "/verifycaptcha", method = RequestMethod.GET )
	public ResponseEntity<String> getProfileById(@RequestParam("captchaText") String captchaText,HttpSession session) throws Exception {	
		
		String captcha=(String)session.getAttribute("CAPTCHA");
		  if(StringUtils.isBlank(captcha)|| (!StringUtils.isBlank(captcha) && !captcha.equals(captchaText))){
		    	captcha="";
		    	return ResponseEntity.ok("Captcha Invalid");
		    }
		  else		
			  return ResponseEntity.ok("Captcha Valid");	
			
	}

}
