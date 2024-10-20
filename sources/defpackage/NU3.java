package defpackage;

import android.util.Base64;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final /* synthetic */ class NU3 implements Runnable {
    public final /* synthetic */ C7177l24 a;

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC2737Vb2.g().edit().putString("UpdateProtos_Tracking", Base64.encodeToString(this.a.toByteArray(), 0)).apply();
    }
}
