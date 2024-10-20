package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Yf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3144Yf extends C2364Sf {
    public final SeekBar d;
    public Drawable e;
    public ColorStateList f;
    public PorterDuff.Mode g;
    public boolean h;
    public boolean i;

    public C3144Yf(SeekBar seekBar) {
        super(seekBar);
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = false;
        this.d = seekBar;
    }

    @Override // defpackage.C2364Sf
    public final void a(AttributeSet attributeSet, int i) {
        super.a(attributeSet, R.attr.f12160_resource_name_obfuscated_res_0x7f0503ed);
        SeekBar seekBar = this.d;
        Context context = seekBar.getContext();
        int[] iArr = JG2.l;
        IN3 m = IN3.m(context, attributeSet, iArr, R.attr.f12160_resource_name_obfuscated_res_0x7f0503ed);
        Ec4.l(seekBar, seekBar.getContext(), iArr, attributeSet, m.b, R.attr.f12160_resource_name_obfuscated_res_0x7f0503ed, 0);
        Drawable f = m.f(0);
        if (f != null) {
            seekBar.setThumb(f);
        }
        Drawable e = m.e(1);
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.e = e;
        if (e != null) {
            e.setCallback(seekBar);
            e.setLayoutDirection(seekBar.getLayoutDirection());
            if (e.isStateful()) {
                e.setState(seekBar.getDrawableState());
            }
            c();
        }
        seekBar.invalidate();
        if (m.l(3)) {
            this.g = AbstractC3085Xt0.c(m.h(3, -1), this.g);
            this.i = true;
        }
        if (m.l(2)) {
            this.f = m.b(2);
            this.h = true;
        }
        m.n();
        c();
    }

    public final void c() {
        Drawable drawable = this.e;
        if (drawable != null) {
            if (this.h || this.i) {
                Drawable mutate = drawable.mutate();
                this.e = mutate;
                if (this.h) {
                    mutate.setTintList(this.f);
                }
                if (this.i) {
                    this.e.setTintMode(this.g);
                }
                if (this.e.isStateful()) {
                    this.e.setState(this.d.getDrawableState());
                }
            }
        }
    }

    public final void d(Canvas canvas) {
        if (this.e != null) {
            int max = this.d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.e.getIntrinsicWidth();
                int intrinsicHeight = this.e.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.e.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
