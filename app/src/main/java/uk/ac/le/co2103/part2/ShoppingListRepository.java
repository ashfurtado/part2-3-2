package uk.ac.le.co2103.part2;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

public class ShoppingListRepository {
    private ShoppingListDao mShoppingListDao;
    private LiveData<List<ShoppingList>> mAllShoppingLists;

    ShoppingListRepository(Application application) {
        ShoppingListRoomDatabase db = ShoppingListRoomDatabase.getDatabase(application);
        mShoppingListDao = db.shoppingListDao();
        mAllShoppingLists = mShoppingListDao.getAlphabetizedWords();
    }

    LiveData<List<ShoppingList>> getmAllShoppingLists(){
        return mAllShoppingLists;
    }

    void insert(ShoppingList shoppingList) {
        ShoppingListRoomDatabase.databaseWriteExecutor.execute(() -> {mShoppingListDao.insert(shoppingList);});
    }
}
