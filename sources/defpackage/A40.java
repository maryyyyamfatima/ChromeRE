package defpackage;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class A40 implements Comparable {
    public final String a;
    public final String g;
    public final List h;
    public final List i;
    public final List j;
    public final ArrayList k;
    public boolean l;
    public Drawable m;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((A40) obj).g.compareTo(this.g);
    }

    public A40(String str, String str2, List list, List list2, List list3) {
        this.g = str2 == null ? "" : str2;
        this.h = list == null ? new ArrayList() : list;
        this.i = list2 == null ? new ArrayList() : list2;
        this.j = list3 == null ? new ArrayList() : list3;
        this.k = new ArrayList();
        this.a = str;
    }

    public static String a(String str) {
        String replaceAll = str.replaceAll("\n\n", "\n");
        while (true) {
            String str2 = replaceAll;
            String str3 = str;
            str = str2;
            if (str.length() < str3.length()) {
                replaceAll = str.replaceAll("\n\n", "\n");
            } else {
                return str.replaceAll("\n", ", ");
            }
        }
    }

    public final String b(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (z) {
            int i2 = 0;
            for (C4687do2 c4687do2 : this.j) {
                int i3 = i2 + 1;
                if (i2 > 0) {
                    sb.append("\n");
                }
                sb.append(a(c4687do2.c[0]));
                i2 = i3;
            }
            i = i2;
        }
        if (z2) {
            for (String str : this.h) {
                int i4 = i + 1;
                if (i > 0) {
                    sb.append("\n");
                }
                sb.append(str);
                i = i4;
            }
        }
        if (z3) {
            for (String str2 : this.i) {
                int i5 = i + 1;
                if (i > 0) {
                    sb.append("\n");
                }
                sb.append(str2);
                i = i5;
            }
        }
        return sb.toString();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.g});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof A40) {
            return this.a.equals(((A40) obj).a);
        }
        return false;
    }
}
