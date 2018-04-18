
public class Main {

	public static void main(String[] args) {
		Phone myphone = new Phone();
		myphone.nummer = 5597;
		
		CourseSlide prog1 = new CourseSlide();
		prog1.naam = "Programmeren 1";
		prog1.beschrijving = "Introductie Java programmeren";
		CourseSlide sr = new CourseSlide();
		sr.naam = "Smart Requirements";
		sr.beschrijving = "Requirements course for foreign students";
		CourseSlide se3 = new CourseSlide();
		se3.naam = "Software Engineering 3";
		se3.beschrijving = "AGILE ontwikkelmethodes";
		
		Laptop mylaptop = new Laptop();
		mylaptop.merk = "Dell";
		mylaptop.addCourseSlide(prog1);
		mylaptop.addCourseSlide(sr);
		mylaptop.addCourseSlide(se3);
		
		Teacher jasper = new Teacher();
		jasper.naam = "jasper";
		jasper.phone = myphone;
		jasper.laptop = mylaptop;
		
		System.out.println("Naam: " + jasper.naam);
		System.out.println("Telefoonnummer " +myphone.nummer);
		System.out.println("Laptopmerk " +jasper.laptop);
		
		return;
	}

}
