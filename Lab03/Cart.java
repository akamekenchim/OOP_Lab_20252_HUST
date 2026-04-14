package Lab03;

public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    public int qtyOrdered = 0;
    public void addDigitalVideoDisc(DigitalVideoDisc d){
        int c = qtyOrdered;
        if(c >= MAX_NUMBER_ORDERED){
            System.out.println("Da order qua nhieu");
            return;
        }
        itemsOrdered[c] = d;
        qtyOrdered++;
        if(c==MAX_NUMBER_ORDERED-1 || c==MAX_NUMBER_ORDERED) System.out.println("The cart is almost full");
        else System.out.println("The disc has been added");
    }
    public void addDigitalVideoDisc(DigitalVideoDisc ... dArray){
        if(qtyOrdered + dArray.length > MAX_NUMBER_ORDERED){
            System.out.println("Da order qua nhieu");
            return;
        }
        for(int i = 0; i<dArray.length; i++){
            itemsOrdered[qtyOrdered++] = dArray[i];
        }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc d1, DigitalVideoDisc d2){
        int c = qtyOrdered;
        if(c+1 >= MAX_NUMBER_ORDERED){
            System.out.println("Da order qua nhieu");
            return;
        }
        itemsOrdered[c] = d1;
        itemsOrdered[c+1] = d2;
        qtyOrdered += 2;
        if(qtyOrdered==MAX_NUMBER_ORDERED - 1 || qtyOrdered==MAX_NUMBER_ORDERED) System.out.println("The cart is almost full");
        else System.out.println("The disc has been added");
    }

    public double totalCost(){
        double tc = 0;
        for(int i =0 ; i<qtyOrdered; i++){
            tc += itemsOrdered[i].getCost();
        }
        return tc;
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc d){
        int[] songhanh = new int[MAX_NUMBER_ORDERED];
        for(int i =0; i<MAX_NUMBER_ORDERED; i++){
            songhanh[i] = 0;
        }
        int count = qtyOrdered;
        for(int i =0 ; i<count; i++){
            if((itemsOrdered[i].getTitle()).equals(d.getTitle()) && ((itemsOrdered[i].getCategory()).equals(d.getCategory()))){
                songhanh[i] = -1;
            }
        }
        int count1 = 0;
        int deleted = 0;
        for(int i = 0; i<count; i++){
            if(songhanh[i] == -1){
                deleted++;
                continue;
            }
            itemsOrdered[count1++] = itemsOrdered[i];
        }
        for(int i = count-1; i>count-1-deleted; i--){
            itemsOrdered[i] = null;
        }
        qtyOrdered -= deleted;
    }
    public void printAll(){
        for(int i =0; i<qtyOrdered; i++){
            System.out.println(itemsOrdered[i].getTitle());
        }
    }
}

