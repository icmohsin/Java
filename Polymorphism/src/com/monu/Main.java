package com.monu;

    class Movie{
        private String name;

        public Movie (String name){
           this.name = name;
        }

        public String plot(){
            return "Plot from main class";
        }

        public String getName() {
            return name;
        }
    }

    class Movie1 extends Movie{
        public Movie1() {
            super("Movie1");
        }
        public String plot(){
            return "Movie1 plot";
        }
    }

    class Movie2 extends Movie{
        public Movie2() {
            super("Movie2");
        }

        @Override
        public String plot() {
            return "Movie2 Plot";
        }
    }

     class Movie3 extends Movie{
         public Movie3() {
             super("Movie3");
         }

         @Override
         public String plot() {
             return "Movie3 Plot";
         }
     }

     class NoMovie extends Movie{
        public NoMovie(){
            super("No movies");
        }

         @Override
         public String getName() {
             return "No Movies are there";
         }
     }

public class Main {
    public static void main(String[] args) {
	// write your code here
    for (int i=1;i<11;i++){
        Movie movie = randomMovies() ;
        System.out.println("Movie numbwe : " + i +"\n" + movie.getName()+"\n"+movie.plot());
        }

    }

    public  static Movie randomMovies(){
        int randomNumber = (int) (Math.random()*4)+1;
        System.out.println("random number genrated is " + randomNumber);
        switch (randomNumber){
            case 1:
                return new Movie1();
            case 2:
                return new Movie2();
            case 3:
                return new Movie3();
            case 4:
                return new NoMovie();
        }
        return null;
    }

}
