package gmail.alexejkrawez.a_figure;

import java.util.Objects;

public class Triangle extends Figure { //треугольник прямоугольный

    /**
     * Переменная стороны a прямоугольника
     */
    private double a;

    /**
     * Переменная стороны b прямоугольника
     */
    private double b;

    /**
     * Переменная стороны c прямоугольника
     */
    private double c;

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

    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }

    /**
     * Получение периметра треугольника.
     *
     * @return - возвращает периметр числом с плавающей точкой.
     * */
    public double Perimeter() {
        return (a + b + c);
    }

    /**
     * Получение площади треугольника.
     *
     * @return - возвращает площадь числом с плавающей точкой.
     * */
    public double Area() {
        double half_per = (a + b + c) / 2;
        return Math.sqrt(half_per * (half_per-a) *(half_per-b) * (half_per-c));
    }

    /**
     * Определение наименьшей стороны треугольника.
     *
     * @return - возвращает значение наименьшей стороны числом с плавающей точкой.
     * */
    @Override
    public double getMinSize() {
        return Math.min(Math.min(a, b), c);
    }

    /**
     * Определение наибольшей стороны треугольника.
     *
     * @return - возвращает значение наибольшей стороны числом с плавающей точкой.
     * */
    @Override
    public double getMaxSize() {
        return Math.max(Math.max(a, b), c);
    }

    /**
     * Отображение простого имени класса, размеров сторон треугольника.
     *
     * @return - возвращает описание треугольника.
     * */
    @Override
    public String toString () {
        return this.getClass().getSimpleName() +
                ": side A = " + a +
                ", side B = " + b +
                ", side C = " + c;
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
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.a, a) == 0 &&
                Double.compare(triangle.b, b) == 0 &&
                Double.compare(triangle.c, c) == 0;
    }

    /**
     * Переопределение метода hashCode() для возможности
     * делать сравнение с учётом полей.
     *
     * @return - возвращает истину, если коды сравниваемых фигур совпадают.
     * */
    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }
}