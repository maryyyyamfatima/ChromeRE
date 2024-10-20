package defpackage;

import J.N;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.chromium.base.PowerMonitor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Xx2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3107Xx2 extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        PowerMonitor.b.a = intent.getAction().equals("android.intent.action.ACTION_POWER_DISCONNECTED");
        N.MCImhGql();
    }
}
