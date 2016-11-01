package com.company.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;

@Table(name = "DEMO_VALUE_DESCRIPTION")
@Entity(name = "demo$ValueDescription")
public class ValueDescription extends StandardEntity {
    private static final long serialVersionUID = 4970039108133282882L;

    @Column(name = "VALUE_", nullable = false)
    protected Integer value;

    @Column(name = "DESCRIPTION", nullable = false)
    protected String description;

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }


}