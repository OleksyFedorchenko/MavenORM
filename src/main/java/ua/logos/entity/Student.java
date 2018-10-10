package ua.logos.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "students")
public class Student extends BaseEntity {

    @Column(name = "full_name", nullable = false)
    private String fullName;

    @Column(nullable = false)
    private int age;

    @ManyToMany(mappedBy = "students")
    private List<Course> courses;
}
