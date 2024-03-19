package in.phonebook.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phonebook.binding.UserDto;
import com.phonebook.entity.User;

import in.phonebook.repo.UserRepository;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepo;

	@Override
	public UserDto saveUser(UserDto user) {
		User userEntity = new User();
		String userId = UUID.randomUUID().toString();
		userEntity.setUserId(userId);
		BeanUtils.copyProperties(userEntity, user);
		
		userEntity=userRepo.save(userEntity);
		BeanUtils.copyProperties(userEntity, user);
		return user;
	}

	@Override
	public List<UserDto> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto getUser(String userId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
    
	

}
