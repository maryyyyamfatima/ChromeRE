package defpackage;

import J.N;
import android.content.Context;
import org.chromium.components.component_updater.UpdateScheduler;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: u24 */
/* loaded from: classes2.dex */
public final class C10266u24 extends S02 {
    @Override // defpackage.S02
    public final int d(Context context, KF3 kf3, N02 n02) {
        UpdateScheduler.getInstance().a = n02;
        return 0;
    }

    @Override // defpackage.S02
    public final void e(Context context, KF3 kf3, InterfaceC2559Ts interfaceC2559Ts) {
        UpdateScheduler updateScheduler = UpdateScheduler.getInstance();
        N.MILubAN7(updateScheduler.b, updateScheduler);
    }

    @Override // defpackage.S02
    public final boolean f() {
        UpdateScheduler updateScheduler = UpdateScheduler.getInstance();
        long j = updateScheduler.b;
        if (j != 0) {
            N.MfjHVxSB(j, updateScheduler);
        }
        updateScheduler.a = null;
        updateScheduler.a(updateScheduler.c);
        return false;
    }

    @Override // defpackage.S02
    public final boolean g(KF3 kf3) {
        UpdateScheduler updateScheduler = UpdateScheduler.getInstance();
        long j = updateScheduler.b;
        if (j != 0) {
            N.MfjHVxSB(j, updateScheduler);
        }
        updateScheduler.a = null;
        updateScheduler.a(updateScheduler.c);
        return false;
    }

    @Override // defpackage.InterfaceC2689Us
    public final void a() {
        UpdateScheduler updateScheduler = UpdateScheduler.getInstance();
        updateScheduler.a(updateScheduler.c);
    }
}
