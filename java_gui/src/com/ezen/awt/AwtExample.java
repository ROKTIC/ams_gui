package com.ezen.awt;

import java.awt.*;

public class AwtExample {
    public static void main(String[] args) {
        // 컨테이너 생성
        Frame frame = new Frame("연습용 프레임");

        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));

        // AWT에서 제공하는 비주얼 컴포넌트들...
        Button button1 = new Button("버튼");
//        button1.setBackground(new Color(25, 5, 25));
        button1.setBackground(Color.BLUE);
        button1.setForeground(Color.WHITE);
        Button button2 = new Button("버튼");
        Button button3 = new Button("버튼");

        TextField textField = new TextField("문자열 초기값");

        Checkbox hobbyCheckbox1 = new Checkbox("운동", true);
        Checkbox hobbyCheckbox2 = new Checkbox("게임");
        Checkbox hobbyCheckbox3 = new Checkbox("낮잠");
        hobbyCheckbox3.setBackground(Color.BLUE);
        hobbyCheckbox3.setForeground(Color.WHITE);

        CheckboxGroup checkboxGroup = new CheckboxGroup();
        Checkbox womanCB = new Checkbox("여자", true, checkboxGroup);
        Checkbox manCB = new Checkbox("남자", false, checkboxGroup);

        Choice selectBox = new Choice();
        selectBox.add("Java");
        selectBox.add("SQL");
        selectBox.add("HTML");
        selectBox.add("CSS");
        selectBox.add("Java");
        selectBox.add("JSP");

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(textField);

        frame.add(hobbyCheckbox1);
        frame.add(hobbyCheckbox2);
        frame.add(hobbyCheckbox3);

        frame.add(womanCB);
        frame.add(manCB);

        frame.add(selectBox);

        frame.setVisible(true);
    }
}
