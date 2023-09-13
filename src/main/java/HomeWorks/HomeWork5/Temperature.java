package HomeWorks.HomeWork5;
/*
3 Представим, что у нас есть устройство, в котором две колбы.
Прибор работает корректно, если температура первой колбы выше 100 градусов,
а температура второй колбы меньше 100 градусов.
 Вы должны написать метод, который проверяет это устройство.
  Ваша программа должна иметь переменные Temperature1 и Temperature2.
  В результате он выводит сообщение true или false.
 */

public class Temperature {
    public static void main(String[] args) {

        int temp1 = 100;
        int temp2 = 100;

        boolean result = true;

        if (temp1 <100 && temp2 >100){

            result = true;


            }else{
            result = false;

            System.out.println(result);




        }






    }
}
