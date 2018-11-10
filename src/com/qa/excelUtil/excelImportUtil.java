package com.qa.excelUtil;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;

public class excelImportUtil
{
    static Workbook book;
    static Sheet sheet;
    public static String testDataSheetPath = "/Users/lee/eclipse-workspace/Framework/src/com/qa/testData/zaubaTest.xlsx";

    public static Object[][] getTestData(String sheetName) throws Exception
    {
        FileInputStream fis = null;
        fis= new FileInputStream(testDataSheetPath);
        book = WorkbookFactory.create(fis);
        sheet = book.getSheet(sheetName);
        Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
        System.out.println("Last row number = "+sheet.getLastRowNum());
        System.out.println("Lastcolumn number = "+sheet.getRow(0).getLastCellNum());

        for(int i=0;i<=sheet.getLastRowNum();i++)
        {
            for(int j=0;j<sheet.getRow(i).getLastCellNum();j++)
            {
                data[i][j] = sheet.getRow(i).getCell(j).toString();
            }
        }
        return data;
    }
}
