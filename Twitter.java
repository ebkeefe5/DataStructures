import java.util.Map;
import java.util.HashMap;

public class Twitter
{

  //Find the first and last tweet by date
  //There could be an issue with the way this is setup
  //may need to store the dates as a list and sort the list
  //sorting is O(nlogn)
  public static void findTweets()
  {
    Map<String, Integer> tweetsByDate = new HashMap();
    tweetsByDate.put("hi", 2012);
    tweetsByDate.put("my", 2016);
    tweetsByDate.put("teddy", 2020);
    System.out.println(tweetsByDate.get("teddy"));
  }
}
