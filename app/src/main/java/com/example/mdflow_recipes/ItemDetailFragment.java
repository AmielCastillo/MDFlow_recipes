package com.example.mdflow_recipes;

import android.app.Activity;
import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mdflow_recipes.dummy.DummyContent;

/**
 * A fragment representing a single Item detail screen.
 * This fragment is either contained in a {@link ItemListActivity}
 * in two-pane mode (on tablets) or a {@link ItemDetailActivity}
 * on handsets.
 */
public class ItemDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    String[] recipeTitles;
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The dummy content this fragment is presenting.
     */
    private DummyContent.DummyItem mItem;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public ItemDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            mItem = DummyContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));

            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle(mItem.content);
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_detail, container, false);
        recipeTitles = getResources().getStringArray(R.array.recipeNames);
        // Show the dummy content as text in a TextView.
        if (mItem != null) {
            //((TextView) rootView.findViewById(R.id.item_detail)).setText(mItem.content);
            if (mItem.id.equals("1")){
                rootView = inflater.inflate(R.layout.recipe_page, container, false);
                ((TextView) rootView.findViewById(R.id.recipeTitle)).setText(mItem.recipeTitle);
                ((TextView) rootView.findViewById(R.id.recipeDesc)).setText(mItem.recipeDescription);
            }
            if (mItem.id.equals("2")){
                rootView = inflater.inflate(R.layout.recipe_page, container, false);
                ((TextView) rootView.findViewById(R.id.recipeTitle)).setText(mItem.recipeTitle);
                ((TextView) rootView.findViewById(R.id.recipeDesc)).setText(mItem.recipeDescription);
            }
            if (mItem.id.equals("3")){
                rootView = inflater.inflate(R.layout.recipe_page, container, false);
                ((TextView) rootView.findViewById(R.id.recipeTitle)).setText(mItem.recipeTitle);
                ((TextView) rootView.findViewById(R.id.recipeDesc)).setText(mItem.recipeDescription);
            }
            if (mItem.id.equals("4")){
                rootView = inflater.inflate(R.layout.recipe_page, container, false);
                ((TextView) rootView.findViewById(R.id.recipeTitle)).setText(mItem.recipeTitle);
                ((TextView) rootView.findViewById(R.id.recipeDesc)).setText(mItem.recipeDescription);
            }
            if (mItem.id.equals("5")){
                rootView = inflater.inflate(R.layout.recipe_page, container, false);
                ((TextView) rootView.findViewById(R.id.recipeTitle)).setText(mItem.recipeTitle);
                ((TextView) rootView.findViewById(R.id.recipeDesc)).setText(mItem.recipeDescription);
            }
            if (mItem.id.equals("6")){
                rootView = inflater.inflate(R.layout.recipe_page, container, false);
                ((TextView) rootView.findViewById(R.id.recipeTitle)).setText(mItem.recipeTitle);
                ((TextView) rootView.findViewById(R.id.recipeDesc)).setText(mItem.recipeDescription);
            }
        }

        return rootView;
    }
}