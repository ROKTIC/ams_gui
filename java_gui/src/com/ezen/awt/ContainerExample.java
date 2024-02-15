package com.ezen.awt;

import java.awt.*;

public class ContainerExample {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setSize(500, 500);
        frame.setVisible(true);

        Window window = new Window(frame);
        window.add(new Button("take rest......."));
        window.setSize(400, 300);
        window.setVisible(true);

        Dialog dialog = new Dialog(frame, "대화상자입니다..", false);
        dialog.setSize(300, 300);
        dialog.setVisible(true);

//        FileDialog fileDialog = new FileDialog(frame, "파일 열기", FileDialog.LOAD);
        FileDialog fileDialog = new FileDialog(frame, "파일 열기", FileDialog.SAVE);
        fileDialog.setVisible(true);
    }
}
