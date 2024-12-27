package section5.bai1.trungtamjava;

public class Table {
    private int id;
    private String tableName;
    private String tableType;

    public Table() {
    }

    public Table(int id, String tableName, String tableType) {
        this.id = id;
        this.tableName = tableName;
        this.tableType = tableType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableType() {
        return tableType;
    }

    public void setTableType(String tableType) {
        this.tableType = tableType;
    }
}
