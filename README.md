# Задача «Логгер»

## Описание
В этом задании попрактикуемся с шаблоном *Singleton* (*Одиночка*). Мы пишем программу, которая будет каждый свой шаг обильно логгировать в консоль, но не напрямую через `System.out.println`, а через объект-логгер нашего собственного класса-синглтона.

### Функционал программы
1. Программа здоровается с пользователем, просит ввести два числа: размер списка `N` и верхнюю границу значений элементов в списке `M`.
2. Программа создаёт список `ArrayList` из `N` элементов и заполняет их случайными числами от `0` до `M`.
3. Программа просит пользователя ввести число `f` для фильтрации списка.
4. Программа создаёт объект `filter` вашего класса `Filter`, передав в конструктор значение `f`
5. Программа вызывает у `filter` метод `List<Integer> filterOut(List<Integer> list)`, передавая созданный случайный список в качестве параметра и принимая в качестве ответа список, который идентичен исходному, если пропустить элементы меньше `f`
6. Программа выводит итоговый список на экран и завершает свою работу

### Логгер
Каждое действие программы, будь то некорректный ввод пользователем входных данных или решение не добавлять элемент в результирующий список в методе `filterOut`, должно быть залоггировано. Для этого надо создать синглтон-класс `Logger` у которого будет метод `void log(String msg)` для вывода на экран сообщения. Сообщение должно выводиться в формате: `[<дата и номер сообщения>] <текст сообщения>`, где `<номер сообщения>` это порядковый номер выводимого логгером сообщения, а `<текст сообщения>` это значение параметра `msg`.
