package pkg;

public class Movie{
    String movieName;
    double rating;
    int numRating;
    int revenue;
    
    public Movie(){
        movieName = "Avengers";
        rating = 8.0;
        numRating = 33;
        revenue = 623357910;
    }
    
    public Movie(String a, double b, int c, int d){
        movieName = a;
        rating = b;
        numRating = c;
        revenue = d;
    }
    
    public void movieToString(){
        System.out.println("Movie: " + movieName);
        System.out.println("Rating " + rating);
        System.out.println("Number of Ratings: " + numRating);
        System.out.println("Revenue: " + revenue);
        System.out.println("");
    }

    public String getMovieName(){
        return this.movieName;
    }
    
    public int getRevenue(){
        return this.revenue;
    }
    
    public double getRating(){
        return this.rating;
    }
    
    public double addRating(double sakura){
        this.numRating = numRating + 1;
        this.rating = (rating * (numRating - 1) + sakura) / (numRating + 1);
        return rating;
    }
    /*
   public boolean compareRatings(Movie){
       return getRating() > getRating();
   }*/

    public String revenueToString(){
        int x = (revenue / 1000000 - revenue % 10);
        int y = (revenue - ((revenue / 1000000 - revenue % 10)*1000000));
        int s = ((revenue / 100 - revenue % 100));

        String z = (x + "," + y + "," + s);
        return z;
    }
        
    
}
