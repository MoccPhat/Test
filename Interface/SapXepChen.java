package Interface;
public class SapXepChen implements SapXepInterface{
    
    @Override 
    public void SapXepTangDan (double []arr){
        int n = arr.length;
        int i, j;
        for (i = 1; i < n; i++) {
            double key = arr[i];        // Phần tử cần chèn
            j = i - 1;
            // Di chuyển phần tử lớn hơn key sang phải
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key; // Chèn key vào đúng vị trí
        }
    }

    @Override 
    public void SapXepGiamDan (double [] arr){
        int n = arr.length;
        int i, j;
        for (i = 1; i < n; i++) {
            double key = arr[i];        // Phần tử cần chèn
            j = i - 1;
            // Di chuyển phần tử lớn hơn key sang phải
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key; // Chèn key vào đúng vị trí
        }
    }
}
