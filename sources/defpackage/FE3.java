package defpackage;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class FE3 extends AbstractSet {
    public final int a;
    public final /* synthetic */ GE3 g;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        GE3 ge3 = this.g;
        Object[] objArr = ge3.a;
        int a = a();
        int[] iArr = ge3.g;
        int i = this.a;
        return Arrays.binarySearch(objArr, a, iArr[i + 1], obj, i == -1 ? GE3.k : ME3.b) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.g.g[this.a + 1] - a();
    }

    public FE3(GE3 ge3, int i) {
        this.g = ge3;
        this.a = i;
    }

    public final int a() {
        int i = this.a;
        if (i == -1) {
            return 0;
        }
        return this.g.g[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new EE3(this);
    }
}
