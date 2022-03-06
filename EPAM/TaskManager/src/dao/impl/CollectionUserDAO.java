package dao.impl;

import beans.Role;
import beans.User;
import dao.UserDAO;

import java.util.ArrayList;

public class CollectionUserDAO implements UserDAO{
    private final ArrayList<User> users = new ArrayList<>();

    @Override
    public boolean authorization(String login, String password){
        int i;
        boolean signIn = false;
        for (i = 0; i < users.size(); i++){
            if (users.get(i).getLogin().equals(login) && users.get(i).getPassword().equals(password)){
                signIn = true;
            }
        }
        return signIn;
    }

    @Override
    public void registration(User user) {
        users.add(user);
    }

    @Override
    public String show(){
        String userList = "";
        int i;
        for (i = 0; i < users.size(); i++){
            if (users.get(i).getRole().equals(Role.MANAGER)){
                userList = userList + users.get(i).toString() + ".\n";
            }
        }
        return userList;
    }

    @Override
    public void deleteUser(String name){
        users.remove(findUser(name));
    }

    @Override
    public User findUser(String name){
        int i;
        for (i = 0; i < users.size(); i++){
            if (users.get(i).getName().equals(name)){
                break;
            }
        }
        return users.get(i);
    }
}
