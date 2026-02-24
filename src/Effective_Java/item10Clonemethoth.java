package Effective_Java;

import java.util.ArrayList;

public class item10Clonemethoth {
    public static class Item implements Cloneable {
        public int id;
        public String name;
        public SubItem subItem;
        public ArrayList<String> listRef;

        public Item(int id, String name, SubItem subItem, ArrayList<String> listRef) {
            this.id = id;
            this.name = name;
            this.subItem = subItem;
            this.listRef = listRef;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            // shallow copy
            Item cloned = (Item) super.clone();
            // deep copy cho subItem và listRef
            cloned.subItem = new SubItem(this.subItem.text);
            cloned.listRef = new ArrayList<>(this.listRef);
            return cloned;
        }

        @Override
        public String toString() {
            return "Item{id=" + id + ", name=" + name +
                    ", subItem=" + (subItem != null ? subItem.text : "null") +
                    ", listRef=" + listRef + "}";
        }
    }

    public static class SubItem {
        public String text;

        public SubItem(String text) {
            this.text = text;
        }
    }

    public static void main(String[] args) {
        //tesstcase 1
//        ArrayList<String> listRef = new ArrayList<>();
//        listRef.add("ref1");
//        Item A = new Item(1, "A", new SubItem("SubA"), listRef);
//
//        System.out.println("MainActivity_onCreate ------->A=" + A);
//        Item B = null;
//        try {
//            B = (Item) A.clone();
//            System.out.println("MainActivity_onCreate ------->B=" + B);
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
// testcase 2
        ArrayList<String> listRef = new ArrayList<>();
        listRef.add("ref1");
        Item A = new Item(1, "A", new SubItem("SubA"), listRef);

        System.out.println("MainActivity_onCreate ------->A=" + A);
        Item B = null;
        try {
            B = (Item) A.clone();
            System.out.println("MainActivity_onCreate ------->B=" + B);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        B.listRef.clear();
        A.subItem.text = "changeText";
        A.name = "changeNameA";
        System.out.println("MainActivity_onCreate ------->A=" + A);
        System.out.println("MainActivity_onCreate ------->B=" + B);
    }
}
