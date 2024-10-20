package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.chrome.R;
import java.util.HashMap;
import java.util.Objects;
import org.chromium.components.browser_ui.widget.listmenu.ListMenuButton;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Qj1 */
/* loaded from: classes.dex */
public abstract class AbstractC2126Qj1 implements InterfaceC1477Lj1 {
    public final Context a;
    public final C3296Zj1 b;
    public UD2 c;
    public View d;

    public AbstractC2126Qj1(Context context, C3166Yj1 c3166Yj1, InterfaceC3036Xj1 interfaceC3036Xj1, Runnable runnable) {
        this.a = context;
        this.b = new C3296Zj1(interfaceC3036Xj1, c3166Yj1, runnable);
    }

    public final void a(C3632ak1 c3632ak1, boolean z) {
        this.d = LayoutInflater.from(this.a).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0132, (ViewGroup) null);
        final C3296Zj1 c3296Zj1 = this.b;
        Objects.requireNonNull(c3296Zj1);
        Runnable runnable = new Runnable() { // from class: Mj1
            @Override // java.lang.Runnable
            public final void run() {
                C3296Zj1 c3296Zj12 = C3296Zj1.this;
                c3296Zj12.b.c(c3296Zj12.c);
            }
        };
        Runnable runnable2 = new Runnable() { // from class: Nj1
            @Override // java.lang.Runnable
            public final void run() {
                C3296Zj1.this.a.run();
            }
        };
        HashMap e = PropertyModel.e(AbstractC6038hk1.e);
        JD2 jd2 = AbstractC6038hk1.a;
        GD2 gd2 = new GD2();
        gd2.a = runnable;
        e.put(jd2, gd2);
        JD2 jd22 = AbstractC6038hk1.b;
        GD2 gd22 = new GD2();
        gd22.a = runnable2;
        e.put(jd22, gd22);
        HD2 hd2 = AbstractC6038hk1.c;
        AD2 ad2 = new AD2();
        ad2.a = z;
        e.put(hd2, ad2);
        JD2 jd23 = AbstractC6038hk1.d;
        GD2 gd23 = new GD2();
        gd23.a = c3632ak1;
        this.c = UD2.a(AbstractC1996Pj1.a(e, jd23, gd23, e), this.d, new TD2() { // from class: Oj1
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj, Object obj2) {
                PropertyModel propertyModel = (PropertyModel) wd2;
                View view = (View) obj;
                FD2 fd2 = (FD2) obj2;
                JD2 jd24 = AbstractC6038hk1.a;
                if (jd24 == fd2) {
                    final Runnable runnable3 = (Runnable) propertyModel.i(jd24);
                    view.findViewById(R.id.incognito_reauth_unlock_incognito_button).setOnClickListener(new View.OnClickListener() { // from class: kk1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            runnable3.run();
                        }
                    });
                    return;
                }
                JD2 jd25 = AbstractC6038hk1.b;
                if (jd25 == fd2) {
                    final Runnable runnable4 = (Runnable) propertyModel.i(jd25);
                    view.findViewById(R.id.incognito_reauth_see_other_tabs_label).setOnClickListener(new View.OnClickListener() { // from class: lk1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            runnable4.run();
                        }
                    });
                    return;
                }
                HD2 hd22 = AbstractC6038hk1.c;
                if (hd22 != fd2) {
                    JD2 jd26 = AbstractC6038hk1.d;
                    if (jd26 == fd2) {
                        ZC1 zc1 = (ZC1) propertyModel.i(jd26);
                        ListMenuButton listMenuButton = (ListMenuButton) view.findViewById(R.id.incognito_reauth_menu_button);
                        listMenuButton.e(zc1, true);
                        listMenuButton.setVisibility(zc1 == null ? 8 : 0);
                        return;
                    }
                    return;
                }
                view.findViewById(R.id.incognito_reauth_see_other_tabs_label).setVisibility(propertyModel.j(hd22) ? 0 : 8);
            }
        });
    }
}
