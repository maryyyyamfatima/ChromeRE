package defpackage;

import android.accounts.AccountManagerCallback;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class W91 extends BroadcastReceiver {
    public final /* synthetic */ Context a;
    public final /* synthetic */ X91 b;

    public W91(X91 x91, Context context) {
        this.b = x91;
        this.a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.unregisterReceiver(this);
        X91 x91 = this.b;
        Y91 y91 = x91.a;
        y91.b.getAuthToken(y91.e, y91.d, y91.c, true, (AccountManagerCallback<Bundle>) new X91(x91.b, y91), (Handler) null);
    }
}
