package com.ezen.awt;

import java.awt.*;

public class BankFrame extends Frame {
    Choice accountChoice;
    TextField accountNum, accountOwner, passwd, depositMoney, borrowMoney;
    Button check, delete, search, newAccount, checkAll;
    List accountList;
    Label accountKindLabel, accountNumLabel, accountOwnerLabel, passwdLabel, depositMoneyLabel, borrowMoneyLabel, accountListLabel, unitLabel;

    public BankFrame(String title){
        super(title);
        accountKindLabel = new Label("계좌종류");
        accountChoice = new Choice();
        accountChoice.add("입출금 계좌");
        accountChoice.add("마이너스 계좌");
        accountNumLabel = new Label("계좌번호");
        accountNum = new TextField();
        accountOwnerLabel = new Label("예금주명");
        accountOwner = new TextField();
        passwdLabel = new Label("비밀번호");
        passwd = new TextField();
        depositMoneyLabel = new Label("입금금액");
        depositMoney = new TextField();
        borrowMoneyLabel = new Label("대출금액");
        borrowMoney = new TextField();
        borrowMoney.setBackground(new Color(246, 246, 246));
        check = new Button("조 회");
        delete = new Button(" 삭 제");
        search = new Button("검 색");
        newAccount = new Button("신규등록");
        checkAll = new Button("전체조회");
        accountListLabel = new Label("계좌목록");
        accountList = new List();
        unitLabel = new Label("(단위 : 원)");
        accountList.setBackground(new Color(240, 240, 240));
    }

    public void initComponents(){
        setLayout(null);
        accountKindLabel.setBounds(35, 45, 50, 30);
        accountChoice.setBounds(100, 50, 120, 30);
        accountNumLabel.setBounds(35, 75, 50, 30);
        accountNum.setBounds(100, 80, 200, 25);
        check.setBounds(310, 80, 70, 25);
        delete.setBounds(385, 80, 70, 25);
        accountOwnerLabel.setBounds(35, 110, 50, 30);
        accountOwner.setBounds(100, 115, 200, 25);
        search.setBounds(310, 115, 70, 25);
        passwdLabel.setBounds(35, 145, 50, 30);
        passwd.setBounds(100, 150, 200, 25);
        depositMoneyLabel.setBounds(315, 145, 50, 30);
        depositMoney.setBounds(385, 150, 200, 25);
        borrowMoneyLabel.setBounds(35, 180, 50, 30);
        borrowMoney.setBounds(100, 185, 200, 25);
        newAccount.setBounds(310, 185, 70, 25);
        checkAll.setBounds(385, 185, 70, 25);
        accountListLabel.setBounds(35, 220, 50, 30);
        unitLabel.setBounds(525 , 220, 60, 30);
        accountList.setBounds(30, 250, 555, 170);

        add(accountKindLabel);
        add(accountChoice);
        add(accountNumLabel);
        add(accountNum);
        add(check);
        add(delete);
        add(accountOwnerLabel);
        add(accountOwner);
        add(search);
        add(passwdLabel);
        add(passwd);
        add(depositMoneyLabel);
        add(depositMoney);
        add(borrowMoneyLabel);
        add(borrowMoney);
        add(newAccount);
        add(checkAll);
        add(accountListLabel);
        add(unitLabel);
        add(accountList);
    }
}
