package com.example.mdflow_recipes.dummy;

import com.example.mdflow_recipes.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {
    String[] recipeTitles, recipeDescriptions;
    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    //private static final int COUNT = 25;

    static {
        addItem(new DummyItem("1", "Bacon & Spinach Stuffed Chicken", "- 4 boneless skinless chicken breasts\n- Kosher salt\n- Freshly ground black pepper\n- 4 oz. cream cheese, softened\n- 1/2 c. frozen spinach, defrosted and drained\n- 1/3 c. chopped artichoke hearts\n- 1 c. shredded mozzarella, dividedPinch crushed red pepper flakes\n- 4 strips bacon, cut into 4 strips\n- 2 tbsp. extra-virgin olive oil"));
        addItem(new DummyItem("2", "Tex-Mex Meatballs", "- 1 1/2 lb. ground beef\n- 2 c. shredded Mexican cheese blend, divided\n- 1/2 c. panko bread crumbs\n- 2 tbsp. freshly chopped parsley, plus more for garnishn\n2 cloves garlic, minced\n- 1 jalapeño, finely chopped\n- 1 large egg\n- 1 tsp. ground cumin\n- Kosher salt\n- Freshly ground black pepper\n- 1 tbsp. extra-virgin olive oil\n- 1/2 large onion, chopped\n- 1 (15-oz.) can crushed tomatoes\n- 2 tbsp. chopped chipotle chiles in adobo sauce"));
        addItem(new DummyItem("3", "Best-Ever Calzones", "- Cooking spray\n- 1 3/4 lb. pizza dough\n- All-purpose flour, for surface\n- 1 c. pizza sauce\n- 1 c. ricotta\n- 1/2 c. pepperoni\n- 1 c. shredded mozzarella\n- Extra-virgin olive oil, for brushing\n- Kosher salt"));
        addItem(new DummyItem("4", "Baked Spaghetti", "- Cooking spray\n- 16 oz. spaghetti\n- 2 tbsp. extra-virgin olive oil\n- 1 medium yellow onion, finely chopped\n- 2 cloves garlic, minced\n- 1 lb. ground beef\n- kosher salt\n- Freshly ground black pepper\n- 1 tsp. Italian seasoning\n- 1 (28-oz.) can crushed tomatoes\n- 1/2 c. basil, chopped\n- 1 c. shredded mozzarella\n- 1/4 c. freshly grated Parmesan\n- Chopped fresh parsley, for garnish"));
        addItem(new DummyItem("5", "Cheesy Ground Beef Tacos","- 1 large onion, chopped\n- 1 lb. ground beef\n- 1 (15-oz.) can fire-roasted tomatoes\n- 1 (15-oz.) can black beans, drained and rinsed\n- 1 tbsp. taco seasoning\n- kosher salt\n- 2 c. shredded cheddar or pepper jack\n- 8 Small flour tortillas\n- Sliced green onions, for serving\n- Sour cream, for serving"));
        addItem(new DummyItem("6", "Beef Totchos","- Cooking spray\n- 2 (1-lb.) bags frozen tater tots\n- 1 tbsp. extra-virgin olive oil\n- 1 lb. ground beef\n- 1 tbsp. taco seasoning\n- 1 c. cherry tomatoes, quartered\n- 1 c. black beans\n- 1 jalapeño, sliced\n- 1 c. shredded cheddar\n- 1 c. shredded Monterey Jack\n- Sour cream, for serving\n- Guacamole, for serving\n- Freshly chopped cilantro, for serving"));

        // Add some sample items.
        //for (int i = 1; i <= COUNT; i++) {
        //    addItem(createDummyItem(i));
        //}
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }
/*
    private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }
*/
    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public String content;
        public String recipeTitle;
        public String recipeDescription;
        public int images[];

        public DummyItem(String id, String content) {
            this.id = id;
            this.content = content;
        }
        public DummyItem(String id, String recipeTitle, String recipeDesc) {
            this.id = id;
            content = recipeTitle;
            this.recipeTitle = recipeTitle;
            this.recipeDescription = recipeDesc;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}