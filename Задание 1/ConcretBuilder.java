package lab_11_1;

public class ConcretBuilder extends Builder {

    readFile read = new readFile();

    ConcretBuilder() {
        read.readFile();
    }

    @Override
    public void buiderTopic() {
        articles.setTopic(read.article[0]);
    }

    @Override
    public void buiderAuthor() {
        articles.setAuthor(read.article[1]);
    }

    @Override
    public void buiderText() {
        articles.setText(read.article[2]);
    }

    @Override
    public void buiderHash() {
        articles.setHash(read.article[3]);
    }

}
