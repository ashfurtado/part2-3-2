package uk.ac.le.co2103.part2;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {ShoppingList.class}, version = 1, exportSchema = false)
public abstract class ShoppingListRoomDatabase extends RoomDatabase {

    public abstract ShoppingListDao shoppingListDao();
    private static volatile ShoppingListRoomDatabase INSTANCE;
    private static final int NUMBER_OF_THREADS = 4;
    static final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    static ShoppingListRoomDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (ShoppingListRoomDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(), ShoppingListRoomDatabase.class, "shopping_list_database").build();
                }
            }
        }
        return INSTANCE;
    }
}
