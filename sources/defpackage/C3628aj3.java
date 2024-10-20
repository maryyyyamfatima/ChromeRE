package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: aj3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3628aj3 extends AbstractC6850k53 {
    public final /* synthetic */ C6168i61 a;
    public final /* synthetic */ C3972bj3 g;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final boolean isEmpty() {
        return this.a.g.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void clear() {
        this.a.g.clear();
    }

    public C3628aj3(C3972bj3 c3972bj3) {
        this.g = c3972bj3;
        this.a = c3972bj3.i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Set keySet = this.g.i.g.keySet();
        return new UL1(keySet.iterator(), new C3293Zi3(this));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.g.i.g.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean z;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() == null || !(entry.getValue() instanceof Map)) {
            return false;
        }
        try {
            z = this.g.i.g.entrySet().contains(entry);
        } catch (ClassCastException | NullPointerException unused) {
            z = false;
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return entry.getKey() != null && (entry.getValue() instanceof Map) && this.g.i.g.entrySet().remove(entry);
    }
}
