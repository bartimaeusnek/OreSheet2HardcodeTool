package os2hc;
//import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.bean.CsvToBeanBuilder;
//import com.opencsv.bean.StatefulBeanToCsvBuilder;

public class Main {
	private static List<String> hardcode;
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

    	//if (!(args.length >= 1))
    		//return;
    	
        String csvFile = args[0];
        String output1 = args[1];
        String output2 = args[2];
       // File F = new File();
        FileReader reader;
        FileWriter writer1,writer2;
        char newline = '\n';
        ArrayList<String> cfg = new ArrayList<String>();
        try {
            reader = new FileReader(csvFile);
            writer1 = new FileWriter(output1);
            writer2 = new FileWriter(output2);
            List<Oremix> beans = new CsvToBeanBuilder(reader).withType(Oremix.class).build().parse();
            hardcode = new Process2Hardcode(beans).run();
            for (int i=0; i<hardcode.size();i++) {
            	writer1.write(hardcode.get(i));
            	writer1.write(newline);
            }
            writer1.close();
            
            cfg.add("        mix {");
        	cfg.add(" ");
            for (int i=0; i<beans.size();i++) {
            	cfg.addAll(CFGGenerator.generateCFG(beans.get(i)));	
            }
            cfg.add("    }");
            for (int i=0; i<cfg.size();i++) {
            	writer2.write(cfg.get(i));
            	writer2.write(newline);
            }
            writer2.close();
            
            /*List<Oremix> CSV = new ArrayList();
            for (int i=0; i<96;++i) {
            	String s;
            	if (i<10)
            		 s = "0"+i;
            	else
            		s=Integer.toString(i);
            	CSV.add(SpeadsheedGenerator.BeanGenerator(SpeadsheedGenerator.GT5CFG(F,s),s));
            }
            	Writer writer = new FileWriter();
                StatefulBeanToCsvBuilder beanToCsv = new StatefulBeanToCsvBuilder(writer);
                try {
					beanToCsv.withSeparator(',').build().write(CSV);
				} catch (Exception e) {
					e.printStackTrace();
					}
                writer.close();*/
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}