package com.example.mindp.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mindp.Model.Tour;
import com.example.mindp.Repository.TourRepository;
import com.example.mindp.Service.TouristService;

@Service
public class TouristImpl implements TouristService
{

	@Autowired
	private TourRepository tourRepository;
	@Override
	public Tour saveTour(Tour tour) 
	{
		
		return tourRepository.save(tour);
	}
	@Override
	public List<Tour> getAllTours() 
	{
		// TODO Auto-generated method stub
		return tourRepository.findAll();
	}
	@Override
	public List<Tour> getAllDesc() 
	{
		
		return tourRepository.findAllByOrderByNameDesc();
	}

	

}
