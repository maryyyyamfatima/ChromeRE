package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class A01 {
    public static final Uri f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String a;
    public final String b;
    public final ComponentName c;
    public final int d;
    public final boolean e;

    public A01(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = null;
        this.d = 4225;
        this.e = z;
    }

    public A01(ComponentName componentName) {
        this.a = null;
        this.b = null;
        this.c = componentName;
        this.d = 4225;
        this.e = false;
    }

    public final String toString() {
        String str = this.a;
        return str == null ? this.c.flattenToString() : str;
    }

    public final Intent a(Context context) {
        Bundle bundle;
        String str = this.a;
        if (str != null) {
            if (this.e) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("serviceActionBundleKey", str);
                try {
                    bundle = context.getContentResolver().call(f, "serviceIntentCall", (String) null, bundle2);
                } catch (IllegalArgumentException e) {
                    Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(String.valueOf(e)));
                    bundle = null;
                }
                r2 = bundle != null ? (Intent) bundle.getParcelable("serviceResponseIntentKey") : null;
                if (r2 == null) {
                    Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: " + str);
                }
            }
            return r2 == null ? new Intent(str).setPackage(this.b) : r2;
        }
        return new Intent().setComponent(this.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Integer.valueOf(this.d), Boolean.valueOf(this.e)});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A01)) {
            return false;
        }
        A01 a01 = (A01) obj;
        return W82.a(this.a, a01.a) && W82.a(this.b, a01.b) && W82.a(this.c, a01.c) && this.d == a01.d && this.e == a01.e;
    }
}
