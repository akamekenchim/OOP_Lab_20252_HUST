package Lab03.AimsProject.src.hust.soict.dsai.test.disc;

import Lab03.AimsProject.src.hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        swap(jungleDVD, cinderellaDVD);
        swapCorrect(jungleDVD, cinderellaDVD);

        System.out.println("jungle DVD title: " + jungleDVD.getTitle());
        System.out.println("cinderella DVD title: " + cinderellaDVD.getTitle());

        changeTitle(jungleDVD, cinderellaDVD.getTitle());

        System.out.println("jungle DVD title: " + jungleDVD.getTitle());
    }
    public static void swap(Object o1, Object o2){
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }
    public static void changeTitle(DigitalVideoDisc dvd1, String title){
        String oldTitle = dvd1.getTitle();
        dvd1.setTitle(title);
        dvd1 = new DigitalVideoDisc(oldTitle);
    }
    //ham swap chinh xac
    public static void swapCorrect(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        String tmpTitle = dvd1.getTitle();
        String tmpCategory = dvd1.getCategory();
        String tmpDirector = dvd1.getDirector();
        int tmpLength = dvd1.getLength();
        float tmpCost = dvd1.getCost();

        dvd1.setTitle(dvd2.getTitle());
        dvd1.setCategory(dvd2.getCategory());
        dvd1.setDirector(dvd2.getDirector());
        dvd1.setLength(dvd2.getLength());
        dvd1.setCost(dvd2.getCost());

        dvd2.setTitle(tmpTitle);
        dvd2.setCategory(tmpCategory);
        dvd2.setDirector(tmpDirector);
        dvd2.setLength(tmpLength);
        dvd2.setCost(tmpCost);
    }
}

