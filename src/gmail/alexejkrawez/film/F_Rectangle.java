package gmail.alexejkrawez.film;

import gmail.alexejkrawez.a_figure.Rectangle;

public class F_Rectangle extends Rectangle implements Film {

    /**
     * Конструктор плёночного прямоугольника, который просит задать длину и ширину.
     * */
    public F_Rectangle() {
        System.out.println("Какой он будет длины?");
        int int_a = input.nextInt(); // вводим значения типа int, ибо удобнее
        setA((double)int_a);         // преобразуем значение int в double, ибо переменные у нас double
        System.out.println("А ширины?");
        int_a = input.nextInt();
        setB((double)int_a);
        /*Ненужные примочки:*/
        System.out.println(toString());
    }

}
