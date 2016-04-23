package com.hyurumi.fb_bot_boilerplate.models.send;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by genki.furumi on 4/14/16.
 */
public class Payload {
    @SerializedName("template_type")
    final private String templateType;
    final private String text;
    final private String url;
    final private List<Element> elements;
    final private List<Button> buttons;

    private Payload(String type, String text, String url, List<Element> elements, List<Button> buttons){
        this.templateType = type;
        this.text = text;
        this.url = url;
        this.elements = elements;
        this.buttons = buttons;
    }

    public static Payload Button(String text){
        return new Payload("button", text, null, null, new ArrayList<>());
    }

    public static Payload Generic(){
        return new Payload("generic", null, null, new ArrayList<>(), null);
    }

    public static Payload Image(String url) {
        return new Payload(null, null, url, null, null);

    }

    public boolean addButton(Button button) {
        if (buttons != null) {
            return buttons.add(button);
        }else {
            return false;
        }
    }

    public boolean addElement(Element element) {
        if (elements != null) {
            return elements.add(element);
        }else {
            return false;
        }
    }
}
