package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.vr.ndk.base.DaydreamApi;
import org.chromium.chrome.browser.vr.VrFirstRunActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class Ki4 extends Hi4 {
    @Override // defpackage.Hi4
    public final Intent d(Context context, Intent intent) {
        Intent intent2 = new Intent();
        intent2.setClassName(context, VrFirstRunActivity.class.getName());
        intent2.addCategory("com.google.intent.category.DAYDREAM");
        intent2.putExtra("org.chromium.chrome.browser.vr.VR_FRE", new Intent(intent));
        return intent2;
    }

    @Override // defpackage.Hi4
    public final void c(Intent intent) {
        if (intent == null) {
            return;
        }
        intent.removeCategory("com.google.intent.category.DAYDREAM");
    }

    @Override // defpackage.Hi4
    public final Intent e(Intent intent) {
        return DaydreamApi.setupVrIntent(intent);
    }
}
