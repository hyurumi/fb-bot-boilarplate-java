package com.hyurumi.fb_bot_boilerplate.models.webhook;

import java.util.List;

/**
 * Created by genki.furumi on 4/14/16.
 */
public class Message {
    public String mid;
    public int seq;
    public List<Attachment> attachments;
    public String text;
}
