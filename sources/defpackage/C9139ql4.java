package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Locale;
import org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ql4 */
/* loaded from: classes2.dex */
public final class C9139ql4 extends BroadcastReceiver {
    public final /* synthetic */ WebContentsAccessibilityImpl a;

    public C9139ql4(WebContentsAccessibilityImpl webContentsAccessibilityImpl) {
        this.a = webContentsAccessibilityImpl;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.f11538J = Locale.getDefault().toLanguageTag();
    }
}
