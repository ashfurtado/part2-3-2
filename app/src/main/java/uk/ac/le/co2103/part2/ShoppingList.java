package uk.ac.le.co2103.part2;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Shopping_List")
public class ShoppingList {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "listId")
    private long listId;

    @ColumnInfo(name = "name")
    private String name;


    public long getListId() {
        return listId;
    }

    public void setListId(long listId) {
        this.listId = listId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShoppingList(long listId, String name) {
        this.listId = listId;
        this.name = name;
    }
}
