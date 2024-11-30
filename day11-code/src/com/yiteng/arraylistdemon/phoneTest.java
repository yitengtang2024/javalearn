package com.yiteng.arraylistdemon;

import java.util.ArrayList;

public class phoneTest {
    public static void main(String[] args) {
        ArrayList<Phone> phoneList = new ArrayList<>();
        Phone phone1 = new Phone("xiaomi",1000);
        Phone phone2 = new Phone("huawei",8000);
        Phone phone3 = new Phone("samsung",5000);
        phoneList.add(phone1);
        phoneList.add(phone2);
        phoneList.add(phone3);

        ArrayList<Phone> filterationList = new ArrayList<>();
        filterationList = getPhoneList(phoneList,5000);
        System.out.println(filterationList);

    }
    private static ArrayList<Phone> getPhoneList(ArrayList<Phone> phoneList, double targetPrice) {
        ArrayList<Phone> phonefilterList = new ArrayList<>();
        for (int i = 0; i < phoneList.size(); i++) {
            double phonePrice= phoneList.get(i).getPrice();
            if (phonePrice <= targetPrice){
                phonefilterList.add(phoneList.get(i));
            }

        }
        return phonefilterList;

    }
}
