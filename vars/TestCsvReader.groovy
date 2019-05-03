@Grab('com.xlson.groovycsv:groovycsv:0.2')
import com.xlson.groovycsv.CsvParser

//def call(String Variable ,  int index)
def call()
{
    
    //def list= []
    File csvFile = new File('C:\\JenkinsAutomation\\Newjob.csv')
    //String fileContents = new File('C:/JenkinsAutomation/Newjob.csv').text
    //List<String[]> allData = fileContents.split('\n')
    //for (def i=0;i<=allData.size;i++) // Read All Lines
    //{
        //if(allData[i].toString().contains('Variable'))
        //{
         // List<String[]> Spl = allData[i].split('=') 
          //List<String[]> parts =   Spl[1].split(',')
          //for(def j=0;j<parts.size;j++)
            //{
            //list.add(parts[j].toString()) 
            //}
        //}
    //}
    //return list[index]
   CSV.foreach('C:\\JenkinsAutomation\\Newjob.csv').map { |row| row[0] }
 println 'Attachment ' + row[0] + '.'
} 
