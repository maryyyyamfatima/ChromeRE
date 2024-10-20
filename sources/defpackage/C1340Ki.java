package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.app.a;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ki */
/* loaded from: classes2.dex */
public final class C1340Ki implements InterfaceC0950Hi, InterfaceC6377ij3, T20 {
    public ViewOnKeyListenerC11859yi a;
    public C0820Gi g;
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public final View j;
    public final Context k;
    public final InterfaceC2379Si l;
    public final InterfaceC0560Ei m;
    public final View n;
    public final I5 o;
    public final InterfaceC0079Ap3 p;
    public Integer q;

    @Override // defpackage.InterfaceC6377ij3
    public final void f() {
    }

    public C1340Ki(a aVar, InterfaceC2379Si interfaceC2379Si, InterfaceC0560Ei interfaceC0560Ei, View view, I5 i5, View view2, HQ2 hq2) {
        this.k = aVar;
        this.m = interfaceC0560Ei;
        this.l = interfaceC2379Si;
        this.n = view;
        this.j = view2;
        this.p = hq2;
        this.o = i5;
        i5.b(this);
    }

    public final void h(Integer num) {
        Integer num2 = this.q;
        if (num2 == null && num == null) {
            return;
        }
        if (num2 == null || !num2.equals(num)) {
            this.q = num;
            boolean z = num != null;
            Iterator it = this.i.iterator();
            while (it.hasNext()) {
                QS1 qs1 = (QS1) ((InterfaceC2249Ri) it.next());
                qs1.g.k(TS1.e, z);
                C3799bD c3799bD = qs1.e;
                if (z) {
                    qs1.n = c3799bD.w(qs1.n);
                } else {
                    c3799bD.u(qs1.n);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:240:0x0697, code lost:            if (r6 != 2) goto L1410;     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01e0, code lost:            if (r2 != (-1)) goto L1268;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k(android.view.View r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 1875
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1340Ki.k(android.view.View, boolean):boolean");
    }

    public final boolean b() {
        ViewOnKeyListenerC11859yi viewOnKeyListenerC11859yi = this.a;
        if (viewOnKeyListenerC11859yi == null) {
            return false;
        }
        PopupWindow popupWindow = viewOnKeyListenerC11859yi.k;
        return popupWindow == null ? false : popupWindow.isShowing();
    }

    public final void a() {
        ViewOnKeyListenerC11859yi viewOnKeyListenerC11859yi = this.a;
        if (viewOnKeyListenerC11859yi != null) {
            PopupWindow popupWindow = viewOnKeyListenerC11859yi.k;
            if (popupWindow == null ? false : popupWindow.isShowing()) {
                this.a.a();
            }
        }
    }

    @Override // defpackage.InterfaceC6377ij3
    public final void g() {
        a();
    }

    @Override // defpackage.T20
    public final void onConfigurationChanged(Configuration configuration) {
        a();
    }

    public final void d(boolean z) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i >= arrayList.size()) {
                return;
            }
            QS1 qs1 = (QS1) ((InterfaceC2249Ri) arrayList.get(i));
            C3799bD c3799bD = qs1.e;
            if (z) {
                qs1.f.a();
                View currentFocus = qs1.i.getCurrentFocus();
                if (currentFocus != null) {
                    qs1.j.d(currentFocus);
                }
                if (!((Boolean) qs1.o.get()).booleanValue()) {
                    if (((RS1) qs1.g.i(TS1.h)).a) {
                        qs1.a(true);
                        qs1.h.run();
                    }
                }
                qs1.m = c3799bD.w(qs1.m);
            } else {
                c3799bD.u(qs1.m);
            }
            if (z) {
                qs1.s.run();
            }
            i++;
        }
    }

    public final boolean j() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i >= arrayList.size()) {
                return true;
            }
            if (!((InterfaceC12202zi) arrayList.get(i)).X()) {
                return false;
            }
            i++;
        }
    }
}
