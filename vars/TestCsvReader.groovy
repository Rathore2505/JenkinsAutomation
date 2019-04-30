@Grab('com.opencsv:opencsv:4.0')
@Grab('com.xlson.groovycsv:groovycsv:0.2')
import com.opencsv.CSVReader
import com.opencsv.CSVWriter
import com.xlson.groovycsv.CsvParser

def call()
{
def csv = '''Name,Lastname
Mark,Andersson
Pete,Hansen'''

def data = new CsvParser().parse(csv)
for(line in data) {
    println "$line.Name $line.Lastname"
}
     
