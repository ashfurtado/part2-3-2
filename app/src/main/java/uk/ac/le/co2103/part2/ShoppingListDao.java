package uk.ac.le.co2103.part2;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.RoomDatabase;

import java.util.List;

@Dao
public interface ShoppingListDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(ShoppingList shoppingList);

    @Query("DELETE FROM Shopping_List")
    void deleteAll();

    @Query("SELECT * FROM Shopping_List ORDER BY name ASC")
    LiveData<List<ShoppingList>> getAlphabetizedWords();
}
