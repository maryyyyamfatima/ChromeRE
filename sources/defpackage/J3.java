package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class J3 extends BroadcastReceiver {
    public final /* synthetic */ Callback a;
    public final /* synthetic */ L3 b;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        L3 l3 = this.b;
        l3.getClass();
        MC2 mc2 = new MC2();
        new K3(l3, mc2).c(AbstractC0185Bl.f);
        mc2.g(this.a);
    }

    public J3(L3 l3, S2 s2) {
        this.b = l3;
        this.a = s2;
    }
}
