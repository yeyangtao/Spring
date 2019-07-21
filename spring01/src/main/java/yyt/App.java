package yyt;

import java.util.List;
import java.util.Map;

/**
 * Hello world!
 */
public class App {
    private  int m;
    private User u;
    private List<User> userList;
    private Map<Integer,String> map;

    public Map<Integer, String> getMap() {
        return map;
    }

    public void setMap(Map<Integer, String> map) {
        this.map = map;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public User getU() {
        return u;
    }

    public void setU(User u) {
        this.u = u;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public void sayHi() {
        System.out.println(map.get(1)+userList.get(0).getName()+"AWSL"+m);
    }

}
