package com.example.kazajii.local;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SliderAdapter extends PagerAdapter
{

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context)
    {
        this.context = context;
    }

    //Arrays
    /*public int[] slide_images =
            {
                    R.drawable.logo
            };*/

    public String[] slide_desc1 =
            {
                    "Votre pharmacie de garde la plus proche.",

                    "Vous permet de trouver la pharmacie de garde" +
                            " proche de chez vous.",
                    "Vous permet de renseigner vos jours de garde" +
                            "semaine, ce facilitera votre localisation."
            };

    public String[] slide_CliPha1 =
            {
                    " ",
                    "AUX CLIENTS.",
                    "AUX PHARMACIES."
            };

    @Override
    public int getCount() {
        return slide_desc1.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == (RelativeLayout)o;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position)
    {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout, container,false);

        //ImageView slideImageView = (ImageView) view.findViewById(R.id.slide_image);
        TextView slide_desc = (TextView) view.findViewById(R.id.slide_desc);

        TextView slide_CliPha = (TextView) view.findViewById(R.id.slide_CliPha);

        //slideImageView.setImageResource(slide_images[position]);
        slide_desc.setText(slide_desc1[position]);
        slide_CliPha.setText(slide_CliPha1[position]);

        container.addView(view);


        return view;

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object)
    {
        container.removeView((RelativeLayout)object);
    }
}