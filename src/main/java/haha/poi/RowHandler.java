package haha.poi;

import java.util.List;

public interface RowHandler {

    /**
     * 处理一行数据
     * @param sheetIndex 当前Sheet序号
     * @param rowIndex 当前行号
     * @param rowList 行数据列表
     */
    void handle(int sheetIndex, int rowIndex, List<Object> rowList);
}
