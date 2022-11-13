package com.example.mindp.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mindp.Model.Tour;
import com.example.mindp.Service.TouristService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/apitour")
public class TourController 
{
	@Autowired
	private TouristService tourService;
	
	@PostMapping("/insert")
	public ResponseEntity<Tour> saveTour(@RequestBody Tour tour)
	{
		return new ResponseEntity<Tour>(tourService.saveTour(tour),HttpStatus.OK);
	}
	
	@GetMapping("/allret")
	public List<Tour>getAllTours()
	{
		return tourService.getAllTours();
	}
	
	@GetMapping("/getdesc")
	public List<Tour> getAllDesc()
	{
		return tourService.getAllDesc();
	}

}
