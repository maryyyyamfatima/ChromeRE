package defpackage;

import J.N;
import android.os.Handler;
import android.os.Message;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yd3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11833yd3 extends PF3 implements InterfaceC11490xd3 {
    public final Handler l;
    public final boolean m;

    public C11833yd3(Handler handler, QF3 qf3, boolean z) {
        super(qf3, "SingleThreadTaskRunnerImpl", 2);
        this.l = handler;
        this.m = z;
    }

    @Override // defpackage.PF3
    public final void h() {
        Handler handler = this.l;
        if (handler == null) {
            EI2.h(2, 3, "Android.TaskScheduling.PreNativeTaskPostType");
            return;
        }
        boolean z = this.m;
        NF3 nf3 = this.e;
        if (z) {
            EI2.h(1, 3, "Android.TaskScheduling.PreNativeTaskPostType");
            Message obtain = Message.obtain(handler, nf3);
            obtain.setAsynchronous(true);
            handler.sendMessageAtFrontOfQueue(obtain);
            return;
        }
        EI2.h(0, 3, "Android.TaskScheduling.PreNativeTaskPostType");
        handler.post(nf3);
    }

    @Override // defpackage.InterfaceC11490xd3
    public final boolean c() {
        synchronized (this.f) {
            f();
        }
        Boolean valueOf = this.d == 0 ? null : Boolean.valueOf(N.MdFi6sVQ(this.d));
        if (valueOf != null) {
            return valueOf.booleanValue();
        }
        return this.l.getLooper().getThread() == Thread.currentThread();
    }
}
