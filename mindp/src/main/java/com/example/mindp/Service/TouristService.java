package com.example.mindp.Service;

import java.util.List;

import com.example.mindp.Model.Tour;

public interface TouristService
{
	Tour saveTour(Tour tour);
	
	List<Tour> getAllTours();
	
	List<Tour> getAllDesc();

}
