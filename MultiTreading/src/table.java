import java.io.FileWriter;
import java.io.IOException;

public class table {
    public static void main(String[] args) {
        StringBuilder html = new StringBuilder();
        html.append("<html><head><style>")
                .append("table { width: 100%; border-collapse: collapse; }")
                .append("td { border: 1px solid black; height: 60px; vertical-align: top; padding: 5px; }") // Высота +20%
                .append(".num { color: red; font-size: 24px; font-family: Arial; }")
                .append("</style></head><body><table>");

        int count = 1;
        for (int i = 0; i < 25; i++) { // 25 рядов по 8 колонок = 200
            html.append("<tr>");
            for (int j = 0; j < 8; j++) {
                html.append("<td><span class='num'>").append(count++).append("</span></td>");
            }
            html.append("</tr>");
        }

        html.append("</table></body></html>");

        try (FileWriter writer = new FileWriter("table200.html")) {
            writer.write(html.toString());
            System.out.println("Файл table200.html успешно создан! Открой его в браузере и сохрани как фото или PDF.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
