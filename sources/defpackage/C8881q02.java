package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: q02 */
/* loaded from: classes.dex */
public final class C8881q02 extends X {
    public final transient InterfaceC0209Bp3 j;

    public C8881q02(OY oy, C8538p02 c8538p02) {
        super(oy);
        this.j = c8538p02;
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

    @Override // defpackage.X
    public final Collection c() {
        return (Set) this.j.get();
    }

    @Override // defpackage.X
    public final Collection f(Collection collection) {
        if (collection instanceof NavigableSet) {
            return AbstractC7882n53.c((NavigableSet) collection);
        }
        if (collection instanceof SortedSet) {
            return Collections.unmodifiableSortedSet((SortedSet) collection);
        }
        return Collections.unmodifiableSet((Set) collection);
    }

    @Override // defpackage.X
    public final Collection g(Object obj, Collection collection) {
        if (collection instanceof NavigableSet) {
            return new U(this, obj, (NavigableSet) collection, null);
        }
        if (collection instanceof SortedSet) {
            return new W(this, obj, (SortedSet) collection, null);
        }
        return new V(this, obj, (Set) collection);
    }

    @Override // defpackage.X
    public final Set d() {
        Map map = this.h;
        if (map instanceof NavigableMap) {
            return new L(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new O(this, (SortedMap) map);
        }
        return new J(this, map);
    }

    @Override // defpackage.X
    public final Map b() {
        Map map = this.h;
        if (map instanceof NavigableMap) {
            return new K(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new N(this, (SortedMap) map);
        }
        return new H(this, map);
    }
}
