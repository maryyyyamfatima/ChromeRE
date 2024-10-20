package defpackage;

import java.io.Serializable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zi1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12204zi1 extends AbstractC3724b0 implements Serializable {
    public final Object a;
    public final Object g;

    public C12204zi1(Object obj, Object obj2) {
        this.a = obj;
        this.g = obj2;
    }

    @Override // defpackage.AbstractC3724b0, java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // defpackage.AbstractC3724b0, java.util.Map.Entry
    public final Object getValue() {
        return this.g;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
