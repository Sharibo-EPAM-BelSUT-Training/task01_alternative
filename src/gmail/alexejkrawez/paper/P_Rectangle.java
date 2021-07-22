package gmail.alexejkrawez.paper;

import gmail.alexejkrawez.a_figure.Rectangle;

public class P_Rectangle extends Rectangle implements Paper {
    private Painted painted = new Painted();

    /**
     * Конструктор бумажного прямоугольника, который просит задать длину и ширину.
     * */
    public P_Rectangle() {
        System.out.println("Какой он будет длины?");
        int int_a = input.nextInt(); // вводим значения типа int, ибо удобнее
        setA((double)int_a);         // преобразуем значение int в double, ибо переменные у нас double
        System.out.println("А ширины?");
        int_a = input.nextInt();
        setB((double)int_a);
    }

    /**
     * Получение цвета прямоугольника.
     * */
    @Override
    public Caparol getColor() {
        return painted.getFigColor();
    }

    /**
     * Задание цвета прямоугольника из списка enum Caparol.
     * */
    @Override
    public void setColor(Caparol capcolor) { // Вписываешь цвет из энам и он красит им фигуру.
        painted.setFigColor(capcolor);
    } // для задания цвета

    /**
     * Отображение простого имени класса,
     * размеров длины и ширины прямоугольника, его цвета.
     * */
    @Override
    public String toString() {
        return super.toString() + ", painted = " + painted.getFigColor();
    }
}