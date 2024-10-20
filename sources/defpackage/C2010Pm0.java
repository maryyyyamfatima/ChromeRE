package defpackage;

import android.os.Bundle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Pm0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2010Pm0 implements TX3 {
    public final /* synthetic */ String a;
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ IX3 c;
    public final /* synthetic */ Runnable d;
    public final /* synthetic */ Runnable e;

    public C2010Pm0(String str, Bundle bundle, IX3 ix3, Runnable runnable, Runnable runnable2) {
        this.a = str;
        this.b = bundle;
        this.c = ix3;
        this.d = runnable;
        this.e = runnable2;
    }

    @Override // defpackage.TX3
    public final void b(C1193Je2 c1193Je2, ZX3 zx3) {
        Bundle bundle;
        Runnable runnable = this.d;
        boolean z = false;
        try {
            bundle = zx3.b(this.a, this.b, this.c);
        } catch (Exception unused) {
            AbstractC4851eH1.f("DigitalGoods", "Exception communicating with client.", new Object[0]);
            runnable.run();
            bundle = null;
        }
        if (bundle != null && bundle.getBoolean("success", false)) {
            z = true;
        }
        if (z) {
            return;
        }
        runnable.run();
    }

    @Override // defpackage.TX3
    public final void a() {
        this.e.run();
    }
}
