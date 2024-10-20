package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.d;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class AK2 extends ViewGroup.MarginLayoutParams {
    public d a;
    public final Rect g;
    public boolean h;
    public boolean i;

    public AK2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = new Rect();
        this.h = true;
        this.i = false;
    }

    public AK2(int i, int i2) {
        super(i, i2);
        this.g = new Rect();
        this.h = true;
        this.i = false;
    }

    public AK2(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.g = new Rect();
        this.h = true;
        this.i = false;
    }

    public AK2(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.g = new Rect();
        this.h = true;
        this.i = false;
    }

    public AK2(AK2 ak2) {
        super((ViewGroup.LayoutParams) ak2);
        this.g = new Rect();
        this.h = true;
        this.i = false;
    }

    public final boolean e() {
        return this.a.n();
    }

    public final boolean d() {
        return (this.a.o & 2) != 0;
    }

    public final int c() {
        return this.a.h();
    }
}
