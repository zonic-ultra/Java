package com.bandaljudens.BandalJudensSpringboot.model;

public class Assets {
    private Long id;
    private String name;
    private String type;
    private String serialNumber;

    public Assets(Long id, String name, String type, String serialNumber) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.serialNumber = serialNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
