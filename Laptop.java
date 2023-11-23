package Shop_Laptop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Laptop {
    
    private List<Brand> brands;

    private String model;
    private float diagonal;
    private String screen;
    private String dvdRom;
    private int hardDisk;
    private String operativeMemory;
    private String operatingSystem;
    private String color;

    public Laptop() {
    }

    public Laptop(String model, float diagonal, String screen, String dvdRom, int hardDisk,
            String operativeMemory, String operatingSystem, String color) {
        this.brands = new ArrayList<>();
        this.model = model;
        this.diagonal = diagonal;
        this.screen = screen;
        this.dvdRom = dvdRom;
        this.hardDisk = hardDisk;
        this.operativeMemory = operativeMemory;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }

    public String getModel() {return model;}
    public float getDiagonal() {return diagonal;}
    public String getscreen() {return screen;}
    public String isDvdRom() {return dvdRom;}
    public int getHardDisk() {return hardDisk;}
    public String getOperativeMemory() {return operativeMemory;}
    public String getOperatingSystem() {return operatingSystem;}
    public String getColor() {return color;}

    
     public void addBrand(Brand brand) {
        brands.add(brand);
    }



    public Set<Laptop> newFilter(Set<Laptop> laptop) {
        Scanner scan = new Scanner(System.in);
        Set<Laptop> listLaptop = new HashSet<>(laptop);

        System.out.println("Здраствуйте, Укажите критерии поиска : " + 
        "\n1. Объем жесткого диска\n2. Объем оперативной памяти\n3. Операционная система\n4. Цвет \nВвод: ");
        String userRequest = scan.nextLine();


   
        for (int i = 0; i < userRequest.length(); i++) {
            if(1 == Character.getNumericValue(userRequest.charAt(i))) {
                System.out.println("Выберете объем жёсткого диска в Гб\nВналичии : 256, 512, 1024");
                String enterHardDisk = scan.nextLine();
                int intParseEnterHardDisk = Integer.parseInt(enterHardDisk);
                for (Laptop tempLaptop : laptop) {
                    if (intParseEnterHardDisk != tempLaptop.hardDisk){ 
                        listLaptop.remove(tempLaptop);
                    }
                }          
            }
            
            if(2 == Character.getNumericValue(userRequest.charAt(i))){
                System.out.println("Выберете объем оперативной памяти в Гб\nВналичии : 8, 16, 32 ");
                String enterOperativeMemory = scan.nextLine();
                for (Laptop tempLaptop : laptop) {
                    if ((enterOperativeMemory.equals(tempLaptop.operativeMemory)) == false) {
                        listLaptop.remove(tempLaptop);
                    }
                }
            }   

            if(3 == Character.getNumericValue(userRequest.charAt(i))){
                System.out.println("Выберете операционную систему\nВналичии : Linux, ios, Windows_11, No_OS ");
                String enterOperatingSystem = scan.nextLine();
                for (Laptop tempLaptop : laptop) {
                    if ((enterOperatingSystem.equals(tempLaptop.operatingSystem) == false)) {
                        listLaptop.remove(tempLaptop);
                    }
                }
            }
        
            if(4 == Character.getNumericValue(userRequest.charAt(i))){
                System.out.println("Выберете цвет ноутбука\nВналичии :black,white,gray,silver");
                String enterColor = scan.nextLine();
                for (Laptop tempLaptop : laptop) {
                    if ((enterColor.equals(tempLaptop.color)) == false) {
                        listLaptop.remove(tempLaptop);
                    }
                }
            }
            if(5 == Character.getNumericValue(userRequest.charAt(i))) {
            System.out.println("Такие параметры не найдены. ");
            }

        }
        return listLaptop;
    }


    public String toString() {
        return "\nНоутбук  ->  " + model + "\n" +brands + ",\nДиагональ_экрана - " + diagonal + ",\nЭкран - " + screen
                + ",\nDVD_привод - " + dvdRom + ",\nЖесткий_диск - " + hardDisk + ",\nОперативная_память - " + operativeMemory
                + ",\nОперационная_система - " + operatingSystem + ",\nЦвет - " + color + "\n";
    }
}
