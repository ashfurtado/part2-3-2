package uk.ac.le.co2103.part2;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class ShoppingListViewModel extends AndroidViewModel {
    private ShoppingListRepository mRepository;
    private final LiveData<List<ShoppingList>> mAllShoppingLists;

    public ShoppingListViewModel(Application application) {
        super(application);
        mRepository = new ShoppingListRepository(application);
        mAllShoppingLists = mRepository.getmAllShoppingLists();
    }

    LiveData<List<ShoppingList>> getmAllShoppingLists() { return mAllShoppingLists; }
    public void insert(ShoppingList shoppingList) {mRepository.insert(shoppingList);}
}
