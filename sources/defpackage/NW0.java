package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.util.regex.Pattern;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.profiles.ProfileManager;
import org.chromium.components.signin.base.CoreAccountInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class NW0 {
    public static NW0 e;
    public static final Pattern f;
    public final Context a;
    public final C12157za2 b = new C12157za2();
    public Boolean c;
    public String d;

    public final boolean a() {
        if (!ProfileManager.b) {
            return false;
        }
        C1202Jg1 a = C1202Jg1.a();
        Profile d = Profile.d();
        a.getClass();
        CoreAccountInfo b = C1202Jg1.b(d).b(1);
        return (b == null || TextUtils.isEmpty(this.d) || !TextUtils.equals(b.getEmail(), this.d)) ? false : true;
    }

    static {
        String.format("content://%s/publicvalue/roti_for_chrome_enabled", String.format("%s.GsaPublicContentProvider", "com.google.android.googlequicksearchbox"));
        f = Pattern.compile("^(\\d+)\\.(\\d+)(\\.\\d+)*$");
    }

    public static NW0 c(Context context) {
        if (e == null) {
            e = new NW0(context);
        }
        return e;
    }

    public NW0(Context context) {
        this.a = context.getApplicationContext();
    }

    public final void f(String str) {
        this.d = str;
        C11814ya2 c11814ya2 = (C11814ya2) this.b.iterator();
        if (c11814ya2.hasNext()) {
            X5.a(c11814ya2.next());
            throw null;
        }
    }

    public final boolean e() {
        Boolean bool = this.c;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean bool2 = Boolean.FALSE;
        this.c = bool2;
        Intent intent = new Intent("com.google.android.googlequicksearchbox.TEXT_ASSIST");
        intent.setPackage("com.google.android.googlequicksearchbox");
        if (AbstractC3017Xf2.b(intent, 0).size() == 0) {
            this.c = bool2;
        } else {
            Context context = this.a;
            if (AbstractC4983eg2.c(context, "com.google.android.googlequicksearchbox") >= 300401021) {
                if (AbstractC4983eg2.c(context, "com.google.android.gms") >= 6577010) {
                    this.c = Boolean.TRUE;
                }
            }
            this.c = bool2;
        }
        return this.c.booleanValue();
    }

    public static boolean d(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return true;
        }
        String[] split = str.split("\\.", -1);
        String[] split2 = str2.split("\\.", -1);
        int min = Math.min(split.length, split2.length);
        for (int i = 0; i < min; i++) {
            int parseInt = Integer.parseInt(split[i]);
            int parseInt2 = Integer.parseInt(split2[i]);
            if (parseInt < parseInt2) {
                return true;
            }
            if (parseInt > parseInt2) {
                return false;
            }
        }
        return split.length < split2.length;
    }

    public final String b() {
        try {
            return this.a.getPackageManager().getPackageInfo("com.google.android.googlequicksearchbox", 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
