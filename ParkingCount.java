import java.util.Scanner;

public class ParkingCount {
    public static void main(String[] args) {
        System.out.println("======= Perhitungan Parkir =======");
        Scanner input           = new Scanner(System.in);
        String vehicleStr       = "*jenis kendaraan salah";
        int costParking1        = 2000;
        int costParking2        = 5000;
        int totalCostParking    = 0;

        System.out.println("Masukkan Jenis Kendaraan (Pilih salah satu dibawah): ");
        System.out.println("(1) Motor");
        System.out.println("(2) Mobil");
        System.out.println("===================");
        String vehicle = input.next();
        System.out.println("Masukkan Jam Lama Parkir (bilangan bulat): ");
        System.out.println("===================");
        int time = input.nextInt();
        if (vehicle.equals("1")) {
            vehicleStr       = "Motor";
            totalCostParking = time * costParking1;
        } else if (vehicle.equals("2")) {
            vehicleStr       = "Mobil";
            totalCostParking = time * costParking2;
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        System.out.println("          Detail Biaya Parkir          ");
        System.out.println("Jenis Kendaraan       : " + vehicleStr);
        System.out.println("Lama Parkir           : " + time + " Jam");
        System.out.println("Total Biaya Parkir    : Rp " + totalCostParking);
        System.out.println("              terimakasih              ");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
    }
}
