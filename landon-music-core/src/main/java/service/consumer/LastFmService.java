package service.consumer;

public class LastFmService {
    private static final String LAST_FM_ROOT_URL = "http://ws.audioscrobbler.com/2.0/";
    private static final String MB_ROOT_URL = "http://musicbrainz.org/ws/2/";
    private static final String LAST_FM_API_KEY = "479c5b7243a02e8985b3728d483882c0";


    public String search(String searchString) {
        final String method = "?method=album.search";
        String apiKey = "&api_key=" + LAST_FM_API_KEY;
        final String format = "&limit=20&format=json";
        String albumString = "&album=" + searchString;
        String response = albumString;

        return response;
    }

}
