package defpackage;

import java.util.Comparator;
import java.util.SortedSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class W extends Q implements SortedSet {
    public final /* synthetic */ X k;

    public SortedSet f() {
        return (SortedSet) this.g;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(X x, Object obj, SortedSet sortedSet, Q q) {
        super(x, obj, sortedSet, q);
        this.k = x;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return f().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        b();
        return f().first();
    }

    @Override // java.util.SortedSet
    public final Object last() {
        b();
        return f().last();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        b();
        SortedSet headSet = f().headSet(obj);
        Q q = this.h;
        if (q == null) {
            q = this;
        }
        return new W(this.k, this.a, headSet, q);
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        b();
        SortedSet subSet = f().subSet(obj, obj2);
        Q q = this.h;
        if (q == null) {
            q = this;
        }
        return new W(this.k, this.a, subSet, q);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        b();
        SortedSet tailSet = f().tailSet(obj);
        Q q = this.h;
        if (q == null) {
            q = this;
        }
        return new W(this.k, this.a, tailSet, q);
    }
}
