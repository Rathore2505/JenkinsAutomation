@Grab('com.opencsv:opencsv:4.0')
import com.opencsv.CSVReader
import com.opencsv.CSVWriter

class TestCsvReader 
      //csv file containing data
      string strFile = 'C:\JenkinsAutomation\Newjob.csv'
      CSVReader reader = new CSVReader(new FileReader(strFile));
      String [] nextLine;
      int lineNumber = 0;
      while ((nextLine = reader.readNext()) != null) {
        lineNumber++;
        System.out.println("Line # " + lineNumber);

        // nextLine[] is an array of values from the line
        System.out.println(nextLine[4] + "etc...");
      }
    }
  }
}
