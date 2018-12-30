/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet2.model;

public class Sucursal {
    
    private int idSucursal;
    private String name;
    private String address;
    private Employee[] employeeList;

    public Sucursal(int idSucursal, String name, String address, Employee[] employeeList) {
        this.idSucursal = idSucursal;
        this.name = name;
        this.address = address;
        this.employeeList = employeeList;
    }

    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Employee[] getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(Employee[] employeeList) {
        this.employeeList = employeeList;
    }   
}
