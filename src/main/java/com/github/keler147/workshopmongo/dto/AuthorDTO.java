package com.github.keler147.workshopmongo.dto;

import com.github.keler147.workshopmongo.domain.User;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class AuthorDTO implements Serializable {

    private String id;
    private String name;

    public AuthorDTO() {
    }
    public AuthorDTO(User author) {
        id = author.getId();
        name = author.getName();
    }
}
