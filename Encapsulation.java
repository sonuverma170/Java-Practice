class stu {
    public String name;
    public int age;
    public String addname;
    protected int id;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getaddname() {
        return this.addname;
    }

    public void setaddname(String addname) {
        this.addname = addname;
    }

    public int getid() {
        return this.id;
    }

    public void setid(int id) {
        this.id = id;
    }
}

public class Encapsulation {

    public static void main(String[] args) {

        stu s = new stu();
        s.setName("SONUVERMAJI Bhai!");
        s.setAge(22);
        s.setaddname("jogipur PBH");
        s.setid(2346);
        System.out.println(s.getaddname());
        System.out.println(s.getid());
        System.out.println(s.getName());
        System.out.print(s.getAge());

    }
}
