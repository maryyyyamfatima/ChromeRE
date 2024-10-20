package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Db3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0399Db3 {
    public static boolean a(Activity activity) {
        Intent intent = new Intent("android.settings.SYNC_SETTINGS");
        ComponentName componentName = AbstractC2281Ro1.a;
        try {
            activity.startActivity(intent, null);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }
}
