package sahil.mulla.myfavapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemsRecyclerAdapter extends RecyclerView.Adapter<ItemViewHolder> {
    MyCategory myCategory;
    public ItemsRecyclerAdapter(MyCategory category) {
        this.myCategory=category;

    }
    public void setMyCategory(MyCategory myCategory)
    {
        this.myCategory=myCategory;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view_holder,parent,false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
    holder.textView.setText(myCategory.getItems().get(position));
    }

    @Override
    public int getItemCount() {

        return myCategory.getItems().size();
    }
}
