package com.model;

public class Movie {

	
	private String name;
	private double rating;
	private String Hero;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	public String getHero() {
		return Hero;
	}
	public void setHero(String hero) {
		Hero = hero;
	}
	@Override
	public String toString() {
		return "Movie [name=" + name + ", rating=" + rating + ", Hero=" + Hero + "]";
	}
	
	
	
}
