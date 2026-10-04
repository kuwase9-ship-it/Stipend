public class stipend {
    static abstract class Student {

        public abstract double calculateMonthlyStipend();
    }
    static class UndergraduateStudent extends Student {

        private double gpa;

        public UndergraduateStudent(double gpa) {
            this.gpa = gpa;
        }

        @Override
        public double calculateMonthlyStipend() {

            double stipend = 500;

            if (gpa > 3.5) {
                stipend = stipend + 150;
            }

            return stipend;
        }
    }
    static class GraduateStudent extends Student {

        private double taHours;
        private double yearlyResearchGrant;

        public GraduateStudent(double taHours, double yearlyResearchGrant) {
            this.taHours = taHours;
            this.yearlyResearchGrant = yearlyResearchGrant;
        }

        @Override
        public double calculateMonthlyStipend() {

            double stipend = 1200;

            stipend = stipend + (taHours * 25);

            stipend = stipend + (yearlyResearchGrant / 12);

            return stipend;
        }
    }
    public static void main(String[] args) {

        Student undergraduate = new UndergraduateStudent(3.8);

        Student graduate = new GraduateStudent(20, 12000);

        System.out.println("Undergraduate stipend: $"
                + undergraduate.calculateMonthlyStipend());

        System.out.println("Graduate stipend: $"
                + graduate.calculateMonthlyStipend());
    }
}