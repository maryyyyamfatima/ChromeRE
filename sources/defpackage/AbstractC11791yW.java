package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yW, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11791yW extends AbstractC11105wW {
    public static final boolean a(Iterable iterable, Object obj) {
        int i;
        AbstractC0087Ar1.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (!(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                Object next = it.next();
                if (i2 >= 0) {
                    if (AbstractC0087Ar1.a(obj, next)) {
                        i = i2;
                        break;
                    }
                    i2++;
                } else {
                    throw new ArithmeticException("Index overflow has happened.");
                }
            }
        } else {
            i = ((List) iterable).indexOf(obj);
        }
        return i >= 0;
    }

    public static final void b(Iterable iterable, AbstractCollection abstractCollection) {
        AbstractC0087Ar1.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static final Set c(ArrayList arrayList) {
        C10310uA0 c10310uA0 = C10310uA0.a;
        int size = arrayList.size();
        if (size == 0) {
            return c10310uA0;
        }
        if (size == 1) {
            Set singleton = Collections.singleton(arrayList.get(0));
            AbstractC0087Ar1.d(singleton, "singleton(element)");
            return singleton;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC3846bM1.a(arrayList.size()));
        b(arrayList, linkedHashSet);
        return linkedHashSet;
    }
}
