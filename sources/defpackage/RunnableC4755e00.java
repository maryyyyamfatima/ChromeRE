package defpackage;

import android.content.Intent;
import android.content.IntentSender;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: e00, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC4755e00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ IntentSender.SendIntentException g;
    public final /* synthetic */ C5099f00 h;

    public RunnableC4755e00(C5099f00 c5099f00, int i, IntentSender.SendIntentException sendIntentException) {
        this.h = c5099f00;
        this.a = i;
        this.g = sendIntentException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.h.a(this.a, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.g));
    }
}
