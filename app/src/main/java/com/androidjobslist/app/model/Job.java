package com.androidjobslist.app.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Serializable implementation of a Github "Job" item.
 * Note: Variable names are same as the corresponding JSON
 */
public class Job implements Serializable {

    public String id;
    public String created_at;
    public String title;
    public String location;
    public String type;
    public String description;
    public String company;
    public String company_url;
    public String company_logo;
    public String url;

    public Job(String id, String created_at, String title, String location, String type, String description, String company, String company_url, String company_logo, String url) {
        this.id = id;
        this.created_at = created_at;
        this.title = title;
        this.location = location;
        this.type = type;
        this.description = description;
        this.company = company;
        this.company_url = company_url;
        this.company_logo = company_logo;
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany_url() {
        return company_url;
    }

    public void setCompany_url(String company_url) {
        this.company_url = company_url;
    }

    public String getCompany_logo() {
        return company_logo;
    }

    public void setCompany_logo(String company_logo) {
        this.company_logo = company_logo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    @Override
    public String toString() {
        return "Job{" +
                "id='" + id + '\'' +
                ", created_at='" + created_at + '\'' +
                ", title='" + title + '\'' +
                ", location='" + location + '\'' +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", company='" + company + '\'' +
                ", company_url='" + company_url + '\'' +
                ", company_logo='" + company_logo + '\'' +
                ", url='" + url + '\'' +
                '}';
    }



}
