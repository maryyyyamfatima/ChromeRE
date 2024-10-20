package defpackage;

import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pf0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8756pf0 implements InterfaceC7381lf0 {
    public static Boolean a;

    @Override // defpackage.InterfaceC7381lf0
    public final String a() {
        String str = null;
        if (!d()) {
            return null;
        }
        Cursor query = V60.a.getContentResolver().query(c("homepage"), null, null, null, null);
        if (query != null && query.moveToFirst() && query.getColumnCount() == 1) {
            str = query.getString(0);
        }
        if (query != null) {
            query.close();
        }
        return str;
    }

    @Override // defpackage.InterfaceC7381lf0
    public final boolean b() {
        boolean z = false;
        if (!d()) {
            return false;
        }
        Cursor query = V60.a.getContentResolver().query(c("disablebookmarksediting"), null, null, null, null);
        if (query != null && query.moveToFirst() && query.getColumnCount() == 1 && query.getInt(0) == 1) {
            z = true;
        }
        if (query != null) {
            query.close();
        }
        return z;
    }

    public static boolean d() {
        if (a == null) {
            boolean z = false;
            ProviderInfo resolveContentProvider = V60.a.getPackageManager().resolveContentProvider("com.android.partnerbrowsercustomizations", 0);
            if (resolveContentProvider != null) {
                if ((resolveContentProvider.applicationInfo.flags & 1) != 0) {
                    z = true;
                } else {
                    AbstractC4851eH1.f("CustomizationProv", Y5.a(new StringBuilder("Browser Customizations content provider package, "), resolveContentProvider.packageName, ", is not a system package. This could be a malicious attempt from a third party app, so skip reading the browser content provider."), new Object[0]);
                }
            }
            a = Boolean.valueOf(z);
        }
        return a.booleanValue();
    }

    public static Uri c(String str) {
        return new Uri.Builder().scheme("content").authority("com.android.partnerbrowsercustomizations").appendPath(str).build();
    }
}
