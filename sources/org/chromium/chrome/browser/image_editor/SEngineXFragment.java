package org.chromium.chrome.browser.image_editor;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.c;
import defpackage.AbstractC4508dH1;
import defpackage.C0200Bo;
import defpackage.C0330Co;
import defpackage.C9593s5;
import defpackage.IS0;
import defpackage.VS2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes5.dex */
public class SEngineXFragment extends c {
    public VS2 b0;
    public C0330Co c0;

    @Override // androidx.fragment.app.c
    public final void n0(Context context, AttributeSet attributeSet, Bundle bundle) {
        super.n0(context, attributeSet, bundle);
        C0200Bo a = C0330Co.a();
        a.b(1);
        a.d = -328966;
        a.f = (byte) (a.f | 2);
        this.c0 = a.a();
    }

    @Override // androidx.fragment.app.c
    public final void g0(Bundle bundle) {
        super.g0(bundle);
        Bundle bundle2 = this.l;
        if (bundle2 != null) {
            C0200Bo a = C0330Co.a();
            int i = bundle2.getInt("taskRunnerImplementation");
            int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 3 : 2 : 1;
            if (i2 == 0) {
                throw new NullPointerException("Null taskRunnerImplementation");
            }
            a.a = i2;
            a.b(bundle2.getInt("viewTransparency") == 2 ? 2 : 1);
            a.d = bundle2.getInt("backgroundColor");
            a.f = (byte) (a.f | 2);
            a.b = bundle2.getLong("randomSeed");
            a.f = (byte) (a.f | 1);
            a.e = bundle2.getBoolean("enableInkDocument");
            a.f = (byte) (a.f | 4);
            this.c0 = a.a();
        }
    }

    @Override // androidx.fragment.app.c
    public final View i0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        VS2 vs2 = new VS2(getActivity(), this.c0);
        this.b0 = vs2;
        vs2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        return this.b0;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View, AW0] */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.view.View, AW0] */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.view.View, AW0] */
    @Override // androidx.fragment.app.c
    public final void u0() {
        boolean isEmpty;
        VS2 vs2 = this.b0;
        C9593s5 c9593s5 = vs2.a.a;
        synchronized (c9593s5) {
            isEmpty = c9593s5.a.isEmpty();
        }
        if (isEmpty) {
            int i = AbstractC4508dH1.a;
        } else {
            synchronized (vs2.q) {
                try {
                    vs2.r = false;
                    vs2.g.e();
                    if ((vs2.a.b != null) && vs2.g.g()) {
                        int i2 = AbstractC4508dH1.a;
                        long uptimeMillis = SystemClock.uptimeMillis() + 1000;
                        try {
                            for (long uptimeMillis2 = SystemClock.uptimeMillis(); !vs2.r && uptimeMillis2 < uptimeMillis; uptimeMillis2 = SystemClock.uptimeMillis()) {
                                vs2.q.wait(uptimeMillis - uptimeMillis2);
                            }
                        } catch (InterruptedException e) {
                            AbstractC4508dH1.b("interrupted waiting for drawframe", e);
                        }
                    } else {
                        AbstractC4508dH1.a("tried to force flush of render thread when it wasn't able to draw");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        vs2.l.j = true;
        vs2.g.onPause();
        this.f11484J = true;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, AW0] */
    @Override // androidx.fragment.app.c
    public final void t0() {
        this.f11484J = true;
        VS2 vs2 = this.b0;
        vs2.g.onResume();
        IS0 is0 = vs2.l;
        is0.j = false;
        is0.a();
    }
}
