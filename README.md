# task01_alternative
First task in **[EPAM BelSUT Training](https://github.com/Sharibo-EPAM-BelSUT-Training).** Alternative version.

I used classes, interfaces, fields, methods, enumeration. I also learned how to work with collections and arrays. I created documentation comments and generated a [javadoc](https://sharibo-epam-belsut-training.github.io/task01_alternative/). In the end I built a [jar-file](https://github.com/Sharibo-EPAM-BelSUT-Training/task01_alternative/releases).

I executed this variant in the form of a dialogue of a console program with a "girl". ***My idea was:** more user interaction, programming shouldn't be boring!*

**Attention:** the program is in Russian.

***
<div align="center"><b>↓ How it works ↓</b></div>

***

Basically, the program corresponds to [task01](https://github.com/Sharibo-EPAM-BelSUT-Training/task01), but the Main.java class is an infinite while-loop. Inside the loop, there are many switch-case and if-else branches for implementing a dialogue with the user, the main purpose of which is to determine the user's response options, execute the corresponding code and output the result to the console.
<div align="center"><img src="https://github.com/Sharibo-EPAM-BelSUT-Training/task01_alternative/blob/master/presentation.gif" alt="GIF-preview"/></div>

In case of irrelevant input, the branches are traversed without finding a match and a new iteration of the infinite loop begins.
The infinite loop is interrupted by typing the word "выход", which sets the loop flag = boolean to false. This completes the program.

## Usage:
In [releases](https://github.com/Sharibo-EPAM-BelSUT-Training/task01_alternative/releases), you can download this program ( .jar-file) and "play" it.
Because the program is in Russian, **first you need to enable support for Russian input in the console**, then start the program itself. Further input takes place on the Russian keyboard layout.

For Windows:
```
chcp 1251
java -jar task01_alternative.jar
```
Or, more simply, you can run the program using this script in [releases](https://github.com/Sharibo-EPAM-BelSUT-Training/task01_alternative/releases): ```task01_alternative.bat```.

***
***
# task01_alternative
Первая лабораторная в **[Тренинге ЕПАМ при БелГУТе](https://github.com/Sharibo-EPAM-BelSUT-Training).** Альтернативная версия.

Я использовал классы, интерфейсы, поля, методы, перечисление. Я также научился работать с коллекциями и массивами. Я оформил документирующие комментарии и сгенерировал [javadoc](https://sharibo-epam-belsut-training.github.io/task01_alternative/). В конце я собрал [jar-file](https://github.com/Sharibo-EPAM-BelSUT-Training/task01_alternative/releases).

Я оформил этот вариант в виде диалога консольной программы с «девушкой». ***Моя идея заключалась в следующем:** больше взаимодействия с пользователем, программирование не должно быть скучным!*

**Внимание:** программа на русском языке.

***
<div align="center"><b>↓ Как это работает ↓</b></div>

***

В основном программа соответствует [task01](https://github.com/Sharibo-EPAM-BelSUT-Training/task01), но основной Main.java класс выполнен в виде бесконечного while-цикла. Внутри цикла есть много ветвлений switch-case и if-else для реализации диалога с пользователем, основная цель которых — определить варианты ответа пользователя, выполнить соответствующий код и вывести результат в консоль.
<div align="center"><img src="https://github.com/Sharibo-EPAM-BelSUT-Training/task01_alternative/blob/master/presentation.gif" alt="GIF-превью"/></div>

В случае нерелевантного ввода ветвления не находят совпадений и просто начинается новая итерация бесконечного цикла.
Бесконечный цикл прерывается вводом слова «выход», что переключает флаг цикла = булевую переменную в значение false. Таким образом завершается выполнение программы.

## Запуск:
В разделе [релизов](https://github.com/Sharibo-EPAM-BelSUT-Training/task01_alternative/releases) можно скачать данную программу и "сыграть" в неё.
Т.к. программа на русском языке, для начала **требуется включить поддержку русского ввода в консоли**, уже после запустить саму программу. Дальнейший ввод производится на русской раскладке клавиатуры. Для Windows:
```
chcp 1251
java -jar task01_alternative.jar
```
Или более просто запустить программу можно с помощью скрипта, также в разделе [релизов](https://github.com/Sharibo-EPAM-BelSUT-Training/task01_alternative/releases): ```task01_alternative.bat```.
