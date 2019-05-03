@Grab('com.xlson.groovycsv:groovycsv:0.2')
import com.xlson.groovycsv.CsvParser
@Grab('net.sf.opencsv:opencsv:2.3')
import au.com.bytecode.opencsv.CSVReader
import au.com.bytecode.opencsv.bean.CsvToBean;
import au.com.bytecode.opencsv.bean.HeaderColumnNameMappingStrategy;
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
    def csv = """\
name,age
Charlie,23
Billy,64"""

// read the files and keep the first one as the header
def csvr = new CSVReader(new StringReader(csv))
def header
     println ' ' + csvr.toString() + '.'
while ((line=csvr.readNext())) {
    if (!header) {
        header = line
        println 'Attachment ' + header + '.'
    } else {
        // create a map from the header and the line
        println([header,line].transpose().collectEntries())
    }
}
} 
