package Programmingnew;

import javax.swing.*;
import java.awt.*;

/**
 *
 */

public class Window {
    public static void main(String[] args) {

        JFrame startFrame = new JFrame("Game"); //создаем окно с названием
        startFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //закрытие окна при клике крестика
        startFrame.setSize(1024, 680);
        // startFrame.add(new Panel()); // перенос содержимого класса Panel в фрейм
        startFrame.setVisible(true); //делаем окно видимым
    }

}
