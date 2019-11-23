package lab_11_1;

//Абстрактный класс - Строитель 
public abstract class Builder {

    protected Article articles = new Article();

    public Article getArticle() {
        return articles;
    }

    //Получить заколовок
    public abstract void buiderTopic();

    //Получить автор
    public abstract void buiderAuthor();

    //Получить текст
    public abstract void buiderText();

    //Получить хэш
    public abstract void buiderHash();
}
