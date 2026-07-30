class Itersection_of_arrays{
    public int[] intersection(int[] nums1, int[] nums2) {
    int[] items= new int[nums1.length] ;
    int k=0;
    for(int i=0; i < nums1.length; i++ )    {
        for(int j=0; j< nums2.length ; j++){
            if(nums1[i] == nums2[j]){
                boolean found = false;

                for(int x=0; x<k; x++){
                    if(items[x] == nums1[i]){
                        found = true;
                        break;
                    }
                }

                if (!found){
                    items[k] = nums1[i];
                    k++;
                }
                break;            
            }
        }
    }
    int[] result = new int[k];
    for(int i=0; i< k ; i++) {
    result[i] = items[i];
    }
    return result;
    }
}