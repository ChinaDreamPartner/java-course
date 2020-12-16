package com.design.Builder;

/**
 * Product.java
 *  产品（具体的手机）
 */
class Product {
    private String buildA="CPU";
    private String buildB="内存";
    private String buildC="电池";
    private String buildD="屏幕";
    private String buildE="摄像头";
    private String buildF="GPS";
    private String buildG="指纹识别";
    private String buildH="NFC";

    public String getBuildA() {
        return buildA;
    }
    public void setBuildA(String buildA) {
        this.buildA = buildA;
    }
    public String getBuildB() {
        return buildB;
    }
    public void setBuildB(String buildB) {
        this.buildB = buildB;
    }
    public String getBuildC() {
        return buildC;
    }
    public void setBuildC(String buildC) {
        this.buildC = buildC;
    }
    public String getBuildD() {
        return buildD;
    }
    public void setBuildD(String buildD) {
        this.buildD = buildD;
    }

    public String getBuildE() {
        return buildE;
    }

    public void setBuildE(String buildE) {
        this.buildE = buildE;
    }

    public String getBuildF() {
        return buildF;
    }

    public void setBuildF(String buildF) {
        this.buildF = buildF;
    }

    public String getBuildG() {
        return buildG;
    }

    public void setBuildG(String buildG) {
        this.buildG = buildG;
    }

    public String getBuildH() {
        return buildH;
    }

    public void setBuildH(String buildH) {
        this.buildH = buildH;
    }



}