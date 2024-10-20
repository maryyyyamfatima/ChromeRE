package defpackage;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class Qn4 implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ Intent g;

    public Qn4(Context context, Intent intent) {
        this.a = context;
        this.g = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.a;
        Intent intent = this.g;
        ComponentName componentName = AbstractC2281Ro1.a;
        try {
            context.startActivity(intent, null);
        } catch (ActivityNotFoundException unused) {
        }
    }
}
