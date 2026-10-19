// Optimal Approaches : 
// Time Complexity : O(N)
// Space Complexity : O(1)
// iss missing element or finding single elment iss type valle quation ke liye xor method ka istamal karna 
class Solution {
    public int singleNumber(int[] nums) {
    // jab bhi unique elment valla quation aaye toh xor istemal kare 
    // solve these quation through xor used 
      int n = nums.length;
      int single = 0;
        for(int i=0;i<n;i++){
         single^=nums[i];
        }
        return single;
        
    }
}
// dry run : 
// nums[2,2,1] 
// single = 0
// i=0 ==> 0 ^ 2 = 2
// i=1 ==> 2 ^ 2 = 0
// i=2 ==> 0 ^ 1 = 1  

// Better Approaaches :
// in front of interview :
class Solution {
    public int singleNumber(int[] nums) {
        // Better Approaches : 
        // Time Complexity : O(2N)
        // Space Complexity : O(N)
        // Hashing to solve 
        // using hashing solve the quation :

         int n = nums.length;
        
         // creating the HashSet : 
         HashSet<Integer> s1 = new HashSet<>();

         for(int i=0;i<n;i++){
        
            if(s1.contains(nums[i])){
                // set me vahi element lena hai jo singal hai 
                s1.remove(nums[i]);
            }else{
                // jo singal hai usse add karna hai
                s1.add(nums[i]);
            }
         }
           
           // har singal elment ko add karna hai s1 ke andar 
           for(int num : s1){
            return num; 
           }
            
            
                return -1;
         } 

    
    }
