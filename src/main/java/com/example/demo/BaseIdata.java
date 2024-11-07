package com.example.demo;

public abstract class BaseIdata implements Ildata {

    private String department;
    private MainWork mainWork;

    public BaseIdata(String department, MainWork mainWork) {
        this.department = department;
        this.mainWork = mainWork;
    }

    @Override
    public String getDepartment() {
        return department;
    }

    @Override
    public MainWork getMainWork() {
        return mainWork;
    }

}
