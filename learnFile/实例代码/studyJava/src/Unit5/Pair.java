package Unit5;

/**
 * ¼üÖµ¶Ô
 * 
 * @author JHZ
 *
 * @param <K>
 * @param <V>
 */
public class Pair<K, V> {

	/* ¼ü */
	private K key;
	/* Öµ */
	private V value;

	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}
}
