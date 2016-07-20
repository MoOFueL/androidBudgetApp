package com.moofuel.budget.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author MoOFueL
 */
public class GeneralResponse {

    private String status;

    private List<String> errors = new ArrayList<>(0);

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }

    @Override
    public String toString() {
        return "GeneralResponse{" +
                "status='" + status + '\'' +
                ", errors=" + errors +
                '}';
    }
}
