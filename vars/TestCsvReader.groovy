@Grab('com.xlson.groovycsv:groovycsv:0.2')
import com.xlson.groovycsv.CsvParser

def call()
{

    File csvFile = new File('C:\\JenkinsAutomation\\Newjob.csv')
    String fileContents = new File('C:/JenkinsAutomation/Newjob.csv').text
   List<String[]> lines = fileContents.split('\n')
    //for (def i=0;i<lines.size;i++) // specify how many line need to read eg.. 30
   // {
    //log.info file1.readLines().get(i)  

   // }
    println 'File All Text' + lines + '.'
    println 'File All Text' + fileContents + '.'

} 
