package com.isai.examen1;

import java.util.ArrayList;

public class ListDataHelper {
    public static ArrayList<ListViewItem> provideItems(){
        ArrayList<ListViewItem> list = new ArrayList<>();
        list.add(new ListViewItem(R.drawable.ic_brightness_1_black_24dp,android.R.color.holo_blue_bright, "Holo Blue Bright"));
        list.add(new ListViewItem(R.drawable.ic_brightness_1_black_24dp,android.R.color.holo_blue_light, "Holo Blue Light"));
        list.add(new ListViewItem(R.drawable.ic_brightness_1_black_24dp,android.R.color.holo_green_light, "Holo Green Light"));
        list.add(new ListViewItem(R.drawable.ic_brightness_1_black_24dp,android.R.color.holo_orange_light, "Holo Orange Light"));
        list.add(new ListViewItem(R.drawable.ic_brightness_1_black_24dp, android.R.color.holo_red_light,"Holo Red light"));
        list.add(new ListViewItem(R.drawable.ic_brightness_1_black_24dp,android.R.color.holo_purple, "Holo Purple"));
        list.add(new ListViewItem(R.drawable.ic_brightness_1_black_24dp, android.R.color.holo_blue_dark,"Holo Blue Dark"));
        list.add(new ListViewItem(R.drawable.ic_brightness_1_black_24dp, android.R.color.holo_green_dark,"Holo Green Dark"));
        list.add(new ListViewItem(R.drawable.ic_brightness_1_black_24dp,android.R.color.holo_red_dark,"Holo Red Dark"));
        list.add(new ListViewItem(R.drawable.ic_brightness_1_black_24dp,android.R.color.holo_orange_dark,"Holo Orange Dark"));

        return list;
    }
}

