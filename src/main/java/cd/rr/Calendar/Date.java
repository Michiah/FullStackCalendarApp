package cd.rr.Calendar;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class Date{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ID;
    @Column
    private String month;
    @Column
    private String day;
    @Column
    private String year;



}
