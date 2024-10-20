package defpackage;

import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Xi3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3033Xi3 extends CS0 implements Map.Entry {
    public final /* synthetic */ Map.Entry a;

    @Override // java.util.Map.Entry
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Object getValue() {
        return this.a.getValue();
    }

    public final Object k(Object obj) {
        return this.a.setValue(obj);
    }

    @Override // java.util.Map.Entry
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (V82.a(getKey(), entry.getKey()) && V82.a(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    public C3033Xi3(Map.Entry entry) {
        this.a = entry;
    }

    @Override // defpackage.CS0
    public final Object a() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        return k(obj);
    }
}
