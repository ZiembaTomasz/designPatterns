package Observer;

import com.ziembatomasz.patterns.observer.SportsNews;
import com.ziembatomasz.patterns.observer.TwitterUser;
import com.ziembatomasz.patterns.observer.WeatherNews;
import org.junit.Assert;
import org.junit.Test;

public class TwitterObserverTestSuite {
    @Test
    public void shouldUpdateTest() {
        //Given
        SportsNews sportsNews = new SportsNews();
        WeatherNews weatherNews = new WeatherNews();
        TwitterUser hayley = new TwitterUser("Hayley");
        TwitterUser maX = new TwitterUser("maX");
        TwitterUser ann = new TwitterUser("Ann");
        sportsNews.registerObserver(hayley);
        weatherNews.registerObserver(hayley);
        sportsNews.registerObserver(maX);
        weatherNews.registerObserver(maX);
        weatherNews.registerObserver(ann);
        //When
        sportsNews.addTwitt("NHL Stanley Cup!!!");
        weatherNews.addTwitt("Rain for tomorrow");
        sportsNews.addTwitt("Lewandowski scored again!!!");
        //Then
        Assert.assertEquals(3, hayley.getUpdater());
        Assert.assertEquals(3, maX.getUpdater());
        Assert.assertEquals(1, ann.getUpdater());
    }
}
