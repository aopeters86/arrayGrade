
/*Assign Grades : write a program that reads students scores, gets best score, and then assigns
 * grades based on following scheme
 * grade is a if score is >= best -10
 * grade is b if score is >= best - 20 
 * etc
 * 
 * program prompts the user to enter the total number of students, then prompts for scores, concludes by displaying grades 
 */





public class GradesTestString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	java.util.Scanner input = new java.util.Scanner(System.in);
	System.out.print("Enter the number of students: ");
	int n = input.nextInt();
	int[] students = new int[n]; // create the array 
	int best = 0;
	
	
	//stores scores in the array?
	System.out.print("Enter " + n + " Scores");
	
		for (int i = 0; i < students.length; i++) {
			students[i] = input.nextInt();
			if (best < students[i])
			best = students[i];
		}
		
		//Determine grade, score 
		//loop to find best max score
		for(int i = 0; i < students.length; i++) {
			best = Math.max(best, students[i]);
			//System.out.print(best);
			}
	//}
		
//		public static String getGrades(String score, String max){
		char grades;
		for(int i = 0; i < students.length; i++) {
			if (students[i] >= best - 10)
				grades = 'A';	
			else if (students[i] >= best - 20)
				grades = 'B';
			else if (students[i] >= best - 30)
				grades = 'C';
			else if (students[i] >= best - 40)
				grades = 'D';
			else
				grades = 'F';
//		}
//		
		
		

			System.out.println("Student " + i +"Score is " + students[i]+ " " + grades);
//			
	
		
		
	}
	
		//need to loop array to find max number then determine score for rest of them based on best score
		
		
		//need cases? if best score - 10 = A
		//need cases? if best score - 20 = b
		//need cases? if best score - 30 = c
		//need cases? if best score - 40 = d
		//need cases? otherwise f
		
		
		
		
		
		
		
		
		
		
		
		//loop results for max
		//System.out.print(max);
		
}
}


//for(int i = 0; i < students.length; i++) {
//	System.out.print(students[i] + " ll");
//}