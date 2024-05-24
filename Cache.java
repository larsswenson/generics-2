import java.util.HashMap;
import java.util.Map;

public class Cache<T> {
    private Map<String, T> cache;

    public Cache() {
        cache = new HashMap<>();
    }

    public void add(String key, T value) {
        cache.put(key, value);
    }

    public T get(String key) {
        return cache.get(key);
    }

    public void clear() {
        cache.clear();
    }

    public void addAll(Cache<? extends T> other) {
        for (Map.Entry<String, ? extends T> entry : other.cache.entrySet()) {
            this.cache.put(entry.getKey(), entry.getValue());
        }
    }
}

