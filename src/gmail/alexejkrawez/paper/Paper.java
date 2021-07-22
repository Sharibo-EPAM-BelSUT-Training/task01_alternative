package gmail.alexejkrawez.paper;

public interface Paper { //бумага

    /**
     * Список цветов, в которые могут быть покрашены бумажные фигуры.
     */
    enum Caparol { //список цветов
        red,
        orange,
        yellow,
        green,
        blue,
        indigo,
        violet
    }

    /**
     * Получение цвета из списка enum Caparol.
     * */
    Caparol getColor();

    /**
     * Задание цвета из списка enum Caparol.
     *
     * @param capcolor - устанавливает цвет.
     * */
    void setColor(Caparol capcolor);

    
    class Painted {
        private Caparol figure_color;

        /**
         * Получение цвета фигуры из списка enum Caparol.
         *
         * @return - возвращает цвет фигуры.
         * */
        public Caparol getFigColor() {
            return figure_color;
        }

        /**
         * Задание цвета фигуре из списка enum Caparol.
         * Если фигуре уже был присвоен однажды цвет,
         * то второй раз цвет присвоить не удастся.
         *
         * @param color - устанавливает фигуре цвет из списка enum.
         * */
        public void setFigColor(Caparol color) {
            if (this.figure_color == null) {
                this.figure_color = color;
            }
        }

    }
}
