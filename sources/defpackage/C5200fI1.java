package defpackage;

import android.util.Log;
import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fI1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5200fI1 {
    public final String a;
    public final String b;

    public C5200fI1(String... strArr) {
        String sb;
        if (strArr.length == 0) {
            sb = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(",");
                }
                sb2.append(str);
            }
            sb2.append(']');
            sb2.append(' ');
            sb = sb2.toString();
        }
        this.b = sb;
        this.a = "Auth";
        for (int i = 2; 7 >= i && !Log.isLoggable(this.a, i); i++) {
        }
    }

    public final void a(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        Log.w(this.a, this.b.concat(str));
    }
}
