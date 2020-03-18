package fr.kevinleturc.java.record;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public Map<String, Integer> getPoint() {
        // return a map because jackson doesn't support record yet
        return new Point(10, 50).toMap();
    }

}
