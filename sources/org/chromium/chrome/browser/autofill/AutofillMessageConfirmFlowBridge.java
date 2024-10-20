package org.chromium.chrome.browser.autofill;

import J.N;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.AbstractC11227wr;
import defpackage.AbstractC5103f04;
import defpackage.C0860Gq;
import defpackage.C10245tz1;
import defpackage.C2289Rq;
import defpackage.C9512rr;
import defpackage.C9902sz1;
import defpackage.InterfaceC0730Fq;
import defpackage.InterfaceC10884vr;
import defpackage.InterfaceC2159Qq;
import defpackage.RunnableC1510Lq;
import java.util.Iterator;
import java.util.LinkedList;
import org.chromium.base.task.PostTask;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AutofillMessageConfirmFlowBridge implements InterfaceC0730Fq, InterfaceC2159Qq, InterfaceC10884vr {
    public AbstractC11227wr a;
    public long b;
    public final WindowAndroid c;
    public final LinkedList d = new LinkedList();

    public AutofillMessageConfirmFlowBridge(long j, WindowAndroid windowAndroid) {
        this.b = j;
        this.c = windowAndroid;
    }

    @Override // defpackage.InterfaceC10884vr
    public final void c() {
        long j = this.b;
        if (j == 0) {
            return;
        }
        N.M25jn5gd(j);
    }

    @Override // defpackage.InterfaceC2159Qq
    public final void d(String str) {
        N.MJf5_DPQ(this.b, str);
    }

    @Override // defpackage.InterfaceC0730Fq
    public final void a(String str, String str2) {
        N.M_2nL5Q3(this.b, str, str2);
    }

    @Override // defpackage.InterfaceC10884vr
    public final void e() {
        N.Ml1UCNSp(this.b);
    }

    @Override // defpackage.InterfaceC10884vr
    public final void b(String str) {
        N.M8yo3Hbh(this.b, str);
    }

    public static AutofillMessageConfirmFlowBridge create(long j, WindowAndroid windowAndroid) {
        return new AutofillMessageConfirmFlowBridge(j, windowAndroid);
    }

    public final void fixDate(String str, String str2, String str3, String str4) {
        boolean z;
        WindowAndroid windowAndroid = this.c;
        Activity activity = (Activity) windowAndroid.k().get();
        if (activity == null) {
            PostTask.c(AbstractC5103f04.a, new RunnableC1510Lq(this));
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (this.a == null) {
                C0860Gq c0860Gq = new C0860Gq(activity, this, str, 0, str2, str3, str4, true);
                View view = c0860Gq.j;
                view.findViewById(R.id.message_divider).setVisibility(0);
                view.findViewById(R.id.google_pay_logo).setVisibility(0);
                this.a = c0860Gq;
                Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    this.a.b((C10245tz1) it.next());
                }
            }
            this.a.d(activity, windowAndroid.s());
        }
    }

    public final void fixName(String str, String str2, String str3, String str4, String str5) {
        boolean z;
        WindowAndroid windowAndroid = this.c;
        Activity activity = (Activity) windowAndroid.k().get();
        if (activity == null) {
            PostTask.c(AbstractC5103f04.a, new RunnableC1510Lq(this));
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (this.a == null) {
                C2289Rq c2289Rq = new C2289Rq(activity, this, str2, str, 0, str4, str5, true);
                View view = c2289Rq.j;
                view.findViewById(R.id.cc_details).setVisibility(0);
                ((TextView) view.findViewById(R.id.cc_details_masked)).setText(str3);
                this.a = c2289Rq;
                Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    this.a.b((C10245tz1) it.next());
                }
            }
            this.a.d(activity, windowAndroid.s());
        }
    }

    public final void confirmSaveCard(String str, String str2, String str3, String str4) {
        boolean z;
        WindowAndroid windowAndroid = this.c;
        Activity activity = (Activity) windowAndroid.k().get();
        if (activity == null) {
            PostTask.c(AbstractC5103f04.a, new RunnableC1510Lq(this));
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (this.a == null) {
                this.a = new C9512rr(activity, this, str, str2, str3, str4);
                Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    this.a.b((C10245tz1) it.next());
                }
            }
            this.a.d(activity, windowAndroid.s());
        }
    }

    public final void dismiss() {
        AbstractC11227wr abstractC11227wr = this.a;
        if (abstractC11227wr != null) {
            abstractC11227wr.h.c(4, abstractC11227wr.g);
        }
    }

    public final void nativeBridgeDestroyed() {
        this.b = 0L;
    }

    public final void addLegalMessageLine(String str) {
        this.d.add(new C10245tz1(str));
    }

    public final void addLinkToLastLegalMessageLine(int i, int i2, String str) {
        ((C10245tz1) this.d.getLast()).b.add(new C9902sz1(i, i2, str));
    }
}
