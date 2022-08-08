package com.brainstorm.employmentrecord.employee;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Employee implements Serializable {
    @Id
    @Column( nullable = false, updatable = false)
    private long id;

    @Column( nullable = false)
    private String name;
    private String Email;

    private String jobTitle;
    private String stack;
    private String companyName;
    private String previousCompany;
    private String phone;
    private String imageUrl;
    private String linkedinUrl;
    private String facebookUrl;
    private String skypeUrl;
    private String twitterUrl;

    public Employee() {
    }

    public Employee(long id, String name, String email, String jobTitle, String stack, String companyName, String previousCompany, String phone, String imageUrl, String facebookUrl, String linkedinUrl, String skypeUrl, String twitterUrl) {
        this.id = id;
        this.name = name;
        Email = email;
        this.jobTitle = jobTitle;
        this.stack = stack;
        this.companyName = companyName;
        this.previousCompany = previousCompany;
        this.phone = phone;
        this.imageUrl = imageUrl;
        this.facebookUrl = facebookUrl;
        this.skypeUrl = skypeUrl;
        this.linkedinUrl = linkedinUrl;
        this.twitterUrl = twitterUrl;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPreviousCompany() {
        return previousCompany;
    }

    public void setPreviousCompany(String previousCompany) {
        this.previousCompany = previousCompany;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getLinkedinUrl() {
        return linkedinUrl;
    }

    public void setlinkedinUrl(String linkedinUrl) {
        this.linkedinUrl = linkedinUrl;
    }

    public String getfacebookUrl() {
        return facebookUrl;
    }

    public void setfacebookUrl(String facebookUrl) {
        this.facebookUrl = facebookUrl;
    }

    public String getskypeUrl() {
        return skypeUrl;
    }

    public void setskypeUrl(String skypeUrl) {
        this.skypeUrl = skypeUrl;
    }

    public String gettwitterUrl() {
        return twitterUrl;
    }

    public void setTwitterUrl(String twitterUrl) {
        this.twitterUrl = twitterUrl;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Email='" + Email + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", stack='" + stack + '\'' +
                ", companyName='" + companyName + '\'' +
                ", previousCompany='" + previousCompany + '\'' +
                ", phone='" + phone + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", linkedinUrl='" + linkedinUrl + '\'' +
                ", facebookUrl='" + facebookUrl + '\'' +
                ", skypeUrl='" + skypeUrl + '\'' +
                ", twitterUrl='" + twitterUrl + '\'' +
                '}';
    }
}
