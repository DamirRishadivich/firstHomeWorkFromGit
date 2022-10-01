# **Менеджер продаж**

## Функционал

1. Инициализируем массив чисел.
``` java
int[] array = {1, 2, 21, 11, 32, 45};
```
2. Инициализируем класс SalesManager. Передаем ему наш массив array.
``` java
SalesManager salesManager = new SalesManager(array);
```
3. Метод .max() класса SalesManager ищет наибольшее число из массива своих объектов
``` java
System.out.println(salesManager.max());
```
4. Получаем вывод в консоль числа **45**