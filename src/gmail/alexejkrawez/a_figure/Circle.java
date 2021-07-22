package gmail.alexejkrawez.a_figure;

import java.util.Objects;

public class Circle extends Figure { //круг
    private double r;
    /*Делаем безопасными переменные*/
    public double getA() {
        return r;
    }
    public void setA(double r) {
        this.r = r;
    }

    /**
     * Получение периметра круга.
     * */
    public double Perimeter() {
        return 2 * Math.PI * r;
    }

    /**
     * Получение площади круга.
     * */
    public double Area() {
        return Math.PI * r * r;
    }

    /**
     * Определение наименьшей стороны круга.
     * */
    @Override
    public double getMinSize() {
        return r * 2;
    }

    /**
     * Определение наибольшей стороны круга.
     * */
    @Override
    public double getMaxSize() {
        return r * 2;
    }

    /**
     * Отображение простого имени класса, размеров радиуса круга.
     * */
    @Override
    public String toString () {
        return this.getClass().getSimpleName() + ": radius = " + r;
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
        Circle circle = (Circle) o;
        return Double.compare(circle.r, r) == 0;
    }

    /**
     * Переопределение метода hashCode() для возможности
     * делать сравнение с учётом полей.
     *
     * @return - возвращает истину, если коды сравниваемых фигур совпадают.
     * */
    @Override
    public int hashCode() {
        return Objects.hash(r);
    }
}
