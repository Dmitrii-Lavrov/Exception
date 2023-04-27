public class homework_1 {   
    
    public static int [] ArrayDivision(int [] arr_1, int [] arr_2){
        if (arr_1.length != arr_2.length) {
            throw new RuntimeException("Массивы  не равны");
        }
        int [] arr_3 = new int [arr_1.length];        
        for (int i = 0; i < arr_1.length; i++) {
            if (arr_2[i] == 0){
                throw new RuntimeException("На ноль делить нельзя!"); 
            }
            arr_3[i] = arr_1[i] / arr_2[i];         
        }
        return arr_3;
    }

    public static int [] ArraySubtraction(int [] arr_1, int [] arr_2){
        if (arr_1.length != arr_2.length) {
            throw new RuntimeException("Массивы  не равны");
        }
        int [] arr_3 = new int [arr_1.length];        
        for (int i = 0; i < arr_1.length; i++) {
            
            arr_3[i] = arr_1[i] - arr_2[i];            
        
        }
        return arr_3;
    }    
        

    public static void main(String[] args) {
        
        int [] arr_1 = new int[]{110, 100, 90, 80, 70, 60, 50, 40, 30, 20};
        int [] arr_2 = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        
        
        int [] array = ArrayDivision(arr_1, arr_2);
        int [] array1 = ArraySubtraction(arr_1, arr_2);               
        
    }
    
}
