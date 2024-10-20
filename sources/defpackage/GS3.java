package defpackage;

import J.N;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.HashMap;
import org.chromium.base.Callback;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.ui.resources.ResourceManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class GS3 implements InterfaceC3897bW2 {
    public final NS3 a;
    public final C7173l20 g;
    public final LS3 h;

    @Override // defpackage.InterfaceC3897bW2
    public final void F(ArrayList arrayList) {
    }

    @Override // defpackage.InterfaceC3897bW2
    public final boolean K() {
        return false;
    }

    @Override // defpackage.InterfaceC3897bW2
    public final void c0(float f, float f2, float f3, int i) {
    }

    @Override // defpackage.InterfaceC7458ls
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.InterfaceC3897bW2
    public final AbstractC5518gD0 l() {
        return null;
    }

    @Override // defpackage.InterfaceC3897bW2
    public final boolean onBackPressed() {
        return false;
    }

    @Override // defpackage.InterfaceC3897bW2
    public final boolean p(long j) {
        return false;
    }

    @Override // defpackage.InterfaceC3897bW2
    public final boolean s() {
        return false;
    }

    public GS3(Context context, InterfaceC10240ty1 interfaceC10240ty1, Callback callback, C8385oa2 c8385oa2, FC fc, InterfaceC0079Ap3 interfaceC0079Ap3, QS3 qs3, int i, boolean z) {
        HashMap e = PropertyModel.e(MS3.k);
        ID2 id2 = MS3.c;
        DD2 dd2 = new DD2();
        dd2.a = R.id.control_container;
        e.put(id2, dd2);
        ID2 id22 = MS3.g;
        DD2 dd22 = new DD2();
        dd22.a = R.drawable.0_resource_name_obfuscated_res_0x7f090396;
        e.put(id22, dd22);
        LD2 ld2 = MS3.h;
        AD2 ad2 = new AD2();
        ad2.a = true;
        e.put(ld2, ad2);
        MD2 md2 = MS3.i;
        CD2 cd2 = new CD2();
        cd2.a = 0.0f;
        e.put(md2, cd2);
        MD2 md22 = MS3.j;
        CC cc = (CC) fc;
        float f = cc.r + cc.n;
        CD2 cd22 = new CD2();
        cd22.a = f;
        e.put(md22, cd22);
        LD2 ld22 = MS3.a;
        AD2 ad22 = new AD2();
        ad22.a = false;
        e.put(ld22, ad22);
        PropertyModel propertyModel = new PropertyModel(e);
        NS3 ns3 = new NS3(interfaceC0079Ap3);
        this.a = ns3;
        C9897sy1 c9897sy1 = (C9897sy1) interfaceC10240ty1;
        this.g = new C7173l20(propertyModel, ns3, new TD2() { // from class: FS3
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj, Object obj2) {
                NU nu;
                PropertyModel propertyModel2 = (PropertyModel) wd2;
                NS3 ns32 = (NS3) obj;
                InterfaceC0079Ap3 interfaceC0079Ap32 = ns32.h;
                if (interfaceC0079Ap32.get() == null) {
                    return;
                }
                N.MHqlwRYg(ns32.g, ns32, (ResourceManager) interfaceC0079Ap32.get(), propertyModel2.h(MS3.c), propertyModel2.h(MS3.e), propertyModel2.h(MS3.g), propertyModel2.h(MS3.f), propertyModel2.g(MS3.i), propertyModel2.g(MS3.j), propertyModel2.j(MS3.d), propertyModel2.j(MS3.h), propertyModel2.j(MS3.a));
                C7928nE c7928nE = UN.a;
                if (N.M09VlOh_("DisableCompositedProgressBar") || (nu = (NU) propertyModel2.i(MS3.b)) == null) {
                    return;
                }
                long j = ns32.g;
                Rect rect = nu.a;
                int i2 = rect.left;
                int i3 = rect.top;
                int width = rect.width();
                int height = rect.height();
                int i4 = nu.c;
                Rect rect2 = nu.b;
                N.MKAQCQU8(j, ns32, i2, i3, width, height, i4, rect2.left, rect2.top, rect2.width(), rect2.height(), nu.d);
            }
        }, c9897sy1.K);
        this.h = new LS3(propertyModel, context, c9897sy1, callback, c8385oa2, fc, qs3, i, z);
    }

    @Override // defpackage.InterfaceC7458ls
    public final InterfaceC7697ma2 r() {
        return new C8385oa2();
    }

    @Override // defpackage.InterfaceC3897bW2
    public final AbstractC4240cW2 j(RectF rectF, ResourceManager resourceManager, float f) {
        return this.a;
    }

    @Override // defpackage.InterfaceC3897bW2
    public final boolean p0() {
        this.h.getClass();
        return true;
    }

    public final void a(boolean z) {
        LS3 ls3 = this.h;
        ls3.l = z;
        ls3.b();
        ls3.d();
    }
}
