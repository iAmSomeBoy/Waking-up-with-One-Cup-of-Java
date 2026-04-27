import java.util.*;

class Patient {
    String name;
    int priority; // 1 = highest emergency

    Patient(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return name + " (priority " + priority + ")";
    }
}

public class _03_PriorityQueueHospital {
    public static void main(String[] args) {
        // Smaller priority number comes first
        PriorityQueue<Patient> pq = new PriorityQueue<>(Comparator.comparingInt(p -> p.priority));
        Scanner sc = new Scanner(System.in);

        System.out.print("How many patients arrived? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Patient name: ");
            String name = sc.nextLine();

            System.out.print("Priority (1-5): ");
            int p = sc.nextInt();
            sc.nextLine();

            pq.offer(new Patient(name, p));
        }

        System.out.println("\nTreatment order:");
        while (!pq.isEmpty()) {
            System.out.println("Treating: " + pq.poll());
        }

        sc.close();
    }
}