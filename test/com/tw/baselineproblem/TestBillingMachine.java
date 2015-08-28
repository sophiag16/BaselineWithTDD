package com.tw.baselineproblem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBillingMachine {

    @Test
    public void produceReceiptForASingleItemList() {
        BillingMachine billingMachine = new BillingMachine();

        assertEquals("1 book : 12.49\n" +
                "Sales Taxes : 0.0\n" +
                "Total : 12.49", billingMachine.produceReceipt("1 book at 12.49"));
    }

    @Test
    public void produceReceiptForAnotherSingleItemList() {
        BillingMachine billingMachine = new BillingMachine();

        assertEquals("1 chocolate bar : 0.85\n" +
                "Sales Taxes : 0.0\n" +
                "Total : 0.85", billingMachine.produceReceipt("1 chocolate bar at 0.85"));
    }
}
