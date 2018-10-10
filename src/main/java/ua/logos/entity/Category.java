package ua.logos.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "categories")
public class Category extends BaseEntity {
    @Column(nullable = false, length = 50, unique = true)
    private String name;

    @OneToMany(mappedBy = "category")
    private List<Course> courses;

}
