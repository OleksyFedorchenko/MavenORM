package ua.logos.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true,exclude = {"courses","teacherDetails"})
@AllArgsConstructor
@Builder

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

    @OneToOne(mappedBy = "teacher")
    private TeacherDetails teacherDetails;

}
