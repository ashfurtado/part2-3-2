package uk.ac.le.co2103.part2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ShoppingListViewHolder extends RecyclerView.ViewHolder {

    private final TextView ShoppingListItemView;

    private ShoppingListViewHolder(View itemView) {
        super(itemView);
        ShoppingListItemView = itemView.findViewById(R.id.recyclerview);
    }

    public void bind(String text) {
        ShoppingListItemView.setText(text);
    }

    static ShoppingListViewHolder create(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item, parent, false);
        return new ShoppingListViewHolder(view);
    }
}
