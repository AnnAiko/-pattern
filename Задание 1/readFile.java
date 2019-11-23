package lab_11_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class readFile {

    //Путь файла
    private String filePath = "Article.txt";

    public String article[] = new String[4];

    //Читать файл
    public void readFile() {
        File fileInput = new File(filePath);
        try {
            //Чтение файла
            FileInputStream fstream = new FileInputStream(fileInput);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            //Если файл существует
            if (fileInput.exists()) {
                String str = "";
                //Пока не конец строки
                while ((strLine = br.readLine()) != null) {
                    //str += strLine;
                    int indexTopic = strLine.indexOf("Topic");
                    int indexAuthor = strLine.indexOf("Author");
                    int indexArticle = strLine.indexOf("Article");
                    int indexHash = strLine.indexOf("Hash");
                    if (indexTopic == 0) {
                        article[0] = strLine.replaceAll("Topic:", " ").trim();
                    }
                    if (indexAuthor == 0) {
                        article[1] = strLine.replaceAll("Author:", " ").trim();
                    }
                    if (indexArticle == 0) {
                        article[2] = strLine.replaceAll("Article:", " ").trim();
                        //str = "";
                    }
                    if (indexHash == 0) {
                        article[3] = strLine.replaceAll("Hash:", " ").trim();
                    }

                }
                br.close();

                //Проверить на корректность хэш-код статьи
                Hash hash = new Hash();
                String newHash = hash.hashCode(article[0]);
                //System.out.println(newHash);

                if (hash.hashCode(article[0]).equals(article[3])) {
                    System.out.println("Хэш-код статьи корректный");
                } else {
                    System.out.println("Хэш- код статьи некорректный");
                }
            } else {
                System.out.println("Файла не найден");
            }
        } catch (IOException e) {
        }
    }
}
