package defpackage;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ns1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1781Ns1 {
    public static void b(List list, InterfaceC6808jy2 interfaceC6808jy2, int i, int i2) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i2) {
                break;
            } else if (interfaceC6808jy2.apply(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            } else {
                list.remove(i2);
            }
        }
    }

    public static String c(Iterable iterable) {
        Iterator it = iterable.iterator();
        StringBuilder sb = new StringBuilder("[");
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(it.next());
            z = false;
        }
        sb.append(']');
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object a(AbstractCollection abstractCollection) {
        Object next;
        if (abstractCollection instanceof List) {
            List list = (List) abstractCollection;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return list.get(list.size() - 1);
        }
        Iterator it = abstractCollection.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }
}
