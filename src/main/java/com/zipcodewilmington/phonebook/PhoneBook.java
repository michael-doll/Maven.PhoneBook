package com.zipcodewilmington.phonebook;

import java.util.*;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {
    private Map<String, List<String>> map;


    public PhoneBook(Map<String, List<String>> map) {
        this.map = new LinkedHashMap<>();
    }

    public PhoneBook() {
        this(null);

    }

    public void add(String name, String phoneNumber) {
        map.put(name, Arrays.asList(phoneNumber));
    }

    public void addAll(String name, String... phoneNumbers) {
        map.put(name,Arrays.asList(phoneNumbers));
    }

    public void remove(String name) {
        map.remove(name);
    }

    public Boolean hasEntry(String name) {
        return map.containsKey(name);
    }

    public List<String> lookup(String name) {
        return map.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
//        for(int i =0; i < map.size(); i++)  {
//            if(lookup(map.get(i).contains(phoneNumber)){
//                return String.valueOf(map.get(i));
//            }
        String name = "";
        for(Map.Entry<String, List<String>> entry : map.entrySet()){
            List<String> phoneNumberList = map.get(entry.getKey());
            for(int i =0; i < phoneNumberList.size(); i++){
                if(phoneNumberList.get(i).equals(phoneNumber)){
                    name = entry.getKey();
                }
            }
        }
       return name;
    }

    public List<String> getAllContactNames() {

        return new ArrayList<>(map.keySet());
    }

    public Map<String, List<String>> getMap() {
        return map;
    }
}
