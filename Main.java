package Shop_Laptop;

import java.util.HashSet;
import java.util.Set;

public class Main {
        public static void main(String[] args) {

        Laptop samsung_galaxy_book_3 = new Laptop("samsung_galaxy_book_3", 15, "4k", 
        "Есть", 512, "16", "Windows_11", "gray"); 
        Brand brandSamsung = new Brand("Samsung", "Китай", "Русский");
        samsung_galaxy_book_3.addBrand(brandSamsung); 
        
        Laptop samsung_galaxy_book3_pro = new Laptop("samsung_galaxy_book3_pro", 16, "FullHD", 
        "Есть", 1024, "16", "Windows", "white");
        samsung_galaxy_book3_pro.addBrand(brandSamsung);
       

        Laptop huawei_mateBook_d_15 = new Laptop("HUAWEI_MateBook_D_15", 15, "FullHD", 
        "Есть", 256, "8", "Windows_11", "gray");
        Brand brandHuawei = new Brand("Huawei", "Китай", "Русский");
        huawei_mateBook_d_15.addBrand(brandHuawei);
        
        Laptop huawei_mateBook_d_16 = new Laptop("HUAWEI_MateBook_D_16", 16, "4k", 
        "Нет", 512, "16", "Linux", "black");
        huawei_mateBook_d_16.addBrand(brandHuawei);
        
        
        Laptop thunderobot_911 = new Laptop(" Thunderobot_911", 15, "FullHD", 
        "Есть", 512, "16", "Windows_11", "black");
        Brand thunderobot = new Brand("Thunderobot", "Китай", "Русский");
        thunderobot_911.addBrand(thunderobot);

        
        Laptop  apple_MacBook_Pro_16 = new Laptop("apple_MacBook_Pro_16", 16, "4k", 
        "Нет", 1000, "32", "ios", "silver");
        Brand brandApple = new Brand("Apple", "США", "Английский");
        apple_MacBook_Pro_16.addBrand(brandApple);
        
        
        Laptop  asus_m1502ia = new Laptop("asus_m1502ia", 15, "FullHD", 
        "Есть", 512, "16", "No_OS", "gray");
        Brand brandAsus = new Brand("Asus", "Китай", "Русский");
        asus_m1502ia.addBrand(brandAsus);

        Laptop  asus_vivoBook_16 = new Laptop("asus_vivoBook_16" ,16, "4k", 
        "Нет", 256, "8", "No_OS", "black");
        asus_vivoBook_16.addBrand(brandAsus);
        
        
        Laptop acer_aspire_5 = new Laptop("acer_aspire_5", 15, "FullHD", 
        "Есть", 512, "8", "Windows_11", "silver");
        Brand brandAcer = new Brand("Acer", "Китай", "Русский");
        acer_aspire_5.addBrand(brandAcer);
        
        Laptop acer_predator_triton = new Laptop("acer_predator_triton", 16, "FullHD", 
        "Есть", 1024, "16", "No_OS", "black");
        acer_predator_triton.addBrand(brandAcer);

        Set <Laptop> laptop = new HashSet<>();      
        laptop.add(thunderobot_911);
        laptop.add(huawei_mateBook_d_15);
        laptop.add(huawei_mateBook_d_16);
        laptop.add(samsung_galaxy_book_3);
        laptop.add(samsung_galaxy_book3_pro);
        laptop.add(apple_MacBook_Pro_16);
        laptop.add(asus_m1502ia);
        laptop.add(asus_vivoBook_16);
        laptop.add(acer_aspire_5);
        laptop.add(acer_predator_triton);

        Laptop FilterLaptop = new Laptop();

        System.out.println(FilterLaptop.newFilter(laptop));
    }
}
