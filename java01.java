import java.io.File;

public class Demo01Filter {
    public static void main(String[] args) {
        File file = new File("D:\\a");
        getAllFile(file);
    }


    //简易的文件搜索器
   public static void  getAllFile(File dir){
//       System.out.println(dir);
       File[] files = dir.listFiles(new FileFilterImpl());
       for (File f : files) {
           if (f.isDirectory()){
               getAllFile(f);
           }else {
               System.out.println(f);
           }
       }
    }

}
