package ca.ualberta.cs.lonelytwitter;

public class getTweet extends LonelyTwitterActivity {
// return list of tweets in chronological order
    //get tweets from bodytext
    loadFromFile();
    //display tweets
    //sort tweets by date

    //from https://stackoverflow.com/questions/5927109/sort-objects-in-arraylist-by-date
    public static class MyObject implements Comparable<MyObject> {

        @Override
        public int compareTo(MyObject o) {
            return tweets.compareTo(o.getDate());
        }
    }
}