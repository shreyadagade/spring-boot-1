package com.itshaala.springboot1.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "course")

public class Course {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     @Column(name = "id")
     private int courseId;


   @Column(name = "name")
     private String courseName;


   @Column(name = "price")
     private int coursePrice;

}
