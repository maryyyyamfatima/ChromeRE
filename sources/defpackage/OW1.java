package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class OW1 extends AbstractSet {
    public final /* synthetic */ QW1 a;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.e;
    }

    public OW1(QW1 qw1) {
        this.a = qw1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new NW1(this);
    }
}
