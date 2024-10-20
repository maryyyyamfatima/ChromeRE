package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import com.android.chrome.R;
import org.chromium.base.Callback;
import org.chromium.components.permissions.PermissionDialogController;
import org.chromium.components.search_engines.TemplateUrlService;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Kl3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1359Kl3 implements InterfaceC0868Gr2, HG3, InterfaceC4229cU1 {
    public final Resources A;
    public final Context B;
    public final InterfaceC3472aG1 C;
    public final PermissionDialogController D;
    public final C9798sh2 H;

    /* renamed from: J, reason: collision with root package name */
    public final WindowAndroid f11453J;
    public boolean L;
    public float M;
    public final float N;
    public final float O;
    public final PropertyModel a;
    public final QZ2 g;
    public final InterfaceC0408Dd2 h;
    public final InterfaceC0079Ap3 i;
    public final InterfaceC0079Ap3 j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public final boolean p;
    public final int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int w;
    public int x;
    public int y;
    public int z;
    public int v = 3;
    public final Handler E = new Handler();
    public final Handler F = new Handler();
    public int G = -1;
    public final C8083nh2 I = new C8083nh2();
    public boolean K = true;
    public int P = 8500;

    public C1359Kl3(PropertyModel propertyModel, Resources resources, Context context, boolean z, InterfaceC3472aG1 interfaceC3472aG1, PermissionDialogController permissionDialogController, QZ2 qz2, C0538Ed2 c0538Ed2, InterfaceC0079Ap3 interfaceC0079Ap3, C9798sh2 c9798sh2, C10285u6 c10285u6, C8385oa2 c8385oa2) {
        this.a = propertyModel;
        this.C = interfaceC3472aG1;
        this.g = qz2;
        this.h = c0538Ed2;
        c0538Ed2.j(new Callback() { // from class: Fl3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C1359Kl3 c1359Kl3 = C1359Kl3.this;
                c1359Kl3.getClass();
                ((TemplateUrlService) obj).a(c1359Kl3);
                c1359Kl3.d(0);
            }
        });
        this.i = interfaceC0079Ap3;
        this.A = resources;
        this.B = context;
        this.H = c9798sh2;
        this.f11453J = c10285u6;
        this.j = c8385oa2;
        this.q = resources.getDimensionPixelSize(R.dimen.f34850_resource_name_obfuscated_res_0x7f0803bd) - resources.getDimensionPixelSize(R.dimen.f34840_resource_name_obfuscated_res_0x7f0803bc);
        float dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.f34920_resource_name_obfuscated_res_0x7f0803c4) / (r4 + r5);
        this.N = dimensionPixelSize;
        this.O = dimensionPixelSize != 1.0f ? 1.0f - dimensionPixelSize : 1.0f;
        this.p = z;
        this.D = permissionDialogController;
        permissionDialogController.a.a(this);
        c();
        propertyModel.k(AbstractC1878Ol3.d, !interfaceC3472aG1.isIncognito());
        d(0);
    }

    public final void e() {
        if (this.p) {
            return;
        }
        InterfaceC3472aG1 interfaceC3472aG1 = this.C;
        boolean isIncognito = interfaceC3472aG1.isIncognito();
        this.g.getClass();
        boolean z = true;
        boolean z2 = !isIncognito;
        this.o = z2;
        d(0);
        if (z2) {
            boolean g = interfaceC3472aG1.g();
            PropertyModel propertyModel = this.a;
            LD2 ld2 = AbstractC1878Ol3.d;
            if (g) {
                propertyModel.k(ld2, true);
                return;
            }
            if (this.i.get() == null || !T34.f(interfaceC3472aG1.h())) {
                propertyModel.k(ld2, true);
                return;
            }
            if (!z2 || (!this.k && this.M <= 0.0f)) {
                z = false;
            }
            propertyModel.k(ld2, z);
        }
    }

    public final void f() {
        int i;
        boolean z = this.m;
        boolean z2 = false;
        if (z) {
            i = R.string.f76520_resource_name_obfuscated_res_0x7f1405d3;
        } else {
            i = this.n ? R.string.f76530_resource_name_obfuscated_res_0x7f1405d4 : 0;
        }
        if ((this.n || z) && this.l && !this.k && i != 0) {
            z2 = true;
        }
        PropertyModel propertyModel = this.a;
        if (z2) {
            propertyModel.m(AbstractC1878Ol3.l, i);
        }
        propertyModel.k(AbstractC1878Ol3.m, z2);
    }

    public final void c() {
        int c;
        int i;
        int i2 = this.v;
        Context context = this.B;
        if (i2 == 0) {
            c = context.getColor(R.color.f22770_resource_name_obfuscated_res_0x7f0705cd);
        } else if (i2 == 1) {
            c = context.getColor(R.color.f22790_resource_name_obfuscated_res_0x7f0705cf);
        } else if (i2 == 2) {
            c = context.getColor(R.color.f22780_resource_name_obfuscated_res_0x7f0705ce);
        } else {
            c = AbstractC9685sM1.c(R.attr.f5240_resource_name_obfuscated_res_0x7f050139, context, "OmniboxResourceProvider");
        }
        ND2 nd2 = AbstractC1878Ol3.c;
        PropertyModel propertyModel = this.a;
        propertyModel.m(nd2, c);
        this.z = AbstractC3494aK3.d(this.v);
        if (this.m) {
            int i3 = this.v;
            if (i3 == 0) {
                i = context.getColor(R.color.f22740_resource_name_obfuscated_res_0x7f0705ca);
            } else if (i3 == 1) {
                i = context.getColor(R.color.f22760_resource_name_obfuscated_res_0x7f0705cc);
            } else if (i3 == 2) {
                i = context.getColor(R.color.f22750_resource_name_obfuscated_res_0x7f0705cb);
            } else {
                i = AbstractC9685sM1.c(R.attr.f5250_resource_name_obfuscated_res_0x7f05013a, context, "OmniboxResourceProvider");
            }
        } else if (this.n) {
            int i4 = this.v;
            if (i4 == 0) {
                i = context.getColor(R.color.f22710_resource_name_obfuscated_res_0x7f0705c7);
            } else if (i4 == 1) {
                i = context.getColor(R.color.f22730_resource_name_obfuscated_res_0x7f0705c9);
            } else if (i4 == 2) {
                i = context.getColor(R.color.f22720_resource_name_obfuscated_res_0x7f0705c8);
            } else {
                i = context.getColor(R.color.f18300_resource_name_obfuscated_res_0x7f070157);
            }
        } else {
            i = 0;
        }
        if (i != 0) {
            propertyModel.m(AbstractC1878Ol3.k, i);
        }
        d(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:            if ((!r3) != false) goto L10;     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0129 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
    /* JADX WARN: Type inference failed for: r13v0, types: [El3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(int r17) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1359Kl3.d(int):void");
    }

    public final boolean b() {
        boolean z = this.k && this.o;
        Object obj = this.i.get();
        InterfaceC3472aG1 interfaceC3472aG1 = this.C;
        boolean z2 = (obj == null || !T34.f(interfaceC3472aG1.h()) || interfaceC3472aG1.e() || this.p || (!this.k && this.M <= 0.0f)) ? false : true;
        boolean isIncognito = interfaceC3472aG1.isIncognito();
        this.g.getClass();
        if (!isIncognito) {
            return z || z2;
        }
        return false;
    }

    public final void a() {
        this.E.removeCallbacksAndMessages(null);
        this.G = -1;
        this.F.removeCallbacksAndMessages(null);
        this.L = false;
    }

    @Override // defpackage.HG3
    public final void x() {
        d(0);
    }
}
