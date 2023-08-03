package array;

import java.util.Scanner;

public class ArrayController {
	static ArrayService arrayService = new ArrayService();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("enter the size of the array");
		int size = scanner.nextInt();

		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter the element" + (i + 1));
			arr[i] = scanner.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		while (true) {
			System.out.println(
					"1.insertion \n 2.deletion \n 3.updation \n 4.search \n 5.sort \n 6.reverse \n 7.display \n 8.min \n 9.min \n 10.isEmpty \n 11.exit");
			int option = scanner.nextInt();
			switch (option) {
			case 1: {
				System.out.println("enter the inserting element");
				int ele = scanner.nextInt();
				System.out.println("enter the postion to insert new element");
				int pos = scanner.nextInt();
				arr = arrayService.insertion(arr, ele, pos);
				arrayService.display(arr);
				System.out.println();

				break;
			}
			case 2: {
				System.out.println("enter the deleting element");
				int ele = scanner.nextInt();
				arr = arrayService.deletion(arr, ele);
				arrayService.display(arr);
				System.out.println();
				break;
			}
			case 3: {
				System.out.println("enter the old element");
				int oldele = scanner.nextInt();
				System.out.println("enter the new element");
				int newele = scanner.nextInt();
				arr = arrayService.updation(arr, oldele, newele);
				arrayService.display(arr);
				System.out.println();
				break;
			}
			case 4: {
				System.out.println("enter the search element");
				int ele = scanner.nextInt();
				int b = arrayService.search(arr, ele);
				if (b == -1) {
					System.out.println("element is not present");
				} else {
					System.out.println("search element is found at position " + (b + 1));
				}
				break;
			}
			case 5: {
				arr = arrayService.sort(arr);
				arrayService.display(arr);
				System.out.println();
				break;
			}
			case 6: {
				arr = arrayService.reverse(arr);
				arrayService.display(arr);
				System.out.println();
				break;
			}
			case 7: {
				arrayService.display(arr);
				System.out.println();
				break;
			}
			case 8: {
				int a = arrayService.min(arr);
				System.out.println("minimum element in the array is " + a);
				break;
			}
			case 9: {
				int a = arrayService.max(arr);
				System.out.println("miximum element in the array is " + a);

				break;
			}
			case 10: {
				if (arrayService.isEmpty(arr)) {
					System.out.println("array is empty");
				} else {
					System.out.println("array is not empty");
				}
				System.out.println();
				break;
			}
			case 11: {
				System.exit(0);
				// return // we can use the return keyword to exit from the program
			}
			default: {
				System.out.println("please chhoose the correct option");
				break;
			}

			}

		}

	}

}
