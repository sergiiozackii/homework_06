package _05;
// 1.Найти индекс элемента, значение которого равно 15

//    public class myArray {
//    public static void main(String[] args) {
//        int[] myArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
//        findElementByValue(myArray);
//    }
//    public static int findElementByValue(int[] arr) {
//        int n = 15;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == n) {
//                System.out.println("Индекс элемента - " + i + " - Значение - " + arr[i]);
//            }
//        }
//        return n;
//    }
//}

// 2.То же самое, но чтобы 15 не было в массиве, т е пройтись по всем элементам,
// ничего не найти и вывести в консоль, что ничего не нашли. Сделать с помощью for.

//    public class myArray {
//    public static void main(String[] args) {
//        int[] myArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
//        {
//        int n = 15;
//        for (int i = 0; i < myArray.length; i++) {
//            if (myArray[i] == n) {
//                System.out.println("Индекс элемента - " + i + " - Значение - " + myArray[i]);
//            }else if(n>14){
//                    System.out.println("Значение элемента не найдено");
//                    break;
//                }
//            }
//        }
//            {
//    }
//}}

//2.1 То же самое, но чтобы 15 не было в массиве, т е пройтись по всем элементам,
// ничего не найти и вывести в консоль, что ничего не нашли. Сделать с помощью while.

//   public class myArray {
//    public static void main(String[] args) {
//        int[] myArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
//        {
//        int n = 15;
//        while (++n < myArray.length) {
//                System.out.println("Индекс элемента - " + n + " - Значение - " + myArray[n]);}
//            { System.out.println("Значение элемента не найдено");}}}}


// 3.Пройтись по массиву и напечатать каждый 2й элемент в консоль.
//       public class myArray{
//        public  static void main(String[]args) {
//            int[] myArray = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
//            for (int i = 0; i < myArray.length; i++) {
//              if((i%2) !=0){
//                System.out.println(myArray[i]);
//            }
//        }}}


// 4. Найти максимальный элемент в массиве.
//    public class myArray{
//        public  static void main(String[]args){
//            int[] myArray = { 1, 2, 3, 4, 5, 6,7,8,9,10,11,12,13,14,15 };
//            int indexOfMax = 0;
//            for (int i = 0; i < myArray.length; i++)
//
//                if (myArray[i] > myArray[indexOfMax])
//                {
//                    indexOfMax = i;
//                }
//            System.out.println(indexOfMax+1);
//        }}

// 5. Вывести все элементы на консоль по порядку в формате [1,2,3,4,5]
//       public class myArray{
//        public  static void main(String[]args) {
//            int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};{
//                System.out.print("[");
//                for(int i=0; i<myArray.length;i++){
//                    if (i ==myArray.length -1)
//                        System.out.print(myArray[i]+"]");
//                    else
//                        System.out.print(myArray[i]+",");
//                }
//              }}}
//  6. Тоже самое только в обратном порядке.

//public class myArray{
////    public  static void main(String[]args) {
////        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};{
////            System.out.print("[");
////            for(int i=myArray.length - 1; i != -1;i--){
////                if (i ==0)
////                    System.out.print(myArray[i]+"]");
////                else
////                    System.out.print(myArray[i]+",");
////            }
////        }}}