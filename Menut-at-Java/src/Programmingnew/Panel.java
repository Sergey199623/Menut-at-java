package Programmingnew;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;

/**
 * Панель игры
 */

public class Panel extends JPanel implements ActionListener {

    //Задаем размер игровой панели
    public static int WIDTH = Toolkit.getDefaultToolkit().getScreenSize().width;
    public static int HEIGHT = Toolkit.getDefaultToolkit().getScreenSize().height;

    //обозначаем координаты мыши

    public static int mouseX;
    public static int mouseY;


    public static enum STATES{MENUE,PLAY}; //объявляем статическую переменную
    public static STATES state = STATES.MENUE; // изначальная переменная игры

    private BufferedImage image; //ссылка на объект класса;
    private Graphics2D g; //ссылка на объект класса;


    Timer mainTimer = new Timer(30, this); //Таймер

    Back back = new Back();
    Player player = new Player();
    Menue menue = new Menue();




    public Panel() { //конструктор
        super(); // вызываем родительский конструктор
        setFocusable(true); //задаем фокус
        requestFocus(); //активируем фокус
        //mainTimer.start();

        image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB); //создаем объект буфура для хранения картинки
        g = (Graphics2D) image.getGraphics(); // графическому объекту присвоим элемент из буффера - картинку Graphics2D применив метод getGraphics()


        addMouseListener( new Listeners()); // добавляем обработчик событий клика мышки
        addKeyListener( new Listeners()); // добавляем обработчик событий клавиш
        addMouseMotionListener( new Listeners()); // добавляем обработчик событий перемещения мышки
    }


    public void actionPerformed(ActionEvent e) { //события игры
        if (state.equals(STATES.MENUE)) { //если переменная state == menue
            back.draw(g); //отображаем фон
            menue.draw(g); //отображаем меню
            gameDraw(); //прорисовываем в панели
        }

        if (state.equals(STATES.PLAY)) { // если переменная state == play
            gameUpdate();
            gameRender();
            gameDraw();
        }

    }
    public void gameRender() {
        back.draw(g);
        player.draw(g);
    }

    public void gameUpdate() { //обновление

        player.update();

    }
    // Переносим изображения на панель игры
    private void gameDraw() {
        Graphics g2 = this.getGraphics(); //переопределяем Graphics2D на Graphics
        g2.drawImage(image, 0, 0, null); //рисуем
        g2.dispose();

    }
}
