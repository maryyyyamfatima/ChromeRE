package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Mb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1564Mb extends AbstractC8446ok3 {
    public C3487aJ1 I;

    /* renamed from: J, reason: collision with root package name */
    public C1593Mg3 f11456J;

    public C1564Mb(C1564Mb c1564Mb, C2214Rb c2214Rb, Resources resources) {
        super(c1564Mb, c2214Rb, resources);
        if (c1564Mb != null) {
            this.I = c1564Mb.I;
            this.f11456J = c1564Mb.f11456J;
        } else {
            this.I = new C3487aJ1();
            this.f11456J = new C1593Mg3();
        }
    }

    @Override // defpackage.AbstractC1006Ht0
    public final void e() {
        this.I = this.I.clone();
        this.f11456J = this.f11456J.clone();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v2 */
    public final int f(int i) {
        ?? r5;
        if (i < 0) {
            return 0;
        }
        C1593Mg3 c1593Mg3 = this.f11456J;
        int i2 = 0;
        int a = X40.a(c1593Mg3.i, i, c1593Mg3.g);
        if (a >= 0 && (r5 = c1593Mg3.h[a]) != C1593Mg3.j) {
            i2 = r5;
        }
        return i2.intValue();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C2214Rb(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C2214Rb(this, resources);
    }
}
