package Mr.Cricket.Controllers;

import Mr.Cricket.Services.CricketMatchService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@RequestMapping("/cricket")
public class CricketMatchController {
    private final CricketMatchService cricketMatchService;

    // Constructor Injection
    public CricketMatchController(CricketMatchService cricketMatchService) {
        this.cricketMatchService = cricketMatchService;
    }

    // Endpoint to fetch upcoming matches
    @GetMapping("/upcoming")
    public Map<String, Object> getUpcomingMatches() {
        return cricketMatchService.getUpcomingMatches();
    }
}



