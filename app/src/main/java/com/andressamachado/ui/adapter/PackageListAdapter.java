package com.andressamachado.ui.adapter;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.andressamachado.util.CurrencyUtil;
import com.andressamachado.util.DurationUtil;
import com.andressamachado.R;
import com.andressamachado.util.ResourcesUtil;
import com.andressamachado.model.TravelPackage;

import java.util.List;

public class PackageListAdapter extends BaseAdapter {
    private final List<TravelPackage> travelPackages;
    private final Context context;

    public PackageListAdapter(List<TravelPackage> travelPackages, Context context){
        this.travelPackages = travelPackages;
        this.context = context;
    }

    @Override
    public int getCount() {
        return travelPackages.size();
    }

    @Override
    public Object getItem(int position) {
        return travelPackages.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View newView = LayoutInflater.from(context).inflate(R.layout.package_item, parent, false);
        TravelPackage travelPackage = travelPackages.get(position);

        //sets destination name to the view
        showDestinationName(newView, travelPackage);
        //sets destination photo to the view
        showDestinationPhoto(newView, travelPackage);
        //sets package duration to the view
        showDuration(newView, travelPackage);
        //sets price to the view
        showPrice(newView, travelPackage);

        return newView;
    }

    private void showDestinationName(View newView, TravelPackage travelPackage) {
        TextView local = newView.findViewById(R.id.package_item_local);
        local.setText(travelPackage.getLocal());
    }

    private void showPrice(View newView, TravelPackage travelPackage) {
        TextView price = newView.findViewById(R.id.package_item_price);
        String canadianDollar = CurrencyUtil.currencyFormat(travelPackage.getPrice());
        price.setText(canadianDollar);
    }

    private void showDestinationPhoto(View newView, TravelPackage travelPackage) {
        ImageView image = newView.findViewById(R.id.package_item_image);
        Drawable drawableImagePackage = ResourcesUtil.getDrawable(context, travelPackage.getImage());
        image.setImageDrawable(drawableImagePackage);
    }

    private void showDuration(View newView, TravelPackage travelPackage) {
        TextView days = newView.findViewById(R.id.package_item_duration);
        String stringDays = DurationUtil.durationFormat(travelPackage.getDays());
        days.setText(stringDays);
    }
}
