package defpackage;

import j$.util.Map;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ck, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4317ck extends C1439Lb3 implements Map, j$.util.Map {
    public C2904Wj i;
    public C3164Yj j;
    public C3630ak k;

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

    @Override // j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public C4317ck(C4317ck c4317ck) {
        super(0);
        if (c4317ck != null) {
            g(c4317ck);
        }
    }

    public C4317ck() {
    }

    public C4317ck(int i) {
        super(i);
    }

    public final boolean k(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.C1439Lb3, java.util.Map, j$.util.Map
    public final boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    @Override // defpackage.C1439Lb3, java.util.Map, j$.util.Map
    public final boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // defpackage.C1439Lb3, java.util.Map, j$.util.Map
    public final Object get(Object obj) {
        return super.get(obj);
    }

    @Override // defpackage.C1439Lb3, java.util.Map, j$.util.Map
    public final Object remove(Object obj) {
        return super.remove(obj);
    }

    @Override // java.util.Map, j$.util.Map
    public final Set entrySet() {
        C2904Wj c2904Wj = this.i;
        if (c2904Wj != null) {
            return c2904Wj;
        }
        C2904Wj c2904Wj2 = new C2904Wj(this);
        this.i = c2904Wj2;
        return c2904Wj2;
    }

    @Override // java.util.Map, j$.util.Map
    public final Set keySet() {
        C3164Yj c3164Yj = this.j;
        if (c3164Yj != null) {
            return c3164Yj;
        }
        C3164Yj c3164Yj2 = new C3164Yj(this);
        this.j = c3164Yj2;
        return c3164Yj2;
    }

    @Override // java.util.Map, j$.util.Map
    public final Collection values() {
        C3630ak c3630ak = this.k;
        if (c3630ak != null) {
            return c3630ak;
        }
        C3630ak c3630ak2 = new C3630ak(this);
        this.k = c3630ak2;
        return c3630ak2;
    }

    public final boolean l(Collection collection) {
        int i = this.h;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.h;
    }

    public final boolean m(Collection collection) {
        int i = this.h;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(f(i2))) {
                h(i2);
            }
        }
        return i != this.h;
    }

    @Override // java.util.Map, j$.util.Map
    public final void putAll(java.util.Map map) {
        b(map.size() + this.h);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }
}
