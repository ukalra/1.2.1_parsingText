public class MediaLib
{
    // instance variables - replace the example below with your own
    private static double totalCost;
    private static int numSongs;
    private static int totalRatings;
    private static double averageCost;
    private static double averageRat;
    public MediaLib()
    {
        // initialise instance variable
        numSongs = 0;
    }
    public static void main(){
        
        Song s1 = new Song(10, 70.0, "Computer Love");   
        numSongs++;
        Song s2 = new Song(9, 60.0, "Can You Stand the Rain");    
        numSongs++;
        Song s3 = new Song(5, 40.0, "Everybody wants to rule the World");     
        numSongs++;
        MediaFile.writeString(s1.getTitle() + " | " + s1.getRating());
        MediaFile.writeString(s2.getTitle() + " | " + s2.getRating());
        MediaFile.writeString(s3.getTitle() + " | " + s3.getRating());
        MediaFile.saveAndClose();
        Movie m1 = new Movie(15, "Kingsman", 6);
        Book b1 = new Book(4, "Harry Potter");
        System.out.println(s1.getTitle() + " & rating " + Integer.toString(s1.getRating()) + " & price " + Double.toString(s1.getPrice()));
        System.out.println(s2.getTitle() + " & rating " + Integer.toString(s2.getRating()) + " & price " + Double.toString(s2.getPrice()));
        System.out.println(s3.getTitle() + " & rating " + Integer.toString(s3.getRating()) + " & price " + Double.toString(s3.getPrice()));
        totalCost = s1.getPrice() + s2.getPrice() + s3.getPrice();
        totalRatings = s1.getRating() + s2.getRating() + s3.getRating();
        System.out.println("total Cost: " + totalCost);
        System.out.println("Num Songs: " + numSongs);
        System.out.println("total Rating: " + totalRatings);
        averageCost = totalCost/numSongs;
        System.out.println("average song cost:" + averageCost);
        averageRat = totalRatings/numSongs;
        System.out.println("average rating: "+(int)averageRat);
        System.out.println(m1.getTitle() + " length(Hr): " + Double.toString(m1.getDurationH()));
        System.out.println(m1.getTitle() + " length(Min): " + Double.toString(m1.getDurationM()));
    }
    public static int getNum(){
        return numSongs;
    }
}
