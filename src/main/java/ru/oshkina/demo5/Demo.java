package ru.oshkina.demo5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static javax.swing.JOptionPane.PLAIN_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;

//Обработчик на основе внутреннего класса
public class Demo {
    public static void main(String[] args) {
        //текст для метки
        String msg = "Текст синего цвета";
        String txt = "Текст красного цвета";

        //Создание текстовой метки
        JLabel label = new JLabel(msg);
        //Режим выравнимания текста в метке по центру:
        label.setHorizontalAlignment(JLabel.CENTER);
        //Синий цвет для текста метки:
        label.setForeground(Color.blue);
        //Создание объекта шрифта:
        Font f = new Font("Arial", Font.ITALIC, 18);
        //Применение шрифта к метке:
        label.setFont(f);
        //Рамка вокург метки:
        label.setBorder(BorderFactory.createEtchedBorder());

        //Внутренний класс
        class Handler extends MouseAdapter{
            @Override
            public void mouseEntered(MouseEvent e){
                label.setText(txt);
                label.setForeground(Color.red);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                label.setText(msg);
                label.setForeground(Color.blue);
            }
        }

        //Создание объекта обработчика
        Handler handler = new Handler();
        //Регистрация обработчика в метке
        label.addMouseListener(handler);
        showMessageDialog(
                null, label, "Сообщение", PLAIN_MESSAGE
        );
    }
}
