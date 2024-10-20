package defpackage;

import android.content.ContentProvider;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Gg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0810Gg extends ContentProvider {
    public static void a(Context context) {
        int callingUid = Binder.getCallingUid();
        if (callingUid == Process.myUid()) {
            return;
        }
        if (context == null) {
            throw new SecurityException("Context is null!");
        }
        try {
            if (context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).uid != callingUid) {
                throw new SecurityException("Calling UID " + callingUid + " is not Google Play Services.");
            }
            int i = W31.e;
            int d = X31.d(context, 12600000);
            if (d != 0) {
                throw new SecurityException(AbstractC4809e90.a("Calling package problem: ", ConnectionResult.r1(d)));
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new SecurityException("Google Play Services not installed", e);
        }
    }
}
