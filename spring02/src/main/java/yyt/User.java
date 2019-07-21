package yyt;

public class User {
    private Cat cat;
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public void show() {
        cat.print();
    }
    public void init(){
        System.out.println("init...");
    }
    public void destroy(){
        System.out.println("destroy...");
    }
}


