package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vR2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10740vR2 extends BroadcastReceiver {
    public final /* synthetic */ C11083wR2 a;

    public C10740vR2(C11083wR2 c11083wR2) {
        this.a = c11083wR2;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.c(intent);
    }
}
