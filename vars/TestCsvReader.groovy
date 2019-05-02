@Grab('com.xlson.groovycsv:groovycsv:0.2')
import com.xlson.groovycsv.CsvParser

def call()
{
    
    def list= []
    File csvFile = new File('C:\\JenkinsAutomation\\Newjob.csv')
    String fileContents = new File('C:/JenkinsAutomation/Newjob.csv').text
    List<String[]> allData = fileContents.split('\n')
    for (def i=0;i<=allData.size;i++) // Read All Lines
    {
        if(allData[i].toString().contains('EmailValue'))
        {
          List<String[]> Spl = allData[i].split('=') 
           println  ''+ Spl[0].toString()  + ''
           println  ''+ Spl[1].toString()  + ''
           println  ''+ allData[i].toString()  + ''
          List<String[]> parts =   Spl[1].split(',')
             //println  ''+ parts[0].toString() + ''
             //println  ''+ parts[1].toString() + ''
             //println  ''+ parts[2].toString() + ''
          for(def j=0;j<parts.size;j++)
            {
            list.add(parts[j].toString()) 
            }
        }
    }
    //mapList.add(tmpMap)
    println ""+list[0]
    println ""+list[1]
    println ""+list[2]
 
} 
