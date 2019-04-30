@Grab('com.opencsv:opencsv:4.0')
@Grab('com.xlson.groovycsv:groovycsv:0.2')
import com.opencsv.CSVReader
import com.opencsv.CSVWriter
import com.xlson.groovycsv.CsvParser

def call()
{
def mapList = []

File csvFile = new File("C:\JenkinsAutomation\Newjob.csv")

csvFile.eachLine { line ->
    def parts = line.split(",")
    def tmpMap = [:]

    tmpMap.putAt("Sno", parts[0])
    tmpMap.putAt("Service", parts[1])
   

    mapList.add(tmpMap)
    //println 'Sending mail to ' + mapList + '.'
} 
