package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: w84, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10988w84 extends Drawable.ConstantState {
    public int a;
    public C10645v84 b;
    public ColorStateList c;
    public PorterDuff.Mode d;
    public boolean e;
    public Bitmap f;
    public ColorStateList g;
    public PorterDuff.Mode h;
    public int i;
    public boolean j;
    public boolean k;
    public Paint l;

    public C10988w84(C10988w84 c10988w84) {
        this.c = null;
        this.d = C11674y84.o;
        if (c10988w84 != null) {
            this.a = c10988w84.a;
            C10645v84 c10645v84 = new C10645v84(c10988w84.b);
            this.b = c10645v84;
            if (c10988w84.b.e != null) {
                c10645v84.e = new Paint(c10988w84.b.e);
            }
            if (c10988w84.b.d != null) {
                this.b.d = new Paint(c10988w84.b.d);
            }
            this.c = c10988w84.c;
            this.d = c10988w84.d;
            this.e = c10988w84.e;
        }
    }

    public C10988w84() {
        this.c = null;
        this.d = C11674y84.o;
        this.b = new C10645v84();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C11674y84(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C11674y84(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a;
    }
}
