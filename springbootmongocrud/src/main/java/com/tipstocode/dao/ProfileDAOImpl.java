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
		
		ProfileVO existProfile =mongoTemplate.findById(userVO.get_id(), ProfileVO.class);
		// TODO Auto-generated method stub
		//updating createdBy and createdOn
		userVO.setCreatedBy(existProfile.getCreatedBy());
		userVO.setCreatedDate(existProfile.getCreatedDate());
		
		return userVO = mongoTemplate.save(userVO);
	}

	public void deleteUserById(String id) {
		// TODO Auto-generated method stub
		ProfileVO userVO = mongoTemplate.findById(id, ProfileVO.class);
		mongoTemplate.remove(userVO);
	}
	
	

}
