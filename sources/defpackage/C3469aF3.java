package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.base.Callback;
import org.chromium.components.favicon.LargeIconBridge;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: aF3 */
/* loaded from: classes.dex */
public final class C3469aF3 {
    public static C3469aF3 j;
    public final Context a;
    public final Callback b;
    public final C7616mK1 c;
    public final C8197o04 d;
    public final View e;
    public final ZX1 f;
    public PropertyModel g;
    public C1756Nn1 h;
    public int i;

    public C3469aF3(Activity activity, ZX1 zx1, LargeIconBridge largeIconBridge, PZ1 pz1) {
        C7616mK1 c7616mK1 = new C7616mK1();
        this.c = c7616mK1;
        this.a = activity;
        this.f = zx1;
        this.b = pz1;
        this.d = new C8197o04(activity, largeIconBridge);
        C7342lY1 c7342lY1 = new C7342lY1(c7616mK1);
        c7342lY1.a(0, new InterfaceC7960nK1() { // from class: XE3
            @Override // defpackage.InterfaceC7960nK1
            public final View a(ViewGroup viewGroup) {
                return LayoutInflater.from(C3469aF3.this.a).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0143, (ViewGroup) null);
            }
        }, new TD2() { // from class: YE3
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj, Object obj2) {
                PropertyModel propertyModel = (PropertyModel) wd2;
                View view = (View) obj;
                FD2 fd2 = (FD2) obj2;
                PD2 pd2 = AbstractC3813bF3.a;
                if (pd2 == fd2) {
                    ((ImageView) view.findViewById(R.id.favicon)).setImageDrawable((Drawable) propertyModel.i(pd2));
                    return;
                }
                PD2 pd22 = AbstractC3813bF3.b;
                if (pd22 == fd2) {
                    ((TextView) view.findViewById(R.id.title)).setText((CharSequence) propertyModel.i(pd22));
                    return;
                }
                PD2 pd23 = AbstractC3813bF3.c;
                if (pd23 == fd2) {
                    ((TextView) view.findViewById(R.id.desc)).setText((CharSequence) propertyModel.i(pd23));
                    return;
                }
                PD2 pd24 = AbstractC3813bF3.e;
                if (pd24 == fd2) {
                    view.setOnClickListener((View.OnClickListener) propertyModel.i(pd24));
                    return;
                }
                LD2 ld2 = AbstractC3813bF3.f;
                if (ld2 == fd2) {
                    ((ImageView) view.findViewById(R.id.check_mark)).setVisibility(propertyModel.j(ld2) ? 0 : 4);
                }
            }
        });
        View inflate = LayoutInflater.from(activity).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e02b2, (ViewGroup) null);
        this.e = inflate;
        ((ListView) inflate.findViewById(R.id.list_view)).setAdapter((ListAdapter) c7342lY1);
    }
}
