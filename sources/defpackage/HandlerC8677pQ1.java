package defpackage;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pQ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC8677pQ1 extends Handler {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final /* synthetic */ C11420xQ1 c;

    public HandlerC8677pQ1(C11420xQ1 c11420xQ1) {
        this.c = c11420xQ1;
    }

    public final void b(int i, Object obj) {
        obtainMessage(i, obj).sendToTarget();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int l;
        ArrayList arrayList = this.a;
        int i = message.what;
        Object obj = message.obj;
        int i2 = message.arg1;
        C11420xQ1 c11420xQ1 = this.c;
        if (i == 259 && c11420xQ1.f().c.equals(((DQ1) obj).c)) {
            c11420xQ1.q(true);
        }
        ArrayList arrayList2 = this.b;
        if (i == 262) {
            DQ1 dq1 = (DQ1) ((C8776pi2) obj).b;
            c11420xQ1.c.r(dq1);
            if (c11420xQ1.r != null && dq1.d()) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    c11420xQ1.c.q((DQ1) it.next());
                }
                arrayList2.clear();
            }
        } else if (i != 264) {
            switch (i) {
                case 257:
                    c11420xQ1.c.p((DQ1) obj);
                    break;
                case 258:
                    c11420xQ1.c.q((DQ1) obj);
                    break;
                case 259:
                    C0104Au3 c0104Au3 = c11420xQ1.c;
                    DQ1 dq12 = (DQ1) obj;
                    c0104Au3.getClass();
                    if (dq12.b() != c0104Au3 && (l = c0104Au3.l(dq12)) >= 0) {
                        c0104Au3.w((C11592xu3) c0104Au3.w.get(l));
                        break;
                    }
                    break;
            }
        } else {
            DQ1 dq13 = (DQ1) ((C8776pi2) obj).b;
            arrayList2.add(dq13);
            c11420xQ1.c.p(dq13);
            c11420xQ1.c.r(dq13);
        }
        try {
            int size = c11420xQ1.g.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ArrayList arrayList3 = c11420xQ1.g;
                    MQ1 mq1 = (MQ1) ((WeakReference) arrayList3.get(size)).get();
                    if (mq1 == null) {
                        arrayList3.remove(size);
                    } else {
                        arrayList.addAll(mq1.b);
                    }
                } else {
                    int size2 = arrayList.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        a((C7302lQ1) arrayList.get(i3), i, obj, i2);
                    }
                    return;
                }
            }
        } finally {
            arrayList.clear();
        }
    }

    public static void a(C7302lQ1 c7302lQ1, int i, Object obj, int i2) {
        boolean z;
        MQ1 mq1 = c7302lQ1.a;
        int i3 = 65280 & i;
        AbstractC6958kQ1 abstractC6958kQ1 = c7302lQ1.b;
        if (i3 != 256) {
            if (i3 != 512) {
                if (i3 == 768 && i == 769) {
                    abstractC6958kQ1.l((C5245fR1) obj);
                    return;
                }
                return;
            }
            switch (i) {
                case 513:
                    abstractC6958kQ1.a();
                    return;
                case 514:
                    abstractC6958kQ1.c();
                    return;
                case 515:
                    abstractC6958kQ1.b();
                    return;
                default:
                    return;
            }
        }
        DQ1 dq1 = (i == 264 || i == 262) ? (DQ1) ((C8776pi2) obj).b : (DQ1) obj;
        DQ1 dq12 = (i == 264 || i == 262) ? (DQ1) ((C8776pi2) obj).a : null;
        if (dq1 != null) {
            boolean z2 = true;
            if ((c7302lQ1.d & 2) == 0 && !dq1.h(c7302lQ1.c)) {
                C11420xQ1 c = MQ1.c();
                if (c != null) {
                    C5245fR1 c5245fR1 = c.q;
                    if (c5245fR1 == null ? false : c5245fR1.c) {
                        z = true;
                        z2 = (!z && dq1.d() && i == 262 && i2 == 3 && dq12 != null) ? true ^ dq12.d() : false;
                    }
                }
                z = false;
                if (!z) {
                }
            }
            if (z2) {
                switch (i) {
                    case 257:
                        abstractC6958kQ1.d(dq1);
                        return;
                    case 258:
                        abstractC6958kQ1.f(dq1);
                        return;
                    case 259:
                        abstractC6958kQ1.e(mq1, dq1);
                        return;
                    case 260:
                        abstractC6958kQ1.k(dq1);
                        return;
                    case 261:
                        abstractC6958kQ1.getClass();
                        return;
                    case 262:
                        abstractC6958kQ1.h(mq1, dq1, i2);
                        return;
                    case 263:
                        abstractC6958kQ1.j(mq1, dq1, i2);
                        return;
                    case 264:
                        abstractC6958kQ1.h(mq1, dq1, i2);
                        return;
                    default:
                        return;
                }
            }
        }
    }
}
