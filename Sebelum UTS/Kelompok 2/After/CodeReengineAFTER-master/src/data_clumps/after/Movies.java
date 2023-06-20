package data_clumps.after;

import java.util.Date;

//dalam class Movies buat  constructor dan getter nya
//pisahkan method date start dan date end ke dalam 1 class bernama RentalDuration agar menjadi lebih efisien
//dalam class RentalDuration buat constructor nya dan getter nya
public class Movies {
	private String movieName;
	public Movies(String movieName){
		super();
		this.movieName = movieName;
	}
	public String getMovieName(){
		return this.movieName;
	}
}
