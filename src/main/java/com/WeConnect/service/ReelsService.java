package com.WeConnect.service;

import java.util.List;

import com.WeConnect.models.Reels;
import com.WeConnect.models.User;


public interface ReelsService {
	
	public Reels createReels(Reels reel, User user);
	
	public List<Reels> findAllReels();
	
	public List<Reels> findUserReels(Integer userId) throws Exception;
	
	
}
