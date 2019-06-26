package utils;

public class ExcelDataProvider {
    public static void main(String[] args) {
    testData();
    }

    public static void testData(){
        ExcelUtil excel = new ExcelUtil();
        int rowCount = 10;
        int colCount = 10;
        excel.getClass();

        for(int i = 1; i< rowCount;i++){
            for( int j=0; j<colCount; j++) {
                //String cellData = excel.getCellDataString(i,j);
                //System.out.println(cellData);
                System.out.println("need data sheet");
            }
            }

        }
    }

