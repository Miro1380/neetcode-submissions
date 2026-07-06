class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] products = new int[nums.length];
        int product = 1;
        for(int i = 0; i < nums.length; i++){
            products[i] = product;
            product *= nums[i];
        }
        System.out.println("Left to right Array: "+Arrays.toString(products));
        
        //for(int i )
        int rProduct = 1;
        for(int i = nums.length-1; i >= 0; i--){
            products[i] *= rProduct;
            rProduct *= nums[i];
        }

        System.out.println("After right array: "+ Arrays.toString(products));
        return products;
    }
}  
