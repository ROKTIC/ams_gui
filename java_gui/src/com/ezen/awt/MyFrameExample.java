package com.ezen.awt;

public class MyFrameExample {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.initComponents();
        frame.eventListenerRegist();
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
