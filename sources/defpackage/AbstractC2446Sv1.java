package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Sv1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2446Sv1 {
    public static final Object a = new Object();
    public static Boolean b;

    public static List e(Context context) {
        if (!g(context)) {
            return Collections.emptyList();
        }
        Vector vector = new Vector();
        try {
            try {
                Cursor c = c(context, "FirewallPolicy", "getURLFilterList");
                if (c != null && c.moveToFirst()) {
                    while (!c.isAfterLast()) {
                        vector.add(c.getString(0));
                        c.moveToNext();
                    }
                    b(c);
                    return vector;
                }
                List emptyList = Collections.emptyList();
                b(c);
                return emptyList;
            } catch (IllegalStateException | NullPointerException | SecurityException e) {
                AbstractC4851eH1.a("KnoxSettingsProvider", "Error getting URL black list: " + e, new Object[0]);
                return Collections.emptyList();
            }
        } finally {
            b(null);
        }
    }

    public static Cursor c(Context context, String str, String str2) {
        return context.getContentResolver().query(Uri.withAppendedPath(new Uri.Builder().scheme("content").authority("com.sec.knox.provider").build(), str), null, str2, null, null);
    }

    public static boolean f(Context context, String str, String str2, boolean z) {
        if (!g(context)) {
            return z;
        }
        Cursor cursor = null;
        try {
            try {
                cursor = c(context, str, str2);
                if (cursor != null && cursor.getColumnCount() == 1 && cursor.moveToFirst()) {
                    String string = cursor.getString(0);
                    if ("true".equalsIgnoreCase(string)) {
                        return true;
                    }
                    if ("false".equalsIgnoreCase(string)) {
                        return false;
                    }
                    int i = cursor.getInt(0);
                    if (i == 1) {
                        return true;
                    }
                    if (i == 0) {
                        return false;
                    }
                    AbstractC4851eH1.a("KnoxSettingsProvider", "Unexpected result when reading " + str2 + " from " + Uri.withAppendedPath(new Uri.Builder().scheme("content").authority("com.sec.knox.provider").build(), str) + ": \"" + string + "\" (int " + i + ")", new Object[0]);
                    return z;
                }
                return z;
            } catch (IllegalStateException | NullPointerException | SecurityException e) {
                AbstractC4851eH1.a("KnoxSettingsProvider", "Failed to read boolean value: " + e, new Object[0]);
                return z;
            }
        } finally {
            b(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r6v13, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v8 */
    public static String d(Context context) {
        Object e;
        String str = null;
        str = null;
        str = null;
        str = null;
        str = null;
        Cursor cursor = null;
        if (g(context)) {
            try {
                try {
                    context = c(context, "BrowserPolicy", "getHttpProxy");
                } catch (IllegalStateException e2) {
                    e = e2;
                    e = e;
                    context = 0;
                    AbstractC4851eH1.a("KnoxSettingsProvider", "Failed to read string value: " + e, new Object[0]);
                    context = context;
                    b(context);
                    return str;
                } catch (NullPointerException e3) {
                    e = e3;
                    e = e;
                    context = 0;
                    AbstractC4851eH1.a("KnoxSettingsProvider", "Failed to read string value: " + e, new Object[0]);
                    context = context;
                    b(context);
                    return str;
                } catch (SecurityException e4) {
                    e = e4;
                    e = e;
                    context = 0;
                    AbstractC4851eH1.a("KnoxSettingsProvider", "Failed to read string value: " + e, new Object[0]);
                    context = context;
                    b(context);
                    return str;
                } catch (Throwable th) {
                    th = th;
                    b(cursor);
                    throw th;
                }
                if (context != 0) {
                    try {
                        int columnCount = context.getColumnCount();
                        context = context;
                        if (columnCount == 1) {
                            if (context.moveToFirst()) {
                                str = context.getString(0);
                                context = context;
                            } else {
                                context = context;
                            }
                        }
                    } catch (IllegalStateException e5) {
                        e = e5;
                        AbstractC4851eH1.a("KnoxSettingsProvider", "Failed to read string value: " + e, new Object[0]);
                        context = context;
                        b(context);
                        return str;
                    } catch (NullPointerException e6) {
                        e = e6;
                        AbstractC4851eH1.a("KnoxSettingsProvider", "Failed to read string value: " + e, new Object[0]);
                        context = context;
                        b(context);
                        return str;
                    } catch (SecurityException e7) {
                        e = e7;
                        AbstractC4851eH1.a("KnoxSettingsProvider", "Failed to read string value: " + e, new Object[0]);
                        context = context;
                        b(context);
                        return str;
                    }
                }
                b(context);
            } catch (Throwable th2) {
                cursor = context;
                th = th2;
                b(cursor);
                throw th;
            }
        }
        return str;
    }

    public static boolean g(Context context) {
        boolean booleanValue;
        synchronized (a) {
            if (b == null) {
                b = Boolean.valueOf(a(context));
            }
            booleanValue = b.booleanValue();
        }
        return booleanValue;
    }

    public static boolean a(Context context) {
        if (!"com.android.chrome".equals(context.getPackageName())) {
            return false;
        }
        if (context.checkCallingOrSelfPermission("com.sec.enterprise.knox.MDM_CONTENT_PROVIDER") != 0) {
            AbstractC4851eH1.f("KnoxSettingsProvider", "Permission to read device policy denied.", new Object[0]);
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider("com.sec.knox.provider", 0);
        if (resolveContentProvider == null) {
            return false;
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(resolveContentProvider.packageName, 0);
            if (applicationInfo != null && (applicationInfo.flags & 1) != 0) {
                return true;
            }
            AbstractC4851eH1.f("KnoxSettingsProvider", "Unable to verify content provider is in the system image.", new Object[0]);
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            AbstractC4851eH1.f("KnoxSettingsProvider", "Unable to resolve application info for policy content provider", new Object[0]);
            return false;
        }
    }

    public static void b(Cursor cursor) {
        if (cursor == null) {
            return;
        }
        try {
            cursor.close();
        } catch (IllegalStateException e) {
            AbstractC4851eH1.a("KnoxSettingsProvider", "Failed to close cursor: " + e, new Object[0]);
        }
    }
}
