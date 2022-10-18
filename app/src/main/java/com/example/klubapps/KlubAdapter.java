package com.example.klubapps;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class KlubAdapter extends RecyclerView.Adapter<KlubAdapter.ViewHolder> {
    private final ArrayList<Klub> values;
    //oncreate holder untuk nge-set isi
    private final LayoutInflater inflater;

    public KlubAdapter(Context context, ArrayList<Klub> values) {
        this.values = values;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull KlubAdapter.ViewHolder holder, int position) {
        Klub klub = values.get(position);
        holder.txtName.setText(klub.name);
        holder.txtColor.setText(klub.color);
        holder.txtDesc.setText(klub.desc);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(holder.itemView.getContext(), String.valueOf(position), Toast.LENGTH_LONG).show();
                Intent intent = new Intent(holder.itemView.getContext(), DetailKlubActivity.class);
                intent.putExtra("name", klub.name);
                intent.putExtra("color", klub.color);
                intent.putExtra("desc", klub.desc);
                holder.itemView.getContext().startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return values.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtName, txtColor, txtDesc;
        public ViewHolder(@NonNull View itemView){
            super(itemView);
            txtName = itemView.findViewById(R.id.txt_name);
            txtColor = itemView.findViewById(R.id.txt_color);
            txtDesc = itemView.findViewById(R.id.txt_description);
        }
    }
}
