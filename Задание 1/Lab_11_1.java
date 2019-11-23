package lab_11_1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Lab_11_1 {

    public static void main(String[] args) {
        Article a1 = Direct.createArticle(new ConcretBuilder());

        //Маршализация 
        try {

            JAXBContext context = JAXBContext.newInstance(Articles.class);
            Marshaller m = context.createMarshaller();
            //Анонимный класс
            Articles emp = new Articles() {
                {
                    this.add(a1);
                }
            };
            m.marshal(emp, new FileOutputStream("xmlArticle.xml"));
            //m.marshal(emp, System.out);
            System.out.println("XML-файл создан");
        } catch (FileNotFoundException e) {
            System.out.println("XML-файл не может быть создан: " + e);
        } catch (JAXBException e) {
            System.out.println("JAXB-контекст ошибочен " + e);
        }
    }
}
