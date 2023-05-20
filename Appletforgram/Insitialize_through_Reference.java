class Reference1 {
    int id;
    String name;
    float Salary;
}

class Reference {
    public static void main(String[] args) {
        Reference1 r1 = new Reference1();
        Reference1 r2 = new Reference1();
        r2.id = 200;
        r2.name = "Ramu MC";
        r2.Salary = 20000;
        System.out.println(r2.id + " " + r2.name + " " + r2.Salary);

        System.out.println(r1.id = 10);
        System.out.println(r1.name = "SonuVerma");
        System.out.println(r1.Salary = 10000);
    }

}
