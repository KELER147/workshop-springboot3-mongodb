package com.github.keler147.workshopmongo.resources;
import com.github.keler147.workshopmongo.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<User>> findAll() {
        User maria = new User("1","Maria Brown", "maria@gmail.com");
        User alex = new User("2","Alex Green", "alex@gmail.com");
        List<User> list = Arrays.asList(maria,alex);
        return ResponseEntity.ok().body(list);
    }


}
