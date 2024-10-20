package defpackage;

import android.content.ComponentName;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.HashSet;
import org.chromium.chrome.browser.browserservices.permissiondelegation.InstalledWebappBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: z72 */
/* loaded from: classes.dex */
public final class C12009z72 implements UX3 {
    public final /* synthetic */ C1193Je2 a;
    public final /* synthetic */ C72 b;

    @Override // defpackage.UX3
    public final void a() {
        Integer valueOf;
        C11205wn1 c11205wn1 = this.b.a;
        C11548xn1 c11548xn1 = c11205wn1.a;
        HashSet g = c11548xn1.g();
        C1193Je2 c1193Je2 = this.a;
        g.remove(c1193Je2.toString());
        c11548xn1.a.edit().putStringSet("origins", g).remove(C11548xn1.d(5, c1193Je2)).remove(C11548xn1.e(5, c1193Je2)).remove(C11548xn1.d(4, c1193Je2)).remove(C11548xn1.e(4, c1193Je2)).remove(C11548xn1.b(c1193Je2)).remove(C11548xn1.c(c1193Je2)).remove(C11548xn1.a(c1193Je2)).apply();
        int i = Build.VERSION.SDK_INT;
        if (!(i < 26)) {
            D62 d62 = (D62) c11205wn1.d.get();
            if (i < 26) {
                d62.getClass();
            } else {
                C11548xn1 c11548xn12 = d62.a;
                c11548xn12.getClass();
                String str = "pre_twa_notification_permission_setting." + c1193Je2.toString();
                SharedPreferences sharedPreferences = c11548xn12.a;
                if (sharedPreferences.contains(str)) {
                    int i2 = sharedPreferences.getInt(str, 3);
                    sharedPreferences.edit().remove(str).apply();
                    valueOf = Integer.valueOf(i2);
                } else {
                    String str2 = "pre_twa_notification_permission." + c1193Je2.toString();
                    if (sharedPreferences.contains(str2)) {
                        boolean z = sharedPreferences.getBoolean(str2, false);
                        sharedPreferences.edit().remove(str2).apply();
                        valueOf = Integer.valueOf(z ? 1 : 2);
                    } else {
                        valueOf = null;
                    }
                }
                if (valueOf != null) {
                    d62.b.a(System.currentTimeMillis(), c1193Je2.toString(), valueOf.intValue() == 1);
                }
            }
        }
        InstalledWebappBridge.a(5);
        InstalledWebappBridge.a(4);
    }

    public C12009z72(C72 c72, C1193Je2 c1193Je2) {
        this.b = c72;
        this.a = c1193Je2;
    }

    @Override // defpackage.UX3
    public final void b(ComponentName componentName, int i) {
        this.b.a(this.a, 0L, componentName.getPackageName(), i);
    }
}
