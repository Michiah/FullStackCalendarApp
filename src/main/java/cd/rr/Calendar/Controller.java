package cd.rr.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private CalendarRepository calendarRepository;

    @GetMapping("/")
    public String partyTime() {
        return "Pool Party!!";
    }

    @GetMapping("/events")
    public List<Calendar> read() {
        return calendarRepository.findAll();// going to the database and selecting all. (SQL)
    }

    @PostMapping("/invite")
    public Calendar invite(@RequestBody Calendar event) {
        return calendarRepository.save(event);

    }

    @PutMapping("/changeDate")
    public Calendar postPone(@RequestBody Calendar event) {
        return calendarRepository.save(event);
    }

    @DeleteMapping("/cancel")
    public String cancel(@RequestBody Calendar event) {
        calendarRepository.delete(event);
        return "Event removed from calendar";
    }
}