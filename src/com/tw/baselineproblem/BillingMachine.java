package com.tw.baselineproblem;

public class BillingMachine {
    public static String produceReceipt(String itemInfo) {

        String[] splitItemInfo = itemInfo.split(" ");
        int length = splitItemInfo.length;
        double shelfPrice = Double.parseDouble(splitItemInfo[length - 1]);
        String receipt = "";

        for(int i = 0; i < length - 2; i++) {
            receipt += splitItemInfo[i] + " ";
        }
        
        receipt += ": " + Double.toString(shelfPrice);
        receipt += "\nSales Taxes : 0.0" + "\nTotal : " + Double.toString(shelfPrice);
        return receipt;
    }
}
