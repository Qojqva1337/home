public class Main {
    public static void main(String[] args) {
        Car Lada = new Car("Lada","granta",1.7, "Желтый", 2015, "Россия");
        System.out.println("Марка автомобиля: " + Lada.brand + "; Модель автомобиля: " + Lada.model + "; Год выпуска: " + Lada.age
                + "; Цвет авто: " + Lada.color + "; Объём двигателя: " + Lada.engineVolume + "; Страна: " + Lada.country) ;


        Car Audi = new Car("Audi","A8", 3.0,"Черный", 2020, "Германия");
        System.out.println("Марка автомобиля: " + Audi.brand + "; Модель автомобиля: " + Audi.model + "; Год выпуска: " + Audi.age
                + "; Цвет авто: " + Audi.color + "; Объём двигателя: " + Audi.engineVolume + "; Страна: " + Audi.country) ;


        Car KIA = new Car("KIA","Sportage", 2.4, "Черный", 2018, "Южная Корея");
        System.out.println("Марка автомобиля: " + KIA.brand + "; Модель автомобиля: " + KIA.model + "; Год выпуска: " + KIA.age
                + "; Цвет авто: " + KIA.color + "; Объём двигателя: " + KIA.engineVolume + "; Страна: " + KIA.country) ;



        Car BMW = new Car("BMW","Z8", 3.0, "Черный",  2021,"Германия");
        System.out.println("Марка автомобиля: " + BMW.brand + "; Модель автомобиля: " + BMW.model + "; Год выпуска: " + BMW.age
                + "; Цвет авто: " + BMW.color + "; Объём двигателя: " + BMW.engineVolume + "; Страна: " + BMW.country) ;



        Car Hyundai = new Car("Hyundai","Avante", 1.6, "Черный",  2016,"Южная Корея");
        System.out.println("Марка автомобиля: " + Hyundai.brand + "; Модель автомобиля: " + Hyundai.model + "; Год выпуска: " + Hyundai.age
                + "; Цвет авто: " + Hyundai.color + "; Объём двигателя: " + Hyundai.engineVolume + "; Страна: " + Hyundai.country) ;

    }
}