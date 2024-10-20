package defpackage;

import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bj3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3972bj3 extends ZL1 {
    public final /* synthetic */ C6168i61 i;

    public C3972bj3(C6168i61 c6168i61) {
        this.i = c6168i61;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        boolean z;
        C6168i61 c6168i61 = this.i;
        if (obj == null) {
            c6168i61.getClass();
            return false;
        }
        try {
            z = c6168i61.g.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            z = false;
        }
        return z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        boolean z;
        C6168i61 c6168i61 = this.i;
        boolean z2 = false;
        if (obj == null) {
            c6168i61.getClass();
        } else {
            try {
                z = c6168i61.g.containsKey(obj);
            } catch (ClassCastException | NullPointerException unused) {
                z = false;
            }
            if (z) {
                z2 = true;
            }
        }
        if (!z2) {
            return null;
        }
        Objects.requireNonNull(obj);
        return new C3163Yi3(c6168i61, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        return (Map) this.i.g.remove(obj);
    }

    @Override // defpackage.ZL1
    public final Set a() {
        return new C3628aj3(this);
    }
}
