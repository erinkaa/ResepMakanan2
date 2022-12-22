package com.example.resepmakanan2.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.resepmakanan2.R;
import com.example.resepmakanan2.ResepTemplate;

import java.util.List;


public class AdaperResep extends RecyclerView.Adapter<AdaperResep.ViewHolder> {

    private Context context;
    private List<Resep> list;

    public AdaperResep(Context context, List<Resep> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public AdaperResep.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(context).inflate(R.layout.item,null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaperResep.ViewHolder holder, int position) {
        holder.imageViewResep.setImageResource(list.get(position).getGambarMakanan());
        holder.judulResepTextView.setText(list.get(position).getJudulResep());
        holder.resepCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ResepTemplate.class);
                intent.putExtra("gambarResep", list.get(holder.getAdapterPosition()).getGambarMakanan());
                intent.putExtra("judulResep", list.get(holder.getAdapterPosition()).getJudulResep());
                intent.putExtra("bahanResep", list.get(holder.getAdapterPosition()).getBahanResep());
                intent.putExtra("tahapanResep", list.get(holder.getAdapterPosition()).getTahapResep());
                intent.putExtra("idResepVideo", list.get(holder.getAdapterPosition()).getIdResepVideo());

                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageViewResep;
        private CardView resepCardView;
        private TextView judulResepTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageViewResep = itemView.findViewById(R.id.gambarResep);
            resepCardView = itemView.findViewById(R.id.resepCardView);
            judulResepTextView = itemView.findViewById(R.id.judulResep);

        }
    }
}
