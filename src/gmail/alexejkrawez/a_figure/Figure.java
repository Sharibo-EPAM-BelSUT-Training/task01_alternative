package gmail.alexejkrawez.a_figure;
import gmail.alexejkrawez.paper.Paper;

import java.util.Scanner;

import static gmail.alexejkrawez.Main.*;

abstract public class Figure { //абстрактная фигура

    /**
     * Создание сканнера под названием input для возможности
     * воспринимать ввод пользователя при вызове
     * конструкторов фигур.
     **/
    protected Scanner input = new Scanner(System.in);

    /**
     * Вырезание из старой фигуры новой.
     * Новая и существующая фигура сравниваются,
     * если новая фигура меньше старой - она записывается на её место
     * в список вырезанных фигур, а если она бумажная - и в список бумажных.
     * В противном случае возвращается сообщение о невозможности вырезать фигуру.
     *
     * @param figure - новая фигура, которая будет сравниваться со старой.
     * @param figureIndex - индекс старой фигуры в списке вырезанных фигур.
     * */
    public void cutFigure(Figure figure, int figureIndex) {
        if (figure.getMaxSize() < getListIndex(figureIndex).getMinSize()) {
            if (figure instanceof Paper) {
                ((Paper) figure).setColor(((Paper) getListIndex(figureIndex)).getColor()); // присваиваем цвет
                setPaperListIndex(indexOfPaperFigure(getListIndex(figureIndex)), figure);
                System.out.println(figure.toString()); // для бумажных фигур вывод описания после применения цвета
            }
            setListIndex(figureIndex, figure); // Перезаписываем большую фигуру вырезанной из неё малой
        } else {
            System.out.println("Не выйдет вырезать");
        }
    }

    /**
     * Получение периметра фигуры.
     * */
    public abstract double Perimeter();

    /**
     * Получение площади фигуры.
     * */
    public abstract double Area();

    /**
     * Определение наименьшей стороны фигуры.
     * */
    public abstract double getMinSize();

    /**
     * Определение наибольшей стороны фигуры.
     * */
    public abstract double getMaxSize();
}