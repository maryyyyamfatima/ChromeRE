package defpackage;

import java.util.Comparator;
import java.util.SortedSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class FS0 extends ES0 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((C7538m53) this).g.comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return ((C7538m53) this).g.first();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return ((C7538m53) this).g.headSet(obj);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return ((C7538m53) this).g.last();
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return ((C7538m53) this).g.subSet(obj, obj2);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return ((C7538m53) this).g.tailSet(obj);
    }
}
