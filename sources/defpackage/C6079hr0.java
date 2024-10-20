package defpackage;

import android.net.Uri;
import org.chromium.chrome.browser.download.MimeUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hr0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6079hr0 extends C5735gr0 {
    @Override // defpackage.C5735gr0
    public final String c(String str, String str2, String str3) {
        return MimeUtils.remapGenericMimeType(str, str2, str3);
    }

    @Override // defpackage.C5735gr0
    public final Uri b(String str) {
        return AbstractC6091ht0.d(str);
    }

    @Override // defpackage.C5735gr0
    public final boolean a(String str) {
        return C9513rr0.c(str);
    }
}
