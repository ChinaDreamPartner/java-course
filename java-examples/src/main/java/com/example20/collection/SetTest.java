package com.example20.collection;

import java.util.*;
import java.util.stream.Collectors;

public class SetTest {
    public static void main(String[] args) {

        switchs(getAddElement());
        Set<User> u = getAddElement();
        //removeSet(u,2);
        //traverse(u);
        group(u);
    }

    /**
     * 无基于索引的方法；
     */
    private static Set<User> getAddElement() {
        Set<User> users = new HashSet<>();
        User user = new User(1,"BO","哈尔滨");
        User user1 = new User(2,"SUN","哈尔滨");
        User user2 = new User(3,"Wang","沈阳");
        User user3 = new User(4,"Zhou","沈阳");
        User user4 = new User(5,"Ma","北京");
        users.add(user);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
//        System.out.println(users.size());
//        users.add(user);
//        System.out.println(users.size());


        return users;

    }
    public static List<User> switchs(Set<User> users){
        List<User> userList = new ArrayList<>(users);
        return userList;
    }
    public static void removeSet(Set<User> users,int id){
        Iterator<User> iUsers = users.iterator();
        while(iUsers.hasNext()){
            User u = iUsers.next();
            if(u.getId() == id){
                iUsers.remove();
            }
        }

    }

    public static void traverse(Set<User> users){
        for (User u : users) {
            System.out.println(u.getName());
        }
    }
    public static void group(Set<User> users){
        List<User> u = new ArrayList<>(switchs(users));
        Map<String, List<User>> userGroupMap = u.stream().
                    collect(Collectors.groupingBy(user -> user.getCity()));
//                collect(Collectors.groupingBy(User::getCity));
        Set<String> keySet = userGroupMap.keySet();
        keySet.forEach((key) -> {
            System.out.println(key);
            userGroupMap.get(key).forEach((user) -> System.out.println(user.getName()));
        });
    }

}
