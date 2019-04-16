package com.sensornetworks.controller;

import com.sensornetworks.client.PlatformImpl;
import com.sensornetworks.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import telegram.Update;

@RestController
public class EventController {

	@Autowired EventService eventService;

	@PostMapping("/v1/events")
	public void listen(@RequestBody Update update) {
		update.getMessage().setPlatform(PlatformImpl.TELEGRAM_BOT_COMMON);
		eventService.parseEvent(update);
	}

}
