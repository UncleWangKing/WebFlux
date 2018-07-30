
import java.util.HashMap;
import java.util.Map;

/**
 * @author ZhangDaPang 285296372@qq.com
 * @date 2018/7/30 16:24
 */
public class SqlUtil {
    public static void main(String[] args) {
        String tableName = "小班_______Polygon信息__________1111111";
        String keyName = "MwOID";
        String valueName = "MwGeometry";
        Map<String, String> valueMap = new HashMap();
        valueMap.put("aa", "bbb");
        valueMap.put("cc", "ddd");
        System.out.println(insertSql(tableName, keyName, valueName, valueMap));
    }

    private static String insertSql(String tableName,String keyName, String valueName, Map<String, String> valueMap){
        StringBuilder builder = new StringBuilder();
        //插入语句touch
        builder.append("INSERT INTO ").append(tableName).append(" (");
        //插入的字段
        builder.append(keyName).append(",").append(valueName).append(") VALUES ");
        //插入的值
        for (Map.Entry<String, String> entry:valueMap.entrySet()) {
            builder.append("('").append(entry.getKey()).append("','").append(entry.getValue()).append("'),");
        }

        String sql = builder.toString();
        return sql.substring(0, sql.length()-1);
    }
}
