package App;

class FoodItemList {
    //final int foodItemId;
    final String foodName;
    final int price;
    int quantity = 0;

    FoodItemList(String foodName, int price){
        this.foodName = foodName;
        this.price = price;
        //this.foodItemId = IdGenerator.generateFoodId();

    }



}
