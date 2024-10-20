package defpackage;

import android.content.Intent;
import android.net.Uri;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mk4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC7759mk4 {
    public static Intent a(String str, String str2, boolean z) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str2));
        intent.setPackage(str);
        intent.addFlags(268435456);
        intent.putExtra("org.chromium.chrome.browser.webapk_force_navigation", z);
        return intent;
    }
}
