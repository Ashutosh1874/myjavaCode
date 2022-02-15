package pckg;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class WriteExcel {
	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException {
		
		File f = new File("../forExcelhandling/testoutput.xls");//connection establish
		WritableWorkbook wk = Workbook.createWorkbook(f);
		WritableSheet ws = wk.createSheet("Ashutosh", 0);
		Sheet ws1 = wk.getSheet(0);
		//int r =ws1.getRows();
		//int c =ws1.getColumns();
		for (int i=0;i<5;i++)
		{
			for ( int j=0;j<5;j++)
			{
				Label L = new Label(i, j, "Ashutosh");
				ws.addCell(L);
			}
		}
		wk.write();
		wk.close();
		
	}

}
