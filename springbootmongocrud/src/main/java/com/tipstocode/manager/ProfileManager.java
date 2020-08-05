package com.tipstocode.manager;


import com.tipstocode.model.ProfileVO;

public interface ProfileManager {

	ProfileVO saveUser(ProfileVO userVO);

	ProfileVO getUserById(String id);

	ProfileVO updateUser(ProfileVO userVO);

	String deleteUserById(String id);

}
