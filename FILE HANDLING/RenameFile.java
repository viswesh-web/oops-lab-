import java.io.File;

public class RenameFileExample {
    public static void main(String[] args) {
        // Original file
        File oldFile = new File("oldname.txt");

        // New file name
        File newFile = new File("newname.txt");

        // Attempt to rename
        if (oldFile.renameTo(newFile)) {
            System.out.println("File renamed successfully!");
        } else {
            System.out.println("Failed to rename file.");
        }
    }
}
