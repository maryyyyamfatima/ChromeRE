package defpackage;

import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: m53, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7538m53 extends FS0 implements NavigableSet, Serializable {
    public final NavigableSet a;
    public final SortedSet g;
    public transient C7538m53 h;

    @Override // defpackage.CS0
    public final Object a() {
        return this.g;
    }

    public C7538m53(NavigableSet navigableSet) {
        this.a = navigableSet;
        this.g = Collections.unmodifiableSortedSet(navigableSet);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return this.a.lower(obj);
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return this.a.floor(obj);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return this.a.ceiling(obj);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return this.a.higher(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        C7538m53 c7538m53 = this.h;
        if (c7538m53 != null) {
            return c7538m53;
        }
        C7538m53 c7538m532 = new C7538m53(this.a.descendingSet());
        this.h = c7538m532;
        c7538m532.h = this;
        return c7538m532;
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        Iterator descendingIterator = this.a.descendingIterator();
        if (descendingIterator instanceof C14) {
            return (C14) descendingIterator;
        }
        return new C1911Os1(descendingIterator);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return AbstractC7882n53.c(this.a.subSet(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return AbstractC7882n53.c(this.a.headSet(obj, z));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return AbstractC7882n53.c(this.a.tailSet(obj, z));
    }
}
