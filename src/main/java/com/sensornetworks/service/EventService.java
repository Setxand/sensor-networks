package com.sensornetworks.service;

import com.sensornetworks.client.TelClientEx;
import org.springframework.stereotype.Service;
import telegram.Message;
import telegram.Update;

@Service
public class EventService {

	private final TelClientEx telClientEx;

	public EventService(TelClientEx telClientEx) {
		this.telClientEx = telClientEx;
	}

	public void parseEvent(Update update) {

		Message message = update.getMessage();

		if (message != null &&  message.getText() != null) {
			telClientEx.simpleMessage(message.getText(), message);
		} else {
			/////
		}

	}


}
