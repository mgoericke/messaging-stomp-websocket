package de.javamark.messaging;

public class Greeting {
    private String content;

    public Greeting() {

    }

    public Greeting(String content) {
        this.content = content;
    }
    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }
    /**
     * @param content the content to set
     */
    public void setContent(final String content) {
        this.content = content;
    }
}