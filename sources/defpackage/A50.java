package defpackage;

import J.N;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.d;
import com.android.chrome.R;
import java.util.HashMap;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class A50 extends AbstractC0892Gw1 implements InterfaceC9207qx1 {
    public final Context r;

    public A50(Context context) {
        super(context);
        this.r = context;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [y50] */
    @Override // defpackage.AbstractC0892Gw1, defpackage.AbstractC8305oK2
    public final void C(d dVar, final int i) {
        super.C(dVar, i);
        final C10230tw1 c10230tw1 = (C10230tw1) N(i);
        final C0762Fw1 c0762Fw1 = (C0762Fw1) dVar;
        if (q() > 1 && this.o.b()) {
            ImageView imageView = c0762Fw1.B;
            imageView.setVisibility(0);
            imageView.setImageResource(R.drawable.0_resource_name_obfuscated_res_0x7f0901ee);
            imageView.setOnTouchListener(new View.OnTouchListener() { // from class: Bw1
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    AbstractC0892Gw1 abstractC0892Gw1 = AbstractC0892Gw1.this;
                    abstractC0892Gw1.getClass();
                    if (motionEvent.getActionMasked() != 0) {
                        return false;
                    }
                    abstractC0892Gw1.j.u(c0762Fw1);
                    return false;
                }
            });
        }
        final C7616mK1 c7616mK1 = new C7616mK1();
        if (AbstractC8650pL.a("translate.enabled")) {
            C7928nE c7928nE = UN.a;
            if (!N.M09VlOh_("DetailedLanguageSettings")) {
                int i2 = N.MeNcRA0y(c10230tw1.a) ? 0 : R.drawable.0_resource_name_obfuscated_res_0x7f0901d5;
                HashMap e = PropertyModel.e(AbstractC4144cD1.j);
                ND2 nd2 = AbstractC4144cD1.a;
                DD2 dd2 = new DD2();
                dd2.a = R.string.0_resource_name_obfuscated_res_0x7f140594;
                e.put(nd2, dd2);
                ND2 nd22 = AbstractC4144cD1.e;
                DD2 dd22 = new DD2();
                dd22.a = 0;
                e.put(nd22, dd22);
                ND2 nd23 = AbstractC4144cD1.d;
                DD2 dd23 = new DD2();
                dd23.a = i2;
                e.put(nd23, dd23);
                LD2 ld2 = AbstractC4144cD1.f;
                AD2 ad2 = new AD2();
                ad2.a = c10230tw1.d;
                e.put(ld2, ad2);
                ND2 nd24 = AbstractC4144cD1.g;
                DD2 dd24 = new DD2();
                dd24.a = R.color.0_resource_name_obfuscated_res_0x7f07012a;
                e.put(nd24, dd24);
                PropertyModel propertyModel = new PropertyModel(e);
                C7272lK1 c7272lK1 = new C7272lK1(1, propertyModel);
                propertyModel.m(nd24, R.color.0_resource_name_obfuscated_res_0x7f070113);
                c7616mK1.s(c7272lK1);
            }
        }
        int q = q();
        c7616mK1.s(C4738dx.e(R.string.0_resource_name_obfuscated_res_0x7f140953, 0, 0, q > 1));
        if (!this.o.b()) {
            if (i > 0) {
                c7616mK1.s(C4738dx.d(R.string.0_resource_name_obfuscated_res_0x7f14062c, 0, 0));
                c7616mK1.s(C4738dx.d(R.string.0_resource_name_obfuscated_res_0x7f14062d, 0, 0));
            }
            if (i < q - 1) {
                c7616mK1.s(C4738dx.d(R.string.0_resource_name_obfuscated_res_0x7f14062b, 0, 0));
            }
        }
        final ?? r2 = new SC1() { // from class: y50
            @Override // defpackage.SC1
            public final void b(PropertyModel propertyModel2) {
                A50 a50 = A50.this;
                a50.getClass();
                int h = propertyModel2.h(AbstractC4144cD1.a);
                C10230tw1 c10230tw12 = c10230tw1;
                if (h == R.string.0_resource_name_obfuscated_res_0x7f140594) {
                    boolean z = propertyModel2.h(AbstractC4144cD1.d) == 0;
                    N.Mt0H9F3d(c10230tw12.a, !z);
                    C9549rx1.g(z ? 7 : 6);
                } else if (h == R.string.0_resource_name_obfuscated_res_0x7f140953) {
                    C9549rx1 b = C9549rx1.b();
                    String str = c10230tw12.a;
                    b.getClass();
                    N.Me60Lv4_(str, false);
                    InterfaceC9207qx1 interfaceC9207qx1 = b.b;
                    if (interfaceC9207qx1 != null) {
                        ((A50) interfaceC9207qx1).S();
                    }
                    C9549rx1.g(3);
                } else if (h == R.string.0_resource_name_obfuscated_res_0x7f14062d) {
                    C9549rx1.b().f(c10230tw12.a, -1);
                } else if (h == R.string.0_resource_name_obfuscated_res_0x7f14062b) {
                    C9549rx1.b().f(c10230tw12.a, 1);
                } else if (h == R.string.0_resource_name_obfuscated_res_0x7f14062c) {
                    C9549rx1.b().f(c10230tw12.a, -i);
                }
                if (h != R.string.0_resource_name_obfuscated_res_0x7f140953) {
                    a50.t();
                }
            }
        };
        c0762Fw1.v(new ZC1() { // from class: z50
            @Override // defpackage.ZC1
            public final /* synthetic */ LI2 a(View view) {
                return YC1.a(view);
            }

            @Override // defpackage.ZC1
            public final TC1 b() {
                A50 a50 = A50.this;
                a50.getClass();
                C9549rx1.h(6);
                return new C4738dx(a50.r, c7616mK1, r2);
            }
        });
    }

    public final void S() {
        if (this.o.a()) {
            if (this.j == null) {
                this.j = new C1521Ls1(new C11926yt0(this));
            }
            this.j.j(this.l);
        } else {
            C1521Ls1 c1521Ls1 = this.j;
            if (c1521Ls1 != null) {
                c1521Ls1.j(null);
            }
        }
        R(C9549rx1.b().e());
    }
}
