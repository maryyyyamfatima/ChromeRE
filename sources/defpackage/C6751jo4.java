package defpackage;

import J.N;
import android.net.Uri;
import java.io.Serializable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jo4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6751jo4 implements Comparable, Serializable {
    public final String a;
    public final String g;
    public final String h;
    public final boolean i;

    public static C6751jo4 b(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        boolean z = true;
        if (str.startsWith("[*.]")) {
            return new C6751jo4(null, null, str.substring(4), true);
        }
        if (str.indexOf("://") != -1) {
            Uri parse = Uri.parse(str);
            if (str.endsWith("/")) {
                str = str.substring(0, str.length() - 1);
            }
            if (!"http".equals(parse.getScheme()) || (parse.getPort() != -1 && parse.getPort() != 80)) {
                z = false;
            }
            return new C6751jo4(str, parse.getScheme(), parse.getHost(), z);
        }
        return new C6751jo4(null, null, str, true);
    }

    public C6751jo4(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.g = str2;
        this.h = str3;
        this.i = z;
    }

    public final String d() {
        String str = this.h;
        if (str != null && this.i) {
            return "http://" + str;
        }
        return this.a;
    }

    public final String f() {
        String str = this.a;
        return str == null ? this.h : N.MR6Af3ZS(str, this.i ? 1 : 0);
    }

    public final String c() {
        String str = this.a;
        if (str != null) {
            return T34.b(str, false);
        }
        return T34.b("http://" + this.h, false);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C6751jo4) && compareTo((C6751jo4) obj) == 0;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C6751jo4 c6751jo4) {
        int compareTo;
        if (this == c6751jo4) {
            return 0;
        }
        int compareTo2 = c().compareTo(c6751jo4.c());
        if (compareTo2 != 0) {
            return compareTo2;
        }
        String str = this.g;
        boolean z = str == null;
        String str2 = c6751jo4.g;
        if (z != (str2 == null)) {
            return str == null ? -1 : 1;
        }
        if (str != null && (compareTo = str.compareTo(str2)) != 0) {
            return compareTo;
        }
        String[] e = e();
        String[] e2 = c6751jo4.e();
        int length = e.length - 1;
        int length2 = e2.length - 1;
        while (length >= 0 && length2 >= 0) {
            int i = length - 1;
            int i2 = length2 - 1;
            int compareTo3 = e[length].compareTo(e2[length2]);
            if (compareTo3 != 0) {
                return compareTo3;
            }
            length = i;
            length2 = i2;
        }
        return length - length2;
    }

    public final String[] e() {
        int i;
        String str = this.a;
        if (str != null) {
            int indexOf = str.indexOf("://");
            if (indexOf == -1) {
                return new String[0];
            }
            i = indexOf + 3;
        } else {
            str = this.h;
            i = 0;
        }
        int indexOf2 = str.indexOf(c()) - 1;
        return indexOf2 > i ? str.substring(i, indexOf2).split("\\.") : new String[0];
    }
}
