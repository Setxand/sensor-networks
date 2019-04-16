package com.sensornetworks;

import com.sensornetworks.client.PlatformImpl;
import com.sensornetworks.client.TelClientEx;
import org.springframework.stereotype.Component;
import telegram.Chat;
import telegram.Message;

import javax.annotation.PostConstruct;

@Component
public class BotStart {

	private final TelClientEx telClientEx;

	public BotStart(TelClientEx telClientEx) {
		this.telClientEx = telClientEx;
	}


	@PostConstruct
	public void start() {
		createAdmins();
		telClientEx.setWebHooks();
		Message helloWorld = new Message(new Chat(388073901));
		helloWorld.setPlatform(PlatformImpl.TELEGRAM_BOT_COMMON);
		telClientEx.simpleMessage("Hello world", helloWorld);
	}

	private void createAdmins() {

	}

}
