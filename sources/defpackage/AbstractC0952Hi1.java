package defpackage;

import j$.util.Map;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Hi1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0952Hi1 implements Map, Serializable, j$.util.Map {
    public transient QL2 a;
    public transient RL2 g;
    public transient SL2 h;

    @Override // j$.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object compute(Object obj, java.util.function.BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, java.util.function.Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, Function.VivifiedWrapper.convert(function));
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, java.util.function.BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public final /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override // java.util.Map, j$.util.Map
    public abstract Object get(Object obj);

    @Override // j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public static TL2 e(Serializable serializable, Object obj) {
        RV.a(serializable, obj);
        return TL2.h(1, new Object[]{serializable, obj}, null);
    }

    public static TL2 f(Class cls, Object obj, Class cls2, Object obj2, Class cls3, Object obj3) {
        RV.a(cls, obj);
        RV.a(cls2, obj2);
        RV.a(cls3, obj3);
        return TL2.h(3, new Object[]{cls, obj, cls2, obj2, cls3, obj3}, null);
    }

    public static TL2 g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        RV.a(obj, obj2);
        RV.a(obj3, obj4);
        RV.a(obj5, obj6);
        RV.a(obj7, obj8);
        RV.a(obj9, obj10);
        return TL2.h(5, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10}, null);
    }

    public static C0822Gi1 a() {
        return new C0822Gi1(4);
    }

    public static AbstractC0952Hi1 b(java.util.Map map) {
        if ((map instanceof AbstractC0952Hi1) && !(map instanceof SortedMap)) {
            AbstractC0952Hi1 abstractC0952Hi1 = (AbstractC0952Hi1) map;
            abstractC0952Hi1.getClass();
            return abstractC0952Hi1;
        }
        Set entrySet = map.entrySet();
        C0822Gi1 c0822Gi1 = new C0822Gi1(entrySet instanceof Collection ? entrySet.size() : 4);
        c0822Gi1.c(entrySet);
        return c0822Gi1.a(true);
    }

    @Override // java.util.Map, j$.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final void putAll(java.util.Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean isEmpty() {
        return ((TL2) this).k == 0;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map, j$.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final AbstractC1472Li1 entrySet() {
        QL2 ql2 = this.a;
        if (ql2 != null) {
            return ql2;
        }
        TL2 tl2 = (TL2) this;
        QL2 ql22 = new QL2(tl2, tl2.j, tl2.k);
        this.a = ql22;
        return ql22;
    }

    @Override // java.util.Map, j$.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final AbstractC1472Li1 keySet() {
        RL2 rl2 = this.g;
        if (rl2 != null) {
            return rl2;
        }
        TL2 tl2 = (TL2) this;
        RL2 rl22 = new RL2(tl2, new SL2(0, tl2.k, tl2.j));
        this.g = rl22;
        return rl22;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean containsValue(Object obj) {
        SL2 sl2 = this.h;
        if (sl2 == null) {
            TL2 tl2 = (TL2) this;
            SL2 sl22 = new SL2(1, tl2.k, tl2.j);
            this.h = sl22;
            sl2 = sl22;
        }
        return sl2.contains(obj);
    }

    @Override // java.util.Map, j$.util.Map
    public final Collection values() {
        SL2 sl2 = this.h;
        if (sl2 != null) {
            return sl2;
        }
        TL2 tl2 = (TL2) this;
        SL2 sl22 = new SL2(1, tl2.k, tl2.j);
        this.h = sl22;
        return sl22;
    }

    @Override // java.util.Map, j$.util.Map
    public final int hashCode() {
        return AbstractC7882n53.a(entrySet());
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof java.util.Map) {
            return entrySet().equals(((java.util.Map) obj).entrySet());
        }
        return false;
    }

    public final String toString() {
        int i = ((TL2) this).k;
        RV.b(i, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(i * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
