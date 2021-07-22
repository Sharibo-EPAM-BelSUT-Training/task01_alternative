package gmail.alexejkrawez.a_figure;

import java.util.Objects;

public abstract class Rectangle extends Figure { //четырёхугольник абстрактный

    /**
     * Переменная стороны a прямоугольника
     */
    private double a;

    /**
     * Переменная стороны b прямоугольника
     */
    private double b;

    /*Делаем безопасными переменные*/
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }


    /**
     * Получение периметра прямоугольника.
     *
     * @return - возвращает периметр числом с плавающей точкой.
     * */
    @Override
    public double Perimeter () {
        return 2 * (a + b);
    }

    /**
     * Получение площади прямоугольника.
     *
     * @return - возвращает площадь числом с плавающей точкой.
     * */
    @Override
    public double Area () {
        return a * b;
    }

    /**
     * Определение наименьшей стороны прямоугольника.
     *
     * @return - возвращает значение меньшей стороны числом с плавающей точкой.
    * */
    @Override
    public double getMinSize() {
        return Math.min(a, b);
    }

    /**
     * Определение наибольшей стороны прямоугольника.
     *
     * @return - возвращает значение большей стороны числом с плавающей точкой.
     * */
    @Override
    public double getMaxSize() {
        return Math.max(a, b);
    }

    /**
     * Отображение простого имени класса, размеров длины и ширины прямоугольника.
     *
     * @return - возвращает описание прямоугольника.
     * */
    @Override
    public String toString () {
        return this.getClass().getSimpleName() +
                ": width = " + a +
                ", height = " + b;
    }

    /**
     * Переопределение метода equals() для возможности
     * делать сравнение с учётом полей.
     *
     * @return - возвращает истину, если поля сравниваемых фигур совпадают.
     * */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.a, a) == 0 &&
                Double.compare(rectangle.b, b) == 0;
    }

    /**
     * Переопределение метода hashCode() для возможности
     * делать сравнение с учётом полей.
     *
     * @return - возвращает истину, если коды сравниваемых фигур совпадают.
     * */
    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

}