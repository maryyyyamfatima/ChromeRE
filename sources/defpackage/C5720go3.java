package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.util.SparseArray;
import com.android.chrome.R;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;
import org.chromium.ui.base.LocalizationUtils;
import org.chromium.ui.resources.ResourceManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: go3 */
/* loaded from: classes.dex */
public final class C5720go3 implements InterfaceC7041kf4 {
    public static final C3318Zn3 C = new C3318Zn3();
    public static final C3658ao3 D = new C3658ao3();
    public static final C4002bo3 E = new C4002bo3();
    public static final C4345co3 F = new C4345co3();
    public final int a;
    public final Context b;
    public final InterfaceC5376fo3 c;
    public final C3113Xy3 d;
    public final InterfaceC0512Dy1 e;
    public final InterfaceC2201Qy1 f;
    public final KN3 g;
    public boolean i;
    public final boolean k;
    public float l;
    public String n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public C4424d20 y;
    public float z;
    public boolean h = true;
    public boolean j = true;
    public float m = 1.0f;
    public final RectF w = new RectF();
    public boolean x = true;
    public final RectF A = new RectF();
    public final C12157za2 B = new C12157za2();

    public final void k(float f) {
        KN3 kn3 = this.g;
        kn3.f((f - this.s) + kn3.a.left);
        this.s = f;
        RectF rectF = this.w;
        rectF.left = f;
        rectF.right = f + this.u;
    }

    public C5720go3(Context context, int i, InterfaceC5376fo3 interfaceC5376fo3, C1628Mn3 c1628Mn3, InterfaceC0512Dy1 interfaceC0512Dy1, InterfaceC2201Qy1 interfaceC2201Qy1, boolean z) {
        this.a = -1;
        this.a = i;
        this.b = context;
        this.c = interfaceC5376fo3;
        this.d = new C3113Xy3(i, c1628Mn3);
        this.e = interfaceC0512Dy1;
        this.f = interfaceC2201Qy1;
        this.k = z;
        KN3 kn3 = new KN3(context, 0.0f, 0.0f, new C4688do3(this), R.drawable.0_resource_name_obfuscated_res_0x7f0900d6);
        this.g = kn3;
        kn3.s = R.color.0_resource_name_obfuscated_res_0x7f07012b;
        kn3.t = R.color.0_resource_name_obfuscated_res_0x7f070113;
        kn3.u = R.color.0_resource_name_obfuscated_res_0x7f070121;
        kn3.v = R.color.0_resource_name_obfuscated_res_0x7f070797;
        kn3.l = z;
        kn3.a.set(g());
        kn3.i = 0.0f;
    }

    @Override // defpackage.InterfaceC7041kf4
    public final String d() {
        return this.n;
    }

    @Override // defpackage.InterfaceC7041kf4
    public final void b(RectF rectF) {
        rectF.set(this.w);
    }

    @Override // defpackage.InterfaceC7041kf4
    public final boolean c(float f, float f2) {
        if (f(f, f2)) {
            return false;
        }
        return this.w.contains(f, f2);
    }

    @Override // defpackage.InterfaceC7041kf4
    public final void a(long j) {
        C1758Nn3 c1758Nn3 = (C1758Nn3) this.c;
        c1758Nn3.getClass();
        if (this.i) {
            return;
        }
        c1758Nn3.c.q(AbstractC1558Lz3.d(c1758Nn3.c, this.a), 3, false);
    }

    public final int h(boolean z) {
        boolean z2 = this.k;
        Context context = this.b;
        if (z) {
            return AbstractC11746yN.a(context, z2);
        }
        if (!z2) {
            return AbstractC3899bX.a(AbstractC11746yN.c(context, R.dimen.0_resource_name_obfuscated_res_0x7f08011b), -16777216, GP2.a(R.dimen.0_resource_name_obfuscated_res_0x7f08011d, context.getResources()), false);
        }
        return context.getResources().getColor(R.color.0_resource_name_obfuscated_res_0x7f07004f);
    }

    public final void l(boolean z) {
        this.h = z;
        if (!z) {
            this.f.c(this.a);
        }
        C11814ya2 c11814ya2 = (C11814ya2) this.B.iterator();
        if (c11814ya2.hasNext()) {
            X5.a(c11814ya2.next());
            throw null;
        }
    }

    public final float i() {
        return JM1.b(1.0f - (this.t / this.v), 0.0f, 1.0f);
    }

    public final boolean f(float f, float f2) {
        if (this.x) {
            return this.g.c(f, f2);
        }
        return false;
    }

    public final void j() {
        RectF g = g();
        float width = g.width();
        KN3 kn3 = this.g;
        RectF rectF = kn3.a;
        rectF.right = rectF.left + width;
        float height = g.height();
        RectF rectF2 = kn3.a;
        rectF2.bottom = rectF2.top + height;
        kn3.f(g.left);
        float f = g.top;
        rectF2.bottom = rectF2.height() + f;
        rectF2.top = f;
    }

    public final RectF g() {
        ResourceManager resourceManager;
        float f;
        boolean a = UN.T.a();
        int i = a ? 48 : 36;
        boolean isLayoutRtl = LocalizationUtils.isLayoutRtl();
        float f2 = 0.0f;
        RectF rectF = this.A;
        if (!isLayoutRtl) {
            float f3 = i;
            float f4 = this.u - f3;
            rectF.left = f4;
            rectF.right = f4 + f3;
        } else {
            rectF.left = 0.0f;
            rectF.right = i;
        }
        rectF.top = 0.0f;
        rectF.bottom = this.v;
        if (!a && (resourceManager = ((CompositorViewHolder) this.e).l.n) != null) {
            SparseArray sparseArray = (SparseArray) resourceManager.b.get(0);
            C0642Ey1 c0642Ey1 = sparseArray != null ? (C0642Ey1) sparseArray.get(R.drawable.0_resource_name_obfuscated_res_0x7f0900ae) : null;
            if (c0642Ey1 != null) {
                boolean isLayoutRtl2 = LocalizationUtils.isLayoutRtl();
                RectF rectF2 = c0642Ey1.a;
                if (isLayoutRtl2) {
                    f = rectF2.left;
                } else {
                    f = -(c0642Ey1.b.width() - rectF2.right);
                }
                f2 = f;
            }
        }
        rectF.offset(this.s + f2, this.t);
        return rectF;
    }

    public final void e() {
        boolean z = this.j && this.m > 0.99f;
        if (z != this.x) {
            float f = z ? 1.0f : 0.0f;
            C4424d20 c4424d20 = this.y;
            if (c4424d20 != null) {
                c4424d20.end();
            }
            V10 v10 = ((C9897sy1) this.f).H;
            C4767e20 c4767e20 = C5799h20.p;
            KN3 kn3 = this.g;
            C4424d20 d = C4424d20.d(v10, kn3, c4767e20, kn3.h, f, 150L);
            this.y = d;
            d.addListener(new C5032eo3(this));
            this.y.start();
            this.x = z;
            if (z) {
                return;
            }
            kn3.j = false;
        }
    }
}
