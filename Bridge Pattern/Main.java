public class Main {
    public static void main(String[] args) {

        // Task 1
        System.out.println("===== TASK 1 =====");
        Image guest = new ProxyImage("salary_sheet.png", "GUEST");
        Image admin = new ProxyImage("salary_sheet.png", "ADMIN");
        guest.show();
        admin.show();

        // Task 2
        System.out.println("\n===== TASK 2 =====");
        Video video = new ProxyVideo("Cat_Memes.mp4");
        video.play();
        System.out.println();
        video.play();
        System.out.println();
        video.play();

        // Task 3
        System.out.println("\n===== TASK 3 =====");
        Internet internet = new SchoolProxyInternet();
        internet.connectTo("wikipedia.org");
        internet.connectTo("gaming.com");
    }
}
