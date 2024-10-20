package defpackage;

import android.app.Activity;
import java.io.File;
import java.util.List;
import java.util.concurrent.ExecutionException;
import org.chromium.chrome.browser.compositor.layouts.content.TabContentManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fe0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5313fe0 implements InterfaceC2728Uz3 {
    public static final Object f = new Object();
    public static AbstractC0185Bl g;
    public final int a;
    public final boolean b;
    public C4282ce0 c;
    public N33 d;
    public boolean e;

    @Override // defpackage.InterfaceC2728Uz3
    public final void b(TabContentManager tabContentManager) {
    }

    @Override // defpackage.InterfaceC2728Uz3
    public final void c(boolean z) {
    }

    @Override // defpackage.InterfaceC2728Uz3
    public final boolean f() {
        return false;
    }

    @Override // defpackage.InterfaceC2728Uz3
    public final void h(int i) {
    }

    @Override // defpackage.InterfaceC2728Uz3
    public final /* synthetic */ void i(C5850hA3 c5850hA3, int i) {
    }

    @Override // defpackage.InterfaceC2728Uz3
    public final List j() {
        return null;
    }

    @Override // defpackage.InterfaceC2728Uz3
    public final boolean l() {
        return false;
    }

    @Override // defpackage.InterfaceC2728Uz3
    public final /* synthetic */ boolean m() {
        return false;
    }

    @Override // defpackage.InterfaceC2728Uz3
    public final File n() {
        synchronized (OA3.b) {
            if (OA3.d == null) {
                OA3.d = new File(NA3.a, "custom_tabs");
                C7432ln3 e = C7432ln3.e();
                try {
                    if (!OA3.d.exists() && !OA3.d.mkdirs()) {
                        AbstractC4851eH1.a("tabpersistence", "Failed to create state folder: " + OA3.d, new Object[0]);
                    }
                    e.close();
                } catch (Throwable th) {
                    try {
                        e.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            }
        }
        return OA3.d;
    }

    public C5313fe0(Activity activity, InterfaceC0079Ap3 interfaceC0079Ap3) {
        this.a = activity.getTaskId();
        this.b = interfaceC0079Ap3.get() != null;
    }

    @Override // defpackage.InterfaceC2728Uz3
    public final String d() {
        String num = Integer.toString(this.a);
        Object obj = C9284rA3.z;
        return AbstractC4809e90.a("tab_state", num);
    }

    @Override // defpackage.InterfaceC2728Uz3
    public final boolean g(N33 n33) {
        C4282ce0 c4282ce0 = new C4282ce0(this);
        c4282ce0.d(n33);
        this.c = c4282ce0;
        return true;
    }

    @Override // defpackage.InterfaceC2728Uz3
    public final void e() {
        C4282ce0 c4282ce0 = this.c;
        if (c4282ce0 == null) {
            return;
        }
        try {
            c4282ce0.f();
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // defpackage.InterfaceC2728Uz3
    public final void o() {
        synchronized (f) {
            AbstractC0185Bl abstractC0185Bl = g;
            if (abstractC0185Bl != null) {
                abstractC0185Bl.a(true);
            }
        }
    }

    @Override // defpackage.InterfaceC2728Uz3
    public final void a(C5506gA3 c5506gA3) {
        synchronized (f) {
            AbstractC0185Bl abstractC0185Bl = g;
            if (abstractC0185Bl != null) {
                abstractC0185Bl.a(true);
            }
            C4969ee0 c4969ee0 = new C4969ee0(this, c5506gA3);
            g = c4969ee0;
            c4969ee0.c(AbstractC0185Bl.e);
        }
    }

    @Override // defpackage.InterfaceC2728Uz3
    public final void destroy() {
        this.e = true;
    }

    @Override // defpackage.InterfaceC2728Uz3
    public final void k(N33 n33) {
        this.d = n33;
    }
}
