package defpackage;

import android.os.IInterface;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wt4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11244wt4 extends AbstractRunnableC9872st4 {
    public final /* synthetic */ AbstractRunnableC9872st4 g;
    public final /* synthetic */ Jt4 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11244wt4(Jt4 jt4, Vv4 vv4, AbstractRunnableC9872st4 abstractRunnableC9872st4) {
        super(vv4);
        this.h = jt4;
        this.g = abstractRunnableC9872st4;
    }

    @Override // defpackage.AbstractRunnableC9872st4
    public final void a() {
        Jt4 jt4 = this.h;
        IInterface iInterface = jt4.k;
        ArrayList arrayList = jt4.d;
        AbstractRunnableC9872st4 abstractRunnableC9872st4 = this.g;
        C9187qt4 c9187qt4 = jt4.b;
        if (iInterface != null || jt4.e) {
            if (!jt4.e) {
                abstractRunnableC9872st4.run();
                return;
            } else {
                c9187qt4.b(4, "Waiting to bind to the service.", new Object[0]);
                arrayList.add(abstractRunnableC9872st4);
                return;
            }
        }
        c9187qt4.b(4, "Initiate binding to the service.", new Object[0]);
        arrayList.add(abstractRunnableC9872st4);
        Ht4 ht4 = new Ht4(jt4);
        jt4.j = ht4;
        jt4.e = true;
        if (jt4.a.bindService(jt4.f, ht4, 1)) {
            return;
        }
        c9187qt4.b(4, "Failed to bind to the service.", new Object[0]);
        jt4.e = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractRunnableC9872st4 abstractRunnableC9872st42 = (AbstractRunnableC9872st4) it.next();
            Lt4 lt4 = new Lt4();
            Vv4 vv4 = abstractRunnableC9872st42.a;
            if (vv4 != null) {
                vv4.a(lt4);
            }
        }
        arrayList.clear();
    }
}
