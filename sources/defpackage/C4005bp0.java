package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bp0 */
/* loaded from: classes2.dex */
public final class C4005bp0 extends AbstractC6958kQ1 {
    public final InterfaceC4348cp0 a;
    public final C6614jQ1 b;
    public final HashSet c;
    public final ArrayList d;

    public C4005bp0(String str, ArrayList arrayList, HE he, C6614jQ1 c6614jQ1) {
        HashSet hashSet = new HashSet();
        this.c = hashSet;
        ArrayList arrayList2 = new ArrayList();
        this.d = arrayList2;
        arrayList2.addAll(arrayList);
        this.a = he;
        this.b = c6614jQ1;
        if (hashSet.add(str)) {
            he.s(str, new ArrayList(arrayList2));
        }
    }

    @Override // defpackage.AbstractC6958kQ1
    public final void d(DQ1 dq1) {
        if (dq1.h(this.b)) {
            TR1 a = TR1.a(dq1);
            ArrayList arrayList = this.d;
            if (arrayList.contains(a)) {
                return;
            }
            arrayList.add(a);
            m();
        }
    }

    @Override // defpackage.AbstractC6958kQ1
    public final void f(DQ1 dq1) {
        TR1 a = TR1.a(dq1);
        ArrayList arrayList = this.d;
        if (arrayList.contains(a)) {
            arrayList.remove(a);
            m();
        }
    }

    @Override // defpackage.AbstractC6958kQ1
    public final void e(MQ1 mq1, DQ1 dq1) {
        if (dq1.h(this.b)) {
            d(dq1);
        } else {
            f(dq1);
        }
    }

    public final void m() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((HE) this.a).s((String) it.next(), new ArrayList(this.d));
        }
    }
}
