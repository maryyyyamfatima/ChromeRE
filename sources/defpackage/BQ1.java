package defpackage;

import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class BQ1 {
    public final AbstractC4896eQ1 a;
    public final int b;
    public final DQ1 c;
    public final DQ1 d;
    public final DQ1 e;
    public final ArrayList f;
    public final WeakReference g;
    public RD1 h = null;
    public boolean i = false;
    public boolean j = false;

    public BQ1(C11420xQ1 c11420xQ1, DQ1 dq1, AbstractC4896eQ1 abstractC4896eQ1, int i, DQ1 dq12, Collection collection) {
        this.g = new WeakReference(c11420xQ1);
        this.d = dq1;
        this.a = abstractC4896eQ1;
        this.b = i;
        this.c = c11420xQ1.t;
        this.e = dq12;
        this.f = collection != null ? new ArrayList(collection) : null;
        c11420xQ1.n.postDelayed(new RunnableC12106zQ1(this), 15000L);
    }

    public final void b() {
        RD1 rd1;
        MQ1.b();
        if (this.i || this.j) {
            return;
        }
        WeakReference weakReference = this.g;
        C11420xQ1 c11420xQ1 = (C11420xQ1) weakReference.get();
        if (c11420xQ1 == null || c11420xQ1.C != this || ((rd1 = this.h) != null && rd1.isCancelled())) {
            a();
            return;
        }
        this.i = true;
        c11420xQ1.C = null;
        C11420xQ1 c11420xQ12 = (C11420xQ1) weakReference.get();
        int i = this.b;
        DQ1 dq1 = this.c;
        if (c11420xQ12 != null && c11420xQ12.t == dq1) {
            Message obtainMessage = c11420xQ12.n.obtainMessage(263, dq1);
            obtainMessage.arg1 = i;
            obtainMessage.sendToTarget();
            AbstractC4896eQ1 abstractC4896eQ1 = c11420xQ12.u;
            if (abstractC4896eQ1 != null) {
                abstractC4896eQ1.h(i);
                c11420xQ12.u.d();
            }
            HashMap hashMap = c11420xQ12.x;
            if (!hashMap.isEmpty()) {
                for (AbstractC4896eQ1 abstractC4896eQ12 : hashMap.values()) {
                    abstractC4896eQ12.h(i);
                    abstractC4896eQ12.d();
                }
                hashMap.clear();
            }
            c11420xQ12.u = null;
        }
        C11420xQ1 c11420xQ13 = (C11420xQ1) weakReference.get();
        if (c11420xQ13 == null) {
            return;
        }
        DQ1 dq12 = this.d;
        c11420xQ13.t = dq12;
        c11420xQ13.u = this.a;
        HandlerC8677pQ1 handlerC8677pQ1 = c11420xQ13.n;
        DQ1 dq13 = this.e;
        if (dq13 == null) {
            Message obtainMessage2 = handlerC8677pQ1.obtainMessage(262, new C8776pi2(dq1, dq12));
            obtainMessage2.arg1 = i;
            obtainMessage2.sendToTarget();
        } else {
            Message obtainMessage3 = handlerC8677pQ1.obtainMessage(264, new C8776pi2(dq13, dq12));
            obtainMessage3.arg1 = i;
            obtainMessage3.sendToTarget();
        }
        c11420xQ13.x.clear();
        c11420xQ13.h();
        c11420xQ13.n();
        ArrayList arrayList = this.f;
        if (arrayList != null) {
            c11420xQ13.t.n(arrayList);
        }
    }

    public final void a() {
        if (this.i || this.j) {
            return;
        }
        this.j = true;
        AbstractC4896eQ1 abstractC4896eQ1 = this.a;
        if (abstractC4896eQ1 != null) {
            abstractC4896eQ1.h(0);
            abstractC4896eQ1.d();
        }
    }
}
