package com.application.QuickSorting.service;

import org.springframework.stereotype.Service;

@Service
public class Sortingservice  {
	public static void quicksort(int arr[],int low,int high) {
    int mid=(low+high)/2;
    int i= low;
    int j= high;
    int pivot=arr[mid];
    while (arr[i]<pivot)  i++;
    while(arr[j]>pivot) j--;
    if (i<=j) {
    	int temp=arr[i];
    	arr[i]=arr[j];
    	arr[j]=temp;
    	i++;
    	j--;
    }
	
	if(low<j) {
		quicksort(arr,low,j);
		}
	if (high>i) {
		quicksort(arr,i,high);
		}
}
}
