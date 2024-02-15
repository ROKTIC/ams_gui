package com.ezen.awt;

public class AMS {
    public static void main(String[] args) {
        BankFrame bankFrame = new BankFrame("EZEN-BANK AMS");
        bankFrame.initComponents();
        bankFrame.setSize(620, 450);
        bankFrame.setResizable(false);

        bankFrame.setVisible(true);

    }
}
