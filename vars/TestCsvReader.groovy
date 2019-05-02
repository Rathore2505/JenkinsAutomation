Grab('org.apache.commons:commons-csv:1.2')
import org.apache.commons.csv.CSVParser
import static org.apache.commons.csv.CSVFormat.*
import java.nio.file.Paths

def call()
{

File csvFile = new File('C:\\JenkinsAutomation\\Newjob.csv')
def data = new CsvParser().parse(csvFile)
for(line in data) {
    println 'Sending mail to ' + line + '.'
}
} 
