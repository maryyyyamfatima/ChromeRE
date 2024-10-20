package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.android.chrome.R;
import java.util.Iterator;
import org.chromium.base.Callback;
import org.chromium.components.favicon.LargeIconBridge;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ao1 */
/* loaded from: classes.dex */
public final class C3656ao1 {
    public static C3656ao1 n;
    public final Context a;
    public final Callback b;
    public final Callback c;
    public final Runnable d;
    public final ZX1 e;
    public final C7616mK1 f;
    public final C8197o04 g;
    public final View h;
    public final Drawable i;
    public PropertyModel j;
    public C1756Nn1 k;
    public PropertyModel l;
    public boolean m;

    public C3656ao1(Activity activity, ZX1 zx1, LargeIconBridge largeIconBridge, MZ1 mz1, NZ1 nz1, OZ1 oz1) {
        C7616mK1 c7616mK1 = new C7616mK1();
        this.f = c7616mK1;
        this.a = activity;
        this.e = zx1;
        this.b = mz1;
        this.c = nz1;
        this.g = new C8197o04(activity, largeIconBridge);
        this.d = oz1;
        this.i = AbstractC8540p04.e(R.drawable.0_resource_name_obfuscated_res_0x7f0901be, R.color.0_resource_name_obfuscated_res_0x7f07012b, activity);
        C7342lY1 c7342lY1 = new C7342lY1(c7616mK1);
        c7342lY1.a(0, new InterfaceC7960nK1() { // from class: Qn1
            @Override // defpackage.InterfaceC7960nK1
            public final View a(ViewGroup viewGroup) {
                return LayoutInflater.from(C3656ao1.this.a).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0143, (ViewGroup) null);
            }
        }, new TD2() { // from class: Rn1
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj, Object obj2) {
                AbstractC4343co1.a((PropertyModel) wd2, (View) obj, (FD2) obj2);
            }
        });
        c7342lY1.a(1, new InterfaceC7960nK1() { // from class: Sn1
            @Override // defpackage.InterfaceC7960nK1
            public final View a(ViewGroup viewGroup) {
                return LayoutInflater.from(C3656ao1.this.a).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0141, (ViewGroup) null);
            }
        }, new TD2() { // from class: Rn1
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj, Object obj2) {
                AbstractC4343co1.a((PropertyModel) wd2, (View) obj, (FD2) obj2);
            }
        });
        View inflate = LayoutInflater.from(activity).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0142, (ViewGroup) null);
        this.h = inflate;
        ((ListView) inflate.findViewById(R.id.list_view)).setAdapter((ListAdapter) c7342lY1);
    }

    public final void a(boolean z) {
        if (this.m && z) {
            return;
        }
        this.l.k(AbstractC4000bo1.b, z);
        if (z) {
            this.l.o(AbstractC4000bo1.g, new View.OnClickListener() { // from class: On1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3656ao1 c3656ao1 = C3656ao1.this;
                    c3656ao1.e.c(3, c3656ao1.j);
                    c3656ao1.d.run();
                }
            });
        }
        this.m = z;
    }

    public final void b(C1756Nn1 c1756Nn1) {
        int i = c1756Nn1.a;
        C7616mK1 c7616mK1 = this.f;
        Iterator it = c7616mK1.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C7272lK1 c7272lK1 = (C7272lK1) it.next();
            if (c7272lK1.b.h(AbstractC4000bo1.f) == i) {
                c7616mK1.x(c7272lK1);
                break;
            }
        }
        this.c.onResult(c1756Nn1);
        FI2.a("Android.WindowManager.CloseWindow");
        a(true);
    }
}
