package org.chromium.url;

import J.N;
import android.os.SystemClock;
import android.text.TextUtils;
import defpackage.AbstractC4809e90;
import defpackage.AbstractC4851eH1;
import defpackage.EI2;
import defpackage.QW0;
import org.chromium.base.ThreadUtils;
import org.chromium.base.library_loader.b;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class GURL {
    public String a;
    public boolean b;
    public Parsed c;

    public GURL() {
    }

    public static GURL emptyGURL() {
        return QW0.a;
    }

    public GURL(String str) {
        if (TextUtils.isEmpty(str)) {
            this.a = "";
            this.c = new Parsed(0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, false, null);
        } else {
            b();
            N.MWBVWQ0I(str, this);
        }
    }

    public static boolean l(GURL gurl) {
        return gurl == null || gurl.k() || !gurl.b;
    }

    public final void init(String str, boolean z, Parsed parsed) {
        this.a = str;
        this.b = z;
        this.c = parsed;
    }

    public final long toNativeGURL() {
        return N.MnPIH$$1(this.a, this.b, this.c.c());
    }

    public final String i() {
        return (this.b || this.a.isEmpty()) ? this.a : "";
    }

    public final String j() {
        return this.b ? this.a : "";
    }

    public final String c(int i, int i2) {
        return i2 <= 0 ? "" : this.a.substring(i, i2 + i);
    }

    public final String h() {
        Parsed parsed = this.c;
        return c(parsed.a, parsed.b);
    }

    public final String d() {
        Parsed parsed = this.c;
        return c(parsed.g, parsed.h);
    }

    public final String g() {
        Parsed parsed = this.c;
        return c(parsed.i, parsed.j);
    }

    public final String f() {
        Parsed parsed = this.c;
        return c(parsed.k, parsed.l);
    }

    public final boolean k() {
        return this.a.isEmpty();
    }

    public GURL e() {
        GURL gurl = new GURL();
        N.MNBd3mFA(this.a, this.b, this.c.c(), gurl);
        return gurl;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GURL) {
            return this.a.equals(((GURL) obj).a);
        }
        return false;
    }

    public final String m() {
        String str = "1\u0000" + this.b + (char) 0 + this.c.b() + (char) 0 + this.a;
        return Integer.toString(str.length()) + (char) 0 + str;
    }

    public static GURL a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return emptyGURL();
            }
            String[] split = str.split(Character.toString((char) 0));
            String str2 = split[0];
            if (str.length() != Integer.parseInt(str2) + str2.length() + 1) {
                throw new IllegalArgumentException("Serialized GURL had the wrong length.");
            }
            String str3 = split[split.length - 1];
            if (str.endsWith(Character.toString((char) 0))) {
                str3 = "";
            }
            if (Integer.parseInt(split[1]) != 1) {
                return new GURL(str3);
            }
            boolean parseBoolean = Boolean.parseBoolean(split[2]);
            Parsed a = Parsed.a(3, split);
            GURL gurl = new GURL();
            gurl.init(str3, parseBoolean, a);
            return gurl;
        } catch (Exception e) {
            AbstractC4851eH1.f("GURL", AbstractC4809e90.a("Exception while deserializing a GURL: ", str), e);
            return emptyGURL();
        }
    }

    public static void b() {
        b bVar = b.n;
        if (bVar.f()) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        bVar.b();
        if (ThreadUtils.h()) {
            EI2.n(SystemClock.elapsedRealtime() - elapsedRealtime, "Startup.Android.GURLEnsureMainDexInitialized");
        }
    }
}
