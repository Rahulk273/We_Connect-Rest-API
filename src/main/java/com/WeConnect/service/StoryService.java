package com.WeConnect.service;

import java.util.List;

import com.WeConnect.models.Story;
import com.WeConnect.models.User;

public interface StoryService {
	
	public Story createStory(Story story, User user);
	
	public List<Story> findStoryByUserId(Integer userId) throws Exception;
	
	
}
