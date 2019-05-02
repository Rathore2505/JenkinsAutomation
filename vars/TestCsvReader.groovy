@Grab('com.xlson.groovycsv:groovycsv:0.2')
import com.xlson.groovycsv.CsvParser

def call()
{

File csvFile = new File('C:\\JenkinsAutomation\\Newjob.csv')
String fileContents = new File('C:/JenkinsAutomation/Newjob.csv').text
    println 'Sending mail to ' + fileContents + '.'

} 
