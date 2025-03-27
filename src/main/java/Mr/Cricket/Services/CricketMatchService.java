package Mr.Cricket.Services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Map;

@Service
public class CricketMatchService {
    private static final String API_URL = "https://api.cricapi.com/v1/matches?apikey=5d45a30d-63c7-405c-a2c8-c2ae266de0b6";

    private final RestTemplate restTemplate;

    public CricketMatchService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Map<String, Object> getUpcomingMatches() {
        return restTemplate.getForObject(API_URL, Map.class);
    }
}


