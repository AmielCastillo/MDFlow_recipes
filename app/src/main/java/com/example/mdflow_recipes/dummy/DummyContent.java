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
        addItem(new DummyItem("1", "Bacon & Spinach Stuffed Chicken"));
        addItem(new DummyItem("2", "Tex-Mex Meatballs"));
        addItem(new DummyItem("3", "Best-Ever Calzones"));
        addItem(new DummyItem("4", "Baked Spaghetti"));
        addItem(new DummyItem("5", "Cheesy Ground Beef Tacos"));
        addItem(new DummyItem("6", "Beef Totchos"));

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
            this.content = recipeTitle;
            this.recipeTitle = recipeTitle;
            this.recipeDescription = recipeDesc;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}