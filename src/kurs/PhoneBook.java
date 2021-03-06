package kurs;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private final List names = new ArrayList();
    private final List phones = new ArrayList();

    public void add(String name, String phone) {
        for (int i = 0; i < names.size(); i++) {
            if (name.equals(names.get(i)) && phone.equals(phones.get(i))) return;
        }
        names.add(name);
        phones.add(phone);
    }

    public List get(String name) {
        List resPhones = new ArrayList();
        for (int i = 0; i < names.size(); i++) {
            if (name.equals(names.get(i))) {
                resPhones.add(phones.get(i));
            }
        }
        return resPhones;
    }
}
