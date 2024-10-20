package defpackage;

import android.app.Activity;
import org.chromium.components.browser_ui.bottomsheet.m;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ho2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0983Ho2 implements Runnable {
    public final /* synthetic */ C1243Jo2 a;
    public final /* synthetic */ UD2 g;
    public final /* synthetic */ QB h;
    public final /* synthetic */ ViewOnLayoutChangeListenerC1892Oo2 i;
    public final /* synthetic */ C4350cp2 j;
    public final /* synthetic */ InterfaceC1113Io2 k;
    public final /* synthetic */ Activity l;
    public final /* synthetic */ InterfaceC6244iK3 m;

    public /* synthetic */ RunnableC0983Ho2(C1243Jo2 c1243Jo2, UD2 ud2, QB qb, ViewOnLayoutChangeListenerC1892Oo2 viewOnLayoutChangeListenerC1892Oo2, C4350cp2 c4350cp2, C1642Mq2 c1642Mq2, Activity activity, C6930kK3 c6930kK3) {
        this.a = c1243Jo2;
        this.g = ud2;
        this.h = qb;
        this.i = viewOnLayoutChangeListenerC1892Oo2;
        this.j = c4350cp2;
        this.k = c1642Mq2;
        this.l = activity;
        this.m = c6930kK3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1243Jo2 c1243Jo2 = this.a;
        c1243Jo2.getClass();
        this.g.b();
        m mVar = (m) this.h;
        ViewOnLayoutChangeListenerC1892Oo2 viewOnLayoutChangeListenerC1892Oo2 = this.i;
        mVar.o(viewOnLayoutChangeListenerC1892Oo2);
        mVar.l(this.j, true, 0);
        C1642Mq2 c1642Mq2 = (C1642Mq2) this.k;
        C1513Lq2 c1513Lq2 = c1642Mq2.w;
        c1513Lq2.a = false;
        c1513Lq2.a();
        c1642Mq2.m = null;
        this.l.getWindow().getDecorView().removeOnLayoutChangeListener(viewOnLayoutChangeListenerC1892Oo2);
        viewOnLayoutChangeListenerC1892Oo2.destroy();
        ((C6930kK3) this.m).b();
        c1243Jo2.b.destroy();
    }
}
