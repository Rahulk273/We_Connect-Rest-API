package com.WeConnect.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.WeConnect.models.Post;

public interface PostRepository extends JpaRepository<Post, Integer>{ // with the help of post repository we add data in database

	@Query("select p from Post p where p.user.id=:userId")
	List<Post> findPostByUserId(Integer userId);
}
