package streams;

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ImplementStreams {
    public static void main(String[] args) {
        String csvFile = "job_cleanData.csv";
        
        ArrayList<Job> jobList = new ArrayList<Job>();
        
        try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {
            List<String[]> rows = reader.readAll();
            boolean skipHeader = true;

            int x = 0;
            for (String[] row : rows) {
                if (skipHeader) {
                    skipHeader = false;
                    continue;
                }
                
                Job job = new Job(Long.parseLong(row[0]), row[1], Integer.parseInt(row[2]), row[3], row[4], row[5], Integer.parseInt(row[6]), Integer.parseInt(row[7]), Long.parseLong(row[8]), row[9], Integer.parseInt(row[10]), row[11], row[12], row[13], row[14]);
                
                jobList.add(job);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.println(jobList.size());
        
        Set<Job> set = new HashSet<>(jobList);
        
        Stream<Job> stream = set.stream();
//		System.out.println(stream);
		
		
//		GOAL-01 : How many employees have full-time and contract-based jobs?
        
        System.out.println("************************************************************************************************");
		
        System.out.println("\nSEQUENTIAL EXECUTION\n");
        
        long startTime = System.currentTimeMillis();
		long countFullTime = set.stream().filter(obj -> obj.getInvolvement().equalsIgnoreCase("full-time")).count();		
		long countContract = set.stream().filter(obj -> obj.getInvolvement().equalsIgnoreCase("contract")).count();
		long endTime = System.currentTimeMillis();
		
		System.out.println("sequential execution time : " + (endTime - startTime) +" milliseconds");
		System.out.println("Employees with Full-Time job : " + countFullTime);
		System.out.println("Employees with contract job : " + countContract);
		
        System.out.println("\nPARALLEL EXECUTION\n");
        
        startTime = System.currentTimeMillis();
		countFullTime = set.stream().parallel().filter(obj -> obj.getInvolvement().equalsIgnoreCase("full-time")).count();		
		countContract = set.stream().parallel().filter(obj -> obj.getInvolvement().equalsIgnoreCase("contract")).count();
		endTime = System.currentTimeMillis();
		
		System.out.println("parallel execution time : " + (endTime - startTime) +" milliseconds");
		System.out.println("Employees with Full-Time job : " + countFullTime);
		System.out.println("Employees with contract job : " + countContract);
		


//		GOAL-04 : How many applicants does a company have?
		
        System.out.println("************************************************************************************************");
		
		Map<String, Integer> applicantsByCompany = set.stream().collect(Collectors.groupingBy(Job::getName,Collectors.summingInt(Job::getTotalApplicants)));
		
		System.out.println("Number of applicants for each company:");
		applicantsByCompany.forEach((company, totalApplicants) -> System.out.println(company + ": " + totalApplicants));
	        
		
//	    GOAL-06 : How many employees are working for onsite and remote jobs?
		
        System.out.println("************************************************************************************************");
	        
        System.out.println("\nSEQUENTIAL EXECUTION\n");
        
        startTime = System.currentTimeMillis();
		long countRemote = set.stream().filter(obj -> obj.getWorkType().equalsIgnoreCase("remote")).count();		
		long countOnsite = set.stream().filter(obj -> obj.getWorkType().equalsIgnoreCase("on-site")).count();
		endTime = System.currentTimeMillis();
		
		System.out.println("sequential execution time : " + (endTime - startTime) +" milliseconds");

		System.out.println("Employees working remote job : " + countRemote);
		System.out.println("Employees working on-site job : " + countOnsite);
		
        System.out.println("\nPARALLEL EXECUTION\n");
        
        startTime = System.currentTimeMillis();
		countRemote = set.stream().parallel().filter(obj -> obj.getWorkType().equalsIgnoreCase("remote")).count();		
		countOnsite = set.stream().parallel().filter(obj -> obj.getWorkType().equalsIgnoreCase("on-site")).count();
		endTime = System.currentTimeMillis();
		
		System.out.println("parallel execution time : " + (endTime - startTime) +" milliseconds");

		System.out.println("Employees working remote job : " + countRemote);
		System.out.println("Employees working on-site job : " + countOnsite);
	     
    }
}
