# Java Core (семинары)
<hr>
Урок 4. Обработка исключений
<hr>
   
1. Задача: Проверка логина и пароля
    * 1 - Создать статический метод который принимает на вход три параметра: login, password и confirmPassword.
    * 2 - Длина login должна быть меньше 20 символов. Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
    * 3 - Длина password должна быть меньше 20 символов. Также password и confirmPassword должны быть равны. Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
    * 4 - WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами – один по умолчанию, второй принимает сообщение исключения и передает его в конструктор класса Exception.
    * 5 - В основном классе программы необходимо по-разному обработать исключения.
    * 6 - Метод возвращает true, если значения верны или false в другом случае.

2. Задача: Эмуляция интернет-магазина
   * 1 - написать классы покупатель, товар и заказ;
   * 2 - создать массив покупателей, массив товаров и массив заказов;
   * 3 - создать статический метод “совершить покупку” со строковыми параметрами, соответствующими полям объекта заказа. Метод должен вернуть объект заказа
   * 4 - Если в метод передан несуществующий покупатель, товар или отрицательное количество, метод должен выбросить соответствующее исключение;
   * 5 - Вызвать метод совершения покупки несколько раз таким образом, чтобы заполнить массив покупок возвращаемыми значениями. Обработать исключения.
   * 6 - Вывести в консоль итоговое количество совершённых покупок после выполнения приложения.