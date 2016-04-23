package com.hyurumi.fb_bot_boilerplate.models.send;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by genki.furumi on 4/15/16.
 */
public class Element {
    final private String title;
    @SerializedName("image_url")
    final private String imageUrl;
    final private String subtitle;
    private List<Button> buttons;

    public Element (String title, String imageUrl, String subtitle){
        this.title = title;
        this.imageUrl = imageUrl;
        this.subtitle = subtitle;
    }

    public boolean addButton(Button button) {
        if (buttons == null) buttons = new ArrayList<>();
        return buttons.add(button);
    }
}
