package Package;

public class Main {

    public static void main(String[] args) {
        classOne asus = new classOne();

        System.out.println("Частота пам'яті відеокарти Asus 3090 становить "+asus.asus3090+" МГц");
        System.out.println("Частота пам'яті відеокарти Asus 3080 становить "+asus.asus3080+" МГц");
        System.out.println("Частота пам'яті відеокарти Asus 3070 становить "+asus.asus3070+" МГц");


        classTwo msi = new classTwo();

        System.out.println("Частота пам'яті відеокарти MSI 2080 становить "+msi.msi2080+" МГц");
        System.out.println("Частота пам'яті відеокарти MSI 2060 становить "+msi.msi2060+" МГц");
        System.out.println("Частота пам'яті відеокарти MSI 1080 становить "+msi.msi1080+" МГц");

        classThree gigabyte = new classThree();

        System.out.println("Частота пам'яті відеокарти Gigabyte1070 становить "+gigabyte.gigabyte1070+" МГц");
        System.out.println("Частота пам'яті відеокарти Gigabyte1060 становить "+gigabyte.gigabyte1060+" МГц");
        System.out.println("Частота пам'яті відеокарти Gigabyte1050 становить "+gigabyte.gigabyte1050+" МГц");




    }
}