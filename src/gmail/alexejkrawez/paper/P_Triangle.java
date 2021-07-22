package gmail.alexejkrawez.paper;

import gmail.alexejkrawez.a_figure.Triangle;

public class P_Triangle extends Triangle implements Paper {
    private Painted painted = new Painted();

    /**
     * Конструктор бумажного треугольника, который просит задать размеры сторон.
     * */
    public P_Triangle() {
        System.out.println("Какой длины будет сторона A?");
        int int_a = input.nextInt(); // вводим значения типа int, ибо удобнее
        setA((double) int_a);        // преобразуем значение int в double, ибо переменные у нас double
        System.out.println("сторона B?");
        int_a = input.nextInt();
        setB((double) int_a);
        System.out.println("сторона C?");
        int_a = input.nextInt();
        setC((double) int_a);
    }

    /**
     * Получение цвета треугольника.
     * */
    @Override
    public Caparol getColor() {
        return painted.getFigColor();
    }

    /**
     * Задание цвета треугольника из списка enum Caparol.
     * */
    @Override
    public void setColor(Caparol capcolor) {
        painted.setFigColor(capcolor);
    }

    /**
     * Отображение простого имени класса,
     * размеров длины и ширины треугольника, его цвета.
     * */
    @Override
    public String toString() {
        return super.toString() + ", painted = " + painted.getFigColor();
    }
}
