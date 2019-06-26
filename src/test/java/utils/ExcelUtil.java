package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
    static String projectPath;
    static XSSFWorkbook workbook;
    static XSSFSheet sheet;
    public static void main(String[] args) {
        getRowCount();
        getCellData();
    }

    public static void getRowCount(){
        try {
            projectPath = System.getProperty("user.dir");
            workbook = new XSSFWorkbook(projectPath+ "\\excel\\data.xlsx");
            sheet = workbook.getSheet("Sheet1");
            int rowCount = sheet.getPhysicalNumberOfRows();
            System.out.println("No of rows : "+rowCount);
        } catch(Exception exp){
            System.out.println(exp.getMessage());
            exp.getCause();
            exp.getStackTrace();
        }
    }

    public static void getCellData(){
        try {
            projectPath = System.getProperty("user.dir");
            workbook = new XSSFWorkbook(projectPath+ "\\excel\\data.xlsx");
            String cellData = sheet.getRow(0).getCell(0).getStringCellValue();
            System.out.println("cellData : "+cellData);
        } catch(Exception exp){
            System.out.println(exp.getMessage());
            exp.getCause();
            exp.getStackTrace();
        }
    }

    }

