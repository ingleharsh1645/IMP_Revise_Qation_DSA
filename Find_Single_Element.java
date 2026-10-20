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

// Also these method used
class Solution {
    public int singleNumber(int[] nums) {
   // negative element will be not usefull but positive are usefull : 
   // create the hasharray :
   // create the hash array with 0 hash initialization 
   // find the max length of the hash array : 
   // isseme array ka used kiya hai
//     int n = nums.length;
//     int max = 0;
//     for(int i=0;i<n;i++){
//         // find the max element :
//         if(nums[i]>max){
//        // finding the maximum element :   
//         max = Math.max(max,nums[i]);
//         }
//     }

//     //create the hash array (initiallized all ): 
//     int[] hash = new int[max + 1];
//     // increment the array element count  :
//     for(int i=0;i<n;i++){
//        hash[nums[i]]++;
       
//     }
     
//     // [2,2,1]
//     // hash[]
//    for(int i=0;i<n;i++){
//     if(hash[nums[i]]==1){
//         return nums[i];
//     }
//    }
//      return -1;



// used the hasmap : 
int n = nums.length;
HashMap<Long ,Integer> map = new HashMap<>();
// har aak number ke frequency  ko count karoo 
      for(int i=0;i<n;i++){
        // add the num inside the map :
        // sbase pehele elment loo :
        long num = nums[i];
        // sabhi map ke andar se value ko add karte hai or frequency badathe hai 
        map.put(num,map.getOrDefault(num,0)+1);

      } 
      for(int i=0;i<n;i++){
        if(map.get((long) nums[i])==1){
            return nums[i];
        }
      }


      return -1;
 }
}
