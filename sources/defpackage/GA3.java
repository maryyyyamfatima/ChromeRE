package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import com.android.chrome.R;
import java.util.HashSet;
import java.util.List;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class GA3 implements InterfaceC12028zA3 {
    public final Context a;
    public final InterfaceC10590uz3 g;
    public final C11342xA3 h;
    public final PropertyModel i;
    public final C7526m33 j;
    public final EA3 k;
    public final FA3 l;
    public C10656vA3 m;
    public AA3 n;
    public final C8385oa2 o;

    public final void c(int i, List list) {
        C7526m33 c7526m33 = this.j;
        c7526m33.b = true;
        c7526m33.f();
        if (i > 0) {
            HashSet hashSet = new HashSet();
            for (int i2 = 0; i2 < i; i2++) {
                hashSet.add(Integer.valueOf(((Tab) list.get(i2)).getId()));
            }
            c7526m33.c = hashSet;
            c7526m33.f();
        }
        this.h.a(i, list);
        this.i.k(HA3.a, true);
    }

    public GA3(Context context, InterfaceC10590uz3 interfaceC10590uz3, C11342xA3 c11342xA3, PropertyModel propertyModel, C7526m33 c7526m33) {
        C8385oa2 c8385oa2 = new C8385oa2();
        this.o = c8385oa2;
        CA3 ca3 = new CA3(this);
        DA3 da3 = new DA3(this);
        this.a = context;
        this.g = interfaceC10590uz3;
        this.h = c11342xA3;
        this.i = propertyModel;
        this.j = c7526m33;
        propertyModel.o(HA3.e, ca3);
        propertyModel.o(HA3.b, da3);
        this.k = new EA3(this, interfaceC10590uz3);
        FA3 fa3 = new FA3(this);
        this.l = fa3;
        AbstractC11276wz3 abstractC11276wz3 = (AbstractC11276wz3) interfaceC10590uz3;
        abstractC11276wz3.c(fa3);
        d(abstractC11276wz3.o());
        this.m = new C10656vA3(this, 1);
        this.n = new AA3(this);
        c8385oa2.p(Boolean.valueOf(propertyModel.j(HA3.a)));
        propertyModel.a(new VD2() { // from class: BA3
            @Override // defpackage.VD2
            public final void d(WD2 wd2, Object obj) {
                FD2 fd2 = (FD2) obj;
                LD2 ld2 = HA3.a;
                GA3 ga3 = GA3.this;
                if (fd2 == ld2) {
                    ga3.o.p(Boolean.valueOf(ga3.i.j(ld2)));
                } else {
                    ga3.getClass();
                }
            }
        });
    }

    public final void d(boolean z) {
        int c;
        Context context = this.a;
        int b = AbstractC11746yN.b(context, z);
        if (z) {
            c = context.getColor(R.color.f22420_resource_name_obfuscated_res_0x7f0705a7);
        } else {
            c = AbstractC9685sM1.c(R.attr.f5490_resource_name_obfuscated_res_0x7f050152, context, "TabUiThemeProvider");
        }
        ColorStateList b2 = Y50.b(context, z ? R.color.f18100_resource_name_obfuscated_res_0x7f070142 : R.color.f18180_resource_name_obfuscated_res_0x7f07014a);
        ND2 nd2 = HA3.f;
        PropertyModel propertyModel = this.i;
        propertyModel.m(nd2, b);
        propertyModel.m(HA3.g, c);
        propertyModel.o(HA3.h, b2);
        propertyModel.o(HA3.i, b2);
    }

    public final void a(String str, Integer num, C10656vA3 c10656vA3, int i, AA3 aa3) {
        PropertyModel propertyModel = this.i;
        if (str != null) {
            propertyModel.o(HA3.c, str);
        }
        if (c10656vA3 != null) {
            this.m = c10656vA3;
        }
        if (i != -1) {
            propertyModel.m(HA3.d, i);
        }
        if (aa3 != null) {
            this.n = aa3;
        }
        if (num != null) {
            propertyModel.m(HA3.j, num.intValue());
        }
    }

    @Override // defpackage.InterfaceC7458ls
    public final void h() {
        this.n.a();
    }

    @Override // defpackage.InterfaceC7458ls
    public final InterfaceC7697ma2 r() {
        return this.o;
    }

    public final void b() {
        this.h.a(0, null);
        this.i.k(HA3.a, false);
    }
}
