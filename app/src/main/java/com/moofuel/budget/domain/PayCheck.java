package com.moofuel.budget.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @author MoOFueL
 */
public class PayCheck {


    private Integer id;

    private Date createdAt;

    private void prePersist() {
        createdAt = new Date();
    }

    private String name;

    private String additionalInfo;

    private Integer sum;

    private Set<File> images = new HashSet<>(0);

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public Set<File> getImages() {
        return images;
    }

    public void setImages(Set<File> images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "PayCheck{" +
                "id=" + id +
                ", createdAt=" + createdAt +
                ", name='" + name + '\'' +
                ", additionalInfo='" + additionalInfo + '\'' +
                ", sum=" + sum +
                ", images=" + images +
                '}';
    }
}
