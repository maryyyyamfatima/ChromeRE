package defpackage;

import android.app.Activity;
import android.view.View;
import com.android.chrome.R;
import java.util.HashMap;
import org.chromium.components.page_info.PageInfoController;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.DeviceFormFactor;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Uo2 */
/* loaded from: classes.dex */
public final class C2672Uo2 implements InterfaceC2932Wo2 {
    public final WebContents a;
    public final Activity b;
    public final boolean c;
    public final PropertyModel d;
    public final C3322Zo2 e;
    public final InterfaceC0079Ap3 f;

    public C2672Uo2(Activity activity, WebContents webContents, GURL gurl, C7169l12 c7169l12) {
        this.a = webContents;
        this.b = activity;
        this.f = c7169l12;
        HashMap e = PropertyModel.e(AbstractC3192Yo2.i);
        LD2 ld2 = AbstractC3192Yo2.d;
        AD2 ad2 = new AD2();
        ad2.a = true;
        e.put(ld2, ad2);
        MD2 md2 = AbstractC3192Yo2.c;
        CD2 cd2 = new CD2();
        cd2.a = 0.05f;
        e.put(md2, cd2);
        ND2 nd2 = AbstractC3192Yo2.e;
        int a = AbstractC7176l23.a(this.c, 0, false, false);
        DD2 dd2 = new DD2();
        dd2.a = a;
        e.put(nd2, dd2);
        PD2 pd2 = AbstractC3192Yo2.f;
        String string = activity.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f140160);
        GD2 gd2 = new GD2();
        gd2.a = string;
        e.put(pd2, gd2);
        PD2 pd22 = AbstractC3192Yo2.a;
        GD2 gd22 = new GD2();
        gd22.a = gurl;
        e.put(pd22, gd22);
        PD2 pd23 = AbstractC3192Yo2.g;
        Runnable runnable = new Runnable() { // from class: So2
            @Override // java.lang.Runnable
            public final void run() {
                C2672Uo2 c2672Uo2 = C2672Uo2.this;
                Activity activity2 = c2672Uo2.b;
                WebContents webContents2 = c2672Uo2.a;
                PageInfoController.h(activity2, webContents2, null, 2, new WO(activity2, webContents2, c2672Uo2.f, new C2087Qb2(webContents2), null, null, XO.a()), XO.a());
            }
        };
        GD2 gd23 = new GD2();
        gd23.a = runnable;
        e.put(pd23, gd23);
        PropertyModel propertyModel = new PropertyModel(e);
        this.d = propertyModel;
        this.c = !DeviceFormFactor.a(activity);
        C3062Xo2 c3062Xo2 = new C3062Xo2(propertyModel, webContents, this);
        C3322Zo2 c3322Zo2 = new C3322Zo2(activity);
        this.e = c3322Zo2;
        webContents.h0(c3062Xo2);
        UD2.a(propertyModel, c3322Zo2, new TD2() { // from class: To2
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj, Object obj2) {
                final PropertyModel propertyModel2 = (PropertyModel) wd2;
                C3322Zo2 c3322Zo22 = (C3322Zo2) obj;
                FD2 fd2 = (FD2) obj2;
                PD2 pd24 = AbstractC3192Yo2.a;
                if (pd24 == fd2) {
                    c3322Zo22.c.setText(AbstractC10615v34.b(1, (GURL) propertyModel2.i(pd24)));
                    return;
                }
                PD2 pd25 = AbstractC3192Yo2.b;
                if (pd25 == fd2) {
                    c3322Zo22.d.setText((CharSequence) propertyModel2.i(pd25));
                    return;
                }
                MD2 md22 = AbstractC3192Yo2.c;
                if (md22 == fd2) {
                    c3322Zo22.e.setProgress(Math.round(propertyModel2.g(md22) * 100.0f));
                    return;
                }
                LD2 ld22 = AbstractC3192Yo2.d;
                if (ld22 == fd2) {
                    c3322Zo22.e.setVisibility(propertyModel2.j(ld22) ? 0 : 4);
                    return;
                }
                ND2 nd22 = AbstractC3192Yo2.e;
                if (nd22 == fd2) {
                    c3322Zo22.f.setImageResource(propertyModel2.h(nd22));
                    return;
                }
                PD2 pd26 = AbstractC3192Yo2.f;
                if (pd26 == fd2) {
                    c3322Zo22.f.setContentDescription((String) propertyModel2.i(pd26));
                } else if (AbstractC3192Yo2.g == fd2) {
                    c3322Zo22.f.setOnClickListener(new View.OnClickListener() { // from class: ap2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ((Runnable) PropertyModel.this.i(AbstractC3192Yo2.g)).run();
                        }
                    });
                } else if (AbstractC3192Yo2.h == fd2) {
                    c3322Zo22.g.setOnClickListener(new View.OnClickListener() { // from class: bp2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ((Runnable) PropertyModel.this.i(AbstractC3192Yo2.h)).run();
                        }
                    });
                }
            }
        });
    }
}
