package com.ezen.awt;

import java.awt.*;
import java.awt.event.*;

/**
 * 다양한 종류의 이벤트 처리 연습을 위한 Frame
 */
public class EventDemoFrame extends Frame implements WindowListener, ActionListener, MouseListener, FocusListener, ItemListener {
    Button openButton, saveButton;
    TextField inputTF;
    Choice languageChoice;

    public EventDemoFrame(String title){
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

    public void initComponets(){
        setLayout(new FlowLayout());
        add(openButton);
        add(saveButton);
        add(inputTF);
        add(languageChoice);
    }

    public void eventRegister(){
        addWindowListener(this);
        openButton.addActionListener(this);
        saveButton.addMouseListener(this);
        inputTF.addFocusListener(this);
        inputTF.addActionListener(this);
        languageChoice.addItemListener(this);
    }

    public static void main(String[] args) {
        EventDemoFrame frame = new EventDemoFrame("이벤트 연습 화면");
        frame.initComponets();
        frame.eventRegister();
        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    @Override
    public void windowOpened(WindowEvent e) {  }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) { }

    @Override
    public void windowIconified(WindowEvent e) { }

    @Override
    public void windowDeiconified(WindowEvent e) { }

    @Override
    public void windowActivated(WindowEvent e) { }

    @Override
    public void windowDeactivated(WindowEvent e) { }

    @Override
    public void actionPerformed(ActionEvent e) {
        // ActionEvent가 발생한 이벤트 소스 구별
        Object eventSource = e.getSource();
        if(eventSource == openButton){
            FileDialog dialog = new FileDialog(this, "파일 열기", FileDialog.LOAD);
            dialog.setVisible(true);
        }else if(eventSource == inputTF){
            String inputMessage = inputTF.getText();
            System.out.println(inputMessage);
            inputTF.setText("");
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        FileDialog fileDialog = new FileDialog(this, "파일 저장", FileDialog.SAVE);
        fileDialog.setVisible(true);
        int buttonType = e.getButton();
        if(buttonType == MouseEvent.BUTTON1){
            System.out.println("마우스 왼쪽 버튼을 클릭하였습니다...");
        }else if(buttonType == MouseEvent.BUTTON2){
            System.out.println("마우스 가운데 버튼을 클릭하였습니다..");
        } else {
            System.out.println("마우스 오른쪽 버튼을 클릭하였습니다..");
        }
        int clickX = e.getX();
        int clickY = e.getY();
        System.out.println(clickX + ", " + clickY);

        Point clickPonter = e.getLocationOnScreen();
        System.out.println(clickPonter);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        saveButton.setBackground(Color.YELLOW);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        saveButton.setBackground(Color.ORANGE);

    }

    @Override
    public void focusGained(FocusEvent e) {
        inputTF.setText("");
    }

    @Override
    public void focusLost(FocusEvent e) {

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        System.out.println(e.getStateChange());
        if(e.getStateChange() == ItemEvent.SELECTED) {
            String item = (String) e.getItem();
            System.out.println(item + "을 선택하였습니다..");
        }
    }
}
