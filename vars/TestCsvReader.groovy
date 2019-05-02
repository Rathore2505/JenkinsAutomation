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
        if(allData[i].toString().contains('admin@merge.com'))
        {
          List<String[]> parts =   allData[i].split(',')
             println  ''+ parts[0].toString() + ''
             println  ''+ parts[1].toString() + ''
             println  ''+ parts[2].toString() + ''
             for(def j=0;j<parts.size;j++)
              {
              list.add(parts[j].toString()) 
                  println"Part Val "+parts[j]
              }
        }
    }
    //mapList.add(tmpMap)
    println "List Ele"+list[0]
 
} 
