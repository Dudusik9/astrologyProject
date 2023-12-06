package com.dud.and.kra.astrology.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;
import lombok.Data;


@Entity
@Table(name = "users", schema = "public")
@Data
public class User {
    @Id
    private Long Id;

    private String login;
    private String firstName;
    private String secondName;
    private String email;
    private Date birthday;
}
