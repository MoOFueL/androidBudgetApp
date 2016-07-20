package com.moofuel.budget.domain;

import java.util.Arrays;
import java.util.Date;

/**
 * @author MoOFueL
 */
public class File {

    private Integer id;

    private Date createdAt;

    private void onCreate() {
        createdAt = new Date();
    }

    private String name;

    private byte[] image;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "File{" +
                "id=" + id +
                ", createdAt=" + createdAt +
                ", image=" + Arrays.toString(image) +
                ", name='" + name + '\'' +
                '}';
    }
}
