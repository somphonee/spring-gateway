package co.la.booking;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/booking")
public class BookingController {
    @GetMapping("/info")
    public String getInfo() {
        return "Hello from booking Service ";
    }

    @GetMapping("/data")
    public String getData() {
        return "Some data from booking Service ";
    }
}
