package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eI1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4856eI1 {
    public final String a;
    public final boolean b;
    public String c;

    public C4856eI1(String str) {
        this.a = str;
        this.b = str.length() <= 23;
    }

    public final void a(String str, Object... objArr) {
        if (this.b && Log.isLoggable(this.a, 3)) {
            e(str, objArr);
        }
    }

    public final void b(String str, Object... objArr) {
        if (this.b && Log.isLoggable(this.a, 3)) {
            e(str, objArr);
        }
    }

    public final void f(String str, Object... objArr) {
        Log.i(this.a, e(str, objArr));
    }

    public final void g(String str, Object... objArr) {
        Log.w(this.a, e(str, objArr));
    }

    public final void d(String str, Object... objArr) {
        Log.e(this.a, e(str, objArr));
    }

    public final void c(String str, Exception exc, Object... objArr) {
        Log.e(this.a, e(str, objArr), exc);
    }

    public final String e(String str, Object... objArr) {
        if (objArr.length != 0) {
            str = String.format(Locale.ROOT, str, objArr);
        }
        return !TextUtils.isEmpty(this.c) ? AbstractC7848n0.a(this.c, str) : str;
    }
}
