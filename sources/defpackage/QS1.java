package defpackage;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import com.android.chrome.R;
import org.chromium.base.Callback;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class QS1 implements InterfaceC2249Ri {
    public InterfaceC2379Si a;
    public C0170Bi b;
    public final C8385oa2 c;
    public C1340Ki d;
    public final C3799bD e;
    public final KS1 f;
    public final PropertyModel g;
    public final Runnable h;
    public final Activity i;
    public final C11939yv1 j;
    public final boolean k;
    public final InterfaceC0079Ap3 l;
    public int m = -1;
    public int n = -1;
    public final InterfaceC0079Ap3 o;
    public boolean p;
    public final Resources q;
    public final InterfaceC0079Ap3 r;
    public final Runnable s;
    public final int t;

    public QS1(PropertyModel propertyModel, boolean z, IS1 is1, DP3 dp3, RJ3 rj3, InterfaceC0079Ap3 interfaceC0079Ap3, C3799bD c3799bD, KS1 ks1, C0538Ed2 c0538Ed2, C10285u6 c10285u6, TP3 tp3, UP3 up3) {
        this.g = propertyModel;
        this.k = z;
        this.l = is1;
        this.h = dp3;
        this.o = interfaceC0079Ap3;
        this.e = c3799bD;
        this.f = ks1;
        rj3.j.a(new QJ3() { // from class: NS1
            @Override // defpackage.QJ3
            public final void c(int i, ColorStateList colorStateList) {
                QS1 qs1 = QS1.this;
                qs1.getClass();
                qs1.g.o(TS1.i, new SS1(i, colorStateList));
            }
        });
        c0538Ed2.j(new Callback() { // from class: OS1
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C0430Di c0430Di = (C0430Di) obj;
                QS1 qs1 = QS1.this;
                qs1.getClass();
                C1340Ki c1340Ki = c0430Di.d;
                qs1.d = c1340Ki;
                c1340Ki.i.add(qs1);
                C1340Ki c1340Ki2 = qs1.d;
                c1340Ki2.getClass();
                C0170Bi c0170Bi = new C0170Bi(c1340Ki2);
                qs1.b = c0170Bi;
                c0170Bi.g = new Runnable() { // from class: PS1
                    @Override // java.lang.Runnable
                    public final void run() {
                        FI2.a("MobileToolbarShowMenu");
                    }
                };
                qs1.g.o(TS1.b, c0170Bi);
                qs1.c.p(qs1.b);
                qs1.a = c0430Di.c;
            }
        });
        Activity activity = (Activity) c10285u6.k().get();
        this.i = activity;
        Resources resources = activity.getResources();
        this.q = resources;
        this.c = new C8385oa2();
        this.j = c10285u6.r();
        this.r = tp3;
        this.s = up3;
        this.t = resources.getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080813);
    }

    public final void b(boolean z) {
        if (this.p) {
            return;
        }
        int i = ((US1) this.r.get()).a;
        PD2 pd2 = TS1.c;
        String string = this.q.getString(i);
        PropertyModel propertyModel = this.g;
        propertyModel.o(pd2, string);
        propertyModel.o(TS1.h, new RS1(true, z));
    }

    public final void a(boolean z) {
        PD2 pd2 = TS1.h;
        RS1 rs1 = new RS1(false, z);
        PropertyModel propertyModel = this.g;
        propertyModel.o(pd2, rs1);
        propertyModel.o(TS1.c, this.q.getString(R.string.0_resource_name_obfuscated_res_0x7f14018d));
    }
}
