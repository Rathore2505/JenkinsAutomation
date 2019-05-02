@Grab('com.xlson.groovycsv:groovycsv:0.2')
import com.xlson.groovycsv.CsvParser

def call()
{

    File csvFile = new File('C:\\JenkinsAutomation\\Newjob.csv')
    String fileContents = new File('C:/JenkinsAutomation/Newjob.csv').text
    List<String[]> allData = fileContents.split('\n')
    //for (String[] row : allData)
    //{ 
     //for (String cell : row)
        //{ 
        //  println '' + cell + '.'
        //} 
      
    //} 
   println '' + allData.size + '.'
   //rintln 'File All Text' + fileContents + '.'

} 
