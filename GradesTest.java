
/*Assign Grades : write a program that reads students scores, gets best score, and then assigns
 * grades based on following scheme
 * grade is a if score is >= best -10
 * grade is b if score is >= best - 20 
 * etc
 * 
 * program prompts the user to enter the total number of students, then prompts for scores, concludes by displaying grades 
 */





public class GradesTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	java.util.Scanner input = new java.util.Scanner(System.in);
	System.out.print("Enter the number of students: ");
	int n = input.nextInt();
	double[] students = new double[n]; // create the array 
	double score = 0;
	double max = 0;
	
	
	//stores scores in the array?
	System.out.print("Enter " + n + " Scores");
		for (int i = 0; i < n; i++) {
			students[i] = input.nextDouble();
			score += students[i];
		}
		
		//Determine grade, score 
		//loop to find best max score
		for(int i = 0; i < n; i++) {
			max = Math.max(max, students[i]);
//			System.out.print(max);
			}
		
		
		//loop thru and print results 
		for(int i = 0; i < students.length; i++) {
			System.out.print("Student " + " student number " + score + n + " and grade is " + getGrade(' ', score));
		}
		
		
	}
		public static char getGrade(double students, double max, double score) {
			for(int i = 0; i < students.length; i++) {
			if (score >= max - 10) {
				return 'A';
				}
			if(score >= max - 20) {
				return 'B';
				}
			if(score >= max - 30) {
				return 'C';
				}
			if(score >= max - 30) {
				return 'D';
				}
			else {
				return 'F';
			}
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