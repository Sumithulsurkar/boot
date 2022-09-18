package com.boot.controllers.employee;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    String State;
    int pinCode;
    String city;

    public AddressController() {

    }

    public AddressController(String state, int pinCode, String city) {
        State = state;
        this.pinCode = pinCode;
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }
}
