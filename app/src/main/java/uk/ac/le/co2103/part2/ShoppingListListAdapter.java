package uk.ac.le.co2103.part2;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;

public class ShoppingListListAdapter extends ListAdapter<ShoppingList, ShoppingListViewHolder> {
    public ShoppingListListAdapter(@NonNull DiffUtil.ItemCallback<ShoppingList> diffCallback) {
        super(diffCallback);
    }

    @Override
    public ShoppingListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return ShoppingListViewHolder.create(parent);
    }

    @Override
    public void onBindViewHolder(ShoppingListViewHolder holder, int position) {
        ShoppingList current = getItem(position);
        holder.bind(current.getName());
    }

    static class ShoppingListDiff extends DiffUtil.ItemCallback<ShoppingList> {

        @Override
        public boolean areItemsTheSame(@NonNull ShoppingList oldItem, @NonNull ShoppingList newItem) {
            return oldItem == newItem;
        }

        @Override
        public boolean areContentsTheSame(@NonNull ShoppingList oldItem, @NonNull ShoppingList newItem) {
            return oldItem.getName().equals(newItem.getName());
        }
    }
}
