package ua.logos.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "teachers")
public class Teacher extends BaseEntity {
    @Column(name = "first_name", length = 45, nullable = false)
    private String firstName;

    @Column(name = "last_name", length = 45, nullable = false)
    private String lastName;

    @Column(length = 80, nullable = false, unique = true)
    private String email;

    private int age;

    @OneToMany(mappedBy = "teacher")
    private List<Course> courses;
}
