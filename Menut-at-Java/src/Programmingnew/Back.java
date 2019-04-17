package Programmingnew;
import javax.swing.*;
import java.awt.*;

/**
 * Обратная сторона для игровой панели
 */

public class Back {

   Image img = new ImageIcon("image/fon1.jpg").getImage(); //задаем картинку


    public void draw(Graphics2D g) { //прорисуем в Graphics2D
        Color bacColor = new Color(37, 255, 38); // создаем объект класса цвет и задаем ему цвет
        g.setColor(bacColor); //передаем цвет графическому объекту

        if (Panel.state.equals(Panel.STATES.MENUE)) g.fillRect(0, 0, Panel.WIDTH, Panel.HEIGHT ); //рисуем прямоугольную область
        if (Panel.state.equals(Panel.STATES.PLAY)) g.drawImage(img, (int)0, (int)0, null); //отрисовываем элементы в координатах
    }
}
