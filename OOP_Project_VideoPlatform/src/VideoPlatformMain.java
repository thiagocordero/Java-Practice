
public class VideoPlatformMain {

	public static void main(String[] args) {
		
		Video unit1[] = new Video[4];
		unit1[0] = new Video("Lesson 1");
		unit1[1] = new Video("Lesson 2");
		unit1[2] = new Video("Lesson 3");
		unit1[3] = new Video("Lesson 4");
		
		Student studentsList[] = new Student[2];
		studentsList[0] = new Student("Thiago", 27, "Male", "teacherthiago");
		studentsList[1] = new Student("User01", 35, "Non-binary", "user01");
		
		WatchVideo watch[] = new WatchVideo[5];
		watch[0] = new WatchVideo(studentsList[0], unit1[0]);
		watch[0].evaluate();
		System.out.println(watch[0].toString());
		
		watch[1] = new WatchVideo(studentsList[0], unit1[1]);
		watch[0].evaluate(77.8f);
		System.out.println(watch[1].toString());
		
		/*
		System.out.println("VIDEOS - UNIT 1 \n------------------------------");
		System.out.println(unit1[0].toString());
		System.out.println(unit1[1].toString());
		System.out.println(unit1[2].toString());
		System.out.println(unit1[3].toString());
		System.out.println();
		System.out.println("STUDENTS \n------------------------------");
		System.out.println(studentsList[0].toString());
		System.out.println(studentsList[1].toString());
		System.out.println();
		*/
		
	
		
		
		

	}

}
