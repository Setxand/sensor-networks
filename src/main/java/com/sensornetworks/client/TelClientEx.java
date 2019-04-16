package com.sensornetworks.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import telegram.Message;
import telegram.client.TelegramClient;

@Component
public class TelClientEx extends TelegramClient {

	public TelClientEx(@Value("${url.telegram}") String telegramUrl,@Value("${url.server}") String serverUrl,
					   @Value("${url.webhooks}") String webhook, @Value("${url.urlMap}") String urls) {
		super(telegramUrl, serverUrl, webhook, urls);
	}

	@Override
	public void sendActions(Message message) {

	}
}
