package gmail.alexejkrawez.film;

import gmail.alexejkrawez.a_figure.Triangle;

public class F_Triangle extends Triangle implements Film {

    /**
     * Конструктор плёночного треугольника, который просит задать размеры сторон.
     * */
    public F_Triangle() {
        System.out.println("Какой длины будет сторона A?");
        int int_a = input.nextInt(); // вводим значения типа int, ибо удобнее
        setA((double) int_a);        // преобразуем значение int в double, ибо переменные у нас double
        System.out.println("сторона B?");
        int_a = input.nextInt();
        setB((double) int_a);
        System.out.println("сторона C?");
        int_a = input.nextInt();
        setC((double) int_a);
        /*Ненужные примочки:*/
        System.out.println(toString());
    }

}
