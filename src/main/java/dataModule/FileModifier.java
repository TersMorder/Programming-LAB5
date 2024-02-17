//package DataModule;
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.Collections;
//import java.util.Vector;
//
//public class FileModifier {
//    private Vector<Vector<String>> data = new Vector<>();
//
//    public void parseFile(String filePath){
//        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
//            String line;
//
//            while ((line = br.readLine()) != null) {
//                String[] values = line.split(",");
//                Vector<String> row = new Vector<>();
//                Collections.addAll(row, values);
//                data.add(row);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//    public void addToCollection(int index){
//
//    }
//    public Integer getElIndexByName(String name){
//        for (int i = 0; i < data.size(); i++) {
//            Vector<String> row = data.get(i);
//            for (int j = 0; j < row.size(); j++) {
//                if (row.get(j).equals(name)) {
//                    return j;
//                }
//            }
//        }
//        return null;
//    }
//
//}
