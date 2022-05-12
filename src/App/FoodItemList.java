package App;

public class FoodItemList {
    //final int foodItemId;
    private final String foodName;
    private final int price;
    private int quantity = 0;

    public FoodItemList(String foodName, int price){
        this.foodName = foodName;
        this.price = price;
        //this.foodItemId = IdGenerator.generateFoodId();

    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setQuantity(int quantity){
        if(quantity > 0) {
            this.quantity = quantity;
        }
    }
}
