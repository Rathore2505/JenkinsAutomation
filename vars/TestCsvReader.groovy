@Grab('com.xlson.groovycsv:groovycsv:0.2')
import com.xlson.groovycsv.CsvParser

def call()
{

    File csvFile = new File('C:\\JenkinsAutomation\\Newjob.csv')
    String fileContents = new File('C:/JenkinsAutomation/Newjob.csv').text
    List<String[]> allData = fileContents.split('\n')
    for (def i=0;i<=allData.size;i++) // Read All Lines
    {
        
        if(allData[i].toString().contains('Emilconfig'))
        {
          List<String[]> Split =   allData[i].split( )
           println '' + Split.size + '.'  
        } 
        
    } 
   
    
    
    
   //rintln 'File All Text' + fileContents + '.'

} 
