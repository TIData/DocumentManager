
package domein;

/**
 *
 * @author sebastiaan
 */
public class DocumentFactory {
    public static Document createDocument(String filePath)
    {
        if (filePath.endsWith(".xls")) {
            return new Spreadsheet(filePath);
        } else {
            return new Presentation(filePath);
        }
    }
}
