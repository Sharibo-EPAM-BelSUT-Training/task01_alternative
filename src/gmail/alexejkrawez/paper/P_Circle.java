package gmail.alexejkrawez.paper;

import gmail.alexejkrawez.a_figure.Circle;

public class P_Circle extends Circle implements Paper {
    private Painted painted = new Painted();

    /**
     * Конструктор бумажного круга, который просит задать радиус.
     * */
    public P_Circle() {
        System.out.println("Какого радиуса он будет?");
        int int_a = input.nextInt(); // вводим значения типа int, ибо удобнее
        setA((double) int_a);        // преобразуем значение int в double, ибо переменные у нас double
    }

    /**
     * Получение цвета круга.
     * */
    @Override
    public Caparol getColor() {
        return painted.getFigColor();
    }

    /**
     * Задание цвета круга из списка enum Caparol.
     * */
    @Override
    public void setColor(Caparol capcolor) {
        painted.setFigColor(capcolor);
    }

    /**
     * Отображение простого имени класса,
     * размеров длины и ширины круга, его цвета.
     * */
    @Override
    public String toString() {
        return super.toString() + ", painted = " + painted.getFigColor();
    }
}
