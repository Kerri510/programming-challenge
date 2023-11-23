package de.exxcellent.challenge.model;

public class Weather {
    int day;
    int mxT;
    int mnT;
    int avT;
    float avDP;
    int hrP_TPcpn;
    int pDir;
    float avSp;
    int dir;
    int mxS;
    float skyC;
    int mxR;
    int mn;
    float r_AvSLP;

    public Weather(int day, int mxT, int mnT, int avT, float avDP, int hrP_TPcpn, int pDir, float avSp, int dir, int mxS, float skyC, int mxR, int mn, float r_AvSLP) {
        this.day = day;
        this.mxT = mxT;
        this.mnT = mnT;
        this.avT = avT;
        this.avDP = avDP;
        this.hrP_TPcpn = hrP_TPcpn;
        this.pDir = pDir;
        this.avSp = avSp;
        this.dir = dir;
        this.mxS = mxS;
        this.skyC = skyC;
        this.mxR = mxR;
        this.mn = mn;
        this.r_AvSLP = r_AvSLP;
    }

    public int getDay() {
        return day;
    }

    public int getMxT() {
        return mxT;
    }

    public int getMnT() {
        return mnT;
    }

    public int getAvT() {
        return avT;
    }

    public float getAvDP() {
        return avDP;
    }

    public int getHrP_TPcpn() {
        return hrP_TPcpn;
    }

    public int getpDir() {
        return pDir;
    }

    public float getAvSp() {
        return avSp;
    }

    public int getDir() {
        return dir;
    }

    public int getMxS() {
        return mxS;
    }

    public float getSkyC() {
        return skyC;
    }

    public int getMxR() {
        return mxR;
    }

    public int getMn() {
        return mn;
    }

    public float getR_AvSLP() {
        return r_AvSLP;
    }
}
