package HomeWorks.HomeWork5;
/*
2 Создайте две переменные isEdekaOpen и isReweOpen,
 значения которых зависят от того, открыты магазины или нет (значения задайте сами).
  Реализуйте логический метод canBuy,
  возвращающий true / false Значение этой переменной должно быть true,
   если хотя бы один магазин открыт, иначе false.
   Отобразите строку «Я могу купить еду, это ......» и значение.

 */

public class Shop2 {

    public static void main(String[] args) {

        boolean isEdekaOpen = false;
        boolean isReweOpen = true;
        boolean canBay;

        if (isReweOpen && !isEdekaOpen) {
            canBay = true;

        } else {
            canBay = false;

        }
        System.out.println("Я могу купить еду, это ..." + canBay);

    }


}
