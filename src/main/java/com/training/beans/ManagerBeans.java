package com.training.beans;

import java.util.Objects;

public class ManagerBeans {

    public static int serialUid = 1247;
    private Integer empId;
    private String empName;
    private String phoneNumber;
    private  String address;
    private Boolean paid;
    private String dept;
    private EmployeeBeans empBean;

    public ManagerBeans() {
    }

    public ManagerBeans(Integer empId, String empName, String phoneNumber, String address, Boolean paid, String dept) {
        this.empId = empId;
        this.empName = empName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.paid = paid;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "ManagerBeans{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", paid=" + paid +
                ", dept='" + dept + '\'' +
                ", empBean=" + empBean +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ManagerBeans that = (ManagerBeans) o;
        return Objects.equals(empId, that.empId) &&
                Objects.equals(empName, that.empName) &&
                Objects.equals(phoneNumber, that.phoneNumber) &&
                Objects.equals(address, that.address) &&
                Objects.equals(paid, that.paid) &&
                Objects.equals(dept, that.dept);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, empName, phoneNumber, address, paid, dept);
    }

    public static int getSerialUid() {
        return serialUid;
    }

    public static void setSerialUid(int serialUid) {
        ManagerBeans.serialUid = serialUid;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getPaid() {
        return paid;
    }

    public void setPaid(Boolean paid) {
        this.paid = paid;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public EmployeeBeans getEmpBean() {
        return empBean;
    }

    public void setEmpBean(EmployeeBeans empBean) {
        this.empBean = empBean;
    }
}

