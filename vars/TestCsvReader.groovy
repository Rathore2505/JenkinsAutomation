Grab('org.apache.commons:commons-csv:1.2')
import org.apache.commons.csv.CSVParser
import static org.apache.commons.csv.CSVFormat.*
import java.nio.file.Paths

def call()
{

File csvFile = new File('C:\\JenkinsAutomation\\Newjob.csv')
Paths.get(csvFile').withReader
    { reader ->
    CSVParser csv = new CSVParser(reader, DEFAULT.withHeader())
        for (record in csv.iterator())
        {
        println record.dump()
        }
}

} 
