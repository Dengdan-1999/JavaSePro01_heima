package d1_stream;

import java.util.Objects;

public class Movie implements Comparable<Movie>{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    private String name;
    private String actor;
    private double score;

    public Movie(String name, String actor, double score) {
        this.name = name;
        this.actor = actor;
        this.score = score;
    }

    @Override
    public int compareTo(Movie o){
        if(this.score>o.score){
            return 1;
        }
        else if(this.score<o.score){
            return -1;
        }
        return 0;
    }

    @Override
    public String toString(){
        return "电影名："+this.name+", 演员："+this.actor+"评分: "+this.score;
    }
    @Override
    public boolean equals(Object m){
       if(m instanceof Movie){
           Movie m2=(Movie)m;
           if(this.name== m2.getName()){
               return true;
           }
       }

       return false;
    }
    @Override
    public int hashCode(){
        return Objects.hash(name,score,actor);
    }
}
