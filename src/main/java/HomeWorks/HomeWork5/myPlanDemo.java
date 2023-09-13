package HomeWorks.HomeWork5;
/*
 1 уровень сложности: 1 Создайте две переменные isWeekend и isRain.
 Дайте им свои произвольные значения. Создайте переменную canWalk,
 значение которой должно быть истинным, если это выходной день (isWeekend=true)
 и не идет дождь (isRain=false).

 */
public class myPlanDemo {
    public static void main(String[] args) {

        boolean isWeekend = true;
        boolean isRain = false;
        boolean canWalk;

        if (isWeekend && !isRain){
            canWalk = true;

        }else {
            canWalk = false;

        }
        System.out.println(canWalk);

    }
}
