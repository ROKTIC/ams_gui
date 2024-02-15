package com.ezen.awt;

import com.ezen.awt.event.MyEventListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * Frame 역할 + 이벤트 처리를 위한 이벤트 리스너 클래스 역할
 */
public class MyFrame extends Frame /* implements WindowListener, ActionListener */{

    Button button1, button2, button3, button4;
    Label label;

    Panel panel;
    public Button b1, b2, b3;


    public MyFrame(){
        panel = new Panel();
        //panel.setLayout(new FlowLayout());
        // Panel의 디폴트 레이아웃 매니저는 FlowLayout이다.
        b1 = new Button("패널안의 버튼1");
        b2 = new Button("패널안의 버튼2");
        b3 = new Button("패널안의 버튼3");

        button1 = new Button("클릭1");
        button2 = new Button("클릭2");
        button3 = new Button("클릭3");
        button4 = new Button("클릭4");

        label = new Label("라벨");

    }

    // 컴포트 배치 초기화
    public void initComponents(){
        // 패널 레이아웃
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        
        // 프레임 레이아웃
        add(button1, BorderLayout.CENTER);
        add(button2, BorderLayout.EAST);
        add(button3, BorderLayout.WEST);
        add(button4, BorderLayout.SOUTH);
        add(panel, BorderLayout.NORTH);
    }

    // 이벤트 소스에 이벤트 리스너 등록
    public void eventListenerRegist(){
        // this: 이벤트 소스, this : 이벤트 리스너
        //this.addWindowListener(this);
        //addWindowListener(this);
        //b1.addActionListener(this);
        MyEventListener eventListener = new MyEventListener(this);
        addWindowListener(eventListener);
        b1.addActionListener(eventListener);
    }

    /*
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
        b1.setBackground(Color.YELLOW);
    }
     */
}
