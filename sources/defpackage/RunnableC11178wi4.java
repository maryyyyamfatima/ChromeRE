package defpackage;

import android.content.Intent;
import com.google.vr.ndk.base.DaydreamApi;
import org.chromium.chrome.browser.vr.VrFirstRunActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wi4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC11178wi4 implements Runnable {
    public final /* synthetic */ C6715ji4 a;
    public final /* synthetic */ VrFirstRunActivity g;

    public RunnableC11178wi4(VrFirstRunActivity vrFirstRunActivity, C6715ji4 c6715ji4) {
        this.g = vrFirstRunActivity;
        this.a = c6715ji4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Intent intent = new Intent();
        DaydreamApi a = this.a.a();
        if (a == null) {
            return;
        }
        a.exitFromVr(this.g, 7212, intent);
    }
}
