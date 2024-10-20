package org.chromium.chrome.features.tasks;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.chrome.R;
import defpackage.AbstractC10804vd3;
import defpackage.AbstractC11276wz3;
import defpackage.C10461ud3;
import defpackage.C2183Qu3;
import defpackage.C4404cy3;
import defpackage.C5091ey3;
import defpackage.C7716md3;
import defpackage.C8266oC3;
import defpackage.C8404od3;
import defpackage.FD2;
import defpackage.InterfaceC0079Ap3;
import defpackage.InterfaceC10318uB3;
import defpackage.InterfaceC10590uz3;
import defpackage.InterfaceC8947qB3;
import defpackage.InterfaceC9289rB3;
import defpackage.InterfaceC9632sB3;
import defpackage.LD2;
import defpackage.PD2;
import defpackage.TD2;
import defpackage.UD2;
import defpackage.UN;
import defpackage.WD2;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tabmodel.TabModel;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class b implements InterfaceC10318uB3 {
    public final C10461ud3 a;
    public final C5091ey3 g;
    public final C7716md3 h;

    @Override // defpackage.InterfaceC10318uB3
    public final C8266oC3 k() {
        return null;
    }

    @Override // defpackage.InterfaceC10318uB3
    public final InterfaceC0079Ap3 m() {
        return null;
    }

    public b(Activity activity, FrameLayout frameLayout, InterfaceC10590uz3 interfaceC10590uz3) {
        PropertyModel propertyModel = new PropertyModel(AbstractC10804vd3.e);
        SingleTabView singleTabView = (SingleTabView) LayoutInflater.from(activity).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0282, (ViewGroup) frameLayout, false);
        frameLayout.addView(singleTabView);
        UD2.a(propertyModel, singleTabView, new TD2() { // from class: org.chromium.chrome.features.tasks.a
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj, Object obj2) {
                PropertyModel propertyModel2 = (PropertyModel) wd2;
                SingleTabView singleTabView2 = (SingleTabView) obj;
                FD2 fd2 = (FD2) obj2;
                PD2 pd2 = AbstractC10804vd3.a;
                if (fd2 == pd2) {
                    singleTabView2.setOnClickListener((View.OnClickListener) propertyModel2.i(pd2));
                    return;
                }
                PD2 pd22 = AbstractC10804vd3.b;
                if (fd2 != pd22) {
                    LD2 ld2 = AbstractC10804vd3.c;
                    if (fd2 == ld2) {
                        singleTabView2.setVisibility(propertyModel2.j(ld2) ? 0 : 8);
                        return;
                    }
                    PD2 pd23 = AbstractC10804vd3.d;
                    if (fd2 == pd23) {
                        singleTabView2.g.setText((String) propertyModel2.i(pd23));
                        return;
                    }
                    return;
                }
                singleTabView2.a.setImageDrawable((Drawable) propertyModel2.i(pd22));
            }
        });
        C5091ey3 c5091ey3 = new C5091ey3(activity, false);
        this.g = c5091ey3;
        this.a = new C10461ud3(activity, propertyModel, interfaceC10590uz3, c5091ey3);
        if (UN.E.a()) {
            new C2183Qu3(interfaceC10590uz3);
        }
        this.h = new C7716md3();
    }

    @Override // defpackage.InterfaceC10318uB3
    public final void a() {
        TabModel j;
        int index;
        this.g.f(Profile.d());
        C10461ud3 c10461ud3 = this.a;
        if (c10461ud3.r) {
            return;
        }
        AbstractC11276wz3 abstractC11276wz3 = (AbstractC11276wz3) c10461ud3.g;
        if (abstractC11276wz3.i && (index = (j = abstractC11276wz3.j(false)).index()) != -1) {
            GURL url = j.getTabAt(index).getUrl();
            C8404od3 c8404od3 = new C8404od3(c10461ud3);
            C5091ey3 c5091ey3 = c10461ud3.i;
            c5091ey3.getClass();
            c5091ey3.c(url, false, new C4404cy3(c8404od3));
            c10461ud3.r = true;
        }
    }

    @Override // defpackage.InterfaceC10318uB3
    public final InterfaceC8947qB3 h() {
        return this.a;
    }

    @Override // defpackage.InterfaceC10318uB3
    public final InterfaceC9632sB3 q() {
        return this.h;
    }

    @Override // defpackage.InterfaceC10318uB3
    public final void n(InterfaceC9289rB3 interfaceC9289rB3) {
        this.a.m = interfaceC9289rB3;
    }
}
