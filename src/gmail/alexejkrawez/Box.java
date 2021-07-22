package gmail.alexejkrawez;

import gmail.alexejkrawez.a_figure.Figure;
import gmail.alexejkrawez.film.Film;
import gmail.alexejkrawez.paper.Paper;

import java.math.RoundingMode;
import java.text.DecimalFormat;

import static gmail.alexejkrawez.Main.*;

public class Box {

    /** Максимальная вместимость коробки */
    private final static int MAX_BOX_CAPACITY = 5;

    /** Счётчик заполненности коробки, считает с нуля */
    private static int count;

    /** Создание коробки заданной вместимости */
    private static Figure[] box = new Figure[MAX_BOX_CAPACITY];

    /**
     * Конструктор коробки.
     * Создание коробки и присвоение счётчику фигур начального значения.
     * */
    Box() {
        count = -1;
    }

    /**
     * Показать списком, нумерованным с единицы, фигуры в коробке.
     * При отсутствии фигур выведет соответствующее сообщение.
     * */
    public void getBox() {
        int k = 1;
        for (Figure i : box) {
            if (k == 1 & i == null) {
                System.out.println("Коробка пустая!");
                break;
            } else if (i == null) { //чтобы не писало нули, когда фигуры кончатся
                break;
            }
            System.out.println(k++ + " - " + i); // Выводит список фигур в коробке, нумерованный С ЕДИНИЦЫ.
        }
    }

    /**
     * Показать количество фигур в коробке.
     * При отсутствии фигур выведет соответствующее сообщение.
     * */
    public void boxHowMuchFigure() {
        if (isBoxNull()) {
            System.out.println("В коробке ничего нет!");
        } else {
            int a = count;
            System.out.println("Фигур в коробке - " + ++a);
        }
    }

    /**
     * Определить индекс последней фигуры в коробке.
     *
     * @return - возвращает значение переменной-счётчика count.
     * */
    public int boxFindLastFigure() {
        return count;
    }

