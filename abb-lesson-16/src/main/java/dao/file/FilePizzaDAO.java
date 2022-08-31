package dao.file;

import dao.model.Pizza;

import java.io.File;

public class FilePizzaDAO extends FileDAO<Pizza>{
    public FilePizzaDAO(File file) {
        super(file);
    }
}
