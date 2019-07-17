package pattern12_composite;

import java.util.List;

public interface IFile {
    // 显示文件或文件夹的名称
    public void display();

    // 添加子目录或本文件夹下的文件
    public boolean add(IFile file);

    // 移除
    public boolean remove(IFile file);

    //获得子节点
    public List<IFile> getChild();

}
