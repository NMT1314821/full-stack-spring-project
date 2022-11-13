package com.example.mindp.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.mindp.Model.Tour;

public interface TourRepository extends JpaRepository<Tour, Integer>
{
	public List<Tour> findAllByOrderByNameDesc();

}
