
package lab_11_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

//Задать последовательности элементов XML
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "article"
})
/*Класс предназначен для хранения экземпляров класса Article*/
//Элемент самого верхнего уровня, все остальные элементы лежат в нем
@XmlRootElement(name = "articles")
public class Articles {

    @XmlElement(required = true)
    //Список статей
    protected List<Article> article = new ArrayList<Article>();
    //Получить статью из списка
    public List<Article> getEmployment() {
        if (article == null) {
            article = new ArrayList<Article>();
        }
        return this.article;
    }

    //Добавить элемент в список
    public boolean add(Article emp) {
        return article.add(emp);
    }

    //Преопределить метод 
    @Override
    public String toString() {
        return "Articles [list=" + article + "]";
    }
}
