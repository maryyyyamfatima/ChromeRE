package defpackage;

import android.app.NotificationChannel;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.chromium.chrome.browser.browserservices.permissiondelegation.InstalledWebappBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wn1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11205wn1 {
    public final C11548xn1 a;
    public final PackageManager b;
    public final C10776vY3 c;
    public final InterfaceC3241Yy1 d;

    public static C11205wn1 a() {
        return (C11205wn1) C10712vM.e().i.get();
    }

    public static Boolean d(String str) {
        if (str == null) {
            return null;
        }
        try {
            PackageInfo packageInfo = V60.a.getPackageManager().getPackageInfo(str, 4096);
            String[] strArr = packageInfo.requestedPermissions;
            int[] iArr = packageInfo.requestedPermissionsFlags;
            if (strArr != null) {
                boolean z = false;
                for (int i = 0; i < strArr.length; i++) {
                    if ("android.permission.ACCESS_COARSE_LOCATION".equals(strArr[i]) || "android.permission.ACCESS_FINE_LOCATION".equals(strArr[i])) {
                        if ((iArr[i] & 2) != 0) {
                            return Boolean.TRUE;
                        }
                        z = true;
                    }
                }
                if (z) {
                    return Boolean.FALSE;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            AbstractC4851eH1.a("PermissionManager", "Couldn't find name for client package: %s", str);
        }
        return null;
    }

    public final void f(C1193Je2 c1193Je2, String str, int i, int i2) {
        String str2;
        int importance;
        Boolean valueOf;
        Integer num;
        NotificationChannel notificationChannel = null;
        char c = 0;
        try {
            PackageManager packageManager = V60.a.getPackageManager();
            str2 = packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 0)).toString();
        } catch (PackageManager.NameNotFoundException unused) {
            AbstractC4851eH1.a("PermissionManager", "Couldn't find name for client package: %s", str);
        }
        if (TextUtils.isEmpty(str2)) {
            AbstractC4851eH1.a("PermissionManager", "Invalid details for client package: %s", str2);
            str2 = null;
        }
        if (str2 == null) {
            return;
        }
        C11548xn1 c11548xn1 = this.a;
        if (i == 4) {
            boolean z = i2 == 1;
            Integer f = c11548xn1.f(i, c1193Je2);
            if (f == null) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(f.intValue() == 1);
            }
            this.c.getClass();
            if (valueOf != null) {
                num = (valueOf.booleanValue() || !z) ? (!valueOf.booleanValue() || z) ? null : 2 : 3;
            } else if (z) {
                num = 1;
            } else {
                num = 0;
            }
            if (num != null) {
                EI2.h(num.intValue(), 4, "TrustedWebActivity.LocationPermissionChanged");
            }
        }
        boolean z2 = !c11548xn1.g().contains(c1193Je2.toString());
        SharedPreferences sharedPreferences = c11548xn1.a;
        if (!z2) {
            z2 = (i2 != sharedPreferences.getInt(C11548xn1.e(i, c1193Je2), 3)) || (str.equals(sharedPreferences.getString(C11548xn1.c(c1193Je2), null)) ^ true) || (str2.equals(sharedPreferences.getString(C11548xn1.b(c1193Je2), null)) ^ true);
        }
        HashSet g = c11548xn1.g();
        g.add(c1193Je2.toString());
        sharedPreferences.edit().putStringSet("origins", g).apply();
        sharedPreferences.edit().putInt(C11548xn1.e(i, c1193Je2), i2).putString(C11548xn1.c(c1193Je2), str).putString(C11548xn1.b(c1193Je2), str2).apply();
        if (i == 5) {
            int i3 = Build.VERSION.SDK_INT;
            if (!(i3 < 26)) {
                D62 d62 = (D62) this.d.get();
                d62.getClass();
                if (!(i3 < 26)) {
                    String c1193Je22 = c1193Je2.toString();
                    C5660ge3 c5660ge3 = d62.b;
                    String b = c5660ge3.b(c1193Je22);
                    if (!"sites".equals(b)) {
                        InterfaceC7205l72 interfaceC7205l72 = c5660ge3.a;
                        C6861k72 c6861k72 = ((C7549m72) interfaceC7205l72).a;
                        if (i3 < 26) {
                            c6861k72.getClass();
                        } else {
                            notificationChannel = c6861k72.b.getNotificationChannel(b);
                        }
                        if (notificationChannel == null) {
                            c = 2;
                        } else {
                            importance = notificationChannel.getImportance();
                            if (importance == 0) {
                                c = 1;
                            }
                        }
                        if (c != 2) {
                            int i4 = c != 0 ? 2 : 1;
                            d62.a.a.edit().putInt("pre_twa_notification_permission_setting." + c1193Je2.toString(), i4).apply();
                            ((C7549m72) interfaceC7205l72).d(b);
                        }
                    }
                }
            }
        }
        if (z2) {
            InstalledWebappBridge.a(i);
        }
    }

    public C11205wn1(Context context, C11548xn1 c11548xn1, InterfaceC3241Yy1 interfaceC3241Yy1, C10776vY3 c10776vY3) {
        this.b = context.getPackageManager();
        this.a = c11548xn1;
        this.d = interfaceC3241Yy1;
        this.c = c10776vY3;
    }

    public final HashSet b(C1193Je2 c1193Je2) {
        C11548xn1 c11548xn1 = this.a;
        c11548xn1.getClass();
        HashSet hashSet = null;
        Set<String> stringSet = c11548xn1.a.getStringSet(C11548xn1.a(c1193Je2), null);
        if (stringSet != null) {
            hashSet = new HashSet();
            Iterator<String> it = stringSet.iterator();
            while (it.hasNext()) {
                hashSet.add(new C5920hO3(new C6606jO3(Base64.decode(it.next(), 3))));
            }
        }
        return hashSet;
    }

    public final void e(int i, C1193Je2 c1193Je2) {
        this.a.a.edit().remove(C11548xn1.d(i, c1193Je2)).remove(C11548xn1.e(i, c1193Je2)).apply();
        InstalledWebappBridge.a(i);
    }

    public final int c(int i, C1193Je2 c1193Je2) {
        C11548xn1 c11548xn1 = this.a;
        if (i == 4) {
            c11548xn1.getClass();
            String string = c11548xn1.a.getString(C11548xn1.c(c1193Je2), null);
            Boolean d = d(string);
            if (d != null) {
                if (c11548xn1.f(i, c1193Je2) == null && !d.booleanValue()) {
                    return 3;
                }
                if (Build.VERSION.SDK_INT >= 30 && !d.booleanValue()) {
                    return 3;
                }
                int i2 = d.booleanValue() ? 1 : 2;
                f(c1193Je2, string, 4, i2);
                return i2;
            }
        } else if (i == 5) {
            Integer f = c11548xn1.f(i, c1193Je2);
            if (f == null) {
                AbstractC4851eH1.f("PermissionManager", "Origin %s is known but has no permission set.", c1193Je2);
            } else {
                return f.intValue();
            }
        }
        return 0;
    }
}
