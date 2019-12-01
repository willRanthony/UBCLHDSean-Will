package FeedPackage;

import OrganizationPackage.Organization;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

public class Post {

    private final LocalDateTime datePosted;
    private String content;
    private BufferedImage image;
    private String location;
    private Organization organization;

    /**
     * @param org the organization that is creating the post
     * @param content the written text of the post
     **/
    public Post (    Organization    org,
                     String          content) {
        this.organization = org;
        this.datePosted = LocalDateTime.now();
        this.content = content;
        this.image = null;
        this.location = null;
    }

    /**
     * @param org the organization that is creating the post
     * @param content the written text of the post
     * @param location a location tag for the post
     **/
    public Post (   Organization    org,
                    String          content,
                    String          location) {
        this.organization = org;
        this.datePosted = LocalDateTime.now();
        this.content = content;
        this.image = null;
        this.location = location;
    }

    /**
     * @param org the organization that is creating the post
     * @param content the written text of the post
     * @param image the image associated with the post
     **/
    public Post (   Organization    org,
                    String          content,
                    BufferedImage   image) {
        this.organization = org;
        this.datePosted = LocalDateTime.now();
        this.content = content;
        this.image = image;
        this.location = null;
    }

    /**
     * @param org the organization that is creating the post
     * @param content the written text of the post
     * @param image the image associated with the post
     * @param location a location tag for the post
     **/
    public Post (   Organization    org,
                    String          content,
                    BufferedImage   image,
                    String          location) {
        this.organization = org;
        this.datePosted = LocalDateTime.now();
        this.content = content;
        this.image = image;
        this.location = location;
    }

    /**
     * @return the date that the post was created
     **/
    public LocalDateTime getDatePosted() {
        return this.datePosted;
    }

    /**
     * @return the content of the post
     **/
    public String getContent() {
        return this.content;
    }

    /**
     * @param content alters the content of the post
     **/
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @param image adds an image to the post
     **/
    public void setImage (BufferedImage image) {
        this.image = image;
    }

    /**
     * @param location adds an image to the post
     **/
    public void setLocation (String location) {
        this.location = location;
    }
}
