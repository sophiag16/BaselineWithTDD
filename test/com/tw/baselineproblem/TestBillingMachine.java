package com.tw.baselineproblem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBillingMachine {

    @Test
    public void produceReceiptForASingleItemList() {
        assertEquals("1 book: 12.49\n" +
                "Sales Taxes: 0.0\n" +
                "Total: 12.49", BillingMachine.produceReceipt("1 book at 12.49"));
    }
}
