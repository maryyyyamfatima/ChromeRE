package defpackage;

import android.content.IntentFilter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class L3 {
    public L3(S2 s2) {
        V60.a.registerReceiver(new J3(this, s2), new IntentFilter("android.intent.action.APPLICATION_RESTRICTIONS_CHANGED"));
        MC2 mc2 = new MC2();
        new K3(this, mc2).c(AbstractC0185Bl.f);
        mc2.g(s2);
    }
}
