package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class Q40 {
    public final List a;
    public final List b;
    public final List c;
    public final ArrayList d;
    public final ArrayList e;

    public Q40(List list, List list2, List list3, List list4, List list5) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        if (list4 != null) {
            this.d = new ArrayList();
            Iterator it = list4.iterator();
            while (it.hasNext()) {
                this.d.add(((C4687do2) it.next()).b());
            }
        } else {
            this.d = null;
        }
        if (list5 != null) {
            this.e = new ArrayList();
            Iterator it2 = list5.iterator();
            while (it2.hasNext()) {
                this.e.add(((H40) it2.next()).b());
            }
            return;
        }
        this.e = null;
    }
}
