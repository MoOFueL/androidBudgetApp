package com.moofuel.budget.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @author MoOFueL
 */
public class User {

    private Integer id;

    private Date createdAt;

    private void prePersist() {
        createdAt = new Date();
    }

    private String fio;

    private String additionalInfo;

    private boolean active;

    private Date synchronizedAt;

    private Set<PayCheck> payChecks = new HashSet<>(0);

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

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Date getSynchronizedAt() {
        return synchronizedAt;
    }

    public void setSynchronizedAt(Date synchronizedAt) {
        this.synchronizedAt = synchronizedAt;
    }

    public Set<PayCheck> getPayChecks() {
        return payChecks;
    }

    public void setPayChecks(Set<PayCheck> payChecks) {
        this.payChecks = payChecks;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", createdAt=" + createdAt +
                ", fio='" + fio + '\'' +
                ", additionalInfo='" + additionalInfo + '\'' +
                ", active=" + active +
                ", synchronizedAt=" + synchronizedAt +
                ", payChecks=" + payChecks +
                '}';
    }
}
