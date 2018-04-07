package io.github.aarvedahl.twitternewsintegration.dto;

public class Status extends AbstractUser {

    private String created_at;
    private String text;
    private String profile_background_image_url;

    public String getProfile_background_image_url() { return profile_background_image_url; }

    public void setProfile_background_image_url(String profile_background_image_url) { this.profile_background_image_url = profile_background_image_url; }

    public String getCreated_at() { return created_at; }

    public void setCreated_at(String created_at) { this.created_at = created_at; }

    public String getText() { return text; }

    public void setText(String text) { this.text = text; }

    public Status(String text) {
        this.text = text;
    }

    public Status() {    }
}
