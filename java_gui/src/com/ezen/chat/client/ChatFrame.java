package com.ezen.chat.client;

import org.w3c.dom.Text;

import java.awt.*;

/**
 *  Frame을 이용한 채팅 메인 화면
 */
public class ChatFrame extends Frame {
    TextField nickNameTF, messageTF;
    Button loginButton, sendButton;
    TextArea messageTA;
    List nickNameList;

    public ChatFrame(String title){
        super(title);
        nickNameTF = new TextField("대화명을 입력하세요.");
        loginButton = new Button(" 로그인 ");
        messageTA = new TextArea();
        nickNameList = new List();
        nickNameList.add("방그리");
        nickNameList.add("날라리");
        nickNameList.add("강감찬");
        messageTF = new TextField();
        sendButton = new Button(" 전  송 ");
    }

    public void initComponents(){
        // 개발 편의상 레이아웃 매니저 사용X
        // 좌표값 배치 (실제론 권장 X)
        setLayout(null);
        //nickNameTF.setLocation(100, 50);
        nickNameTF.setBounds(15, 40, 150, 20);
        loginButton.setBounds(170, 40, 80, 20);
        messageTA.setBounds(15, 65, 150, 300);
        nickNameList.setBounds(170, 65, 80, 300);
        messageTF.setBounds(15, 370, 150, 20);
        sendButton.setBounds(170, 370, 80, 20);

        add(nickNameTF);
        add(loginButton);
        add(messageTA);
        add(nickNameList);
        add(messageTF);
        add(sendButton);
    }


}
