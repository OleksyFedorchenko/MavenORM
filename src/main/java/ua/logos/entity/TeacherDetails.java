package ua.logos.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "teacher_details")
public class TeacherDetails extends BaseEntity{

    @Column(nullable = true)
    private String hobby;

    @Column(nullable = false)
    private String country;

    @OneToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;
}
