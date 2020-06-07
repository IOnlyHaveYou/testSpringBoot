package haha.poi;

import java.io.File;
import java.io.InputStream;

public abstract class AbstractReader<T> implements SaxReader<T> {

    @Override
    public T read(String path) {
        return read(new File(path),-1);
    }

    @Override
    public T read(File file) {
        return read(file,-1);
    }

    @Override
    public T read(InputStream in) {
        return read(in,-1);
    }

    @Override
    public T read(String path, int sheetIndex) {
        return read(new File(path),sheetIndex);
    }
}
