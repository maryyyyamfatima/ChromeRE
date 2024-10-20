package defpackage;

import android.content.Context;
import org.chromium.base.ThreadUtils;
import org.chromium.base.task.PostTask;
import org.chromium.content.browser.BrowserStartupControllerImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract class S02 implements InterfaceC2689Us {
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public MO e;

    public abstract int d(Context context, KF3 kf3, N02 n02);

    public abstract void e(Context context, KF3 kf3, InterfaceC2559Ts interfaceC2559Ts);

    public abstract boolean f();

    public abstract boolean g(KF3 kf3);

    public boolean i() {
        return this instanceof C3330Zq0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [N02, Ts] */
    @Override // defpackage.InterfaceC2689Us
    public final boolean b(Context context, KF3 kf3, final InterfaceC2559Ts interfaceC2559Ts) {
        Object obj = ThreadUtils.a;
        this.a = kf3.a;
        ?? r0 = new InterfaceC2559Ts() { // from class: N02
            @Override // defpackage.InterfaceC2559Ts
            public final void a(final boolean z) {
                final S02 s02 = S02.this;
                s02.getClass();
                QF3 qf3 = AbstractC5103f04.a;
                final InterfaceC2559Ts interfaceC2559Ts2 = interfaceC2559Ts;
                PostTask.d(qf3, new Runnable() { // from class: O02
                    @Override // java.lang.Runnable
                    public final void run() {
                        S02.this.h();
                        interfaceC2559Ts2.a(z);
                    }
                });
            }
        };
        int d = d(context, kf3, r0);
        boolean z = false;
        if (d == 2) {
            return false;
        }
        if (d == 1) {
            PostTask.c(AbstractC5103f04.a, new Q02(this, interfaceC2559Ts));
            return true;
        }
        R02 r02 = new R02(this, context, kf3, r0);
        Q02 q02 = new Q02(this, r0);
        if (RC.a().e()) {
            this.c = false;
            this.e.getClass();
            C0225Bt c = C0225Bt.c();
            int i = this.a;
            boolean z2 = this.c;
            c.getClass();
            int a = AbstractC7464lt.a(i);
            C0225Bt.b(a, "Android.NativeBackgroundTask.TaskStarted");
            if (z2) {
                C0225Bt.b(a, "Android.NativeBackgroundTask.TaskStarted.ReducedMode");
            } else {
                C0225Bt.b(a, "Android.NativeBackgroundTask.TaskStarted.FullBrowser");
            }
            PostTask.c(AbstractC5103f04.a, r02);
        } else {
            BrowserStartupControllerImpl a2 = RC.a();
            a2.getClass();
            if (a2.j && !a2.f && a2.g) {
                z = true;
            }
            this.c = i();
            this.e.getClass();
            C0225Bt c2 = C0225Bt.c();
            int i2 = this.a;
            boolean z3 = this.c;
            c2.getClass();
            int a3 = AbstractC7464lt.a(i2);
            C0225Bt.b(a3, "Android.NativeBackgroundTask.TaskStarted");
            if (z3) {
                C0225Bt.b(a3, "Android.NativeBackgroundTask.TaskStarted.ReducedMode");
            } else {
                C0225Bt.b(a3, "Android.NativeBackgroundTask.TaskStarted.FullBrowser");
            }
            PostTask.c(AbstractC5103f04.a, new P02(this, z, r02, q02));
        }
        return true;
    }

    @Override // defpackage.InterfaceC2689Us
    public final boolean c(Context context, KF3 kf3) {
        Object obj = ThreadUtils.a;
        this.b = true;
        h();
        if (RC.a().e()) {
            return g(kf3);
        }
        return f();
    }

    public final void h() {
        Object obj = ThreadUtils.a;
        if (this.d) {
            return;
        }
        this.d = true;
        this.e.getClass();
        C0225Bt c = C0225Bt.c();
        int i = this.a;
        boolean z = this.c;
        int a = AbstractC7464lt.a(i);
        c.getClass();
        C0225Bt.b(a, "Android.NativeBackgroundTask.TaskFinished");
        if (z) {
            C0225Bt.b(a, "Android.NativeBackgroundTask.TaskFinished.ReducedMode");
        } else {
            C0225Bt.b(a, "Android.NativeBackgroundTask.TaskFinished.FullBrowser");
        }
    }
}
