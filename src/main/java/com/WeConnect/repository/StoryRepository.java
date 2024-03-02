package com.WeConnect.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.WeConnect.models.Story;

public interface StoryRepository extends JpaRepository<Story, Integer>{
	
	// list of story of user
	
	public List<Story> findByUserId(Integer userId);
	
}
