package items.drink;

import items.PcsInterface;

public class Bottle extends Drink implements PcsInterface {
   private int amount;

   public Bottle(String name,double price,boolean sweet,int amount){
       super(name,price,sweet);
       this.amount=amount;
   }
   public Bottle(String name,double price,int amount){
       this(name,price,false,amount);
   }
   public Bottle(String name,double price,boolean sweet){
       this(name,price,sweet,1);
   }


    @Override
    public double getTotalPrice() {
        return 0;
    }

    @Override
    public int getAmount() {
        return 0;
    }
}
