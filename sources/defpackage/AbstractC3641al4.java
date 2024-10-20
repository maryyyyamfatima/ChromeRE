package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.StrictMode;
import java.security.PublicKey;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: al4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3641al4 {
    public static byte[] a;
    public static byte[] b;
    public static PublicKey c;
    public static boolean d;

    public static boolean a(Context context, String str, String str2) {
        Iterator it = e(context, str2, str).iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            ActivityInfo activityInfo = ((ResolveInfo) it.next()).activityInfo;
            if (activityInfo != null) {
                if (c(context, activityInfo.packageName) != 0) {
                    return true;
                }
            }
        }
    }

    public static String d(Context context, String str) {
        ResolveInfo b2 = b(context, e(context, str, null));
        if (b2 != null) {
            return b2.activityInfo.packageName;
        }
        return null;
    }

    public static ResolveInfo b(Context context, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ResolveInfo resolveInfo = (ResolveInfo) it.next();
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (activityInfo != null) {
                if (c(context, activityInfo.packageName) != 0) {
                    return resolveInfo;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x0137, code lost:            if (r9 == null) goto L103;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0147 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0142 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int c(android.content.Context r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC3641al4.c(android.content.Context, java.lang.String):int");
    }

    public static List e(Context context, String str, String str2) {
        Intent intent = null;
        try {
            Intent parseUri = Intent.parseUri(str, 1);
            parseUri.addCategory("android.intent.category.BROWSABLE");
            if (str2 != null) {
                parseUri.setPackage(str2);
            } else {
                parseUri.setComponent(null);
            }
            Intent selector = parseUri.getSelector();
            if (selector != null) {
                selector.addCategory("android.intent.category.BROWSABLE");
                selector.setComponent(null);
            }
            intent = parseUri;
        } catch (Exception unused) {
        }
        if (intent == null) {
            return new LinkedList();
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return context.getPackageManager().queryIntentActivities(intent, 64);
        } catch (Exception unused2) {
            return new LinkedList();
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static boolean f(PackageInfo packageInfo, String str) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null && signatureArr.length == 2 && str.startsWith("org.chromium.webapk")) {
            for (Signature signature : packageInfo.signatures) {
                if (Arrays.equals(a, signature.toByteArray())) {
                    return true;
                }
            }
        }
        return false;
    }
}
