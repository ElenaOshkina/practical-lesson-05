package ru.oshkina.demo4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static javax.swing.JOptionPane.showMessageDialog;

//активная текстовая метка
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

        //Создание обработчика для метки:
        MouseAdapter handler = new MouseAdapter() {
            //Метод вызывается при наведении курсора на область метки:
            @Override
            public void mouseEntered(MouseEvent e) {
                //super.mouseEntered(e);
                label.setText(txt);
                label.setForeground(Color.red);
            }

            //Метод вызываеттся при выходе курсора за область метки:
            @Override
            public void mouseExited(MouseEvent e) {
                //super.mouseExited(e);
                label.setText(msg);
                label.setForeground(Color.blue);
            }
        };
        //регистрация обработчика в метке
        label.addMouseListener(handler);
        //отображение сообщения:
        showMessageDialog(
                null,//родительское окно
                label,//отображается метка
                "Сообщение",//название окна
                JOptionPane.PLAIN_MESSAGE//нет пиктограммы
        );
    }
}
