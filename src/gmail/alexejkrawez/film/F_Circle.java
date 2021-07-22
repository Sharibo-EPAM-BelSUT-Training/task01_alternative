package gmail.alexejkrawez.film;

import gmail.alexejkrawez.a_figure.Circle;

public class F_Circle extends Circle implements Film {

    /**
     * Конструктор плёночного круга, который просит задать радиус.
     * */
    public F_Circle() {
        System.out.println("Какого радиуса он будет?");
        int int_a = input.nextInt(); // вводим значения типа int, ибо удобнее
        setA((double) int_a);        // преобразуем значение int в double, ибо переменные у нас double
        /*Ненужные примочки:*/
        System.out.println(toString());
    }

}
