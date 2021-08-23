package ibm.Training;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public abstract class Animals implements Comparable<Fish>{
    public static <T> void main(String[] args) throws IOException {
        List<Duck> ducklist= new ArrayList<>();
        List<Fish> fishlist= new ArrayList<>();
        String[] duckfields = null;
        String[] fishfields = null;
        String Line;
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\002CKZ744\\Desktop\\Tanya\\ducks.txt"))){
             String header = br.readLine();
             String[] headerNames = header.split(",");
             while((Line = br.readLine())!= null) {
                duckfields = Line.split(",");
                 if(duckfields!=null) {
                     Duck duck = new  Duck(Integer.parseInt(duckfields[0]), duckfields[1], duckfields[2]);
                     ducklist.add(duck);
                 }
                 }
        }
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\002CKZ744\\Desktop\\Tanya\\fishes.txt"))){
             String headerfish = br.readLine();
             String[] headerNames = headerfish.split(",");
             while((Line = br.readLine())!= null) {
                fishfields = Line.split(",");
                 if(fishfields!=null) {
                     Fish fish = new  Fish(Integer.parseInt(fishfields[0]), fishfields[1], Boolean.parseBoolean(fishfields[2]), Integer.parseInt(fishfields[2]));
                     fishlist.add(fish);
                 }
                 }
        }
        System.out.println("Before Sorting");
        for(Fish fish:fishlist) {
            System.out.println(fish);
        }
        Collections.sort(fishlist);
        System.out.println("After Sorting");
        for(Fish fish:fishlist) {
            System.out.println(fish);
        }
        Collections.sort(fishlist, (o1,o2));
        }
