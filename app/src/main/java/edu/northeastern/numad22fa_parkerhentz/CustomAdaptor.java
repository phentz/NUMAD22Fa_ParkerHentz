package edu.northeastern.numad22fa_parkerhentz;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;




public class CustomAdaptor extends RecyclerView.Adapter {
    ArrayList sites;
    Context context;

    public CustomAdaptor(ArrayList<String> sites, Context context) {
        this.sites = sites;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false );
        RecyclerView.ViewHolder viewholder = new viewHolder(v);
        return viewholder;
        }


    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {

        //((RecyclerView.ViewHolder)holder).site.setText(sites.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),(Integer)sites.get(position),Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return sites.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        TextView site;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            site = itemView.findViewById(R.id.textView);
        }
    }



}
