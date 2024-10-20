package defpackage;

import android.os.Build;
import org.chromium.content.browser.selection.SelectionPopupControllerImpl;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: k33 */
/* loaded from: classes.dex */
public final class C6838k33 {
    public final boolean a;
    public InterfaceC6152i33 b;

    public C6838k33(WebContents webContents) {
        if (Build.VERSION.SDK_INT > 26) {
            this.b = AbstractC5464g33.a(webContents);
            SelectionPopupControllerImpl.k(webContents).y(this.b);
        }
        this.a = this.b != null;
    }
}
