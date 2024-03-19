package in.phonebook.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.phonebook.binding.UserDto;
import com.phonebook.entity.User;

@Service
public interface UserService {
	
   UserDto saveUser(UserDto user);
   
   List<UserDto> getAllUser();
   
   UserDto getUser(String userId);
}
