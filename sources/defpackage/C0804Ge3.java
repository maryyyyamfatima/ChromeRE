package defpackage;

import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ge3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0804Ge3 implements Map.Entry, Comparable {
    public final Comparable a;
    public Object g;
    public final /* synthetic */ C0284Ce3 h;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a.compareTo(((C0804Ge3) obj).a);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    public C0804Ge3(C0284Ce3 c0284Ce3, Comparable comparable, Object obj) {
        this.h = c0284Ce3;
        this.a = comparable;
        this.g = obj;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.g;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i = C0284Ce3.l;
        this.h.b();
        Object obj2 = this.g;
        this.g = obj;
        return obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean equals;
        boolean equals2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Comparable comparable = this.a;
        if (comparable == null) {
            equals = key == null;
        } else {
            equals = comparable.equals(key);
        }
        if (equals) {
            Object obj2 = this.g;
            Object value = entry.getValue();
            if (obj2 == null) {
                equals2 = value == null;
            } else {
                equals2 = obj2.equals(value);
            }
            if (equals2) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.a;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.g;
        return (obj != null ? obj.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        return AbstractC8192o0.a(String.valueOf(this.a), "=", String.valueOf(this.g));
    }
}
