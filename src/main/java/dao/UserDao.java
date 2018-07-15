package dao;

import java.util.HashMap;
import java.util.Map;
import domain.User;

public class UserDao {
  private Map<String, User> usersDB = new HashMap<>();
  {
    usersDB.put("hiep@mum.edu", new User(1,"hiep@mum.edu","abc"));
  }

  public boolean checkExistUser(String email, String password){
    if(usersDB.containsKey(email) && usersDB.get(email).getPassword().equals(password)){
      return true;
    }
    return false;
  }

  public User getUserByEmail(String email){
    return usersDB.get(email);
  }
}
