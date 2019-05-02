@Grab('com.xlson.groovycsv:groovycsv:0.2')
import com.xlson.groovycsv.CsvParser

def call()
{

File csvFile = new File('C:\\JenkinsAutomation\\Newjob.csv')
def data = new CsvParser().parse(csvFile)
for(line in data) {
    println 'Sending mail to ' + line + '.'
}
} 
