/** /
 * Represents a project within the company.
 */
class Fitur {
    /**
     * The name of the project./
     */
    public String projectName;

    /**
     * The deadline for the project./ git add .
     *
     */
    public String projectDeadline;

    /**
     * The leader of the project.
     */
    public Employee projectLeader;

    /**
     * The budget allocated for the project.
     */
    public double budget;

    /**
     * Constructs a Project object with the given name, deadline, project leader, and budget.
     *
     * @param projectName    The name of the project.
     * @param projectDeadline  The deadline for the project.
     * @param projectLeader  The leader of the project.
     * @param budget         The budget allocated for the project.
     */
    public Fitur(String projectName, String projectDeadline, Employee projectLeader, double budget) {
        this.projectName = projectName;
        this.projectDeadline = projectDeadline;
        this.projectLeader = projectLeader;
        this.budget = budget;
    }

    /**
     * Prints the details of the project.
     */
    public void printProjectDetails() {
        System.out.println("Project Name: " + projectName);
        System.out.println("Project Deadline: " + projectDeadline);
        System.out.println("Budget: " + budget);
        projectLeader.printDetails();
    }

    /**
     * Updates the budget for the project.
     *
     * @param newBudget  The new budget for the project. //param itu untuk mendokumentasikan parameter metode
     */
    public void updateBudget(double newBudget) {
        budget = newBudget;
        System.out.println("Budget updated to: " + budget);
    }

    /**
     * Calculates the total budget used in the project.
     *
     * @return The total budget used. //untuk mendokumentasikan nilai yang dikembalikan oleh  metode jika ada
     */
    public double calculateTotalBudgetUsed() {
        // Implementasi logika untuk menghitung total budget yang telah digunakan
        return budget; // Contoh sederhana, Anda bisa mengimplementasikan logika yang lebih kompleks
    }
}