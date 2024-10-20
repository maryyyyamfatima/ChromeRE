package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import com.android.chrome.R;
import com.google.android.material.card.MaterialCardView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pM1 */
/* loaded from: classes.dex */
public final class C8657pM1 {
    public static final double t = Math.cos(Math.toRadians(45.0d));
    public static final ColorDrawable u;
    public final MaterialCardView a;
    public final DM1 c;
    public final DM1 d;
    public int e;
    public int f;
    public int g;
    public int h;
    public Drawable i;
    public Drawable j;
    public ColorStateList k;
    public ColorStateList l;
    public S53 m;
    public ColorStateList n;
    public RippleDrawable o;
    public LayerDrawable p;
    public DM1 q;
    public boolean s;
    public final Rect b = new Rect();
    public boolean r = false;

    static {
        u = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public C8657pM1(MaterialCardView materialCardView, AttributeSet attributeSet) {
        this.a = materialCardView;
        DM1 dm1 = new DM1(materialCardView.getContext(), attributeSet, R.attr.0_resource_name_obfuscated_res_0x7f050320, R.style.f112740_resource_name_obfuscated_res_0x7f15083b);
        this.c = dm1;
        dm1.g(materialCardView.getContext());
        dm1.k();
        S53 s53 = dm1.a.a;
        s53.getClass();
        R53 r53 = new R53(s53);
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, JG2.y, R.attr.0_resource_name_obfuscated_res_0x7f050320, R.style.f95970_resource_name_obfuscated_res_0x7f1501a0);
        if (obtainStyledAttributes.hasValue(3)) {
            float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
            r53.e = new C6129i(dimension);
            r53.f = new C6129i(dimension);
            r53.g = new C6129i(dimension);
            r53.h = new C6129i(dimension);
        }
        this.d = new DM1();
        e(new S53(r53));
        obtainStyledAttributes.recycle();
    }

    public final C8314oM1 d(Drawable drawable) {
        int i;
        int i2;
        if (this.a.a) {
            int ceil = (int) Math.ceil((((C4902eR2) r0.j.a).e * 1.5f) + (f() ? a() : 0.0f));
            i = (int) Math.ceil(((C4902eR2) r0.j.a).e + (f() ? a() : 0.0f));
            i2 = ceil;
        } else {
            i = 0;
            i2 = 0;
        }
        return new C8314oM1(drawable, i, i2, i, i2);
    }

    public final boolean f() {
        MaterialCardView materialCardView = this.a;
        return materialCardView.g && this.c.h() && materialCardView.a;
    }

    public final void e(S53 s53) {
        this.m = s53;
        DM1 dm1 = this.c;
        dm1.b(s53);
        dm1.A = !dm1.h();
        DM1 dm12 = this.d;
        if (dm12 != null) {
            dm12.b(s53);
        }
        DM1 dm13 = this.q;
        if (dm13 != null) {
            dm13.b(s53);
        }
    }

    public final float a() {
        AbstractC11676y90 abstractC11676y90 = this.m.a;
        DM1 dm1 = this.c;
        return Math.max(Math.max(b(abstractC11676y90, dm1.a.a.e.a(dm1.f())), b(this.m.b, dm1.a.a.f.a(dm1.f()))), Math.max(b(this.m.c, dm1.a.a.g.a(dm1.f())), b(this.m.d, dm1.a.a.h.a(dm1.f()))));
    }

    public static float b(AbstractC11676y90 abstractC11676y90, float f) {
        if (abstractC11676y90 instanceof C6620jR2) {
            return (float) ((1.0d - t) * f);
        }
        if (abstractC11676y90 instanceof C9441rf0) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    public final LayerDrawable c() {
        if (this.o == null) {
            int[] iArr = AbstractC9363rQ2.a;
            this.q = new DM1(this.m);
            this.o = new RippleDrawable(this.k, null, this.q);
        }
        if (this.p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.o, this.d, this.j});
            this.p = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.p;
    }
}
