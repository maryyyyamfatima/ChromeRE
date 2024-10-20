package defpackage;

import J.N;
import android.content.Context;
import android.os.Bundle;
import org.chromium.chrome.browser.offlinepages.TriggerConditions;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ea2 */
/* loaded from: classes.dex */
public final class C0523Ea2 extends S02 {
    @Override // defpackage.S02
    public final boolean f() {
        return true;
    }

    @Override // defpackage.S02
    public final void e(Context context, KF3 kf3, InterfaceC2559Ts interfaceC2559Ts) {
        if (C1909Os.a == null) {
            C1909Os.a = new C1909Os();
        }
        C1909Os c1909Os = C1909Os.a;
        Bundle bundle = kf3.b;
        C0393Da2 c0393Da2 = new C0393Da2(interfaceC2559Ts);
        C1226Jl0 a = C1226Jl0.a(context);
        c1909Os.getClass();
        if (N.MrvK6$zt(a.a, a.b, a.d, c0393Da2)) {
            Bundle bundle2 = kf3.b;
            AbstractC1779Ns.a(new TriggerConditions(bundle2.getInt("BatteryPercentage", 100), bundle2.getBoolean("PowerConnected", true), bundle2.getBoolean("UnmeteredNetwork", true)), 300000L, false);
            return;
        }
        interfaceC2559Ts.a(true);
    }

    @Override // defpackage.S02
    public final boolean g(KF3 kf3) {
        if (C1909Os.a == null) {
            C1909Os.a = new C1909Os();
        }
        C1909Os.a.getClass();
        N.MMBt6JJr();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041 A[RETURN] */
    @Override // defpackage.S02
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(android.content.Context r3, defpackage.KF3 r4, defpackage.N02 r5) {
        /*
            r2 = this;
            android.os.Bundle r4 = r4.b
            java.lang.String r5 = "PowerConnected"
            r0 = 1
            r4.getBoolean(r5, r0)
            java.lang.String r5 = "BatteryPercentage"
            r1 = 100
            int r5 = r4.getInt(r5, r1)
            java.lang.String r1 = "UnmeteredNetwork"
            r4.getBoolean(r1, r0)
            Jl0 r3 = defpackage.C1226Jl0.a(r3)
            boolean r4 = r3.a
            r1 = 0
            if (r4 != 0) goto L25
            int r3 = r3.b
            if (r3 < r5) goto L23
            goto L25
        L23:
            r3 = r1
            goto L26
        L25:
            r3 = r0
        L26:
            if (r3 != 0) goto L29
            goto L3b
        L29:
            boolean r3 = org.chromium.base.SysUtils.isLowEndDevice()
            if (r3 == 0) goto L38
            boolean r3 = org.chromium.base.ApplicationStatus.hasVisibleActivities()
            if (r3 != 0) goto L36
            goto L38
        L36:
            r3 = r1
            goto L39
        L38:
            r3 = r0
        L39:
            if (r3 != 0) goto L3d
        L3b:
            r3 = r1
            goto L3e
        L3d:
            r3 = r0
        L3e:
            if (r3 != 0) goto L41
            return r0
        L41:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0523Ea2.d(android.content.Context, KF3, N02):int");
    }

    @Override // defpackage.InterfaceC2689Us
    public final void a() {
        AbstractC1779Ns.a(new TriggerConditions(0, false, false), 300000L, false);
    }
}
