package jdbchelper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.AbstractMap;

/**
 * ResultSetMappers are used to create map entries from result set.
 * The executed select query should return 2 fields for this to work
 * as expected. If more than 2 fields are returned, only first two fields
 * are used.
 * @param <K> Key type
 * @param <V> Value type
 */
public interface ResultSetMapper<K, V> {
   public AbstractMap.SimpleEntry<K, V> mapRow(ResultSet rs) throws SQLException;
}
