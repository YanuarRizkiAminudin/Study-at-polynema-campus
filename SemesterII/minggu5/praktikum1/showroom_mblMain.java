import java.util.Arrays;

public class showroom_mblMain {
    public static void main(String[] args) {
        showroom_mbl[] cars = {
            new showroom_mbl("BMW", "M2 Coupe", 2016, 6816, 728),
            new showroom_mbl("Ford", "Fiesta ST", 2014, 3921, 575),
            new showroom_mbl("Nissan", "370Z", 2009, 4360, 657),
            new showroom_mbl("Subaru", "BRZ", 2014, 4058, 609),
            new showroom_mbl("Subaru", "Impreza WRX STI", 2013, 6255, 703),
            new showroom_mbl("Toyota", "AE86 Trueno", 1986, 3700, 553),
            new showroom_mbl("Toyota", "86/GT86", 2014, 4180, 609),
            new showroom_mbl("Volkswagen", "Golf GTI", 2014, 4180, 631)
        };
        System.out.println("Daftar Mobil di Showroom:");
        System.out.println("--------------------------------------------------------------------------");
        System.out.printf("%-15s%-20s%-10s%-20s%-10s\n", "Merk", "Tipe", "Tahun", "Top Acceleration", "Top Power");
        System.out.println("--------------------------------------------------------------------------");
        for (showroom_mbl car : cars) {
            System.out.printf("%-15s%-20s%-10d%-20d%-10d\n", car.merk, car.tipe, car.tahun, car.topAcceleration, car.topPower);
        }
        System.out.println("--------------------------------------------------------------------------");

        Arrays.sort(cars, (a, b) -> a.topAcceleration - b.topAcceleration);

        int highestAcceleration = showroom_mbl.AccelerationTertinggi(cars, 0, cars.length - 1);
        int lowestAcceleration = showroom_mbl.AccelerationTerendah(cars, 0, cars.length - 1);
        double RataRataTopPower = showroom_mbl.TopPower(cars);

        System.out.println("Top acceleration tertinggi Divide and Conquer: " + highestAcceleration);
        System.out.println("Top acceleration terendah Divide and Conquer: " + lowestAcceleration);
        System.out.println("Rata-rata top power Brute Force: " + RataRataTopPower);
    }
}
