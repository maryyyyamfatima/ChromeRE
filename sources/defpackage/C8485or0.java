package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: or0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8485or0 extends BroadcastReceiver {
    public final /* synthetic */ C9513rr0 a;

    public C8485or0(C9513rr0 c9513rr0) {
        this.a = c9513rr0;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.MEDIA_REMOVED") || intent.getAction().equals("android.intent.action.MEDIA_MOUNTED") || intent.getAction().equals("android.intent.action.MEDIA_EJECT")) {
            this.a.b = true;
        }
    }
}
