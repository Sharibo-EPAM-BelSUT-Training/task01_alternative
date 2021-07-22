package gmail.alexejkrawez;

/**
 * @name Java.SE.01-alternative
 * @package gmail.alexejkrawez;
 * @file Main.java
 * @author Alexej Krawez
 * @email AlexejKrawez@gmail.com
 * @created 19.11.2018
 * @updated 16.07.2021
 * @version 1.1
 * */

import gmail.alexejkrawez.a_figure.Figure;
import gmail.alexejkrawez.film.F_Circle;
import gmail.alexejkrawez.film.F_Rectangle;
import gmail.alexejkrawez.film.F_Triangle;
import gmail.alexejkrawez.paper.P_Circle;
import gmail.alexejkrawez.paper.P_Rectangle;
import gmail.alexejkrawez.paper.P_Triangle;
import gmail.alexejkrawez.paper.Paper;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    /**
     * Список всех вырезанных фигур. Не отображает фигуры, помещаемые в коробку.
     * */
    private static ArrayList<Figure> list = new ArrayList<Figure>();

    /**
     * Список бумажных фигур из списка всех создаваемых фигур. Не отображает фигуры, помещаемые в коробку.
     * */
    private static ArrayList<Figure> paper_list = new ArrayList<Figure>();

    /**
     * Вызвать фигуру по индексу из списка вырезанных фигур.
     *
     * @param listIndex - индекс вызываемой фигуры.
     * @return - возвращает индекс фигуры в списке.
     * */
    public static Figure getListIndex(int listIndex) {
        return list.get(listIndex);
    }

    /**
     * Добавить фигуру в список вырезанных фигур.
     *
     * @param figure - добавляемая фигура.
     * */
    public static void addListIndex(Figure figure) {
        list.add(figure);
    }

    /**
     * Добавить фигуру в список вырезанных фигур на место другой в списке.
     *
     * @param listIndex - индекс замещаемой фигуры.
     * @param overrideFigure - фигура, которая записывается в лист.
     * */
    public static void setListIndex(int listIndex, Figure overrideFigure) {
        list.set(listIndex, overrideFigure); // Записать фигуру в индекс
    }

    /**
     * Удалить фигуру под индексом в списке вырезанных фигур.
     *
     * @param listIndex - индекс удаляемой фигуры.
     * */
    public static void removeListIndex(int listIndex) {
        list.remove(listIndex);
    }


    /**
     * Добавить фигуру в список бумажных фигур.
     *
     * @param figure - добавляемая фигура.
     * */
    public static void addPaperListIndex(Figure figure) {
        paper_list.add(figure); // Записать фигуру в индекс
    }

    /**
     * Добавить фигуру в список бумажных фигур на место другой в списке.
     *
     * @param paper_listIndex - индекс замещаемой фигуры.
     * @param overrideFigure - фигура, которая записывается в лист.
     * */
    public static void setPaperListIndex(int paper_listIndex, Figure overrideFigure) {
        paper_list.set(paper_listIndex, overrideFigure); // Записать фигуру в индекс
    }

    /**
     * Удалить в списке бумажных фигур фигуру под индексом.
     *
     * @param paper_listIndex - индекс удаляемой фигуры.
     * */
    public static void removePaperListIndex(int paper_listIndex) {
        paper_list.remove(paper_listIndex); // Удалить фигуру по индексу
    }

    /**
     * Определить индекс фигуры в списке бумажных фигур.
     *
     * @param figure - фигура, чей индекс в списке нужно определить.
     * @return - возвращает индекс фигуры в списке.
     * */
    public static int indexOfPaperFigure(Figure figure) {
        return paper_list.indexOf(figure);
    }

    /**
     * Выводит список вырезанных фигур, нумерованный с единицы.
     * */
    public static void getList() {
        int k = 1;
        for (Figure i : list) {
            System.out.println(k++ + " - " + i);
        }
    }

    /**
     * Выводит список бумажных фигур, нумерованный с единицы.
     * */
    public static void getPaperList() {
        int k = 1;
        for (Figure i : paper_list) {
            System.out.println(k++ + " - " + i);
        }
    }

    /**
     * Определяет, выходит ли ввод пользователя за пределы размеров списка типа ArrayList.
     * Если ввод меньше нуля - переменной ввода присваивается значение 0,
     * вызывающее первый элемент списка.
     * Если ввод больше длины списка - переменной ввода присваивается значение,
     * эквивалентное последнему элементу в списке.
     *
     * Перегружаемый метод.
     *
     * @param list_name  - название проверяемого списка.
     * @param input_a - переменная, содержащая ввод пользователя.
     * @return - возвращает ввод пользователя, с поправками или без них.
     * */
    public static int ifOverListSize(ArrayList<Figure> list_name, int input_a) {
        if (input_a >= list_name.size()) { // Проверка на выход за пределы списка.
            System.out.println("Такая жадная! Давай возьмём последнюю!");
            input_a = list_name.size() - 1;
            System.out.println(list_name.get(input_a).toString());
        } else if (input_a < 0) {
            System.out.println("Так скромно! Давай возьмём самую первую, она красивая!");
            input_a = 0;
            System.out.println(list_name.get(0).toString());
        }
        return input_a;
    }

    /**
     * Определяет, выходит ли ввод пользователя за пределы размеров списка типа массива.
     * Если ввод меньше нуля - переменной ввода присваивается значение 0,
     * вызывающее первый элемент списка.
     * Если ввод больше длины списка - переменной ввода присваивается значение,
     * эквивалентное последнему элементу в списке.
     *
     * Перегружаемый метод.
     *
     * @param list_name  - название проверяемого списка.
     * @param input_a - переменная, содержащая ввод пользователя.
     * @return - возвращает ввод пользователя, с поправками или без них.
     * */
    public static int ifOverListSize(Box list_name, int input_a) {
        if (input_a > list_name.boxFindLastFigure()) { // Проверка на выход за пределы списка (и на запрос фигуры-null-а)
            System.out.println("Такая жадная! Давай возьмём последнюю!");
            input_a = list_name.boxFindLastFigure();
            list_name.boxFigureByIndex(input_a);
        } else if (input_a < 0) {
            System.out.println("Так скромно! Давай возьмём самую первую, она красивая!");
            input_a = 0;
            list_name.boxFigureByIndex(0);
        }
        return input_a;
    }


    /**
     * Основной метод main
     **/
    public static void main(String[] args) {

        /** переключатель основного цикла программы */
        boolean bool = true;

        /** переменная для хранения числового ввода пользователя */
        int input_a;

        /** переменная для хранения строкового ввода пользователя */
        String s;

        /**
         * Создание сканнера под названием sc.
         **/
        Scanner sc = new Scanner(System.in);

        /**
         * Создание коробки.
         * Количество фигур, вмещаемых коробкой, указано в классе Box
         * в поле MAX_BOX_CAPACITY.
         **/
        Box box = new Box();

        System.out.println("Программа рассчитана на ввод пользователя по запросу.");
        System.out.println("Для выхода из программы напишите в главном меню \"выход\".");
        System.out.println("\nВ программе заданы следующие фигуры:");
        System.out.println("бумажный прямоугольник / прямоугольник из бумаги;");
        System.out.println("бумажный треугольник / треугольник из бумаги;");
        System.out.println("бумажный круг / круг из бумаги;");
        System.out.println("пленочный прямоугольник / прямоугольник из пленки;");
        System.out.println("пленочный треугольник / треугольник из пленки;");
        System.out.println("пленочный круг / круг из пленки;");
        System.out.println("\nДля покраски фигур доступны семь цветов радуги:");
        System.out.println("красный, оранжевый, желтый, зеленый, голубой, синий, фиолетовый.");
        System.out.println("\nВажно!");
        System.out.println("Программа не воспринимает букву \"ё\" и ввод с большой буквы.");
        System.out.println("-------------------------------------------------------------");

        System.out.println("\nПривет, девочка!");

        while (bool) {
            System.out.println("\nЧто хочешь сделать?");
            System.out.println("1 - Вырезать фигуру?");
            System.out.println("2 - Вырезать фигуру из другой?");
            System.out.println("3 - Посмотреть все вырезанные фигуры?");
            System.out.println("4 - Покрасить бумажную фигуру?");
            System.out.println("5 - Поиграть с коробкой?");
            s = sc.nextLine();

            if (s.isEmpty()) {
                s = sc.nextLine();
            }
            if (s.equals("выход")) {
                System.out.println("Пока-пока, девочка!");
                bool = false;
                continue;
            }

            switch (s) {
                case "1":
                    System.out.println("Какую фигуру ты хочешь вырезать в этот раз?");
                    s = sc.nextLine();

                    if (s.isEmpty()) {
                        s = sc.nextLine();
                    }
                    switch (s) {
                        case "бумажный прямоугольник":
                        case "прямоугольник из бумаги":
                            list.add(new P_Rectangle());
                            paper_list.add(list.get(list.size() - 1));
                            System.out.println(list.get(list.size() - 1).toString());
                            break;
                        case "бумажный треугольник":
                        case "треугольник из бумаги":
                            list.add(new P_Triangle());
                            paper_list.add(list.get(list.size() - 1));
                            System.out.println(list.get(list.size() - 1).toString());
                            break;
                        case "бумажный круг":
                        case "круг из бумаги":
                            list.add(new P_Circle());
                            paper_list.add(list.get(list.size() - 1));
                            System.out.println(list.get(list.size() - 1).toString());
                            break;
                        case "прямоугольник из пленки":
                        case "пленочный прямоугольник":
                            list.add(new F_Rectangle());
                            break;
                        case "треугольник из пленки":
                        case "пленочный треугольник":
                            list.add(new F_Triangle());
                            break;
                        case "круг из пленки":
                        case "пленочный круг":
                            list.add(new F_Circle());
                    }
                    break;

                case "2":
                    if (list.size() == 0) {
                        if (box.isBoxNull()) {
                            System.out.println("Сначала вырежи первую фигуру из листа!");
                        } else {
                            System.out.println("Нет бумажных фигур! Возможно, они есть в коробке?");
                        }

                    } else {
                        if (list.size() == 1) { // Небольшая развилка для устранения оплошностей со списком из одной фигуры
                            input_a = 0;
                        } else {
                            System.out.println("Уже есть столько замечательных фигур! Вот они:");
                            getList();
                            System.out.println("Из какой будешь вырезать?");
                            input_a = sc.nextInt(); //Ввод пользователя
                            input_a -= 1;
                            input_a = ifOverListSize(list, input_a);
                        }

                        System.out.println("Что вырежешь?");
                        s = sc.nextLine(); // Ввод пользователя
                        if (s.isEmpty()) {
                            s = sc.nextLine();
                        }

                        if (list.get(input_a) instanceof Paper) { // Проверка на бумагу или плёнку
                            switch (s) {
                                case "бумажный прямоугольник":
                                case "прямоугольник из бумаги":
                                    Figure figure = new P_Rectangle();
                                    list.get(input_a).cutFigure(figure, input_a);
                                    break;
                                case "бумажный треугольник":
                                case "треугольник из бумаги":
                                    figure = new P_Triangle();
                                    list.get(input_a).cutFigure(figure, input_a);
                                    break;
                                case "бумажный круг":
                                case "круг из бумаги":
                                    figure = new P_Circle();
                                    list.get(input_a).cutFigure(figure, input_a);
                                    break;
                            }
                        } else {
                            switch (s) {
                                case "пленочный прямоугольник":
                                case "прямоугольник из пленки":
                                    Figure figure = new F_Rectangle();
                                    list.get(input_a).cutFigure(figure, input_a);
                                    break;
                                case "пленочный треугольник":
                                case "треугольник из пленки":
                                    figure = new F_Triangle();
                                    list.get(input_a).cutFigure(figure, input_a);
                                    break;
                                case "пленочный круг":
                                case "круг из пленки":
                                    figure = new F_Circle();
                                    list.get(input_a).cutFigure(figure, input_a);
                                    break;
                            }
                        }
                    }
                    break;

                case "3":
                    if (list.size() == 0) {
                        if (box.isBoxNull()) {
                            System.out.println("Пока ещё ничего нет!");
                        } else {
                            System.out.println("Нет фигур! Но они есть в коробке!");
                        }
                    } else {
                        System.out.println("У тебя уже есть столько замечательных фигур! Вот они:");
                        getList();
                    }
                    break;

                case "4":
                    if (paper_list.size() == 0) {
                        if (box.isBoxNull()) {
                            System.out.println("Сначала вырежи первую фигуру из бумаги!");
                        } else {
                            System.out.println("Нет бумажных фигур! Возможно, они есть в коробке?");
                        }
                    } else {

                        if (paper_list.size() == 1) { // Небольшая развилка для устранения оплошностей со списком из одной фигуры
                            if (((Paper) paper_list.get(0)).getColor() == null) {
                                input_a = 0;
                                System.out.println(paper_list.get(0));
                            } else {
                                System.out.println("Ой, её уже красили!");
                                continue;
                            }
                        } else {

                            System.out.println("Уже есть столько замечательных бумажных фигур! Вот они:");
                            getPaperList();  // Получение списка БУМАЖНЫХ фигур
                            System.out.println("Какую покрасишь?");
                            input_a = sc.nextInt(); // Ввод пользователя
                            input_a -= 1;
                            input_a = ifOverListSize(paper_list, input_a);
                            if (((Paper) paper_list.get(input_a)).getColor() != null) {
                                System.out.println("Ой, её уже красили!");
                                continue;
                            }
                        }


                        System.out.println("В какой цвет радуги покрасишь?");
                        s = sc.nextLine(); // Ввод пользователя
                        if (s.isEmpty()) {
                            s = sc.nextLine();
                        }

                        switch (s) {
                            case "красный":
                                ((Paper) paper_list.get(input_a)).setColor(Paper.Caparol.red);
                                System.out.println(paper_list.get(input_a).toString());
                                break;
                            case "оранжевый":
                                ((Paper) paper_list.get(input_a)).setColor(Paper.Caparol.orange);
                                System.out.println(paper_list.get(input_a).toString());
                                break;
                            case "желтый":
                                ((Paper) paper_list.get(input_a)).setColor(Paper.Caparol.yellow);
                                System.out.println(paper_list.get(input_a).toString());
                                break;
                            case "зеленый":
                                ((Paper) paper_list.get(input_a)).setColor(Paper.Caparol.green);
                                System.out.println(paper_list.get(input_a).toString());
                                break;
                            case "голубой":
                                ((Paper) paper_list.get(input_a)).setColor(Paper.Caparol.blue);
                                System.out.println(paper_list.get(input_a).toString());
                                break;
                            case "синий":
                                ((Paper) paper_list.get(input_a)).setColor(Paper.Caparol.indigo);
                                System.out.println(paper_list.get(input_a).toString());
                                break;
                            case "фиолетовый":
                                ((Paper) paper_list.get(input_a)).setColor(Paper.Caparol.violet);
                                System.out.println(paper_list.get(input_a).toString());
                                break;
                        }
                    }
                    break;

                case "5":
                    System.out.println("А вот и коробочка! Хочешь...");
                    System.out.println("1 - Увидеть, что в коробке?");
                    System.out.println("2 - Положить фигуру в коробку?");
                    System.out.println("3 - Достать фигуру из коробки?");
                    System.out.println("4 - Узнать о фигуре больше?");
                    System.out.println("5 - Заменить фигуру другой?");
                    System.out.println("6 - Узнать, сколько в коробке фигур?");
                    System.out.println("7 - Узнать сумму площадей всех фигур в коробке?");
                    System.out.println("8 - Узнать сумму периметров всех фигур в коробке?");
                    System.out.println("9 - Достать все фигуры одного типа?");
                    System.out.println("10 - Достать все пленочные или бумажные фигуры?");
                    System.out.println("11 - Найти похожую фигуру в коробке?");
                    s = sc.next();

                    switch (s) {
                        case "1":
                            System.out.println("А внутри коробки...");
                            box.getBox();
                            break;

                        case "2":
                            if (!box.isBoxFull()) {
                                if (list.size() == 1) {
                                    System.out.println(getListIndex(0).toString());
                                    System.out.println("Положить её в коробку?");
                                    System.out.println("да / нет");
                                    s = sc.next(); //Ввод пользователя
                                    if (s.equals("да")) {
                                        box.boxInByIndex(0);
                                    } else {
                                        continue;
                                    }
                                } else {
                                    System.out.println("Какую положишь?");
                                    getList();
                                    input_a = sc.nextInt(); //Ввод пользователя
                                    input_a -= 1;
                                    input_a = ifOverListSize(list, input_a);
                                    box.boxInByIndex(input_a);
                                }
                            } else {
                                System.out.println("Коробка полная!");
                            }
                            break;

                        case "3":
                            System.out.println("А внутри коробки...");
                            if (!box.isBoxNull()) {
                                if (box.boxFindLastFigure() == 0) {
                                    box.boxFigureByIndex(0);
                                    System.out.println("Достать её из коробки?");
                                    System.out.println("да / нет");
                                    s = sc.next(); //Ввод пользователя
                                    if (s.equals("да")) {
                                        box.boxOutByIndex(0);
                                    } else {
                                        continue;
                                    }
                                } else {
                                    box.getBox();
                                    System.out.println("Какую достанешь?");
                                    input_a = sc.nextInt(); //Ввод пользователя
                                    input_a -= 1;
                                    input_a = ifOverListSize(box, input_a);
                                    box.boxOutByIndex(input_a);
                                }
                            } else {
                                System.out.println("Коробка пустая!");
                            }
                            break;

                        case "4":
                            if (!box.isBoxNull()) {
                                if (box.boxFindLastFigure() == 0) {
                                    System.out.println("Одна одинешенька в коробочке:");
                                    box.boxFigureInfoByIndex(0);
                                    continue;
                                } else {
                                    box.getBox();
                                    System.out.println("О какой?");
                                    input_a = sc.nextInt(); //Ввод пользователя
                                    input_a -= 1;
                                    input_a = ifOverListSize(box, input_a);
                                    box.boxFigureInfoByIndex(input_a);
                                }
                            } else {
                                System.out.println("Коробка пуста!");
                            }
                            break;

                        case "5":
                            if (box.isBoxNull() || list.size() == 0) {
                                System.out.println("Похоже, ничего не выйдет!");
                            } else {
                                if (box.boxFindLastFigure() == 0 & list.size() == 1) { // если по одной фигуре там и там
                                    System.out.print("Есть " + list.get(0)); // одной строкой
                                    System.out.print(" и в коробке ");       // одной строкой
                                    box.boxFigureByIndex(0);         // одной строкой
                                    System.out.println("Хочешь их поменять?");
                                    System.out.println("да / нет");
                                    s = sc.next(); //Ввод пользователя
                                    if (s.equals("да")) {
                                        box.boxReplaceByIndex(0, 0);
                                    } else {
                                        continue;
                                    }

                                } else if (box.boxFindLastFigure() == 0) { // если в коробке лишь одна фигура
                                    System.out.print("В коробке есть лишь "); // одной строкой
                                    box.boxFigureByIndex(0);
                                    System.out.println("На что его заменишь?");
                                    getList();
                                    input_a = sc.nextInt(); //Ввод пользователя
                                    input_a -= 1;
                                    input_a = ifOverListSize(list, input_a);
                                    box.boxReplaceByIndex(input_a, 0);

                                } else if (list.size() == 1) {
                                    System.out.println("Из фигур есть лишь " + list.get(0));
                                    System.out.println(getListIndex(0).toString());
                                    System.out.println("На что хочешь заменить его?");
                                    box.getBox();
                                    input_a = sc.nextInt(); //Ввод пользователя
                                    input_a -= 1;
                                    input_a = ifOverListSize(box, input_a);
                                    box.boxReplaceByIndex(0, input_a);

                                } else {
                                    System.out.println("Коробочка!");
                                    box.getBox();
                                    System.out.println("Фигурки!");
                                    getList();
                                    System.out.println("Какую из фигур в коробке хочешь заменить?");
                                    input_a = sc.nextInt(); //Ввод пользователя
                                    input_a -= 1;
                                    input_a = ifOverListSize(box, input_a);
                                    System.out.println("Какой из фигур её заменишь?");
                                    int input_b = sc.nextInt(); //Ввод пользователя
                                    input_b -= 1;
                                    input_b = ifOverListSize(list, input_b);
                                    box.boxReplaceByIndex(input_b, input_a);
                                }
                            }
                            break;
                        case "6":
                            box.boxHowMuchFigure();
                            break;

                        case "7":
                            if (!box.isBoxNull()){
                                box.boxTotalArea();
                            } else {
                                System.out.println("В коробке пусто!");
                            }
                            break;

                        case "8":
                            if (!box.isBoxNull()){
                                box.boxTotalPerimeter();
                            } else {
                                System.out.println("В коробке пусто!");
                            }
                            break;

                        case "9":
                            System.out.println("А внутри коробки...");
                            if (!box.isBoxNull()) {
                                box.getBox();
                                System.out.println("Какой тип фигур хочешь достать?");
                                s = sc.nextLine(); // ввод пользователя
                                if (s.isEmpty()) {
                                    s = sc.nextLine();
                                }

                                switch (s) {
                                    case "бумажный прямоугольник":
                                    case "бумажные прямоугольники":
                                    case "прямоугольник из бумаги":
                                    case "прямоугольники из бумаги":
                                        box.boxOutByClass("P_Rectangle");
                                        break;
                                    case "бумажный треугольник":
                                    case "бумажные треугольники":
                                    case "треугольник из бумаги":
                                    case "треугольники из бумаги":
                                        box.boxOutByClass("P_Triangle");
                                        break;
                                    case "бумажный круг":
                                    case "бумажные круги":
                                    case "круг из бумаги":
                                    case "круги из бумаги":
                                        box.boxOutByClass("P_Circle");
                                        break;
                                    case "прямоугольник из пленки":
                                    case "прямоугольники из пленки":
                                    case "пленочный прямоугольник":
                                    case "пленочные прямоугольники":
                                        box.boxOutByClass("F_Rectangle");
                                        break;
                                    case "треугольник из пленки":
                                    case "треугольники из пленки":
                                    case "пленочный треугольник":
                                    case "пленочные треугольники":
                                        box.boxOutByClass("F_Triangle");
                                        break;
                                    case "круг из пленки":
                                    case "круги из пленки":
                                    case "пленочный круг":
                                    case "пленочные круги":
                                        box.boxOutByClass("F_Circle");
                                }

                            } else {
                                System.out.println("В коробке ничего нет!");
                            }
                            break;

                        case "10":
                            System.out.println("А внутри коробки...");
                            if (!box.isBoxNull()) {
                                box.getBox();
                                System.out.println("Бумажные или пленочные фигуры хочешь достать?");
                                s = sc.nextLine(); // ввод пользователя
                                if (s.isEmpty()) {
                                    s = sc.nextLine();
                                }

                                switch (s) {
                                    case "бумажные фигуры":
                                    case "бумажные":
                                    case "из бумаги":
                                        box.boxOutByInterface("Paper");
                                        break;
                                    case "пленочные фигуры":
                                    case "пленочные":
                                    case "из пленки":
                                        box.boxOutByInterface("Film");
                                        break;
                                }
                            } else {
                                System.out.println("В коробке ничего нет!");
                            }
                            break;

                        case "11":
                            if (box.isBoxNull()) {
                                System.out.println("Похоже, ничего не выйдет!");
                            } else if (list.size() == 0) {
                                System.out.println("Похоже, ничего не выйдет!");

                            } else {
                                if (list.size() == 1) { // если в наличии только одна фигура
                                    System.out.println("Есть " + list.get(0)); // одной строкой
                                    System.out.println("Хочешь найти похожую?");
                                    System.out.println("да / нет");
                                    s = sc.next(); //Ввод пользователя
                                    if (s.equals("да")) {
                                        box.isFigureEquals(getListIndex(0));
                                    } else {
                                        continue;
                                    }
                                } else { // если в наличии фигур много
                                    System.out.println("Фигурки!");
                                    getList();
                                    System.out.println("С какой из них будешь искать схожесть?");
                                    input_a = sc.nextInt(); //Ввод пользователя
                                    input_a -= 1;
                                    input_a = ifOverListSize(list, input_a);
                                    box.isFigureEquals(getListIndex(input_a));
                                }
                            }
                            break;
                    }
                    break;
            }
        }


    }
}