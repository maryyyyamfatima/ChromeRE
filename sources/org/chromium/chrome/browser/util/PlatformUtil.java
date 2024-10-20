package org.chromium.chrome.browser.util;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import defpackage.AbstractC4851eH1;
import defpackage.V60;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class PlatformUtil {
    public static void launchExternalProtocol(String str) {
        Context context = V60.a;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.setFlags(268435456);
        intent.addCategory("android.intent.category.BROWSABLE");
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            AbstractC4851eH1.a("PlatformUtil", "cannot find activity to launch %s", str, e);
        }
    }
}
