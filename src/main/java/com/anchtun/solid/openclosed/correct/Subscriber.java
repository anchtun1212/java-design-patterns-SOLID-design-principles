package com.anchtun.solid.openclosed.correct;

import lombok.Data;

// base class is closed for modification
@Data
public abstract class Subscriber {
    protected Long subscriberId;
    protected String address;
    protected Long phoneNumber;
    protected int baseRate;
    
    // open for extension
    protected abstract double calculateBill();
}
