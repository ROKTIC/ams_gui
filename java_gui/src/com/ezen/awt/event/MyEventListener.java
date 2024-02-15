package com.ezen.awt.event;

import com.ezen.awt.MyFrame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * MyFrame에서 발생하는 이벤트 처리를 위한 이벤트 리스너 클래스
 */
public class MyEventListener implements WindowListener, ActionListener {

    MyFrame frame;

    public MyEventListener(MyFrame frame){
        this.frame = frame;
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("창이 열렸습니다..");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("OS에 자원을 반납하였습니다..");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("창이 최소화되었습니다...");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("창이 디최소화되었습니다...");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("창이 활성화되었습니다...");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("창이 비활성화되었습니다...");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("버튼1이 실행되었습니다...");
        frame.b1.setBackground(Color.YELLOW);
    }

}
