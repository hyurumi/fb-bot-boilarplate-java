package com.hyurumi.fb_bot_boilerplate.models.webhook;

import com.google.gson.annotations.SerializedName;

/**
 * Created by genki.furumi on 4/23/16.
 */
public class Attachment {
    public enum Type {
        @SerializedName("audio")
        AUDIO,
        @SerializedName("image")
        IMAGE,
        @SerializedName("video")
        VIDEO
    }

    public Type type;
    public Payload payload;
}
