public class Main {
    public static void main(String[] args) {
        System.out.println("условные операторы");
        //задание 1
        int clientOS = 1;
        if (clientOS ==1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        //задание 2
        int productionYear = 2015;
        int  clientDeviceYear = 2012;
        if (clientDeviceYear<productionYear) {
            System.out.print("Установите облегченную версию для ");
        } else {
            System.out.print("Установите версию приложения для ");
        }
        if (clientOS ==1){
            System.out.println(" Android по ссылке");
        } else {
            System.out.println(" iOS по ссылке");
        }

        //задание 3
        int year = 2022;
        if (year % 4==0 && year % 100!=0 || year % 400==0){
            System.out.println(year +  "год является високосным");
        } else {
            System.out.println(year +  "год не является високосным");

        }

        //задание 4
        int  deliveryDistance = 95;
        int deliveryDays = 1;
        int interval = 40;
        int startInterval = 20;
        if (deliveryDistance <= startInterval){
            deliveryDays = 1;
        } else {
            deliveryDays = deliveryDays + (int) Math.ceil((deliveryDistance-startInterval) / (double) interval);
        }
        System.out.println("Потребуется дней:" + deliveryDays);


        //задание 5
        int monthNumber = 12;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
        System.out.println("зима");
        break;
            case 3:
            case 4:
            case 5:
        System.out.println("весна");
        break;
            case 6:
            case 7:
            case 8:
        System.out.println("лето");
        break;
            case 9:
            case 10:
            case 11:
        System.out.println("осень");
        break;
            default:
        System.out.println("такого месяца нет");


        }








    }

}