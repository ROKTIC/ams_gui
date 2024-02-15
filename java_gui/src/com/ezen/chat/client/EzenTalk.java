package com.ezen.chat.client;

public class EzenTalk {
    public static void main(String[] args) {
        ChatFrame chatFrame = new ChatFrame("::: EzenTalk :::");
        chatFrame.initComponents();
        chatFrame.setSize(270, 410);
        chatFrame.setResizable(false);
        chatFrame.setVisible(true);
    }
}
