/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.csvmanl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import csvManager.Program
import csvManager.Instruction
import csvManager.Show
import csvManager.Load
import csvManager.Create
import csvManager.Where
import java.util.concurrent.locks.Condition
import csvManager.Update
import csvManager.Add
import csvManager.Exit
import csvManager.Delete
import csvManager.Join
import csvManager.Copy
import csvManager.Remove

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class CsvManGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		fsa.generateFile('CsvMan.java', resource.allContents.filter(Program).toIterable.head.compile.toString)
	}
	
	def dispatch compile(Program program)
		'''
		import dnl.utils.text.table.TextTable;
		import org.apache.commons.csv.CSVFormat;
		import org.apache.commons.csv.CSVParser;
		import org.apache.commons.csv.CSVPrinter;
		import org.apache.commons.csv.CSVRecord;
		
		import java.io.*;
		import java.nio.file.Files;
		import java.nio.file.Paths;
		
		import java.util.*;
		
		public class CsvMan {
		    
		    private Map<String, String> aliasMaps;
		    private String[] paramTab;
		    private int idxParamTab;
		    private String[] conditionTab;
		    private int idxConditionTab;
		
		    public CsvMan(){
		        this.aliasMaps = new HashMap<>();
		        this.paramTab = new String[0];
		        this.conditionTab = new String[0];
		        this.idxParamTab = 0;
		        this.idxConditionTab = 0;
		    }
		
		    public static void main(String[] args){
   		    	CsvMan man = new CsvMan();
   				«FOR exp: program.instruction»
   					«exp.compile»				
   				«ENDFOR»
		    }
		
		    public void resetParamTab(int length){
		        this.paramTab = new String[length];
		        this.idxParamTab = 0;
		    }
		
		    public void resetConditionTab(int length){
		        this.conditionTab = new String[length];
		        this.idxConditionTab = 0;
		    }
		
		    public void addElmtParamTab(String elmt){
		        this.paramTab[idxParamTab++] = elmt;
		    }
		
		    public void addElmtConditionTab(String elmt){
		        this.conditionTab[idxConditionTab++] = elmt;
		    }
		
		    public String[] getParamTab(){
		        return this.paramTab;
		    }
		
		    public String[] getConditionTab(){
		        return this.conditionTab;
		    }
		
		    /**
		     * Make the link between an alias an a real CSV file
		     * @param alias of the user corresponding to a real CSV that we want to read
		     * @param filename real path to the CSV file
		     */
		    private void putAliasMap(String alias, String filename){
		        String finalAlias = alias;
		
		        //In case there are file with the same id
		        if(aliasMaps.containsKey(alias)){
		            for(int i = 0; i < 1000; i++){
		                if(!aliasMaps.containsKey(alias + "_" + i)){
		                    finalAlias = alias + "_" + i;
		                    aliasMaps.put(finalAlias, filename);
		                    i = Integer.MAX_VALUE;
		                }
		            }
		        }else{
		            aliasMaps.put(alias, filename);
		        }
		        System.out.println("INFO : File " + filename  + " added with alias : " + finalAlias);
		    }
		
		    /**
		     * Return CSVParser on a specific CSV file to read it
		     * @param alias of the user corresponding to a real CSV that we want to read
		     * @exception Exception if CSV file doesn't exist.
		     * @return CSVParser to iterate on CSV file.
		     */
		    private CSVParser getParser(String alias) throws Exception{
		        String fileName = this.aliasMaps.get(alias);
		
		            if (fileName == null)
		                throw new Exception();
		
		            Reader reader = Files.newBufferedReader(Paths.get(fileName));
		            return new CSVParser(reader, CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());
		    }
		
		
		
		    /**
		     * Overwrite a CSV File
		     * @param alias of the user corresponding to a real CSV.
		     * @param txt to push in the file.
		     */
		    private void writeIn(String alias, String txt) {
		        try {
		            Writer fileWriter = new FileWriter(this.aliasMaps.get(alias), false); //overwrites file
		            fileWriter.write(txt);
		            fileWriter.flush();
		            fileWriter.close();
		        }catch (IOException e){
		            System.out.println("ERROR : Alias " + alias + " given doesn't exist, or its CSV file doesn't exist");
		            e.printStackTrace();
		        }
		    }
		
		    /**
		     * Return column of a CSV File
		     * @param parser from the lib that allow use to parse efficiently the csv.
		     * @return all columns represented in the CSV file.
		     */
		    private String getHeader(CSVParser parser){
		        Map<String,Integer> headerMap = parser.getHeaderMap();
		        String res = "";
		        for (int i = 0; i < headerMap.size(); i++) {
		            for (String key : headerMap.keySet()) {
		                if (headerMap.get(key) == i) {
		                    res += key;
		                    if (i != headerMap.size() - 1)
		                        res += ",";
		                }
		            }
		        }
		        return res + "\n";
		    }
		
		    /**
		     * Create a new CSV file
		     * @param filename name of the table given by the user. The CSV file will be saved as filename+'.csv'.
		     */
		    public void create(String filename, String...args){
		        try{
		            BufferedWriter writer = Files.newBufferedWriter(Paths.get(filename + ".csv"));
		            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader(args));
		            csvPrinter.flush();
		            this.putAliasMap(filename, filename + ".csv");
		            String columns = "";
		            for(String temp : args) columns += temp + ", ";
		            columns = columns.substring(0, columns.length()-2);
		            System.out.println("INFO : File " + filename + ".csv was created with columns : " + columns);
		        } catch (IOException e) {
		            System.out.println("ERROR : Alias given " + filename + " doesn't exist, or its CSV file doesn't exist");
		            e.printStackTrace();
		        }
		    }
		
		    /**
		     * Load an existing CSV file according to the name given
		     * @param filename path to a real CSV.
		     * @param alias is the name given by the user to the tab.
		     */
		    public void load(String filename, String alias){
		        File tmpFile = new File(filename);
		        if(tmpFile.exists()){
		            this.putAliasMap(alias, filename);
		            System.out.println("INFO :" + filename + " is reachable as " + alias);
		        }else
		            System.out.println("INFO :" + filename + " doesn't exist...");
		    }
		
		    /**
		     * Copy a table and paste it in a new one to duplicate it
		     * @param startFile alias corresponding to a real CSV.
		     * @param arriveFile alias of the copy that will be generated.
		     */
		    public void copy(String startFile, String arriveFile){
		        InputStream inputStream = null;
		        OutputStream outputStream = null;
		        try {
		            inputStream = new FileInputStream(this.aliasMaps.get(startFile));
		            outputStream = new FileOutputStream(arriveFile + ".csv");
		
		            // the size of the buffer doesn't have to be exactly 1024 bytes, try playing around with this number and see what effect it will have on the performance
		            byte[] buffer = new byte[1024];
		            int length = 0;
		            while ((length = inputStream.read(buffer)) > 0) {
		                outputStream.write(buffer, 0, length);
		            }
		            inputStream.close();
		            outputStream.close();
		            System.out.println("INFO : File " + startFile + " copied into file " + arriveFile);
		            this.putAliasMap(arriveFile, arriveFile + ".csv");
		        } catch (IOException e) {
		            System.out.println("ERROR : Alias 'startFile' given doesn't exist, or its CSV file doesn't exist");
		            e.printStackTrace();
		        }
		    }
		
		    /**
		     * Delete a CSV file according to the name given
		     * @param alias alias corresponding to a real CSV.
		     */
		    public void delete(String alias){
		        String fileName = this.aliasMaps.get(alias);
		
		        if(fileName != null){
		            File file = new File(fileName);
		            if(file.delete()){
		                System.out.println("INFO : File " + alias + ".csv has been deleted");
		                this.aliasMaps.remove(alias);
		                return;
		            }
		        }else {
		            System.out.println( "ERROR : Alias " + alias + " doesn't exists");
		        }
		    }
		
		    /**
		     * Remove tuple from a CSV file
		     * @param alias alias corresponding to a real CSV.
		     * @param conditions where tuple should be deleted.
		     */
		    public void remove(String alias, String[] conditions){
		        try {
		            String res = "";
		            CSVParser csvParser = this.getParser(alias);
		            Map<String, Integer> headerMap = csvParser.getHeaderMap();
		
		            res += this.getHeader(csvParser);
		
		            //Mise à jour des lignes consernées
		            for (CSVRecord record : csvParser) {
		                boolean b = true;
		                for(int i = 0; i < conditions.length; i+=2){
		                    if(!record.get(conditions[i].trim()).equals(conditions[i+1])){
		                        b = false;
		                        break;
		                    }
		                }
		                //Si la ligne ne remplit pas la condition elle n'est pas recopié dans le nouveau fichier
		                if(!b) {
		                    for (int i = 0; i < record.size(); i++) {
		                        res += record.get(i);
		                        if (i < record.size() - 1) res += ",";
		                    }
		                    res += "\n";
		                }
		            }
		            this.writeIn(alias, res);
		            System.out.println("INFO : tuples has been deleted");
		
		        } catch (IOException e){
		            System.out.println("ERROR : Alias " + alias + " given doesn't exist, or its CSV file doesn't exist");
		            e.printStackTrace();
		        } catch (Exception e){
		            System.out.println("ERROR : Alias " + alias + " given doesn't exist faield to get CSVParser");
		            e.printStackTrace();
		        }
		    }
		
		    /**
		     * Display an entire CSV file
		     * @param alias of the user corresponding to a real CSV that we want to read
		     */
		    public void show(String alias){
		        show(alias, new String[0], new String[0]);
		    }
		
		    /**
		     * Display some column of a CSV file
		     * @param alias of the user corresponding to a real CSV that we want to read
		     * @param selected column name to display
		     */
		    public void show(String alias, String[] selected){
		        show(alias, selected, new String[0]);
		    }
		
		    /**
		     * Display some tuple of some column of a CSV file
		     * @param alias of the user corresponding to a real CSV that we want to read
		     * @param selected column name to display
		     * @param condition to verify to display the tuple
		     */
		    public void show(String alias, String[] selected, String[] condition) {
		        System.out.println("\n");
		
		        boolean printAll = (selected.length == 0);
		        boolean noCondition = (condition.length == 0);
		
		        try {
		            CSVParser csvParser = this.getParser(alias);
		            Map<String, Integer> headerMap = csvParser.getHeaderMap();
		
		            String[] header = new String[headerMap.size()];
		
		            if (printAll) {
		                //System.out.print(this.getHeader(csvParser));
		                for (int i = 0; i < headerMap.size(); i++)
		                    for (String key : headerMap.keySet())
		                        if (headerMap.get(key) == i)
		                            header[i] = key;
		
		                List<CSVRecord> records = csvParser.getRecords();
		                int nbCondition = 0;
		
		                for (CSVRecord record : records){
		                    boolean b = true;
		                    //On vérifie les conditions avant l'affichage
		                    for (int i = 0; i < condition.length; i += 2) {
		                        if (!record.get(condition[i].trim()).equals(condition[i + 1])) {
		                            b = false;
		                            break;
		                        }
		                    }
		                    if(b) nbCondition++;
		                }
		
		                String[][] res = new String[nbCondition][headerMap.size()];
		                int index = 0;
		
		                for (CSVRecord record : records) {
		                    boolean b = true;
		                    //On vérifie les conditions avant l'affichage
		                    for (int i = 0; i < condition.length; i += 2) {
		                        if (!record.get(condition[i].trim()).equals(condition[i + 1])) {
		                            b = false;
		                            break;
		                        }
		                    }
		                    if (b) {
		                        for (int i = 0; i < record.size(); i++) {
		                            res[index][i] = record.get(i);
		                        }
		                        index++;
		                    }
		                }
		
		                TextTable tt = new TextTable(header, res);
		                tt.printTable();
		
		            } else {
		                header = new String[selected.length];
		                //Affichage des entêtes (Header)
		                for (int i = 0; i < selected.length; i++) {
		                    if (headerMap.containsKey(selected[i].trim())) {
		                        header[i] = selected[i];
		                    } else throw new Exception();
		                }
		
		                List<CSVRecord> records = csvParser.getRecords();
		                int nbCondition = 0;
		
		                for (CSVRecord record : records){
		                    boolean b = true;
		                    //On vérifie les conditions avant l'affichage
		                    for (int i = 0; i < condition.length; i += 2) {
		                        if (!record.get(condition[i].trim()).equals(condition[i + 1])) {
		                            b = false;
		                            break;
		                        }
		                    }
		                    if(b) nbCondition++;
		                }
		
		                String[][] res = new String[nbCondition][headerMap.size()];
		                int index = 0;
		                for (CSVRecord record : records) {
		                    boolean b = true;
		                    //On vérifie les conditions avant l'affichage
		                    for (int i = 0; i < condition.length; i += 2) {
		                        if (!record.get(condition[i].trim()).equals(condition[i + 1])) {
		                            b = false;
		                            break;
		                        }
		                    }
		                    if (b) {
		                        for (int i = 0; i < selected.length; i++) {
		                            res[index][i] = record.get(selected[i]);
		                        }
		                        index++;
		                    }
		                }
		                TextTable tt = new TextTable(header, res);
		                tt.printTable();
		            }
		            System.out.println("\n");
		        }catch (Exception e){
		            System.out.println("ERROR : Alias " + alias + " given doesn't exist, or its CSV file doesn't exist");
		            e.printStackTrace();
		        }
		
		    }
		
		    /**
		     * Add a tuple in a CSV file at its end
		     * @param parameters giving column name (with elmnt even index) and corresponding value (elmnt with odd idx)
		     * @exception Exception if there is more column than in the existing file.
		     */
		    public void add(String alias, String[] parameters){
		        try {
		            CSVParser csvParser = this.getParser(alias);
		            Map<String, Integer> header = csvParser.getHeaderMap();
		
		            if(parameters.length > header.size())
		                throw new Exception("Ce champ n'existe pas");
		
		            String res = "";
		
		            for(int i = 0; i < parameters.length -1; i++){
		                if(parameters[i] == null)
		                    res += ",";
		                else
		                    res += parameters[i] + ",";
		            }
		
		            if(parameters.length - 1 >= 0 && parameters[parameters.length -1] != null) res += parameters[parameters.length -1];
		                res+= "\n";
		
		            Writer fileWriter = new FileWriter(this.aliasMaps.get(alias), true); //appended in file
		            fileWriter.write(res);
		            fileWriter.flush();
		            fileWriter.close();
		            System.out.println("INFO : tuple has been added");
		
		        }catch (Exception e) {
		            System.out.println("ERROR : some columns given doesn't exist in the CSV file");
		            e.printStackTrace();
		        }
		    }
		
		    /**
		     * Evolved version of Add function. It a tuple in a CSV file at its end
		     * @param parameters giving column name (with elmnt even index) and corresponding value (elmnt with odd idx)
		     * @exception Exception if there is more column than in the existing file.
		     */
		    public void addParameterized(String alias, String[] parameters){
		
		        try {
		            CSVParser csvParser = this.getParser(alias);
		            Map<String, Integer> header = csvParser.getHeaderMap();
		
		            if(parameters.length/2 > header.size()) {
		                throw new Exception("Ce champ n'existe pas");
		            }
		
		            String[] res = new String[header.size()];
		            Arrays.fill(res, ",");
		            res[res.length-1]="";
		
		            for(int i = 0; i < parameters.length; i=i+2){
		
		                //Column given really exist in the tab
		                if(header.containsKey(parameters[i])){
		
		                    if(header.get(parameters[i]) < header.size()-1) {
		                        if (parameters[i + 1] == null)
		                            res[header.get(parameters[i])] = "";
		                        else
		                            res[header.get(parameters[i])] = parameters[i + 1] + ",";
		                    }else { //Pour le dernier élément
		                        if (parameters[i + 1] == null)
		                            res[header.get(parameters[i])] = "";
		                        else
		                            res[header.get(parameters[i])] = parameters[i + 1];
		                    }
		                } else{
		                    throw new Exception("ERROR : some columns given doesn't match with the CSV file");
		                }
		            }
		
		            String resConcat = "";
		            for (String s : res) {
		                if(s!= null) {
		                    resConcat += s;
		                }else{
		                    resConcat += "";
		                }
		            }
		            resConcat += "\n";
		
		            Writer fileWriter = new FileWriter(this.aliasMaps.get(alias), true); //appended in file
		            fileWriter.write(resConcat);
		            fileWriter.flush();
		            fileWriter.close();
		            System.out.println("INFO : tuple has been added");
		
		        }catch (Exception e) {
		            System.out.println(e.getMessage());
		            e.printStackTrace();
		        }
		    }
		
		    /**
		     * Add a tuple in a CSV file at its end
		     * @param alias of the user corresponding to a real CSV that we want to read
		     * @param parameter giving column name (with elmnt even index) and corresponding value (elmnt with odd idx)
		     */
		    public void update(String alias, String[] parameter) {
		        this.update(alias, parameter, new String[0]);
		    }
		
		    /**
		     * Add a tuple in a CSV file at its end
		     * @param alias of the user corresponding to a real CSV that we want to read
		     * @param parameter giving column name (with elmnt even index) and corresponding value (elmnt with odd idx)
		     * @param conditions to verify before updating tuples
		     */
		    public void update(String alias, String[] parameter, String[] conditions) {
		
		        //On lit completement le fichier et on le stocke dans un String
		        try {
		            String res = "";
		            CSVParser csvParser = this.getParser(alias);
		
		            Map<String, Integer> headerMap = csvParser.getHeaderMap();
		            String[] cles = new String[headerMap.size()];
		            String[] nValue = new String[headerMap.size()];
		            boolean[] toModify = new boolean[headerMap.size()];
		
		            //Recopie des entêtes
		            for (int i = 0; i < headerMap.size(); i++) {
		                for (String key : headerMap.keySet()) {
		                    if (headerMap.get(key) == i) {
		                        cles[i] = key.trim();
		                        res += key;
		                        if (i != headerMap.size() - 1)
		                            res += ",";
		                    }
		                }
		            }
		            res+= "\n";
		
		            for(int i = 0; i < parameter.length; i+=2){
		                for(int j = 0; j < cles.length; j++){
		                    if(cles[j].equals(parameter[i])){
		                        toModify[j] = true;
		                        nValue[j] = parameter[i+1];
		                    }
		                }
		            }
		
		            //Mise à jour des lignes consernées
		            for (CSVRecord record : csvParser) {
		                boolean b = true;
		                for(int i = 0; i < conditions.length; i+=2){
		                    if(!record.get(conditions[i].trim()).equals(conditions[i+1])){
		                        b = false;
		                        break;
		                    }
		                }
		
		                for(int i = 0; i < record.size(); i++){
		                    if(toModify[i] && b){
		                        res += nValue[i];
		                    }else{
		                        res += record.get(i);
		                    }
		                    if(i < record.size()-1) res += ",";
		                }
		                res += "\n";
		            }
		            //Write the res in the file
		            this.writeIn(alias, res);
		            System.out.println("INFO : tuples has been updated");
		
		        } catch (Exception e){
		            System.out.println("ERROR : Alias " + alias + " given doesn't exist, or its CSV file doesn't exist");
		            e.printStackTrace();
		        }
		    }
		
		    /**
		     * Join 2 CSV file in a new file
		     * @param alias1 of the first table of user
		     * @param alias2 of the second table of user
		     * @param toAlias of the table that will be generated with the result content
		     */
		    public void join(String alias1, String alias2, String toAlias) {
		        try {
		            CSVParser csvParser1 = this.getParser(alias1);
		            CSVParser csvParser2 = this.getParser(alias2);
		
		            String res = "";
		            Map<String, Integer> headerMap1 = csvParser1.getHeaderMap();
		            Map<String, Integer> headerMap2 = csvParser2.getHeaderMap();
		
		            String colomnToJoin = "";
		
		            for (String k : headerMap1.keySet()) {
		                if (headerMap2.containsKey(k)) {
		                    colomnToJoin = k;
		                    break;
		                }
		            }
		
		            if (colomnToJoin!="") {
		                res += this.getHeader(csvParser1);
		                res = res.replace("\n", "");
		                res += ',';
		                String tmp = this.getHeader(csvParser2).replace(colomnToJoin + ",", "").replace("," + colomnToJoin, "");
		                res += tmp;
		                create(toAlias, res);
		                res += "";
		
		                List<CSVRecord> records2 = csvParser2.getRecords();
		
		                //On parcourt la premiere table
		                for (CSVRecord record : csvParser1) {
		                    String joinValueTab1 = record.get(headerMap1.get(colomnToJoin));
		
		                    //On parcourt la premiere table
		                    for (CSVRecord record2 : records2) {
		                        String joinValueTab2 = record2.get(headerMap2.get(colomnToJoin));
		
		                        //Join accepted for this tuple
		                        if(joinValueTab1.equals(joinValueTab2)){
		
		                            for(int i = 0; i < record.size(); i++){
		                                res += record.get(i);
		                                res += ",";
		                            }
		                            for(int i = 0; i < record2.size(); i++){
		                                if(i!=headerMap2.get(colomnToJoin)) {
		                                    res += record2.get(i);
		                                    if(i < record2.size()-1) res+= ",";
		                                }
		                            }
		                            res += "\n";
		                        }
		                    }
		                }
		                this.writeIn(toAlias, res);
		                System.out.println("INFO : Tables has been joined as a new one : " + toAlias + " thanks to column : "+colomnToJoin);
		                //show(toAlias);
		
		            } else {
		                throw new Exception("Can't join those tables " + alias1 + " and " + alias2 + ": no column in common !");
		            }
		
		        } catch (Exception e) {
		            System.out.println(e.getMessage());
		            e.printStackTrace();
		        }
		    }
		}		
		'''
	
	
		/*
		 * Load Function
		 */
		def dispatch compile(Load load)
			'''
				man.load("«load.fichier»", "«load.csvtable.name»");
			'''
		
		/*
		 * Create Function
		 */
		def dispatch compile(Create created)
			'''
				man.resetParamTab(«created.csvtable.colonne.length»);
				«FOR exp: created.csvtable.colonne»
					man.addElmtParamTab("«exp»");
				«ENDFOR»
				man.create("«created.csvtable.name»", man.getParamTab());
			'''
		
				
		/*
		 * Show function
		 */
		def dispatch compile(Show show)
			'''
				man.resetParamTab(«show.colonne.length»);
				man.resetConditionTab(0);
				«FOR exp: show.colonne»
					man.addElmtParamTab("«exp»");
				«ENDFOR»
				«IF show.where !== null»
					«show.where.compile»
				«ENDIF»
				man.show("«show.csvtable.name»", man.getParamTab(), man.getConditionTab());
			'''
		
		/*
		 * Update function
		 */
		def dispatch compile(Update update)
			'''
				man.resetParamTab(«update.parameter.length»*2);
				man.resetConditionTab(0);
				«FOR exp: update.parameter»
					man.addElmtParamTab("«exp.colonne»");
					man.addElmtParamTab("«exp.value»");
				«ENDFOR»
				«IF update.where !== null»
					«update.where.compile»
				«ENDIF»
				man.update("«update.csvtable.name»", man.getParamTab(), man.getConditionTab());
			'''		 
		
		/*
		 * Add
		 */
		 def dispatch compile(Add add)
			'''
				«IF add.valeur.length > 0»
					man.resetParamTab(«add.valeur.length»);
					«FOR exp: add.valeur»
						man.addElmtParamTab("«exp»");
					«ENDFOR»
					man.add("«add.csvtable.name»", man.getParamTab());				
				«ELSE»
					man.resetParamTab(«add.parameter.length» * 2);
					«FOR exp: add.parameter»
						man.addElmtParamTab("«exp.colonne»");
						man.addElmtParamTab("«exp.value»");					
					«ENDFOR»
					man.addParameterized("«add.csvtable.name»", man.getParamTab());	
					
				«ENDIF»				
			'''		 
		 
		/*
		 * EXIT
		 */
		def dispatch compile(Copy copy)
			'''
				man.copy("«copy.alias.name»", "«copy.table.name»");
			'''		
				
		/*
		 * EXIT
		 */
		def dispatch compile(Exit exit)
			'''
				return;
			'''		
		 
		/*
		 * Delete function
		 */
		def dispatch compile(Remove remove)
			'''
				«IF remove.where !== null»
					«remove.where.compile»
					man.remove("«remove.csvtable.name»", man.getConditionTab());
				«ELSE»
					man.resetConditionTab(0);
					man.remove("«remove.csvtable.name»", man.getConditionTab());
				«ENDIF»
			'''		
		
				 
		/*
		 * Join function
		 */
		def dispatch compile(Join join)
			'''
				man.join("«join.tables.get(0).name»", "«join.tables.get(1).name»", "«join.table3.name»");
			'''			
		
		/*
		 * Remove function
		 */
		def dispatch compile(Delete delete)
			'''
				man.delete("«delete.csvtable.name»");
			'''		
		
		def dispatch compile(Where where)
		'''
			man.resetConditionTab(«where.condition.length»*2);
			«FOR exp: where.condition»
				man.addElmtConditionTab("«exp.colonne»");
				man.addElmtConditionTab("«exp.valeur»");
			«ENDFOR»
		'''

		
	def dispatch compile(Instruction instruction)
		'''
		'''
		

}