    /**
     * Определяет, пустая ли коробка.
     *
     * @return - возвращает истину, если коробка пустая.
     * */
    public boolean isBoxNull() {
        if (count == -1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Определяет, полная ли коробка.
     *
     * @return - возвращает истину, если коробка заполнена.
     * */
    public boolean isBoxFull() {
        if (count == (MAX_BOX_CAPACITY - 1)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Удаляет фигуру под индексом из коробки,
     * при этом происходит смещение индексов фигур, записанных после удаляемой,
     * для устранения образования null-объектов между объектами-фигурами.
     * Вызывается в других методах.
     *
     * @param boxIndex - индекс удаляемой фигуры.
     * */
    private void boxRemoveByIndex(int boxIndex) { //вызывается в других методах
        Figure[] box2 = new Figure[MAX_BOX_CAPACITY];
        for (int i = 0; i < box.length; i++) {
            if (i > boxIndex) {
                box2[i-1] = box[i];
            }
            if (i == boxIndex) {
                continue;
            }
            if (i < boxIndex) {
                box2[i] = box[i];
            }
        }
        box = box2;
    }

    /**
     * Положить фигуру под индексом в коробку (добавить последней).
     * Добавляемая фигура удаляется из списка вырезанных фигур,
     * если она бумажная - также из списка бумажных фигур.
     *
     * @param listIndex - индекс фигуры в списке вырезанных фигур.
     * */
    public void boxInByIndex(int listIndex) {
        Figure listFigure = getListIndex(listIndex);
        box[++count] = listFigure;
        if (listFigure instanceof Paper) {
            removePaperListIndex(indexOfPaperFigure(listFigure)); // Фигура удаляется из списка бумажных фигур
        }
        removeListIndex(listIndex); // Фигура удаляется из общего списка созданных фигур
        System.out.println(box[count].toString()); // Неважное: пишет, какую фигуру добавило в коробку
    }

    /**
     * Извлечь элемент под индексом из коробки.
     * Извлекаемая фигура записывается в список вырезанных фигур,
     * если она бумажная - также в список бумажных фигур.
     * Коробка при удалении смещает фигуры, находящиеся после удаляемой.
     *
     * @param boxIndex - индекс извлекаемой фигуры.
     * */
    public void boxOutByIndex(int boxIndex) {
        Figure boxFigure = box[boxIndex];
        System.out.println(box[boxIndex].toString());
        if (boxFigure instanceof Paper) {
            addPaperListIndex(boxFigure); // Фигура добавляется в список бумажных фигур
        }
        addListIndex(boxFigure); // Фигура добавляется в список всех фигур
        boxRemoveByIndex(boxIndex); // Фигура удаляется из коробки, коробка перестраивается
        count--;
    }

    /**
     * Извлечь все фигуры указанного класса из коробки.
     * Извлекаемые фигуры записываются в список вырезанных фигур,
     * если они бумажные - также в список бумажных фигур.
     * Коробка при удалении каждой фигуры смещает фигуры,
     * находящиеся после удаляемой.
     *
     * @param simpleName - строка, содержащая название запрашиваемого класса.
     * */
    public void boxOutByClass(String simpleName) {
        int k = -1;
        for (; k != count;) {
            k++;
            if (box[k].getClass().getSimpleName().equals(simpleName)) {
                Figure boxFigure = box[k];
                System.out.println(boxFigure.toString());
                if (boxFigure instanceof Paper) {
                    addPaperListIndex(boxFigure); // Фигура добавляется в список бумажных фигур
                }
                addListIndex(boxFigure); // Фигура добавляется в список всех фигур
                boxRemoveByIndex(k); // Фигура удаляется из коробки, коробка перестраивается
                k--;
                count--;
            }
        }
    }

    /**
     * Извлечь все фигуры указанного интерфейса из коробки.
     * Извлекаемые фигуры записываются в список вырезанных фигур,
     * если интерфейс бумага - также в список бумажных фигур.
     * Коробка при удалении каждой фигуры смещает фигуры,
     * находящиеся после удаляемой.
     *
     * @param interfaceName - строка, содержащая название запрашиваемого интерфейса.
     * */
    public void boxOutByInterface(String interfaceName) {
        int k = -1;
        if (interfaceName.equals("Paper")) {
            for (; k != count;) {
                k++;
                if (box[k] instanceof Paper) {
                    Figure boxFigure = box[k];
                    System.out.println(boxFigure.toString());
                    addPaperListIndex(boxFigure); // Фигура добавляется в список бумажных фигур
                    addListIndex(boxFigure); // Фигура добавляется в список всех фигур
                    boxRemoveByIndex(k); // Фигура удаляется из коробки, коробка перестраивается
                    k--;
                    count--;
                }
            }
        } else {
            for (; k != count;) {
                k++;
                if (box[k] instanceof Film) {
                    Figure boxFigure = box[k];
                    System.out.println(boxFigure.toString());
                    addListIndex(boxFigure); // Фигура добавляется в список всех фигур
                    boxRemoveByIndex(k); // Фигура удаляется из коробки, коробка перестраивается
                    k--;
                    count--;
                }
            }
        }

    }

    /**
     * Посмотреть фигуру под индексом в коробке.
     *
     * @param boxIndex - индекс запрашиваемой фигуры.
     * */
    public void boxFigureByIndex(int boxIndex) {
        System.out.println(box[boxIndex].toString());
    }

    /**
     * Посмотреть полную информацию о фигуре под индексом в коробке.
     * Вызывает метод toString() фигуры, дополнительно отображает
     * периметр и площадь фигуры.
     *
     * @param boxIndex - индекс запрашиваемой фигуры.
     * */
    public void boxFigureInfoByIndex(int boxIndex) {
        System.out.println(box[boxIndex].toString());
        DecimalFormat df = new DecimalFormat("#.##"); // округление
        df.setRoundingMode(RoundingMode.CEILING);
        System.out.println("Периметр: " + df.format(box[boxIndex].Perimeter())); // автоупаковки время!
        System.out.println("Площадь: " + df.format(box[boxIndex].Area())); // автоупаковки время!
    }

    /**
     * Заменить фигуру под индексом в коробке.
     * Заменяет фигуру под индексом фигурой из списка вырезанных фигур.
     * При этом фигура из списка вырезанных удаляется из него и из списка бумажных,
     * если она бумажная. Фигура из коробки записывается на её место в обоих списках.
     * Если фигура из коробки бумажная, а фигура из списка вырезанных пленочная -
     * фигура из коробки добавляется последней в список бумажных.
     *
     * @param listIndex - индекс фигуры в списке вырезанных фигур.
     * @param boxIndex - индекс фигуры в коробке.
     * */
    public void boxReplaceByIndex(int listIndex, int boxIndex) {
        System.out.print("Берём из коробки " + box[boxIndex].toString()); // одной строкой
        Figure listFigure = getListIndex(listIndex); // присваиваем переменной ссылку на фигуру с общего списка
        Figure boxFigure = box[boxIndex];            // присваиваем переменной ссылку на фигуру что в коробке

        if (boxFigure instanceof Paper & listFigure instanceof Paper) {
            setPaperListIndex(indexOfPaperFigure(listFigure), boxFigure); // Фигура добавляется в список бумажных фигур на место старой
        } else if (boxFigure instanceof Paper) { // если фигура в коробке бумажная - добавляем её в список бумажных.
            addPaperListIndex(boxFigure);
        } else if (listFigure instanceof Paper) {
            removePaperListIndex(indexOfPaperFigure(listFigure)); // если фигура бумажная - удаляем её из списка бумажных.
        }

        setListIndex(listIndex, boxFigure); // Фигура добавляется в список всех фигур на место старой
        box[boxIndex] = listFigure;         // Присваиваем уже удалённую из листа фигуру на место старой в коробке
        System.out.println(", а кладём " + box[boxIndex].toString());
    }

    /**
     * Найти и посмотреть подобную фигуру.
     *
     * @param listFigure - индекс фигуры, с которой будут
     *                     искаться соответствия среди фигур в коробке.
     * */
    public void isFigureEquals(Figure listFigure) {
        int k = 1;
        for (Figure i : box) {
            if (listFigure.equals(i)) {
                System.out.println("Есть такая же!");
                System.out.println(k + " - " + i.toString());
                break;
            } else if (k > count) {
                System.out.println("Нет похожих!");
                break;
            } else {
                k++;
            }
        }
    }

    /**
     * Показать суммарную площадь всех фигур в коробке.
     * */
    public void boxTotalArea() {
        double total = 0.0;
        int k = -1;
        int p = boxFindLastFigure();
        for (Figure i : box) {
            total += box[++k].Area();
            if (k == p) {
                break;
            }
        }

        DecimalFormat df = new DecimalFormat("#.##"); // округление
        df.setRoundingMode(RoundingMode.CEILING);
        System.out.println("Суммарная площадь фигур в коробке равна: " + df.format(total)); // автоупаковки время!
    }

    /**
     * Показать суммарный периметр всех фигур в коробке.
     * */
    public void boxTotalPerimeter() {
        double total = 0.0;
        int k = -1;
        int p = boxFindLastFigure();
        for (Figure i : box) {
            total += box[++k].Perimeter();
            if (k == p) {
                break;
            }
        }

        DecimalFormat df = new DecimalFormat("#.##"); // округление
        df.setRoundingMode(RoundingMode.CEILING);
        System.out.println("Суммарный периметр фигур в коробке равен: " + df.format(total)); // автоупаковки время!
    }

}
