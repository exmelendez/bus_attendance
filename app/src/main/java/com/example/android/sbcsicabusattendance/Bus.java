package com.example.android.sbcsicabusattendance;

import java.util.List;

public class Bus {
    private String busColor, driverName, driverPhone, pmRouteNum;
    private List<Student> busStudents;

    public Bus(String busColor, String driverName, String driverPhone, String pmRouteNum, List<Student> busStudents) {
        this.busColor = busColor;
        this.driverName = driverName;
        this.driverPhone = driverPhone;
        this.pmRouteNum = pmRouteNum;
        this.busStudents = busStudents;
    }

    public String getBusColor() {
        return busColor;
    }

    public void setBusColor(String busColor) {
        this.busColor = busColor;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverPhone() {
        return driverPhone;
    }

    public void setDriverPhone(String driverPhone) {
        this.driverPhone = driverPhone;
    }

    public String getPmRouteNum() {
        return pmRouteNum;
    }

    public void setPmRouteNum(String pmRouteNum) {
        this.pmRouteNum = pmRouteNum;
    }

    public List<Student> getBusStudents() {
        return busStudents;
    }

    public void setBusStudents(List<Student> busStudents) {
        this.busStudents = busStudents;
    }
}
