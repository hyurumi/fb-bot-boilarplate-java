package com.hyurumi.fb_bot_boilerplate.models.send;

import com.google.gson.annotations.SerializedName;

/**
 * Created by genki.furumi on 4/23/16.
 */
public class Response {
    @SerializedName("recipient_id")
    String recipientId;
    @SerializedName("message_id")
    String messageId;
}
