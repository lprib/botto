package com.jaxforreal.botto;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws URISyntaxException, InterruptedException {
        HackChatClient client = new Botto(new URI("wss://hack.chat/chat-ws"), "botto", "qwe", "botDev");

        client.connectBlocking();
    }
}
