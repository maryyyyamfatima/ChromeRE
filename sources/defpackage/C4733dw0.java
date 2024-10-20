package defpackage;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dw0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4733dw0 {
    public boolean a;
    public int g;
    public boolean h;
    public String i;
    public String j;
    public String k;
    public String l;
    public Drawable m;
    public final String[] n;
    public boolean o;

    public C4733dw0(Drawable drawable, String str, String str2, String str3) {
        this(str, str2, str3, null, drawable);
    }

    public C4733dw0(String str, String str2, String str3, String str4, Drawable drawable) {
        this.a = true;
        this.g = Integer.MAX_VALUE;
        this.n = new String[]{null, null, null};
        this.o = true;
        f(str, str2, str3, str4);
        this.m = drawable;
    }

    public boolean d() {
        return this.a;
    }

    public final void f(String str, String str2, String str3, String str4) {
        this.l = str;
        String[] strArr = this.n;
        strArr[0] = str2;
        strArr[1] = str3;
        strArr[2] = str4;
    }

    public String c(int i, String str) {
        String[] strArr = this.n;
        StringBuilder sb = new StringBuilder(strArr[0]);
        if (!TextUtils.isEmpty(strArr[1])) {
            if (sb.length() > 0) {
                sb.append(str);
            }
            sb.append(strArr[1]);
        }
        if (!TextUtils.isEmpty(strArr[2])) {
            if (sb.length() > 0) {
                sb.append(str);
            }
            sb.append(strArr[2]);
        }
        if (i >= 0 && sb.length() >= i) {
            return sb.substring(0, i / 2);
        }
        return sb.toString();
    }
}
