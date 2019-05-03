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
    def Person {
    String name
    Integer age
}

// use the mapper
def ctb = new CsvToBean<Person>()
def hcnms = new HeaderColumnNameMappingStrategy<Person>()
hcnms.type = Person
println ctb.parse(hcnms, new StringReader(csv))
} 
