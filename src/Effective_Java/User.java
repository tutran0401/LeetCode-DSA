package Effective_Java;

import java.util.HashSet;
import java.util.Set;

class User {
    String id;
    String name;

    User(String id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public boolean equals(Object o ){
        if(this == o) return true;
        if(! (o instanceof User)) return true;

        User other = (User) o;                    // bước 3
        return id.equals(other.id);
    }
    @Override
    public int hashCode() {
        return id.hashCode();
    }

    public static void main(String[] args) {
        User u1 = new User("001", "tu");
        User u2 = new User("001", "tu");
        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        Set<User> users = new HashSet<>();
        users.add(new User("U01", "An"));
        users.add(new User("U01", "An"));
        System.out.println(users.size()); // 2 ❌ (rất nguy hiểm)

    }

}