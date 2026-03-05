package TEN20251020;

import java.time.LocalDateTime;

public class Article extends Media {
    private String articleText;

    public Article(String title, String articleText) {
        super(title);
        setArticleText(articleText);
    }

    public String getArticleText() {
        return articleText;
    }

    public void setArticleText(String newText) {
        if (newText.length() > 140) {
            throw new IllegalArgumentException("Cant be more: " + articleText.length());
        }
        this.articleText = newText;
        setLastupdateNow();
    }

    public String toString() {
        return super.toString() + ", Text: " + articleText;
    }
}