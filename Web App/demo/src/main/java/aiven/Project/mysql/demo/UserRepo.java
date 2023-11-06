package aiven.Project.mysql.demo;


import org.springframework.data.repository.CrudRepository;
import aiven.Project.mysql.demo.User;

public interface UserRepo extends CrudRepository<User , Integer> {


}
