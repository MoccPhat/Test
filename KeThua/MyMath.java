package KeThua;
public class MyMath {
    public int FindMin (int a, int b){
        if(a < b){
            return a;
        } else return b; 
    }

     public double FindMin (double a, double b){
        if(a < b){
            return a;
        } else return b; 
    }

    public double Sum (double a, double b){
        return a + b;
    }
    public double SumArr(double Arr[]){
        double Sum = 0;
        for(int i = 0; i < Arr.length; i++){
            Sum += Arr[i];
        }
        return Sum;
    }
}
