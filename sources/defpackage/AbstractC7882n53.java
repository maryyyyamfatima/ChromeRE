package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: n53, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7882n53 {
    public static int a(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    public static NavigableSet c(NavigableSet navigableSet) {
        return ((navigableSet instanceof AbstractC11861yi1) || (navigableSet instanceof C7538m53)) ? navigableSet : new C7538m53(navigableSet);
    }

    public static boolean b(Set set, Collection collection) {
        if (collection instanceof B02) {
            collection = ((AbstractC6130i0) ((B02) collection)).b();
        }
        boolean z = false;
        if ((collection instanceof Set) && collection.size() > set.size()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            z |= set.remove(it2.next());
        }
        return z;
    }
}
