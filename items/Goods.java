package items;

public class Goods extends Item implements PcsInterface {
   private int amount;
   private Category type;
   public Goods(String name, double price, int amount,Category category){
       super(name,price);
       this.amount=amount;
       this.type=category;
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
