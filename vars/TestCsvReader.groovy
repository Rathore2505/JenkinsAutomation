@Grab('com.opencsv:opencsv:4.0')
import com.opencsv.CSVReader
import com.opencsv.CSVWriter

class TestCsvReader {


    static main(args) {
        def csv = '''"a","b","c"
"d","e","f"
'''
        def Reader csvFileReader = new StringReader(csv)
        def CSVReader reader = new CSVReader(csvFileReader)

        reader.iterator().each { fields ->
            writer.writeNext(fields)
        }
        reader.close()
        writer.close()
    }
}