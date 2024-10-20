package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class GT0 {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        if (!it.hasNext()) {
            return arrayList;
        }
        X5.a(it.next());
        throw null;
    }

    public static void b(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            X5.a(it.next());
            throw null;
        }
    }
}
