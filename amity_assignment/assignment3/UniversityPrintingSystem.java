// Runnable task representing a student's print job
class PrinterJob implements Runnable {
    private String studentName;
    private String documentName;
    private int pages;

    public PrinterJob(String studentName, String documentName, int pages) {
        this.studentName = studentName;
        this.documentName = documentName;
        this.pages = pages;
    }

    @Override
    public void run() {
        String printerThread = Thread.currentThread().getName();
        System.out.println("[" + printerThread + "] Started printing '" + documentName + "' (" + pages + " pages) for " + studentName + "...");

        try {
            // Simulate printing time (e.g., 400ms per page)
            for (int i = 1; i <= pages; i++) {
                Thread.sleep(400);
                System.out.println("[" + printerThread + "] " + studentName + " - Page " + i + "/" + pages + " printed.");
            }
            System.out.println("[" + printerThread + "] Completed print job for " + studentName + "!");
        } catch (InterruptedException e) {
            System.out.println("[" + printerThread + "] Print job interrupted for " + studentName);
            Thread.currentThread().interrupt();
        }
    }
}

public class UniversityPrintingSystem {
    public static void main(String[] args) {
        // Create print jobs for different students
        PrinterJob job1 = new PrinterJob("Aarav", "Java_Assignment.pdf", 3);
        PrinterJob job2 = new PrinterJob("Diya", "Lab_Report.docx", 2);
        PrinterJob job3 = new PrinterJob("Rohan", "Project_Synopsis.pdf", 4);

        // Assign each print job to a separate thread (representing university printers)
        Thread printer1 = new Thread(job1, "Printer-1");
        Thread printer2 = new Thread(job2, "Printer-2");
        Thread printer3 = new Thread(job3, "Printer-3");

        // Start all print jobs simultaneously
        printer1.start();
        printer2.start();
        printer3.start();
    }
}
