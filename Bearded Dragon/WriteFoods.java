#package HTFYD

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Foods
{
    @SuppressWarnings("unchecked")
    public static void main( String[] args )
    {
        JSONObject FruitsDet = new JSONObject();
	  FruitsDet.put("Strawberry");
	  FruitsDet.put("Papaya");
	  FruitsDet.put("Melons");
	  FruitsDet.put("Banana");
	  FruitsDet.put("Mango");
	  FruitsDet.put("Grapes");
	  FruitsDet.put("Star Fruit");
	  FruitsDet.put("Raisins");
	  FruitsDet.put("Peach");
	  FruitsDet.put("Tomato");
	  FruitsDet.put("Guava");
	  FruitsDet.put("Kiwis");
	  FruitsDet.put("Figs");
	  FruitsDet.put("Apricots");
	  FruitsDet.put("Raspberries");
	  FruitsDet.put("Berries");
	  FruitsDet.put("Cantaloupe");
	  FruitsDet.put("Oranges");
	  FruitsDet.put("Pears");
	  FruitsDet.put("Tomatoes");
	  FruitsDet.put("Plums");
	  FruitsDet.put("Blueberries");

        JSONObject FruitsObj = new JSONObject();
        FruitsObj.put("Fruits", FruitsDet);
//_________________________________________________________

        JSONObject VegetablesDet = new JSONObject();
        VegetableDet.put("Squash");
	  VegetableDet.put("Zucchini");
	  VegetableDet.put("Sweet Potato");
	  VegetableDet.put("Broccoli");
	  VegetableDet.put("Peas");
	  VegetableDet.put("Carrot");
	  VegetableDet.put("Beans");
	  VegetableDet.put("Okra");
	  VegetableDet.put("Bean Sprouts");
	  VegetableDet.put("Tofu");
	  VegetableDet.put("Kholrabi");
	  VegetableDet.put("Bell peppers");
	  VegetableDet.put("Green beans");
	  VegetableDet.put("Cactus");
	  VegetableDet.put("Various Squash");
	  VegetableDet.put("Sprouts");
	  VegetableDet.put("Cooked sweet potato");
	  VegetableDet.put("Parsnips");
	  VegetableDet.put("Cucumber");
	  VegetableDet.put("Asparagus");
	  VegetableDet.put("Mushrooms");
	  VegetableDet.put("Corn");
	  VegetableDet.put("Acorn squash");
	  VegetableDet.put("Butternut squash");
	  VegetableDet.put("Lentils");
	  VegetableDet.put("Pumpkin");
	  VegetableDet.put("Snow Peas");
	  VegetableDet.put("Other winter squash");
	  VegetableDet.put("Turnip");
	  VegetableDet.put("Cooked/Raw potato");
	  VegetableDet.put("Yellow Wax Beans");
	  VegetableDet.put("Alfalfa pellets");

        JSONObject VegetablesObj = new JSONObject();
        VegetablesObj.put("Vegetables", VegetablesDet);
//_________________________________________________________

        JSONObject InsectsDet = new JSONObject();
        InsectsDet.put("Crickets");
        InsectsDet.put("Superworms");
        InsectsDet.put("Waxworms");
        InsectsDet.put("Grasshoppers");
        InsectsDet.put("Locusts");
        InsectsDet.put("Pinky mice");
        InsectsDet.put("Earthworms");
        InsectsDet.put("Mealworms");
        InsectsDet.put("Dubia roaches");
        InsectsDet.put("Black soldier fly larvae");
        InsectsDet.put("Silkworms");

        JSONObject InsectsObj = new JSONObject();
        InsectsObj.put("Insects", InsectsDet);
//_________________________________________________________
        JSONObject GreensDet = new JSONObject();
//- - - - - - - - Leafy Greens - - - - - - - - - - -        
	  GreensDet.put("Collard Greens");
        GreensDet.put("Kale");
        GreensDet.put("Romaine");
        GreensDet.put("Dandelion");
        GreensDet.put("Turnip greens");
        GreensDet.put("Mustard greens");
        GreensDet.put("Beet greens");
        GreensDet.put("Bok Choy");
        GreensDet.put("Swiss chard");
        GreensDet.put("Spinach");
        GreensDet.put("Chicory");
        GreensDet.put("Escarole");
        GreensDet.put("Alfalfa hay");
        GreensDet.put("Chow");
        GreensDet.put("Parsley");
        GreensDet.put("Watercress");
        GreensDet.put("Clover");
        GreensDet.put("Red/Green Cabbage");
        GreensDet.put("Savory");
        GreensDet.put("Cilantro");
        GreensDet.put("Grape leaves");
        GreensDet.put("Green/Red Lettuce");
        GreensDet.put("Endive");
        GreensDet.put("Rocket greens");
        GreensDet.put("Chives");
        GreensDet.put("Spinach");
//_________________________________________________________
        JSONObject OtherDet = new JSONObject();
// - - - - - - Flowers - - - - - - -
        OtherDet.put("Hibiscus");
        //OtherDet.put("Dandelion");
        OtherDet.put("Nasturtiums");
        OtherDet.put("Roses");
        OtherDet.put("Carnations");
        OtherDet.put("Geraniums");
        OtherDet.put("Pansies");
        OtherDet.put("Petunias");
        OtherDet.put("Violets");

        JSONObject OtherObj = new JSONObject();
        OtherObj.put("Other", OtherDet);
//________________________________________________
	  JSONArray foodList = new JSONArray();
	  foodList.add(FruitsObj);
        foodList.add(VegetablesObj);
        foodList.add(InsectsObj);

        try (FileWriter file = new FileWriter = new FileWriter("Foods.json")) {
            file.write(foodList.toJSONString());
		file.flush();

        } catch (IOException f) {
		f.printStackTrace();
	  }
    }
}