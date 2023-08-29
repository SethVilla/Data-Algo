package module.one;

import java.util.*;

public class InheritancePolymorphismTester {

	public static void main(String[] args) {
		
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("Sally", "Studier", 1234));
		studentList.add(new GradStudent("Greta", "Grad", 4671, "The Fun of Java"));
		studentList.add(new Student("Pete", "Procrastinator", 5264));
		studentList.add(new GradStudent("Ursula", "Undeclared", 1567));
		studentList.add(new Student("Alan", "Asksalot", 3671));	
		studentList.add(new GradStudent("Constance", "Considering", 2987));
		
		for(Student student : studentList) {
			System.out.println(student.toString());
			student.enroll();
			student.graduate();
			System.out.println();
		}
		
		
		List<GradStudent> undeclaredGradStudents = new ArrayList<GradStudent>();
		
		for(Student student : studentList) {
			if(student instanceof GradStudent) {
				GradStudent gradStudent = (GradStudent) student;
				boolean declared = gradStudent.isThesisTopicDeclared();
				
				//boolean declared = ((GradStudent) student).isThesisTopicDeclared();
				// if only using the casted object once, you could just cast inline rather than declare a local variable
				
				if(!declared) {
					undeclaredGradStudents.add(gradStudent);
				}
			}
		}
		System.out.println("Undeclared grad students\n" + undeclaredGradStudents);
		
		
		
	}

}
