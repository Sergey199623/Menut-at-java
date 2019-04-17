package Programmingnew;

import javax.swing.*;
import java.awt.*;

public class Player {
    // начальные координаты и размер игрока
    private double x; // x - координата игрока
    private double y; // y - координата игрока
    private double w; // ширина объекта
    private double h; // высота объекта

    private int speed; // скорость

    // назначаем клавиши перемещения
    public static boolean up;
    public static boolean down;
    public static boolean left;
    public static boolean right;

    Image img = new ImageIcon("image/player.png").getImage(); //загрузка картинки игрока

    // Конструктор игрока
    public Player() {
        // начальные координаты игрока
        x = 401;
        y = 501;
        // размеры игрока
        w = 142;
        h = 229;
        speed = 5; // скорость перемещения игрока
        //начальное значение клавиш
        up = false;
        down = false;
        left = false;
        right = false;
    }
    // геттеры для получения значения и размера
    public double getX() {return x; }

    public double getY() {
        return y;
    }

    public double getW() {
        return w;
    }

    public double getH() {
        return h;
    }

    //создаем законы перемещения игрока
    public void update() {
        // смещение героя по игровому полю
        if (up && y > 20) {
            y -= speed;
        }
        if (down && y < Panel.HEIGHT - h) {
            y += speed;
        }
        if (left && x > 0) {
            x -= speed;
        }
        if (right && x < Panel.WIDTH - w) {
            x += speed;
        }
    }

    //отрисовка игрока
    public void draw(Graphics2D g){
        g.drawImage(img,(int) x, (int) y,null); //здесь рисуем картинку
    }
}
