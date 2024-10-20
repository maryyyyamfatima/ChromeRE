package defpackage;

import android.content.pm.ResolveInfo;
import android.text.TextUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mj0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7749mj0 {
    public static final String[] a = {"com.android.chrome", "org.chromium.chrome", "com.chrome.canary", "com.chrome.beta", "com.chrome.dev"};
    public static C7749mj0 b;

    public static int a(ResolveInfo resolveInfo) {
        if (resolveInfo == null || resolveInfo.match == 0) {
            return 0;
        }
        return TextUtils.equals(V60.a.getPackageName(), resolveInfo.activityInfo.packageName) ? 2 : 1;
    }
}
