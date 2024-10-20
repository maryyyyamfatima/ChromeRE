package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Wj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2904Wj extends AbstractSet {
    public final /* synthetic */ C4317ck a;

    public C2904Wj(C4317ck c4317ck) {
        this.a = c4317ck;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C3294Zj(this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.h;
    }
}
