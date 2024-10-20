package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: h01, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5788h01 implements InterfaceC6098hu1 {
    public final InterfaceC9607s71 b;
    public final URL c;
    public final String d;
    public String e;
    public URL f;
    public volatile byte[] g;
    public int h;

    public C5788h01(URL url) {
        C5782gz1 c5782gz1 = InterfaceC9607s71.a;
        AbstractC6464iy2.b(url);
        this.c = url;
        this.d = null;
        AbstractC6464iy2.b(c5782gz1);
        this.b = c5782gz1;
    }

    public C5788h01(String str) {
        C5782gz1 c5782gz1 = InterfaceC9607s71.a;
        this.c = null;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.d = str;
        AbstractC6464iy2.b(c5782gz1);
        this.b = c5782gz1;
    }

    public final String d() {
        if (TextUtils.isEmpty(this.e)) {
            String str = this.d;
            if (TextUtils.isEmpty(str)) {
                URL url = this.c;
                AbstractC6464iy2.b(url);
                str = url.toString();
            }
            this.e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.e;
    }

    public final String c() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        URL url = this.c;
        AbstractC6464iy2.b(url);
        return url.toString();
    }

    public final String toString() {
        return c();
    }

    @Override // defpackage.InterfaceC6098hu1
    public final void a(MessageDigest messageDigest) {
        if (this.g == null) {
            this.g = c().getBytes(InterfaceC6098hu1.a);
        }
        messageDigest.update(this.g);
    }

    @Override // defpackage.InterfaceC6098hu1
    public final boolean equals(Object obj) {
        if (!(obj instanceof C5788h01)) {
            return false;
        }
        C5788h01 c5788h01 = (C5788h01) obj;
        return c().equals(c5788h01.c()) && this.b.equals(c5788h01.b);
    }

    @Override // defpackage.InterfaceC6098hu1
    public final int hashCode() {
        if (this.h == 0) {
            int hashCode = c().hashCode();
            this.h = hashCode;
            this.h = this.b.hashCode() + (hashCode * 31);
        }
        return this.h;
    }
}
