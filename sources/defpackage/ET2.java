package defpackage;

import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ET2 implements Map.Entry {
    public final Object a;
    public final Object g;
    public ET2 h;
    public ET2 i;

    public ET2(Object obj, Object obj2) {
        this.a = obj;
        this.g = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.g;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.a + "=" + this.g;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ET2)) {
            return false;
        }
        ET2 et2 = (ET2) obj;
        return this.a.equals(et2.a) && this.g.equals(et2.g);
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.a.hashCode() ^ this.g.hashCode();
    }
}
