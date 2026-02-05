package LeetCode;

public class Item3 {
    class Parent{
        String name;
        Long age;
        private Parent(String name, Long age){
            this.name= name;
            this.age= age;
        }
    }
    class Child extends Parent{
        public Child(String name, Long age){
        super(name, age);
        }
    }

    public static void main(String[] args) {
        Item3 item3 = new Item3();
        Child child =  item3.new Child("tu", 22L);
        System.out.println(child);

    }
}
