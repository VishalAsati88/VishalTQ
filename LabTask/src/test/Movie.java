package test;

import java.awt.List;
import java.util.ArrayList;

public class Movie {
	 int movieId;
	 String movieName;
	 Actor actor;

	public Movie()
	{
	super();
	}
	public Movie(int movieId, String movieName, Actor actor) {
	this.movieId = movieId;
	this.movieName = movieName;
	this.actor = actor;
	}


	public int getMovieId()
	{
	return movieId;
	}
	public String getMovieName()
	{
	return movieName;
	}
	public Actor getActor()
	{
	return actor;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", actor=" + actor + "]";
	}
	public static void main (String args[])
	{



	}



}
