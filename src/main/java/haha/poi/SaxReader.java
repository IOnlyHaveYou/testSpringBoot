package haha.poi;


import java.io.File;
import java.io.InputStream;

public interface SaxReader<T> {
    /**
     * 开始读取Excel，读取所有sheet
     *
     * @param path Excel文件路径
     * @return this
     */
    T read(String path) ;

    /**
     * 开始读取Excel，读取所有sheet
     *
     * @param file Excel文件
     * @return this
     */
    T read(File file) ;

    /**
     * 开始读取Excel，读取所有sheet，读取结束后并不关闭流
     *
     * @param in Excel包流
     * @return this
     */
    T read(InputStream in) ;

    /**
     * 开始读取Excel
     *
     * @param path 文件路径
     * @param sheetIndex Excel中的sheet编号，如果为-1处理所有编号的sheet
     * @return this
     */
    T read(String path, int sheetIndex);

    /**
     * 开始读取Excel
     *
     * @param file Excel文件
     * @param sheetIndex Excel中的sheet编号，如果为-1处理所有编号的sheet
     * @return this
     */
    T read(File file, int sheetIndex);

    /**
     * 开始读取Excel，读取结束后并不关闭流
     *
     * @param in Excel流
     * @param sheetIndex Excel中的sheet编号，如果为-1处理所有编号的sheet
     * @return this
     */
    T read(InputStream in, int sheetIndex) ;

}
