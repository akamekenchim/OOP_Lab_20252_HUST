package Lab03.AimsProject.src.hust.soict.dsai.aims;

import Lab03.AimsProject.src.hust.soict.dsai.aims.cart.Cart;
import Lab03.AimsProject.src.hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {

    //Create a new cart
    Cart anOrder = new Cart();

    //Create new dvd objects and add them to the cart
    DigitalVideoDisc dvd1 = new DigitalVideoDisc("5cm/s",
            "Anime", "Makoto Shinkai", 97, 19.95f);
    anOrder.addDigitalVideoDisc(dvd1);

    DigitalVideoDisc dvd2 = new DigitalVideoDisc("TenSura",
            "Science Fiction", "George Lucas", 87, 24.95f);
    anOrder.addDigitalVideoDisc(dvd2);

    DigitalVideoDisc dvd3 = new DigitalVideoDisc("Asagao to Kase-san",
            "Yuri", "Murasaki", 88,  18.99f);
    
    DigitalVideoDisc dvd4 = new DigitalVideoDisc("MarriageToxin",
            "Romance-Comedy", "Murasaki", 82,  18.99f);
    anOrder.addDigitalVideoDisc(dvd3, dvd4);
    //print total cost of the items in the cart
    System.out.println("Total Cost is: ");
    System.out.println(anOrder.totalCost());

    anOrder.removeDigitalVideoDisc(dvd3);
    //test Search function
    anOrder.findDVD(1);
    anOrder.findDVD("TenSura");    
    anOrder.printAll();
//
}
}
