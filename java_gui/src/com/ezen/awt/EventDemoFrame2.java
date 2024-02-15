package com.ezen.awt;

import java.awt.*;
import java.awt.event.*;

/**
 * 다양한 종류의 이벤트 처리 연습을 위한 Frame
 * 내부클래스를 이용한 이벤트 처리 연습
 */
public class EventDemoFrame2 extends Frame {
    Button openButton, saveButton;
    TextField inputTF;
    Choice languageChoice;

    public EventDemoFrame2(String title) {
        super(title);
        openButton = new Button("열기");
        saveButton = new Button("저장");
        inputTF = new TextField("즐거운 대화되세요...");
        languageChoice = new Choice();
        languageChoice.add("Java");
        languageChoice.add("JavaScript");
        languageChoice.add("Python");
        languageChoice.add("Flutter");
    }

    public void initComponets() {
        setLayout(new FlowLayout());
        add(openButton);
        add(saveButton);
        add(inputTF);
        add(languageChoice);
    }

    // 종료 기능
    public void exit() {
        System.exit(0);
    }

    // 파일 열기 기능
    public void fileOpen() {
        FileDialog dialog = new FileDialog(EventDemoFrame2.this, "파일 열기", FileDialog.LOAD);
        dialog.setVisible(true);
    }

    // 텍스트 필드 초기화
    public void reset(TextField field) {
        field.setText("");
    }

    // 텍스트 필드 입력 받기 및 출력
    public void showMessage() {
        String inputMessage = inputTF.getText();
        System.out.println(inputMessage); // 나중에 서버에 전송
        inputTF.setText("");
    }

    // 언어 선택 기능
    public void selectLanguage() {
        //String selectedItem = (String)e.getItem();
        String selectedItem = languageChoice.getSelectedItem();
        //languageChoice.getSelectedIndex();
        System.out.println(selectedItem);
    }


    public void eventRegister() {
        // 이름이 있는 지역 내부클래스를 이용한 이벤트 처리 클래스 구현
//        class ExiterListener extends WindowAdapter{
//            @Override
//            public void windowClosing(WindowEvent e) {
//                System.exit(0);
//            }
//        }
//        addWindowListener(new ExiterListener());
        // 익명 객체를 이용한 이벤트 처리(가장 많이 사용하는 방법)
        // 종료 처리
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
//                System.out.println("종료 처리됨...");
//                System.exit(0);
                exit();
            }
        });

        // 파일창 열기
        /*openButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
              fileOpen();
            }
        });*/
        // 람다식을 이용한 이벤트 처리
        openButton.addActionListener((e) -> {   // 익명 객체 람다식, 이름 없는 함수 표현식
            fileOpen();
        });


        // 포커스 & 액션이벤트 처리
        inputTF.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                reset(inputTF);
            }
        });
        inputTF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showMessage();
            }
        });

        // 아이템이벤트 처리
        languageChoice.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    selectLanguage();
                }
            }
        });
    }

    public static void main(String[] args) {
        EventDemoFrame2 frame = new EventDemoFrame2("이벤트 연습 화면");
        frame.initComponets();
        frame.eventRegister();
        frame.setSize(300, 200);
        frame.setVisible(true);
    }

}
