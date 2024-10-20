package defpackage;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.TransactionTooLargeException;
import java.util.Collections;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Xf2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3017Xf2 {
    public static final Intent a = new Intent().setAction("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(Uri.fromParts("http", "", null));

    public static ResolveInfo c(Intent intent, int i) {
        try {
            C7432ln3 e = C7432ln3.e();
            try {
                ResolveInfo resolveActivity = V60.a.getPackageManager().resolveActivity(intent, i);
                e.close();
                return resolveActivity;
            } catch (Throwable th) {
                try {
                    e.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (RuntimeException e2) {
            a(e2, intent);
            return null;
        }
    }

    public static List b(Intent intent, int i) {
        try {
            C7432ln3 c = C7432ln3.c();
            try {
                List<ResolveInfo> queryIntentActivities = V60.a.getPackageManager().queryIntentActivities(intent, i);
                c.close();
                return queryIntentActivities;
            } catch (Throwable th) {
                try {
                    c.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (RuntimeException e) {
            a(e, intent);
            return Collections.emptyList();
        }
    }

    public static ResolveInfo d() {
        return c(a, 65536);
    }

    public static void a(RuntimeException runtimeException, Intent intent) {
        if ((runtimeException instanceof NullPointerException) || (runtimeException.getCause() instanceof TransactionTooLargeException)) {
            AbstractC4851eH1.a("PackageManagerUtils", "Could not resolve Activity for intent " + intent.toString(), runtimeException);
            return;
        }
        throw runtimeException;
    }
}
