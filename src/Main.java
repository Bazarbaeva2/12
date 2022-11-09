public class Main {
        public static void main(String[] args) {
        getInformation();



        School school = new School();
        school.setStudent("Jany");
        school.setAge(20);
        school.setGroup("Java-8");
        System.out.println(school.getStudent());
        System.out.println(school.getAge());
        System.out.println(school.getGroup());

        Car car = new Car();
        car.setNameOfCar("Toyota carolla");
        car.setYear(2001);
        car.setFuel("Electric");
        System.out.println(car.getNameOfCar());
        System.out.println(car.getYear());
        System.out.println(car.getFuel());

        Person person = new Person();
        person.setFullName("Bob Adams");
        person.setJobTitle("Manager");
        person.setFamilyStatus("Single");
        System.out.println(person.getFullName());
        System.out.println(person.getJobTitle());
        System.out.println(person.getFamilyStatus());

        University university = new University();
        university.setName("Harvard");
        university.setAddress("Cambridge, MA 02138");
        university.setYear(1683);
        System.out.println(university.getName());
        System.out.println(university.getAddress());
        System.out.println(university.getYear());

    }
     static void getInformation(){

    }


}

