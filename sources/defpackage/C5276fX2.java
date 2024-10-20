package defpackage;

import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fX2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5276fX2 {
    public final int a;
    public final WebContents b;
    public final WindowAndroid c;

    public C5276fX2(WebContents webContents, int i) {
        this.a = i;
        this.b = webContents;
        this.c = null;
    }

    public C5276fX2(WindowAndroid windowAndroid) {
        this.a = 0;
        this.c = windowAndroid;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5276fX2)) {
            return false;
        }
        C5276fX2 c5276fX2 = (C5276fX2) obj;
        return this.a == c5276fX2.a && this.c == c5276fX2.c && this.b == c5276fX2.b;
    }

    public final int hashCode() {
        int i = (527 + this.a) * 31;
        WebContents webContents = this.b;
        int hashCode = (i + (webContents == null ? 0 : webContents.hashCode())) * 31;
        WindowAndroid windowAndroid = this.c;
        return hashCode + (windowAndroid != null ? windowAndroid.hashCode() : 0);
    }
}
