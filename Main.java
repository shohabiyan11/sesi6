package PBO2Sesi6;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    
    static void pilihLaptop(){
        System.out.println("1. Lenovo");
        System.out.println("2. Toshiba");
        System.out.println("3. MacBook");
        System.out.println("");
    }

    static void menuLaptop(){
        System.out.println("1. Input 'ON' atau '1' untuk menyalakan laptop");
        System.out.println("2. Input 'OFF' atau '2' untuk mematikan laptop");
        System.out.println("3. Input 'UP' atau '3' untuk menambah volume");
        System.out.println("4. Input 'DOWN' atau '4' untuk mengurangi volume");
    }

    public static void main(String[] args) {
        boolean bool=true;
        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<Laptop> laptop = new ArrayList<>();
            Lenovo lenovo=new Lenovo();
            Toshiba toshiba=new Toshiba();
            MacBook macbook=new MacBook();

            System.out.println("\n\tMerk Laptop");
           
            pilihLaptop();
            System.out.print("Pilih jenis laptop : ");
            int noJenisLaptop=sc.nextInt();
            switch(noJenisLaptop){
                case 1:
                    laptop.add(lenovo);
                    break;
                case 2 :
                    laptop.add(toshiba);
                    break;
                case 3 :
                    laptop.add(macbook);
                    break;
                default:
                    System.out.println("Tolong input angka yang sesuai pada menu!");
                    return;
            }

            while(bool){
                System.out.println("\n\tMenu");
               
                menuLaptop();
                System.out.print("Input : ");
                String noMenu=sc.next();
                switch(noMenu){
                    case "ON","1":
                        laptop.get(0).powerOn();
                        break;
                    case "OFF","2":
                        laptop.get(0).powerOff();
                        bool=false;
                        break;
                    case "UP","3":
                        laptop.get(0).volumeUp();
                        break;
                    case "DOWN","4":
                        laptop.get(0).volumeDown();
                        break;
                    default:
                        System.out.println("Dimohon untuk memilih sesuai yang ada di menu!");
                        break;
                }              
            }
        }        
    }
}