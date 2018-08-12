package com.fangle.parkingreport;

import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

@Component
public class MessageHandler {
    private CountDownLatch latch = new CountDownLatch(1);


    public void onMessage(String message) {
        System.out.println("Received <" + message + ">");
        latch.countDown();
    }
    public CountDownLatch getLatch() {
        return latch;
    }

}
