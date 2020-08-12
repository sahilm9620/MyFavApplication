package sahil.mulla.myfavapplication;


import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemViewHolder extends RecyclerView.ViewHolder  {
    TextView textView;


    public ItemViewHolder(@NonNull View itemView) {
        super(itemView);
        textView=itemView.findViewById(R.id.item_textview);
    }

}
