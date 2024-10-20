package org.chromium.chrome.browser.autofill;

import J.N;
import android.app.Activity;
import defpackage.AbstractC5103f04;
import defpackage.C0860Gq;
import defpackage.InterfaceC0730Fq;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.autofill.AutofillExpirationDateFixFlowBridge;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class AutofillExpirationDateFixFlowBridge implements InterfaceC0730Fq {
    public long a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public C0860Gq f;

    @Override // defpackage.InterfaceC10884vr
    public final void b(String str) {
    }

    public AutofillExpirationDateFixFlowBridge(long j, String str, String str2, int i, String str3) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
    }

    public static AutofillExpirationDateFixFlowBridge create(long j, String str, String str2, int i, String str3) {
        return new AutofillExpirationDateFixFlowBridge(j, str, str2, i, str3);
    }

    @Override // defpackage.InterfaceC10884vr
    public final void c() {
        N.MYC4Z0Ea(this.a, this);
        this.a = 0L;
    }

    @Override // defpackage.InterfaceC0730Fq
    public final void a(String str, String str2) {
        N.MX7djb2r(this.a, this, str, str2);
    }

    @Override // defpackage.InterfaceC10884vr
    public final void e() {
        N.MVtRWd5A(this.a, this);
    }

    public final void show(WindowAndroid windowAndroid) {
        Activity activity = (Activity) windowAndroid.k().get();
        if (activity != null) {
            C0860Gq c0860Gq = new C0860Gq(activity, this, this.b, this.d, this.e, null, this.c, false);
            this.f = c0860Gq;
            c0860Gq.d(activity, windowAndroid.s());
            return;
        }
        PostTask.c(AbstractC5103f04.a, new Runnable() { // from class: Cq
            @Override // java.lang.Runnable
            public final void run() {
                AutofillExpirationDateFixFlowBridge.this.c();
            }
        });
    }

    public final void dismiss() {
        C0860Gq c0860Gq = this.f;
        if (c0860Gq != null) {
            c0860Gq.h.c(4, c0860Gq.g);
        }
    }
}
