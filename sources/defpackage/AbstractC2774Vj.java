package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Vj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2774Vj extends X {
    public AbstractC2774Vj(OY oy) {
        super(oy);
    }

    @Override // defpackage.X
    public final Collection f(Collection collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // defpackage.X
    public final Collection g(Object obj, Collection collection) {
        List list = (List) collection;
        if (list instanceof RandomAccess) {
            return new M(this, obj, list, null);
        }
        return new T(this, obj, list, null);
    }

    @Override // defpackage.X
    public final boolean e(Object obj, Object obj2) {
        return super.e(obj, obj2);
    }

    @Override // defpackage.AbstractC5098f0
    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // defpackage.AbstractC5098f0, defpackage.InterfaceC8195o02
    public final Map a() {
        Map map = this.g;
        if (map != null) {
            return map;
        }
        Map b = b();
        this.g = b;
        return b;
    }
}
