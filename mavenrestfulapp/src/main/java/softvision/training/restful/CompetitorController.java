package softvision.training.restful;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class CompetitorController {

    private static String presentation = "Competitor name is, %!";
    private final AtomicLong idPosition = new AtomicLong();


    @RequestMapping("/competitor")
    public Competitor competitor(@RequestParam(value = "competitorName", defaultValue = "missed") String competitorName) {
        return new Competitor(idPosition.incrementAndGet(), String.format(presentation, competitorName));
    }

}
