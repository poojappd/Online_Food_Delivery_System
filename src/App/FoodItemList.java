package App;

class FoodItemList {
    int foodItemId;
    final String foodName;
    final int price;
    final int quantity;

    FoodItemList(String foodName, int price, int quantity, int foodItemId){
        this.foodName = foodName;
        this.price = price;
        this.quantity = quantity;

    }

    void setFoodItemId(int foodItemId){
        this.foodItemId = foodItemId;
    }

}
