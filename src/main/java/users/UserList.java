package users;

import java.util.HashMap;

public class UserList {
    private HashMap<String, User> list;

    public UserList() {
        this.list = new HashMap();

        list.put("Frenz Repunte", new User("Frenz Repunte", "franzrepunte@email.com", "123456") );
        list.put("Nino Cabiltes", new User("Nino Cabiltes", "ninocabiltes@email.com", "123456") );
        list.put("Jay Vince Serato", new User("Jay Vince Serato", "jayvinceserato@email.com", "123456") );
        list.put("ash", new User("ash", "ash@email.com", "123") );
    }

    public HashMap<String, User> getList() {
        return list;
    }
}
