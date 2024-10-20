package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.HashSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class JF1 extends BroadcastReceiver {
    public final /* synthetic */ IF1 a;

    public JF1(IF1 if1) {
        this.a = if1;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        HashSet hashSet = IF1.n;
        this.a.d();
    }
}
