package azmimuhammad.com.materialdesign.recyclerview.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import azmimuhammad.com.materialdesign.R;
import azmimuhammad.com.materialdesign.recyclerview.model.SampleData;

/**
 * Created by mazmik25 on 3/5/2018.
 */

public class SimpleAdapter extends RecyclerView.Adapter<SimpleAdapter.ViewHolder> {
    private Context context;

    public SimpleAdapter(Context context) {
        this.context = context;
    }

    @Override
    public SimpleAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SimpleAdapter.ViewHolder holder, final int position) {
        holder.txtTitle.setText(SampleData.getTitle().get(position));
        holder.delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SampleData.getTitle().remove(position);
                notifyItemRemoved(position);
                notifyItemRangeChanged(position, SampleData.getTitle().size());
                notifyDataSetChanged();
            }
        });
        holder.copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int pos = position + 1;
                SampleData.getTitle().add("Name " + pos);
                notifyItemInserted(position);
                notifyItemRangeChanged(position, SampleData.getTitle().size());
                notifyDataSetChanged();
            }
        });
    }

    private void removeItem(int position) {

    }

    @Override
    public int getItemCount() {
        return SampleData.getTitle().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtTitle;
        ImageView delete, copy;

        public ViewHolder(View itemView) {
            super(itemView);
            txtTitle = itemView.findViewById(R.id.txtTitle);
            delete = itemView.findViewById(R.id.delete);
            copy = itemView.findViewById(R.id.copy);
        }
    }
}
