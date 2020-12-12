package ru.oshkina.demo5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Handler extends MouseAdapter {

    private final JLabel label;

    public Handler(JLabel label) {
        this.label = label;
    }

    @Override
    public void mouseEntered(MouseEvent e){
        String txt = "Текст красного цвета";
        label.setText(txt);
        label.setForeground(Color.red);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        String msg = "Текст синего цвета";
        label.setText(msg);
        label.setForeground(Color.blue);
    }
}
