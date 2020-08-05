package com.tipstocode.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.tipstocode.model.ProfileVO;

@Repository
public class ProfileDAOImpl implements ProfileDAO{
	
	@Autowired
	MongoTemplate mongoTemplate;

	public ProfileVO saveUser(ProfileVO userVO) {
		// TODO Auto-generated method stub
		return userVO = mongoTemplate.save(userVO);
	}

	public ProfileVO getUserById(String id) {
		// TODO Auto-generated method stub
		return mongoTemplate.findById(id, ProfileVO.class);
	}

	public ProfileVO updateUser(ProfileVO userVO) {
		// TODO Auto-generated method stub
		return userVO = mongoTemplate.save(userVO);
	}

	public void deleteUserById(String id) {
		// TODO Auto-generated method stub
		ProfileVO userVO = mongoTemplate.findById(id, ProfileVO.class);
		mongoTemplate.remove(userVO);
	}
	
	

}
