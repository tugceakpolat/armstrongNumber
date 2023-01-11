import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = input.nextInt();
        int stepNum = 0; //step number
        int tempNumber=number; // temperature number
        int stepValue; // Step value number.
        int result = 0; // total

        //Find step number.
        while (tempNumber !=0){
            tempNumber /=10;
            stepNum++;
        }
        //kullanıcıdan alınan ve yukarıda hesapladığımız number sayısını tutmalıyız.
        //bu yüzden geçici olarak tempNumber'ı atıyoruz.

        tempNumber=number;

        while (tempNumber!=0){
            stepValue = tempNumber %10;
            result +=stepValue;
            tempNumber /=10;
            }

        System.out.println(result);

        }



    }

