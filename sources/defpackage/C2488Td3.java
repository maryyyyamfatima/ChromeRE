package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Td3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2488Td3 extends BroadcastReceiver {
    public final /* synthetic */ C3138Yd3 a;

    public C2488Td3(C3138Yd3 c3138Yd3) {
        this.a = c3138Yd3;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C3138Yd3 c3138Yd3 = this.a;
        c3138Yd3.getClass();
        C3138Yd3.g.execute(new RunnableC2878Wd3(c3138Yd3));
    }
}
