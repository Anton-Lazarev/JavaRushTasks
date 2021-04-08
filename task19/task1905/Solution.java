package com.javarush.task.task19.task1905;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Закрепляем адаптер
*/

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();

    static {
        countries.put("RU", "Russia");
        countries.put("UA", "Ukraine");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {
    }

    public static class DataAdapter implements RowItem {
        private Customer customer;
        private Contact contact;

        public DataAdapter(Customer customer, Contact contact) {
            this.customer = customer;
            this.contact = contact;
        }

        @Override
        public String getCompany() {
            return customer.getCompanyName();
        }

        @Override
        public String getCountryCode() {
            String countryCode = "";
            if (countries.containsValue(customer.getCountryName())) {
                for (Map.Entry<String, String> entry : countries.entrySet()) {
                    if (customer.getCountryName().equals(entry.getValue())) countryCode = entry.getKey();
                }
            }
            return countryCode;
        }

        @Override
        public String getContactFirstName() {
            return contact.getName().substring(contact.getName().lastIndexOf(" ") + 1);
        }

        @Override
        public String getContactLastName() {
            return contact.getName().substring(0, contact.getName().indexOf(","));
        }

        @Override
        public String getDialString() {
            ArrayList<String> digits = new ArrayList<>();
            digits.add("0");
            digits.add("1");
            digits.add("2");
            digits.add("3");
            digits.add("4");
            digits.add("5");
            digits.add("6");
            digits.add("7");
            digits.add("8");
            digits.add("9");
            String onlyInts = "";
            char[] strArr = contact.getPhoneNumber().toCharArray();
            for (int i = 0; i < strArr.length; i++) {
                String tmp = strArr[i] + "";
                if (digits.contains(tmp)) onlyInts += strArr[i];
            }
            return "callto://+" + onlyInts;
        }
    }

    public static interface RowItem {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        String getDialString();         //For example: callto://+380501234567
    }

    public static interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }

    public static interface Contact {
        String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber();        //For example: +38(050)123-45-67 or +3(805)0123-4567 or +380(50)123-4567 or ...
    }
}