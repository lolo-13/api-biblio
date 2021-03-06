package org.compain.library.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users", uniqueConstraints = {@UniqueConstraint(columnNames = {"id_user", "email"})})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Long idUser;
    @Column(name = "name")
    private String name;
    @Column(name = "firstname")
    private String firstname;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @ManyToOne
    @JoinColumn(name = "id_role")
    private Role role;
    @ManyToOne
    @JoinColumn(name = "id_library")
    private Library library;

    @Override
    public boolean equals(Object o) {

        if (o == null)
            return false;

        if (!(o instanceof User))
            return false;

        return o.equals(this) || this.email.equals(((User) o).getEmail());
    }

}