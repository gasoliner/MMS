package cn.mms.util;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FileUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;


public class PageUtil {

    private static SqlSessionFactory sqlSessionFactory;

    public PageUtil() throws IOException {
        String resource="SqlMapConfig.xml";
//        String resource="classpath:SqlMapConfig.xml";
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream(resource));
    }

    public static String getFileNameByFilePath(String filepath){
        String string[] = filepath.split("\\\\");
        return string[string.length-1];
    }

    public static String getRequestName(String url){
        String []urls =  url.split("/");
        return urls[urls.length-1];
    }

    public static SqlSession openSqlSession() {
        return sqlSessionFactory.openSession();
    }

    public static boolean isTeacher(HttpServletRequest request){
        String role = (String) request.getSession().getAttribute("role");
        if (role == "1"){
            return true;
        }else {
            return false;
        }
    }

//    public static ClassFile uploadFile(HttpServletRequest request){
//
//        ClassFile classFile = new ClassFile();
//
//        DiskFileItemFactory factory = new DiskFileItemFactory();
//        ServletFileUpload upload = new ServletFileUpload(factory);
//        upload.setHeaderEncoding("UTF-8");
//        String path =request.getRealPath("/upload/class_file/");
//        // 如果目录不存在则创建
//        File uploadDir = new File(path);
//        if (!uploadDir.exists()) {
//            uploadDir.mkdir();
//        }
//        try {
//            // 解析请求的内容提取文件数据
//            List<FileItem> formItems = upload.parseRequest(request);
//            Map<String,String> param = new HashMap();
//            if (formItems != null && formItems.size() > 0) {
//                // 迭代表单数据
//                for (FileItem item : formItems) {
//                    // 处理不在表单中的字段
//                    if (!item.isFormField()) {
//                        String fileName = new File(item.getName()).getName();
//                        String filePath = path+fileName;
//                        File storeFile = new File(path,fileName);
//                        // 在控制台输出文件的上传路径
//                        System.out.println(filePath);
//                        // 保存文件到硬盘
//                        FileUtils.copyInputStreamToFile(item.getInputStream(),storeFile);
//                        classFile.setAnnex(filePath);
//                    }else {
//                        param.put(item.getFieldName(), item.getString("utf-8"));
//                    }
//                }
//                if (param.get("cfid")!=null){
//                    classFile.setCfid(Integer.parseInt(param.get("cfid")));
//                }
//                if (param.get("classs")!=null){
//                    classFile.setClasss(param.get("classs"));
//                }
//                if (param.get("filename")!=null){
//                    classFile.setFilename(param.get("filename"));
//                }
//            }
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        System.out.println("classFile:\t"+classFile);
//        return classFile;
//    }
}
