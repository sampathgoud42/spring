package com.tipstocode.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tipstocode.dao.ProfileDAO;
import com.tipstocode.model.ProfileVO;

@Component
public class ProfileManagerImpl implements ProfileManager{
	
	@Autowired	
	ProfileDAO userDAO;

	public ProfileVO saveUser(ProfileVO userVO) {
		// TODO Auto-generated method stub
		return userDAO.saveUser(userVO);
	}

	public ProfileVO getUserById(String id) {
		// TODO Auto-generated method stub
		return userDAO.getUserById(id);
	}

	public ProfileVO updateUser(ProfileVO userVO) {
		// TODO Auto-generated method stub
		return userDAO.updateUser(userVO);
	}

	public String deleteUserById(String id) {
		// TODO Auto-generated method stub
		
		userDAO.deleteUserById(id);
		
		return "Deleted Successfully!.";
	}
	
	

}
