package com.github.keler147.workshopmongo.services;
import com.github.keler147.workshopmongo.domain.User;
import com.github.keler147.workshopmongo.dto.UserDTO;
import com.github.keler147.workshopmongo.repository.UserRepository;
import com.github.keler147.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }

    public User findById(String id) {
        Optional<User> user = repo.findById(id);
        if (user.isEmpty()) {
            throw new ObjectNotFoundException("User not found!");
        }
        return user.get();
    }

    public User insert(User user) {
        return repo.insert(user);
    }

    public User fromDTO(UserDTO userDTO) {
        return new User(userDTO.getId(), userDTO.getName(), userDTO.getEmail());
    }

    public void delete(String id) {
        findById(id);
        repo.deleteById(id);
    }
}
