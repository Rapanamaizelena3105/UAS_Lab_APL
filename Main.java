import java.util.Scanner;

public class Main {
    private static Scanner scanner;

    public static void main(String[] args) {
        String ulang = "y";

        while (ulang.equals("y")) {
            Scanner input = new Scanner(System.in);
            String ul = "", lagi;
            System.out.println("\nMENU");
            System.out.println("1. Pilih Jenis Hujan");
            System.out.println("2. Melihat luas daerah terkena hujan");
            System.out.println("0. Keluar");
            System.out.println("\nMasukkan Pilihan: ");
            int pilih = input.nextInt();

            switch (pilih) {
                case 1: {
                    System.out.println("\nJenis-Jenis Hujan: ");
                    System.out.println(" => konveksi \n => siklonik \n => orografis");
                    System.out.println("Pilih jenis hujan: ");

                    scanner = new Scanner(System.in);
                    String jenisHujan = scanner.next();
                    System.out.println("\nHujan yang anda pilih adalah: " + jenisHujan);

                    // PilihHujan pilihHujan = null;
                    ChooseRain pilihRain = new ChooseRain();

                    if ("Hujan Konvertif".equalsIgnoreCase(jenisHujan)) {
                        pilihRain.setRain(new ConvectiveRain());
                    } else if ("Hujan Siklonik".equalsIgnoreCase(jenisHujan)) {
                        pilihRain.setRain(new CyclonicRain());
                    } else if ("Hujan Orografis".equalsIgnoreCase(jenisHujan)) {
                        pilihRain.setRain(new OrographicRain());
                    }

                    // pilihRain.jenis();
                    break;
                }
                case 2: {
                    Rain convectiveRain = new ConvectiveRain();
                    RainAdapter convectiveRainAdapter = new ImplRainAdapter(convectiveRain);
                    System.out.println("Luas daerah yang terkena hujan " + convectiveRainAdapter.getLuas() + " m.");

                    Rain cyclonicRain = new CyclonicRain();
                    RainAdapter cyclonicRainAdapter = new ImplRainAdapter(cyclonicRain);
                    System.out.println("Luas daerah yang terkena hujan " + cyclonicRainAdapter.getLuas() + " m.");

                    Rain orographicRain = new OrographicRain();
                    RainAdapter orographicRainAdapter = new ImplRainAdapter(orographicRain);
                    System.out.println("Luas daerah yang terkena hujan " + orographicRainAdapter.getLuas() + " m.");

                    break;
                }
                case 0: {
                    System.exit(0);
                    System.out.println("tidak ada pilihan!!");
                }
                    break;
            }
            System.out.println("\nApakah anda ingin mengulang (y/t)? ");
            ulang = input.next();
        }
    }
}