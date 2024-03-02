package com.WeConnect.service;

import java.util.List;

import com.WeConnect.models.Message;
import com.WeConnect.models.User;

public interface MessageService {
	
	public Message createMessage(User user, Integer chatId, Message req) throws Exception;
	public List<Message> findChatsMessages(Integer chatId) throws Exception;
}
