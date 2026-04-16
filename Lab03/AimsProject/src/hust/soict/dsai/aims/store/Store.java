package Lab03.AimsProject.src.hust.soict.dsai.aims.store;

import Lab03.AimsProject.src.hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
    private static final int MAX_NUMBER_ITEMS = 40;
    private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[MAX_NUMBER_ITEMS];
    public int numberItems = 0;
    public Store(){

    }

    public void addDVD(DigitalVideoDisc d){
        if(numberItems == MAX_NUMBER_ITEMS){
            System.out.println("Too many items already!");
        }
        itemsInStore[numberItems++] = d;
    }

    public void removeDVDbyTitle(String title){
        int del = 0;
        int songhanh[] = new int[40];
        DigitalVideoDisc temp[] = new DigitalVideoDisc[40];
        for(int i = 0; i<numberItems; i++){
            songhanh[i] = 0;
            if((itemsInStore[i].getTitle()).equals(title)){
                songhanh[i] = -1;
                del++;
            }
            temp[i] = itemsInStore[i];
        }
        int count1 = 0;
        for(int i = 0; i<numberItems; i++){
            if(songhanh[i] == -1) continue;
            else itemsInStore[count1++] = temp[i];
        }
        if(del == 0){
            System.out.println("Khong tim thay dvd nao nhu vay");
        }
        numberItems -= del;
    }
    public void printStore(){
        System.out.println("*******************************STIORE******************************");
        System.out.println("Ordered items: ");
        for(int i =0; i<numberItems; i++){
            DigitalVideoDisc d = itemsInStore[i];
            System.out.printf("ID: %d. DVD - %s - %s - %s - %d : %.2f\n",d.getId(), d.getTitle(), d.getCategory(), d.getDirector(), d.getLength(), d.getCost());
        }
        System.out.println("*******************************************************************");
    }
}
