package com.example.mindp;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.mindp.Model.Tour;
import com.example.mindp.Repository.TourRepository;

@SpringBootTest
class MindpApplicationTests {

	@Autowired
	TourRepository tourRepo;
	@Test
	public void testCreate()
	{
		Tour t= new Tour();
		t.setId(1);
		t.setName("navi");
		t.setGender("male");
		t.setAge(28);
		t.setFromPlace("tanuku");
		t.setNumberOfDaysVisits(9);
		tourRepo.save(t);
		assertNotNull(tourRepo.findById(1).get());	
	}
	@Test
	public void testAllData()
	{
		List<Tour> list=tourRepo.findAll();
		assertThat(list).size().isGreaterThan(0);
	}
	

}
