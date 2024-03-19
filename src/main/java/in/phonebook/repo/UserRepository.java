package in.phonebook.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phonebook.entity.User;

public interface UserRepository extends JpaRepository<User, Serializable>{

}
