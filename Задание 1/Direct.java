package lab_11_1;

public class Direct {


    public static Article createArticle(Builder builder) {
        builder.buiderTopic();
        builder.buiderAuthor();
        builder.buiderText();
        builder.buiderHash();
        return builder.getArticle();
    }
}
