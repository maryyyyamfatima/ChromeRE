package defpackage;

import android.content.Intent;
import org.chromium.base.Callback;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: za, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C12154za implements InterfaceC10782va, InterfaceC4352cp4 {
    public final WebContents a;
    public Callback g;

    public C12154za(WebContents webContents) {
        this.a = webContents;
    }

    @Override // defpackage.InterfaceC4352cp4
    public final void b(Intent intent, int i) {
        C10439ua c10439ua = new C10439ua();
        c10439ua.a = i;
        c10439ua.b = intent;
        this.g.onResult(c10439ua);
        this.g = null;
    }
}
