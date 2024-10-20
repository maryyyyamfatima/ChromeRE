package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Jn4 {
    public final byte[] a;
    public String b;
    public Bitmap c;
    public final String d;
    public final int e;
    public final boolean f;

    public Jn4() {
    }

    public Jn4(byte[] bArr) {
        this.a = bArr;
    }

    public Jn4(String str) {
        this.b = str;
        this.f = true;
    }

    public Jn4(Bitmap bitmap) {
        this.c = bitmap;
    }

    public Jn4(String str, int i) {
        this.d = str;
        this.e = i;
    }

    public final String b() {
        if (this.b == null) {
            this.b = AbstractC9552ry.a(a());
        }
        return this.b;
    }

    public final Bitmap a() {
        int i;
        if (this.c == null) {
            String str = this.b;
            Bitmap bitmap = null;
            if (str != null && this.f) {
                if (!TextUtils.isEmpty(str)) {
                    byte[] decode = Base64.decode(str, 0);
                    bitmap = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                }
            } else {
                String str2 = this.d;
                if (str2 != null && (i = this.e) != 0) {
                    try {
                        BitmapDrawable bitmapDrawable = (BitmapDrawable) AbstractC9771sd.c(V60.a.getPackageManager().getResourcesForApplication(str2), i, 0);
                        if (bitmapDrawable != null) {
                            bitmap = bitmapDrawable.getBitmap();
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            this.c = bitmap;
        }
        return this.c;
    }
}
