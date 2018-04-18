
public class Laptop {
	String merk = "";
	CourseSlide [] slides = new CourseSlide[3];
	
	void addCourseSlide (CourseSlide courseSlide) {
		int counter = 0;
		while (counter < slides.length){
			if (slides[counter] == null){
				slides[counter] = courseSlide;
				return;
			}
			counter++;
			}
		System.out.println("Er zijn geen lege plekken meer");
		}
	}
	
