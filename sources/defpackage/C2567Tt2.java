package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Tt2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2567Tt2 extends BroadcastReceiver {
    public static volatile boolean b;
    public static final Object a = new Object();
    public static final BT2 c = new BT2(new ConcurrentHashMap());

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra == null) {
            return;
        }
        for (Map.Entry entry : c.entrySet()) {
            if (((String) ((C7745mi2) entry.getKey()).a).equals(stringExtra)) {
                ((JP0) entry.getValue()).a.b();
            }
        }
    }
}
