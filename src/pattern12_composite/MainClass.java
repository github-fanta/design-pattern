package pattern12_composite;

/**
 * 组合模式  通过递归手段来构造树形的对象结构
 * 遍历文件系统目录
 */
public class MainClass {

    public static void main(String[] args) {
        // 构造文件路径如下
        // C:
        //   file.txt
         //  /user/
         //         user.txt
        Folder rootFolder = new Folder("C:");
        rootFolder.add(new File("file.txt"));

        Folder userFolder = new Folder("user");
        rootFolder.add(userFolder);

        userFolder.add(new File("user.txt"));

        displayTree(rootFolder, 0);

    }

    public static void displayTree(IFile rootFolder, int depth) {

        for (int i = 0; i < depth; i++) {
            System.out.print("--/");
        }
        rootFolder.display();
        for (IFile ifile : rootFolder.getChild()) {
            if (ifile instanceof File) {
                for (int i = 0; i <= depth; i++) {
                    System.out.print("--");
                }
                ifile.display();
            } else {
                displayTree(ifile, depth + 1);  // 模式的重点就在于"无差别的"文件和文件夹 和递归
            }
        }
    }
}
