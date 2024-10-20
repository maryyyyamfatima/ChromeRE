package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Bw4 extends AbstractC5069eu4 {
    public static Bw4 j;
    public final Handler g;
    public final InterfaceC9884sv4 h;
    public final LinkedHashSet i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bw4(Context context) {
        super(new C9187qt4("SplitInstallListenerRegistry"), new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"), context);
        EnumC7143kw4 enumC7143kw4 = EnumC7143kw4.a;
        this.g = new Handler(Looper.getMainLooper());
        this.i = new LinkedHashSet();
        this.h = enumC7143kw4;
    }

    @Override // defpackage.AbstractC5069eu4
    public final void a(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("session_state");
        if (bundleExtra == null) {
            return;
        }
        Zs4 b = Zs4.b(bundleExtra);
        this.a.b(3, "ListenerRegistryBroadcastReceiver.onReceive: %s", new Object[]{b});
        ((EnumC7143kw4) this.h).getClass();
        InterfaceC11942yv4 interfaceC11942yv4 = (InterfaceC11942yv4) EnumC7143kw4.g.get();
        if (b.b != 3 || interfaceC11942yv4 == null) {
            d(b);
        } else {
            ((Rt4) interfaceC11942yv4).a(b.i, new vw4(this, b, intent, context));
        }
    }

    public final synchronized void d(Zs4 zs4) {
        Iterator it = new LinkedHashSet(this.i).iterator();
        while (it.hasNext()) {
            ((InterfaceC2768Vh3) it.next()).a(zs4);
        }
        c(zs4);
    }
}
