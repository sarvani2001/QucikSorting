package com.application.QuickSorting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
//import java.security.Provider.Service;
import com.application.QuickSorting.service.Sortingservice;

@RestController
public class Sortingcontroller {
	@Autowired
    Sortingservice Sorting;

    @GetMapping("/sort")
    public int[] bsort(@RequestBody int[] array) {
	Sorting.quicksort(array, 0, (array.length-1));
	return array;
}
}