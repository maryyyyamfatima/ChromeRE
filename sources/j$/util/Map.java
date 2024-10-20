package j$.util;

import j$.util.concurrent.ConcurrentMap$CC;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes3.dex */
public interface Map<K, V> {

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* renamed from: j$.util.Map$-EL */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class EL {
        public static /* synthetic */ Object computeIfAbsent(java.util.Map map, Object obj, Function function) {
            return map instanceof Map ? ((Map) map).computeIfAbsent(obj, function) : map instanceof ConcurrentMap ? ConcurrentMap$CC.$default$computeIfAbsent((ConcurrentMap) map, obj, function) : CC.$default$computeIfAbsent(map, obj, function);
        }
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes3.dex */
    public interface Entry<K, V> {
        boolean equals(Object obj);

        K getKey();

        V getValue();

        int hashCode();

        V setValue(V v);
    }

    void clear();

    V compute(K k, BiFunction<? super K, ? super V, ? extends V> biFunction);

    V computeIfAbsent(K k, Function<? super K, ? extends V> function);

    V computeIfPresent(K k, BiFunction<? super K, ? super V, ? extends V> biFunction);

    boolean containsKey(Object obj);

    boolean containsValue(Object obj);

    Set<Map.Entry<K, V>> entrySet();

    boolean equals(Object obj);

    void forEach(BiConsumer<? super K, ? super V> biConsumer);

    V get(Object obj);

    V getOrDefault(Object obj, V v);

    int hashCode();

    boolean isEmpty();

    Set<K> keySet();

    V merge(K k, V v, BiFunction<? super V, ? super V, ? extends V> biFunction);

    V put(K k, V v);

    void putAll(java.util.Map<? extends K, ? extends V> map);

    V putIfAbsent(K k, V v);

    V remove(Object obj);

    boolean remove(Object obj, Object obj2);

    V replace(K k, V v);

    boolean replace(K k, V v, V v2);

    void replaceAll(BiFunction<? super K, ? super V, ? extends V> biFunction);

    int size();

    Collection<V> values();

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* renamed from: j$.util.Map$-CC */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class CC<K, V> {
        public static Object $default$getOrDefault(java.util.Map _this, Object key, Object obj) {
            Object obj2 = _this.get(key);
            if (obj2 != null || _this.containsKey(key)) {
                return obj2;
            }
            return obj;
        }

        /* JADX WARN: Generic types in debug info not equals: j$.util.function.BiConsumer != java.util.function.BiConsumer<? super K, ? super V> */
        public static void $default$forEach(java.util.Map _this, BiConsumer biConsumer) {
            Objects.requireNonNull(biConsumer);
            for (Map.Entry<K, V> entry : _this.entrySet()) {
                try {
                    K k = entry.getKey();
                    V v = entry.getValue();
                    biConsumer.accept(k, v);
                } catch (IllegalStateException ise) {
                    throw new ConcurrentModificationException(ise);
                }
            }
        }

        /* JADX WARN: Generic types in debug info not equals: j$.util.function.BiFunction != java.util.function.BiFunction<? super K, ? super V, ? extends V> */
        /* JADX WARN: Multi-variable type inference failed */
        public static void $default$replaceAll(java.util.Map map, BiFunction biFunction) {
            Objects.requireNonNull(biFunction);
            for (Map.Entry<K, V> entry : map.entrySet()) {
                try {
                    try {
                        entry.setValue(biFunction.apply(entry.getKey(), entry.getValue()));
                    } catch (IllegalStateException e) {
                        throw new ConcurrentModificationException(e);
                    }
                } catch (IllegalStateException e2) {
                    throw new ConcurrentModificationException(e2);
                }
            }
        }

        public static Object $default$putIfAbsent(java.util.Map _this, Object obj, Object obj2) {
            Object obj3 = _this.get(obj);
            if (obj3 == null) {
                return _this.put(obj, obj2);
            }
            return obj3;
        }

        public static boolean $default$remove(java.util.Map _this, Object key, Object value) {
            Object curValue = _this.get(key);
            if (Objects.equals(curValue, value)) {
                if (curValue == null && !_this.containsKey(key)) {
                    return false;
                }
                _this.remove(key);
                return true;
            }
            return false;
        }

        public static boolean $default$replace(java.util.Map _this, Object obj, Object obj2, Object obj3) {
            Object curValue = _this.get(obj);
            if (Objects.equals(curValue, obj2)) {
                if (curValue == null && !_this.containsKey(obj)) {
                    return false;
                }
                _this.put(obj, obj3);
                return true;
            }
            return false;
        }

        public static Object $default$replace(java.util.Map _this, Object obj, Object obj2) {
            Object obj3 = _this.get(obj);
            return (obj3 != null || _this.containsKey(obj)) ? _this.put(obj, obj2) : obj3;
        }

        /* JADX WARN: Generic types in debug info not equals: j$.util.function.Function != java.util.function.Function<? super K, ? extends V> */
        /* JADX WARN: Multi-variable type inference failed */
        public static Object $default$computeIfAbsent(java.util.Map map, Object obj, Function function) {
            Object apply;
            Objects.requireNonNull(function);
            Object obj2 = map.get(obj);
            if (obj2 != null || (apply = function.apply(obj)) == null) {
                return obj2;
            }
            map.put(obj, apply);
            return apply;
        }

        /* JADX WARN: Generic types in debug info not equals: j$.util.function.BiFunction != java.util.function.BiFunction<? super K, ? super V, ? extends V> */
        /* JADX WARN: Multi-variable type inference failed */
        public static Object $default$computeIfPresent(java.util.Map map, Object obj, BiFunction biFunction) {
            Objects.requireNonNull(biFunction);
            Object obj2 = map.get(obj);
            if (obj2 == null) {
                return null;
            }
            Object apply = biFunction.apply(obj, obj2);
            if (apply != null) {
                map.put(obj, apply);
                return apply;
            }
            map.remove(obj);
            return null;
        }

        /* JADX WARN: Generic types in debug info not equals: j$.util.function.BiFunction != java.util.function.BiFunction<? super K, ? super V, ? extends V> */
        /* JADX WARN: Multi-variable type inference failed */
        public static Object $default$compute(java.util.Map map, Object obj, BiFunction biFunction) {
            Objects.requireNonNull(biFunction);
            Object obj2 = map.get(obj);
            Object apply = biFunction.apply(obj, obj2);
            if (apply != null) {
                map.put(obj, apply);
                return apply;
            }
            if (obj2 == null && !map.containsKey(obj)) {
                return null;
            }
            map.remove(obj);
            return null;
        }

        /* JADX WARN: Generic types in debug info not equals: j$.util.function.BiFunction != java.util.function.BiFunction<? super V, ? super V, ? extends V> */
        /* JADX WARN: Multi-variable type inference failed */
        public static Object $default$merge(java.util.Map map, Object obj, Object obj2, BiFunction biFunction) {
            Objects.requireNonNull(biFunction);
            Objects.requireNonNull(obj2);
            Object obj3 = map.get(obj);
            Object apply = obj3 == null ? obj2 : biFunction.apply(obj3, obj2);
            if (apply == null) {
                map.remove(obj);
            } else {
                map.put(obj, apply);
            }
            return apply;
        }
    }
}
