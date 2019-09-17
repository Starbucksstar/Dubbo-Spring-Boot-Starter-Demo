package com.star.dubboprovider.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student")
@EnableJpaAuditing
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String idno;
    private String name;
    private String password;
    private int age;
    private String address;
    private String phone;
    private int sex;
}
