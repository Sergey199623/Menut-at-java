package Programmingnew;

import javax.swing.*;
import java.awt.*;


public class Menue {
    private int n; // количество кнопок
    private Color color1; //цвет кнопок
    private double x; //координата X кнопки
    private double y; //координата Y кнопки
    private double w; // ширинка кнопки
    private double h; //  высота кнопки

    private String img; //путь к картинке кнопки

    String[] list = new String[5]; // список содержащий 5 кнопок

    // конструктор кнопок
    public Menue(){
        x = 100;
        y = 0;
        w = 396;
        h = 101;
        n = 5;
        color1 = Color.BLACK;
        img = "image/but1.png";

        list[0] = "Новый игрок";
        list[1] = "Начать игру";
        list[2] = "Настройки";
        list[3] = "Правила игры";
        list[4] = "Выход из игры";

    }

    public void update() {

    }

    public void draw(Graphics2D g) {

        for (int i = 0; i < n; i++) {
            g.drawImage(new ImageIcon(img).getImage(), (int) x, (int) (y + 140) * i, null); //отрисовываем элементы в координатах

            g.setColor(color1); //задаем цвет объекту Color
            Font font = new Font("Arial", Font.ITALIC, 60); //Создаем объект класса font (передаем параметры в конструктор)
            g.setFont(font); //устанавливаем наш шрифт

            long length = (int) g.getFontMetrics().getStringBounds(list[i], g).getWidth(); //длина надписи в пикселях
            g.drawString(list[i], (int) (x + w/2) - (int) (length / 2), (int) ((y + 140) * i + (h / 3) * 2)); //рисуем строку в центре панели
        }
    }
}
