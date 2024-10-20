package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import org.chromium.content.browser.accessibility.BrowserAccessibilityState;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8605pC extends ContentObserver {
    public C8605pC(Handler handler) {
        super(handler);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        onChange(z, null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        BrowserAccessibilityState.a().post(new Runnable() { // from class: oC
            @Override // java.lang.Runnable
            public final void run() {
                BrowserAccessibilityState.b();
            }
        });
    }
}
