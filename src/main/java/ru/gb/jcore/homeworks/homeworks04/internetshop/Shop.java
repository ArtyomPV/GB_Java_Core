package ru.gb.jcore.homeworks.homeworks04.internetshop;

import ru.gb.jcore.homeworks.homeworks04.internetshop.Exceptions.AmountException;
import ru.gb.jcore.homeworks.homeworks04.internetshop.Exceptions.CustomerException;
import ru.gb.jcore.homeworks.homeworks04.internetshop.Exceptions.ProductException;


public class Shop {
    public static Product[] products = {new Product("Milk", 25),
            new Product("Bread", 15),
            new Product("Water", 5),
            new Product("Butter", 30),
            new Product("Egg", 20)};

    public static Customer[] customers = {new Customer("Igor"), new Customer("Petr")};
    public static Order[] orders = new Order[5];

    //region Description
//    public static Order buy(Customer customer, Product product, int amount){
//        for(int i = 0; i < customers.length; i++){
//            if(!(customers[i].equals(customer))){
//                throw new CustomerException("Покупатель с таким именем не найден");
//            }
//        }
//        for (int i = 0; i < products.length; i++) {
//            if(!(products[i].equals(product))){
//                throw new ProductException("Покупатель с таким именем не найден");
//            }
//        }
//        if(amount < 0 || amount >100){
//            throw new AmountException("Предано некорректное количество");
//        }
//
//        return new Order(customer, product, amount);
//    }
    //endregion
private static boolean isInArray(Object[] array, Object object){
    for (Object o : array) {
        if (o.equals(object)) return true;
    }
    return false;
}

    public static Order buy(Customer customer, Product product, int amount) {
        if(!isInArray(customers, customer)) throw new CustomerException(customer.getName());
        if(!isInArray(products, product)) throw new ProductException(product.getName());
        if (amount < 0 || amount > 100) throw new AmountException("Введено не корректное значение " + amount);
        return new Order(customer, product, amount);
    }

    //region Description
//    static void run(){
//            Object[][] info = {
//                    {customers[0], products[0], 10},
//                    {customers[1], products[2], 5},
//                    {customers[0], products[1], 150},
//                    {new Customer("Ivan"), products[3], 10},
//                    {customers[1], new Product("Vodka", 100), 2}
//            };
//
//        int capacity = 0;
//        int i = 0;
//        while(capacity < orders.length || i != orders.length){
//
//            try {
//                orders[capacity] = buy((Customer)info[i][0], (Product)info[i][1], (int)info[i][2]);
//                capacity++;
//            } catch (ProductException e){
//                System.out.println(e.getMessage());
//            } catch (AmountException e){
//                orders[capacity++] = buy((Customer)info[i][0], (Product)info[i][1], 1);
//            } catch (CustomerException e) {
//                System.out.println(e.getMessage());
//            } finally {
//                System.out.println("выполнено заказов: " + capacity);
//            }
//        }
//        ++i;
//    }
//endregion
    static void run() {
        Object[][] info = {
                {customers[0], products[0], 10},
                {customers[1], products[2], 5},
                {customers[0], products[1], 150},
                {new Customer("Ivan"), products[3], 10},
                {customers[1], new Product("Vodka", 100), 2}
        };

        int infolength = info.length;
        int capacity = 0;
        int i = 0;
        while (i < info.length && capacity != orders.length - 1) {
            try {
                orders[capacity] = buy((Customer) info[i][0], (Product) info[i][1], (int) info[i][2]);
                capacity++;
            } catch (CustomerException e) {
                System.out.println(e.getMessage());
            } catch (ProductException e) {
                System.out.println(e.getMessage());
            } catch (AmountException e){
                orders[capacity++] = buy((Customer) info[i][0], (Product) info[i][1], 1);
            } finally {
                System.out.println("Выполнено заказов: " + capacity);
            }
            ++i;
        }
    }

}
