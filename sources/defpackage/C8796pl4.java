package defpackage;

import android.view.accessibility.AccessibilityEvent;
import java.util.List;
import org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pl4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8796pl4 {
    public final /* synthetic */ WebContentsAccessibilityImpl a;

    public C8796pl4(WebContentsAccessibilityImpl webContentsAccessibilityImpl) {
        this.a = webContentsAccessibilityImpl;
    }

    public final boolean a(int i, int i2) {
        List list = WebContentsAccessibilityImpl.T;
        WebContentsAccessibilityImpl webContentsAccessibilityImpl = this.a;
        AccessibilityEvent i3 = webContentsAccessibilityImpl.i(i, i2);
        if (i3 == null) {
            return false;
        }
        webContentsAccessibilityImpl.y(i3);
        if (i2 != 128) {
            return true;
        }
        AccessibilityEvent i4 = webContentsAccessibilityImpl.i(webContentsAccessibilityImpl.m, 256);
        if (i4 != null) {
            webContentsAccessibilityImpl.y(i4);
            webContentsAccessibilityImpl.m = i;
            return true;
        }
        if (i == -1 || webContentsAccessibilityImpl.m == i) {
            return true;
        }
        webContentsAccessibilityImpl.m = i;
        return true;
    }
}
