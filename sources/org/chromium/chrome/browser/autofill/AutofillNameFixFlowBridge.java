package org.chromium.chrome.browser.autofill;

import J.N;
import android.app.Activity;
import defpackage.AbstractC5103f04;
import defpackage.C2289Rq;
import defpackage.InterfaceC2159Qq;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.autofill.AutofillNameFixFlowBridge;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class AutofillNameFixFlowBridge implements InterfaceC2159Qq {
    public final long a;
    public final Activity b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public C2289Rq g;

    @Override // defpackage.InterfaceC10884vr
    public final void b(String str) {
    }

    public AutofillNameFixFlowBridge(long j, String str, String str2, String str3, int i, WindowAndroid windowAndroid) {
        this.a = j;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = i;
        Activity activity = (Activity) windowAndroid.k().get();
        this.b = activity;
        if (activity == null) {
            this.g = null;
            PostTask.c(AbstractC5103f04.a, new Runnable() { // from class: Mq
                @Override // java.lang.Runnable
                public final void run() {
                    AutofillNameFixFlowBridge.this.c();
                }
            });
        }
    }

    public static AutofillNameFixFlowBridge create(long j, String str, String str2, String str3, int i, WindowAndroid windowAndroid) {
        return new AutofillNameFixFlowBridge(j, str, str2, str3, i, windowAndroid);
    }

    public final void show(WindowAndroid windowAndroid) {
        C2289Rq c2289Rq = new C2289Rq(this.b, this, this.d, this.c, this.f, null, this.e, false);
        this.g = c2289Rq;
        c2289Rq.d((Activity) windowAndroid.k().get(), windowAndroid.s());
    }

    public final void dismiss() {
        C2289Rq c2289Rq = this.g;
        if (c2289Rq != null) {
            c2289Rq.h.c(4, c2289Rq.g);
        }
    }

    @Override // defpackage.InterfaceC10884vr
    public final void c() {
        N.MriHT7LJ(this.a, this);
    }

    @Override // defpackage.InterfaceC10884vr
    public final void e() {
        N.MDdVATYP(this.a);
    }

    @Override // defpackage.InterfaceC2159Qq
    public final void d(String str) {
        N.MW86M3Ok(this.a, this, str);
    }
}
