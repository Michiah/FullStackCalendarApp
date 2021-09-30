package cd.rr.Calendar;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ID;
    @Column
    private String name;
    @Column
    private String email;



}
