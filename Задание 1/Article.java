package lab_11_1;

//Создаваемый объект
//POJO - Статья
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

//Задать последовательности элементов XML
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Article", propOrder = {
    "topic",
    "author",
    "text",
    "hash"
})
public class Article {

    @XmlElement(required = true)
    private String topic;
    @XmlElement(required = true)
    private String author;
    @XmlElement(required = true)
    private String text;
    @XmlElement(required = true)
    private String hash;

    //Необходим для маршаллизации/демаршалиизации XML
    public Article() {
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    @Override
    public String toString() {
        return "\nГруппа: " + topic + "\nКол-во студентов: " + author
                + text + hash;
    }
}
