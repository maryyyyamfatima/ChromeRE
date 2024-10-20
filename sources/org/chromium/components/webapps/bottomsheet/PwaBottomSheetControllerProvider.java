package org.chromium.components.webapps.bottomsheet;

import J.N;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.AD2;
import defpackage.AbstractC6858k7;
import defpackage.C7936nF2;
import defpackage.C8966qF2;
import defpackage.C9308rF2;
import defpackage.C9994tF2;
import defpackage.GD2;
import defpackage.K14;
import defpackage.LD2;
import defpackage.PD2;
import defpackage.QB;
import defpackage.TD2;
import defpackage.UB;
import defpackage.UD2;
import java.util.HashMap;
import org.chromium.components.browser_ui.bottomsheet.m;
import org.chromium.components.webapps.WebappsIconUtils;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class PwaBottomSheetControllerProvider {
    public static final K14 a = new K14(PwaBottomSheetController.class);

    public static PwaBottomSheetController a(WebContents webContents) {
        WindowAndroid Q0 = webContents.Q0();
        if (Q0 == null) {
            return null;
        }
        return (PwaBottomSheetController) a.e(Q0.t);
    }

    public static boolean canShowPwaBottomSheetInstaller(WebContents webContents) {
        if (a(webContents) != null) {
            return webContents.s() == 2;
        }
        return false;
    }

    public static void showPwaBottomSheetInstaller(long j, WebContents webContents, Bitmap bitmap, boolean z, String str, String str2, String str3) {
        PwaBottomSheetController a2 = a(webContents);
        if (a2 == null) {
            return;
        }
        WindowAndroid Q0 = webContents.Q0();
        a2.g = j;
        a2.l = webContents;
        QB a3 = UB.a(Q0);
        a2.h = a3;
        if (a3 != null) {
            if (webContents.s() == 2) {
                Context context = a2.a;
                C8966qF2 c8966qF2 = new C8966qF2(a2, context);
                a2.k = c8966qF2;
                C9994tF2 c9994tF2 = new C9994tF2(context, c8966qF2);
                a2.j = new C9308rF2(c9994tF2, a2);
                HashMap e = PropertyModel.e(AbstractC6858k7.j);
                PD2 pd2 = AbstractC6858k7.d;
                Pair pair = new Pair(bitmap, Boolean.valueOf(z));
                GD2 gd2 = new GD2();
                gd2.a = pair;
                e.put(pd2, gd2);
                PD2 pd22 = AbstractC6858k7.a;
                GD2 gd22 = new GD2();
                gd22.a = str;
                e.put(pd22, gd22);
                PD2 pd23 = AbstractC6858k7.b;
                GD2 gd23 = new GD2();
                gd23.a = str2;
                e.put(pd23, gd23);
                PD2 pd24 = AbstractC6858k7.c;
                GD2 gd24 = new GD2();
                gd24.a = str3;
                e.put(pd24, gd24);
                LD2 ld2 = AbstractC6858k7.f;
                AD2 ad2 = new AD2();
                ad2.a = true;
                e.put(ld2, ad2);
                PD2 pd25 = AbstractC6858k7.g;
                GD2 gd25 = new GD2();
                gd25.a = a2;
                e.put(pd25, gd25);
                UD2.a(new PropertyModel(e), c9994tF2, new TD2() { // from class: lF2
                    @Override // defpackage.TD2
                    public final void d(WD2 wd2, Object obj, Object obj2) {
                        PropertyModel propertyModel = (PropertyModel) wd2;
                        C9994tF2 c9994tF22 = (C9994tF2) obj;
                        FD2 fd2 = (FD2) obj2;
                        PD2 pd26 = AbstractC6858k7.a;
                        if (!fd2.equals(pd26)) {
                            PD2 pd27 = AbstractC6858k7.b;
                            if (!fd2.equals(pd27)) {
                                PD2 pd28 = AbstractC6858k7.c;
                                if (fd2.equals(pd28)) {
                                    String str4 = (String) propertyModel.i(pd28);
                                    TextView textView = (TextView) c9994tF22.c.findViewById(R.id.description);
                                    textView.setText(str4);
                                    textView.setVisibility(str4.isEmpty() ? 8 : 0);
                                    return;
                                }
                                PD2 pd29 = AbstractC6858k7.d;
                                if (fd2.equals(pd29)) {
                                    Pair pair2 = (Pair) propertyModel.i(pd29);
                                    Bitmap bitmap2 = (Bitmap) pair2.first;
                                    boolean booleanValue = ((Boolean) pair2.second).booleanValue();
                                    ImageView imageView = (ImageView) c9994tF22.b.findViewById(R.id.app_icon);
                                    if (booleanValue) {
                                        if (Build.VERSION.SDK_INT >= 26) {
                                            imageView.setImageBitmap(WebappsIconUtils.generateAdaptiveIconBitmap(bitmap2));
                                            imageView.setVisibility(0);
                                            return;
                                        }
                                    }
                                    imageView.setImageBitmap(bitmap2);
                                    imageView.setVisibility(0);
                                    return;
                                }
                                LD2 ld22 = AbstractC6858k7.f;
                                if (!fd2.equals(ld22)) {
                                    PD2 pd210 = AbstractC6858k7.g;
                                    if (fd2.equals(pd210)) {
                                        View.OnClickListener onClickListener = (View.OnClickListener) propertyModel.i(pd210);
                                        View view = c9994tF22.b;
                                        view.findViewById(R.id.button_install).setOnClickListener(onClickListener);
                                        view.findViewById(R.id.drag_handlebar).setOnClickListener(onClickListener);
                                        return;
                                    }
                                    return;
                                }
                                c9994tF22.b.findViewById(R.id.button_install).setEnabled(propertyModel.j(ld22));
                                return;
                            }
                            ((TextView) c9994tF22.b.findViewById(R.id.app_origin)).setText((String) propertyModel.i(pd27));
                            return;
                        }
                        ((TextView) c9994tF22.b.findViewById(R.id.app_name)).setText((String) propertyModel.i(pd26));
                    }
                });
                ((m) a2.h).a(a2.i);
                if (((m) a2.h).p(a2.j, true)) {
                    new C7936nF2(a2, webContents);
                }
            }
        }
    }

    public static void expandPwaBottomSheetInstaller(WebContents webContents) {
        PwaBottomSheetController a2 = a(webContents);
        if (a2 != null && a2.d()) {
            ((m) a2.h).e();
            N.M55fWa5U(a2.g);
        }
    }

    public static boolean doesBottomSheetExist(WebContents webContents) {
        PwaBottomSheetController a2 = a(webContents);
        return a2 != null && a2.d();
    }

    public static void updateState(WebContents webContents, int i, boolean z) {
        PwaBottomSheetController a2 = a(webContents);
        if (a2 == null) {
            return;
        }
        N.MzfzCOQC(a2.g, i);
        if (z && a2.d()) {
            ((m) a2.h).e();
            N.M55fWa5U(a2.g);
        }
    }
}
