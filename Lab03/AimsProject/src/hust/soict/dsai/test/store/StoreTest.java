package Lab03.AimsProject.src.hust.soict.dsai.test.store;

import Lab03.AimsProject.src.hust.soict.dsai.aims.disc.DigitalVideoDisc;
import Lab03.AimsProject.src.hust.soict.dsai.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("5cm/s",
            "Anime", "Makoto Shinkai", 97, 19.95f);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("TenSura",
                "Science Fiction", "George Lucas", 87, 24.95f);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Asagao to Kase-san",
                "Yuri", "Murasaki", 88,  18.99f);
        
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("MarriageToxin",
                "Romance-Comedy", "Murasaki", 82,  18.99f);

        Store store = new Store();

        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);
        store.addDVD(dvd4);

        store.removeDVDbyTitle("TenSura");

        store.printStore();
    }
}
