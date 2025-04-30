import java.util.Scanner;

class Teacher {
    String name;
    double baseSalary;

    public Teacher(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getInfo() {
        return "Họ tên: " + name + ", Lương cơ bản: " + baseSalary;
    }

    public double calculateSalary() {
        return baseSalary;
    }
}

class PermanentLecturer extends Teacher {
    double researchAllowance;

    public PermanentLecturer(String name, double baseSalary, double researchAllowance) {
        super(name, baseSalary);
        this.researchAllowance = researchAllowance;
    }

    public double getResearchAllowance() {
        return researchAllowance;
    }

    public void setResearchAllowance(double researchAllowance) {
        this.researchAllowance = researchAllowance;
    }

    @Override
    public String getInfo() {
        return "Họ tên: " + name + ", Lương cơ bản: " + baseSalary + ", Phụ cấp nghiên cứu: " + researchAllowance;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + researchAllowance;
    }
}

class VisitingLecturer extends Teacher {
    int teachingHours;
    double paymentPerHour;

    public VisitingLecturer(String name, double baseSalary, int teachingHours, double paymentPerHour) {
        super(name, baseSalary);
        this.teachingHours = teachingHours;
        this.paymentPerHour = paymentPerHour;
    }

    public int getTeachingHours() {
        return teachingHours;
    }

    public void setTeachingHours(int teachingHours) {
        this.teachingHours = teachingHours;
    }

    public double getPaymentPerHour() {
        return paymentPerHour;
    }

    public void setPaymentPerHour(double paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }

    @Override
    public String getInfo() {
        return "Họ tên: " + name + ", Số giờ dạy: " + teachingHours + ", Tiền mỗi giờ: " + paymentPerHour;
    }

    @Override
    public double calculateSalary() {
        return teachingHours * paymentPerHour;
    }
}

public class  INHERITANCE013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Thông tin giảng viên ---");

        for (int i = 0; i < 2; i++) {
            String lecturerType = scanner.nextLine();
            String name = scanner.nextLine();

            if (lecturerType.equals("PermanentLecturer")) {
                double baseSalary = scanner.nextDouble();
                scanner.nextLine(); // Consume newline
                double researchAllowance = scanner.nextDouble();
                scanner.nextLine(); // Consume newline
                PermanentLecturer permanentLecturer = new PermanentLecturer(name, baseSalary, researchAllowance);
                System.out.println("Loại giảng viên: Permanent");
                System.out.println("Họ tên: " + permanentLecturer.getName());
                System.out.println("Lương thực nhận: " + permanentLecturer.calculateSalary());
            } else if (lecturerType.equals("VisitingLecturer")) {
                int teachingHours = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                double paymentPerHour = scanner.nextDouble();
                scanner.nextLine(); // Consume newline
                VisitingLecturer visitingLecturer = new VisitingLecturer(name, 0, teachingHours, paymentPerHour); // Lương cơ bản không dùng cho GV thỉnh giảng
                System.out.println("Loại giảng viên: Visiting");
                System.out.println("Họ tên: " + visitingLecturer.getName());
                System.out.println("Lương thực nhận: " + visitingLecturer.calculateSalary());
            }
        }

        scanner.close();
    }
}