package org.chromium.components.webapps;

import J.N;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.ImageView;
import com.android.chrome.R;
import defpackage.AbstractC6858k7;
import defpackage.C1450Le;
import defpackage.TD2;
import defpackage.UD2;
import defpackage.ViewOnClickListenerC4796e7;
import defpackage.ZX1;
import org.chromium.base.ThreadUtils;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class AddToHomescreenCoordinator {
    public final Context a;
    public final ZX1 b;
    public final WindowAndroid c;
    public final WebContents d;

    public AddToHomescreenCoordinator(WebContents webContents, Context context, WindowAndroid windowAndroid, ZX1 zx1) {
        this.a = context;
        this.c = windowAndroid;
        this.b = zx1;
        this.d = webContents;
    }

    public static void b(Context context, WindowAndroid windowAndroid, ZX1 zx1, WebContents webContents, Bundle bundle) {
        int i = bundle.getInt("AppMenuTitleShown");
        AddToHomescreenCoordinator addToHomescreenCoordinator = new AddToHomescreenCoordinator(webContents, context, windowAndroid, zx1);
        if (webContents == null || webContents.u().k()) {
            return;
        }
        long j = addToHomescreenCoordinator.a().a;
        if (j == 0) {
            return;
        }
        N.MH3_t6hY(j, webContents, i);
    }

    public static long initMvcAndReturnMediator(WebContents webContents) {
        ZX1 s;
        WindowAndroid Q0 = webContents.Q0();
        if (Q0 == null || (s = Q0.s()) == null) {
            return 0L;
        }
        return new AddToHomescreenCoordinator(webContents, (Context) Q0.j.get(), Q0, s).a().a;
    }

    public final AddToHomescreenMediator a() {
        AppBannerManager appBannerManager;
        C1450Le c1450Le;
        PropertyModel propertyModel = new PropertyModel(PropertyModel.e(AbstractC6858k7.j));
        AddToHomescreenMediator addToHomescreenMediator = new AddToHomescreenMediator(propertyModel, this.c);
        WebContents webContents = this.d;
        if (webContents != null) {
            Object obj = ThreadUtils.a;
            appBannerManager = (AppBannerManager) N.MbHcYdCX(webContents);
        } else {
            appBannerManager = null;
        }
        if (appBannerManager != null && (!TextUtils.equals("", N.MvBgz9uo(webContents)))) {
            c1450Le = AppBannerManager.b;
        } else {
            c1450Le = AppBannerManager.c;
        }
        UD2.a(propertyModel, new ViewOnClickListenerC4796e7(this.a, this.b, c1450Le, addToHomescreenMediator), new TD2() { // from class: b7
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj2, Object obj3) {
                Icon createWithAdaptiveBitmap;
                PropertyModel propertyModel2 = (PropertyModel) wd2;
                ViewOnClickListenerC4796e7 viewOnClickListenerC4796e7 = (ViewOnClickListenerC4796e7) obj2;
                FD2 fd2 = (FD2) obj3;
                PD2 pd2 = AbstractC6858k7.a;
                if (fd2.equals(pd2)) {
                    String str = (String) propertyModel2.i(pd2);
                    viewOnClickListenerC4796e7.l.setText(str);
                    viewOnClickListenerC4796e7.j.setText(str);
                    return;
                }
                PD2 pd22 = AbstractC6858k7.b;
                if (!fd2.equals(pd22)) {
                    PD2 pd23 = AbstractC6858k7.d;
                    if (fd2.equals(pd23)) {
                        Pair pair = (Pair) propertyModel2.i(pd23);
                        Bitmap bitmap = (Bitmap) pair.first;
                        boolean booleanValue = ((Boolean) pair.second).booleanValue();
                        ImageView imageView = viewOnClickListenerC4796e7.q;
                        if (!booleanValue || Build.VERSION.SDK_INT < 26) {
                            imageView.setImageBitmap(bitmap);
                        } else {
                            createWithAdaptiveBitmap = Icon.createWithAdaptiveBitmap(bitmap);
                            imageView.setImageIcon(createWithAdaptiveBitmap);
                        }
                        viewOnClickListenerC4796e7.p.setVisibility(8);
                        imageView.setVisibility(0);
                        return;
                    }
                    ND2 nd2 = AbstractC6858k7.e;
                    if (fd2.equals(nd2)) {
                        int h = propertyModel2.h(nd2);
                        viewOnClickListenerC4796e7.getClass();
                        viewOnClickListenerC4796e7.j.setVisibility(h == 2 ? 0 : 8);
                        viewOnClickListenerC4796e7.k.setVisibility(h != 2 ? 0 : 8);
                        viewOnClickListenerC4796e7.m.setVisibility(h == 1 ? 0 : 8);
                        viewOnClickListenerC4796e7.n.setVisibility(h == 0 ? 0 : 8);
                        viewOnClickListenerC4796e7.o.setVisibility(h == 0 ? 0 : 8);
                        return;
                    }
                    LD2 ld2 = AbstractC6858k7.f;
                    if (!fd2.equals(ld2)) {
                        PD2 pd24 = AbstractC6858k7.h;
                        if (fd2.equals(pd24)) {
                            String str2 = (String) propertyModel2.i(pd24);
                            PropertyModel propertyModel3 = viewOnClickListenerC4796e7.a;
                            propertyModel3.o(AbstractC4249cY1.j, str2);
                            propertyModel3.o(AbstractC4249cY1.l, V60.a.getString(R.string.0_resource_name_obfuscated_res_0x7f1401f3, str2));
                            return;
                        }
                        MD2 md2 = AbstractC6858k7.i;
                        if (fd2.equals(md2)) {
                            viewOnClickListenerC4796e7.n.setRating(propertyModel2.g(md2));
                            viewOnClickListenerC4796e7.o.setImageResource(R.drawable.0_resource_name_obfuscated_res_0x7f0901a4);
                            return;
                        }
                        return;
                    }
                    viewOnClickListenerC4796e7.r = propertyModel2.j(ld2);
                    viewOnClickListenerC4796e7.b();
                    return;
                }
                viewOnClickListenerC4796e7.m.setText((String) propertyModel2.i(pd22));
            }
        });
        return addToHomescreenMediator;
    }
}
