package defpackage;

import android.os.Build;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class TI3 {
    public float b;
    public float c;
    public float d;
    public int e;
    public int f;
    public int g;
    public CharSequence h;
    public final boolean m;
    public TextUtils.TruncateAt n;
    public boolean o;
    public int p;
    public Layout.Alignment q;
    public DH3 r;
    public int s;
    public int t;
    public int u;
    public boolean v;
    public TextPaint a = new TextPaint(1);
    public float i = 1.0f;
    public float j = 0.0f;
    public float k = Float.MAX_VALUE;
    public boolean l = true;

    public TI3() {
        this.m = Build.VERSION.SDK_INT >= 28;
        this.n = null;
        this.o = false;
        this.p = Integer.MAX_VALUE;
        this.q = Layout.Alignment.ALIGN_NORMAL;
        this.r = GH3.c;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = false;
    }

    public final void a() {
        if (this.v) {
            TextPaint textPaint = new TextPaint(this.a);
            textPaint.set(this.a);
            this.a = textPaint;
            this.v = false;
        }
    }

    public final int hashCode() {
        int floatToIntBits = (((Float.floatToIntBits(this.d) + ((Float.floatToIntBits(this.c) + ((Float.floatToIntBits(this.b) + ((((Float.floatToIntBits(this.a.getTextSize()) + ((this.a.getColor() + 31) * 31)) * 31) + (this.a.getTypeface() != null ? this.a.getTypeface().hashCode() : 0)) * 31)) * 31)) * 31)) * 31) + this.e) * 31;
        TextPaint textPaint = this.a;
        int floatToIntBits2 = (((((Float.floatToIntBits(this.k) + ((Float.floatToIntBits(this.j) + ((Float.floatToIntBits(this.i) + ((((((Arrays.hashCode(this.a.drawableState) + ((Float.floatToIntBits(textPaint.density) + ((floatToIntBits + textPaint.linkColor) * 31)) * 31)) * 31) + this.f) * 31) + this.g) * 31)) * 31)) * 31)) * 31) + (this.l ? 1 : 0)) * 31) + (this.m ? 1 : 0)) * 31;
        TextUtils.TruncateAt truncateAt = this.n;
        int hashCode = (((((floatToIntBits2 + (truncateAt != null ? truncateAt.hashCode() : 0)) * 31) + (this.o ? 1 : 0)) * 31) + this.p) * 31;
        Layout.Alignment alignment = this.q;
        int hashCode2 = (hashCode + (alignment != null ? alignment.hashCode() : 0)) * 31;
        DH3 dh3 = this.r;
        int hashCode3 = (Arrays.hashCode((int[]) null) + ((Arrays.hashCode((int[]) null) + ((((((hashCode2 + (dh3 != null ? dh3.hashCode() : 0)) * 31) + this.s) * 31) + this.t) * 31)) * 31)) * 31;
        CharSequence charSequence = this.h;
        return hashCode3 + (charSequence != null ? charSequence.hashCode() : 0);
    }
}
