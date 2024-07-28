package practice9;

public class Main {
    public static void main(String[] args) {
        Document document = new Document("This is a sample document.");
        // Create a new Document object with the given content.

        boolean documentContainsKeyword = document.search("sample");
        // Check if the document contains the keyword "sample" and store the result.

        System.out.println("Document contains 'sample': " + documentContainsKeyword);
        // Print the result of the search.

        WebPage webPage = new WebPage("http://example.com", "<html>This is a sample web page.</html>");
        // Create a new WebPage object with the given URL and HTML content.

        boolean webPageContainsKeyword = webPage.search("sample");
        // Check if the web page contains the keyword "sample" and store the result.

        System.out.println("WebPage contains 'sample': " + webPageContainsKeyword);
        // Print the result of the search.
    }
}
