package binarySearchEasyArrays;

public class Koko_eating_banana {

	public static void main(String[] args) {
		 int[] v = {7, 15, 6, 3};
	        int h = 8;
	        int ans = minEatingSpeed(v, h);
	        System.out.println("Koko should eat at least " + ans + " bananas/hr.");
	    }
	
	    public static int findMax(int[] piles){
	    	//to find the max element of the given array
	        int n = piles.length;
	        int maxi = Integer.MIN_VALUE;
	        for(int i = 0; i < n; i++){
	            maxi = Math.max(maxi, piles[i]);
	        }
	        return maxi;
	    }
	    public static int calculateTotalHour(int[] piles, int mid){
	        //to find total time taken to consume -> no. of bananas/hr
	        int totalHour = 0;
	        int n = piles.length;
	        for(int i = 0; i < n; i++){
	            totalHour += Math.ceil((double)piles[i]/(double)mid);
	        }
	        return totalHour;
	    }
	    public static int minEatingSpeed(int[] piles, int h) {
	        int low = 1, high = findMax(piles);
	        while(low <= high){
	            int mid = low+(high - low)/2;
	            int totalHour = calculateTotalHour(piles, mid);
	            if(totalHour <= h) {
	                high = mid-1;//as we've to chk minimum number so it'll go left
	            }
	            else{
	                low = mid+1;//totalHour > h
	            } 
	        }
	        return low;
	    }
	
	}


