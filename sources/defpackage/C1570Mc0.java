package defpackage;

import android.app.Activity;
import android.os.SystemClock;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Mc0 */
/* loaded from: classes.dex */
public final class C1570Mc0 implements InterfaceC3657ao2, V02 {
    public final PC a;
    public final InterfaceC0079Ap3 g;
    public final Activity h;
    public C11208wn4 i;
    public boolean j = true;

    public C1570Mc0(I5 i5, PC pc, Activity activity, InterfaceC0079Ap3 interfaceC0079Ap3) {
        this.a = pc;
        this.h = activity;
        this.g = interfaceC0079Ap3;
        i5.b(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0171  */
    @Override // defpackage.InterfaceC3657ao2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1570Mc0.c():void");
    }

    @Override // defpackage.InterfaceC3657ao2
    public final void e() {
        C11208wn4 c11208wn4 = this.i;
        if (c11208wn4 != null) {
            EI2.j(SystemClock.elapsedRealtime() - c11208wn4.a, "CustomTab.SessionDuration".concat(c11208wn4.b != 3 ? ".Other" : ".MediaLauncherActivity"));
        }
    }

    @Override // defpackage.V02
    public final void U() {
        C11208wn4 c11208wn4 = this.i;
        if (c11208wn4 != null) {
            EI2.j(SystemClock.elapsedRealtime() - c11208wn4.a, "CustomTab.SessionDuration".concat(c11208wn4.b != 3 ? ".Other" : ".MediaLauncherActivity"));
        }
    }
}
