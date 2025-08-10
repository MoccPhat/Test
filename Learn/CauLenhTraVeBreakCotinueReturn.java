package Learn;
// continue và break có thể dùng với label hoặc không
// public class CauLenhTraVeBreakCotinueReturn {
//     public static void main (String[] args){
//         // Khai báo biến
//         int out, in = 0;
//         // Vòng lặplặp
//         for(out = 0; out < 10; out++){
//             for(in = 0; in < 20; in++){
//                 if(in > 10){
//                     break;
//                 }
//             }
//               System.out.println("Ben trong vong lap: out = " +out+ " int = "+in);
//         }
//         System.out.println("Ben ngoai vong lap: out = " +out+ " int = "+in);
//     }
// }

// Sử dụng label (mot_tu_khoa + ':')
// public class CauLenhTraVeBreakCotinueReturn{
//     public static void main (String[] agrs){
//         // Khai báo biến
//         int out , in = 0;
//         // Vòng lặp
//         outer :  for(out = 0; out < 10; out++){
//             for(in = 0; in < 20; in++){
//                 if(in > 10) break outer;
//             }
//             System.out.println("Inside of the loop: out = " +out+ " in = "+in);
//         }
//         System.out.println("Outside of the loop: out = "+out+ " in = "+in);
//     }
// }

// public class CauLenhTraVeBreakCotinueReturn{
//     public static void main(String[] args) {
//        int max = 100;
//         for(int i  = 0; i < max ;i++){
//             if(i < 50) continue;
//             System.out.println(i);
//         }

//     }
// } 

// Sử dụng label
// public class CauLenhTraVeBreakCotinueReturn{
//     public static void main(String[] args) {
//        int max = 100;
//     outer: for(int out =  0; out < 10; out++){
//             for(int i  = 0; i < max ;i++){
//                if(i> 50) continue outer;
//                System.out.println(i);
//        }
//     }
//         System.out.println("The end the programing!");
//     }
// } 
public class CauLenhTraVeBreakCotinueReturn{
public static void main(String[] args) {
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=10; j++) {
				if(j > 5)
					return;
				System.out.println(i+" x "+j +" = "+(i*j));
			}
			System.out.println("---");
		}
		System.out.println("ABC");
	}
}