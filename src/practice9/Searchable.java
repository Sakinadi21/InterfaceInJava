package practice9;
// Define the package name practice9.

interface Searchable {
    boolean search(String keyword);
}
// Define an interface named Searchable with an abstract method search(String keyword).

class Document implements Searchable {
    private String content;

    // Constructor to initialize the content of the document
    public Document(String content) {
        this.content = content;
    }
    // Initialize the Document class to implement the Searchable interface.
    // Add a constructor to initialize the content of the document.

    public boolean search(String keyword) {
        return content.contains(keyword);
    }
    // Implement the search method to check if the document content contains the keyword.
}

class WebPage implements Searchable {
    private String url;
    private String htmlContent;

    // Constructor to initialize the URL and HTML content of the web page
    public WebPage(String url, String htmlContent) {
        this.url = url;
        this.htmlContent = htmlContent;
    }
    // Initialize the WebPage class to implement the Searchable interface.
    // Add a constructor to initialize the URL and HTML content of the web page.

    public boolean search(String keyword) {
        return htmlContent.contains(keyword);
    }
    // Implement the search method to check if the HTML content contains the keyword.
}

// Define the Main class with a main method that serves as the entry point for the program.
