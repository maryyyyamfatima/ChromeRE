package defpackage;

import J.N;
import android.net.Uri;
import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URL;
import org.chromium.components.search_engines.TemplateUrlService;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: e80, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4803e80 {
    public final boolean a;
    public Uri b;
    public Uri c;
    public boolean d;
    public final boolean e;

    public C4803e80(String str, boolean z) {
        this(str, null, null, null, null, z);
    }

    public C4803e80(String str, String str2, String str3, String str4, String str5, boolean z) {
        Uri d;
        this.a = z;
        boolean z2 = false;
        boolean z3 = !TextUtils.isEmpty(str4) && N.Mn0fHwI$(str4);
        this.e = z3;
        if (z3) {
            d = Uri.parse(str4);
        } else {
            d = d(str, str2, str3, false);
        }
        this.c = d;
        if (!z) {
            this.b = null;
        } else {
            if (!TextUtils.isEmpty(str5) && N.Mn0fHwI$(str5)) {
                z2 = true;
            }
            if (z2) {
                this.b = Uri.parse(str5);
            } else {
                Uri d2 = d(str, str2, str3, true);
                if (d2.getPath() != null && d2.getPath().contains("search")) {
                    d2 = d2.buildUpon().path("s").appendQueryParameter("sns", "1").build();
                }
                this.b = d2;
            }
        }
        this.d = z;
    }

    public final String c() {
        URL url;
        this.d = false;
        try {
            url = new URL(b().replaceAll("(ctxs=[^&]+)", "ctxr").replaceAll("(\\&pf=\\w)", ""));
        } catch (MalformedURLException unused) {
            url = null;
        }
        if (url != null) {
            return url.toString();
        }
        return null;
    }

    public final String b() {
        Uri uri;
        return (!this.d || (uri = this.b) == null) ? this.c.toString() : uri.toString();
    }

    public final void a(String str, String str2) {
        if (this.e || TextUtils.isEmpty(str2)) {
            return;
        }
        Uri uri = this.b;
        if (uri != null) {
            this.b = e(uri, str, str2);
        }
        this.c = e(this.c, str, str2);
    }

    public static Uri d(String str, String str2, String str3, boolean z) {
        TemplateUrlService a = IG3.a();
        Uri parse = Uri.parse(((GURL) N.MBQwEcmT(a.c, a, str, str2, z, "2")).i());
        return !TextUtils.isEmpty(str3) ? parse.buildUpon().appendQueryParameter("kgmid", str3).build() : parse;
    }

    public static Uri e(Uri uri, String str, String str2) {
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("ctxsl_trans", "1");
        if (!str.isEmpty()) {
            buildUpon.appendQueryParameter("tlitesl", str);
        }
        if (!str2.isEmpty()) {
            buildUpon.appendQueryParameter("tlitetl", str2);
        }
        buildUpon.appendQueryParameter("tlitetxt", uri.getQueryParameter("q"));
        return buildUpon.build();
    }
}
