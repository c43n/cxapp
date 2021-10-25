package com.example.mywork;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import java.util.Map;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

    public class Myadapter extends RecyclerView.Adapter <Myadapter.MyViewHolder>{
        private View itemView;
        private Context context;
        private List<Map<String,Object>> data;


    public Myadapter(List<Map<String,Object>> data,Context context){
            this.context=context;
            this.data=data;
        }


    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        itemView= LayoutInflater.from(context).inflate(R.layout.item1,parent,false);
        MyViewHolder myViewHolder=new MyViewHolder(itemView);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.textView1.setText(data.get(position).get("name").toString());
        holder.textView2.setText(data.get(position).get("price").toString());
        holder.textView3.setText(data.get(position).get("configure").toString());
        holder.imageView.setImageResource(Integer.parseInt(data.get(position).get("photo").toString()));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(holder.textView1.getText() =="华为"){
                    Intent intent=new Intent(context,MainActivity1.class);
                    context.startActivity(intent);
                }
                if(holder.textView1.getText() == "苹果"){
                    Intent intent=new Intent(context,MainActivity2.class);
                    context.startActivity(intent);
                }
                if(holder.textView1.getText() == "小米"){
                    Intent intent=new Intent(context,MainActivity3.class);
                    context.startActivity(intent);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView textView1,textView2,textView3;
        ImageView imageView;


        public MyViewHolder(View itemView) {
            super(itemView);
            textView1=(TextView) itemView.findViewById(R.id.textView1);
            textView2=(TextView) itemView.findViewById(R.id.textView2);
            textView3=(TextView) itemView.findViewById(R.id.textView3);
            imageView=(ImageView) itemView.findViewById(R.id.imageView);

        }
    }


}
