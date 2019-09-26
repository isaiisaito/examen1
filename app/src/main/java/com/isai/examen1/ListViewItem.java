package com.isai.examen1;

public class ListViewItem {
    private int imageResource;
    private int colorIcono;
    private String title;


    public ListViewItem(int imageResource, int colorIcono, String title) {
        this.imageResource = imageResource;
        this.colorIcono = colorIcono;
        this.title = title;
    }

    public int getImageResource() {
        return imageResource;
    }

    public int getColorIcono() {
        return colorIcono;
    }

    public String getTitle() {
        return title;
    }
}
