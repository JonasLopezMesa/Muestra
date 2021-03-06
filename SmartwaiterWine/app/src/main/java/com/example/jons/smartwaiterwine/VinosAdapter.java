package com.example.jons.smartwaiterwine;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Jonás on 06/10/2015.
 */
public class VinosAdapter extends ArrayAdapter<Vinos> {

    Context context;
    int LayoutResortId;
    Vinos data[]= null;

    public VinosAdapter(Context context, int layoutResortId, Vinos[] data) {
        super(context, layoutResortId,data);

        this.context= context;
        this.LayoutResortId= layoutResortId;
        this.data= data;

    }

    public View getView(int position, View contentView, ViewGroup parent){
        View row= contentView;
        VinosHolder holder = null;

        if(row==null){
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row= inflater.inflate(LayoutResortId, parent, false);

            holder= new VinosHolder();
            holder.imagen= (ImageView) row.findViewById(R.id.imagen);
            holder.texto = (TextView) row.findViewById((R.id.tv));
            row.setTag(holder);
        }
        else{
            holder= (VinosHolder) row.getTag();
        }

        Vinos bandas = data[position];
        holder.texto.setText(bandas.title);
        holder.imagen.setImageResource(bandas.icon);


        return row;
    }

    static class VinosHolder{
        ImageView imagen;
        TextView texto;
    }
}
