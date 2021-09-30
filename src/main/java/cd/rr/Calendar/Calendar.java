package cd.rr.Calendar;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class Calendar {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ID;
    @Column
    private String event;
//    @Column
//    private String date;
    @Column
    private String time;
    @Column
    private String location;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="personId", referencedColumnName ="ID")
    private Person host;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="dateID", referencedColumnName ="ID")
    private Date date;


}
