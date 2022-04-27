package com.example.trianglebackendd.entities;

public class Triangle {
    
    int aside;
    int bside;
    int cside;
    String triangleDefinition;

    public Triangle() {
    }

    public Triangle(int aside, int bside, int cside, String triangleDefinition) {
        this.aside = aside;
        this.bside = bside;
        this.cside = cside;
        this.triangleDefinition = triangleDefinition;
    }
    

    public int getAside() {
        return aside;
    }

    public int getBside() {
        return bside;
    }

    public int getCside() {
        return cside;
    }

    public String getTriangleDefinition() {
        return triangleDefinition;
    }

    public void setTriangleDefinition(String triangleDefinition) {
        this.triangleDefinition = triangleDefinition;
    }
}
