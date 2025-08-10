package Interface;
public class SapXepChon implements SapXepInterface {

    @Override
    public void SapXepTangDan (double[] arr) {
        int n = arr.length;
        for(int i = 0; i < n - 1;i++){
        for(int j = i + 1 ; j < n;j++){
            if (arr[j] < arr[i]){
                double tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                }   
            }               
        }
    }

    @Override 
    public void SapXepGiamDan(double []arr){
        int n = arr.length;
        for(int i = 0; i < n - 1;i++){
        for(int j = i + 1 ; j < n;j++){
            if (arr[j] > arr[i]){
                double tmp = arr[j];
                arr[j] = arr[i];
                arr[i] = tmp;
                }   
            }               
        }
    }
}
