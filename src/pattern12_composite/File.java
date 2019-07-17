package pattern12_composite;

import java.util.List;

/**
 * 文件
 */
public class File implements IFile{

    private String name;
    // 子节点(文件/文件夹)
    private List<IFile> children;

    public File(String name) {
        this.name = name;
    }
    // 显示文件名
    @Override
    public void display() {
        System.out.println(name);
    }


    // 文件 下面方法用不到


    @Override
    public boolean add(IFile file) {
        return false;
    }

    @Override
    public boolean remove(IFile file) {
        return false;
    }

    @Override
    public List<IFile> getChild() {
        return null;
    }
}
