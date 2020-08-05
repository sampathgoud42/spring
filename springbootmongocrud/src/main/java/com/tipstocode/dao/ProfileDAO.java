package com.tipstocode.dao;

import com.tipstocode.model.ProfileVO;

public interface ProfileDAO {

	ProfileVO saveUser(ProfileVO userVO);

	ProfileVO getUserById(String id);

	ProfileVO updateUser(ProfileVO userVO);

	void deleteUserById(String id);

}
