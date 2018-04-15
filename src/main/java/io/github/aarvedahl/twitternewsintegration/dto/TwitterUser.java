package io.github.aarvedahl.twitternewsintegration.dto;

public class TwitterUser extends AbstractUser {
    private String screenname;
    private String location;
    private String description;




    public String getScreenname() {
        return screenname;
    }

    public void setScreenname(String screenname) {
        this.screenname = screenname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
