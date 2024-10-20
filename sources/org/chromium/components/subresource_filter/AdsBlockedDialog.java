package org.chromium.components.subresource_filter;

import J.N;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.text.SpannableString;
import android.text.TextUtils;
import com.android.chrome.R;
import defpackage.AbstractC4249cY1;
import defpackage.BD2;
import defpackage.C11997z52;
import defpackage.InterfaceC3906bY1;
import defpackage.PD2;
import defpackage.ZX1;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.components.subresource_filter.AdsBlockedDialog;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class AdsBlockedDialog implements InterfaceC3906bY1 {
    public long a;
    public final Context g;
    public final ZX1 h;
    public PropertyModel i;
    public C11997z52 j;
    public final Handler k = new Handler(ThreadUtils.c());

    public static AdsBlockedDialog create(long j, WindowAndroid windowAndroid) {
        return new AdsBlockedDialog(j, windowAndroid);
    }

    public AdsBlockedDialog(long j, WindowAndroid windowAndroid) {
        this.a = j;
        this.g = (Context) windowAndroid.j.get();
        this.h = windowAndroid.s();
    }

    public void show(boolean z) {
        Context context = this.g;
        Resources resources = context.getResources();
        this.j = new C11997z52(context, new Callback() { // from class: O7
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                N.MnOtNR6U(AdsBlockedDialog.this.a);
            }
        });
        BD2 bd2 = new BD2(AbstractC4249cY1.B);
        bd2.e(AbstractC4249cY1.a, this);
        bd2.d(AbstractC4249cY1.c, resources, R.string.0_resource_name_obfuscated_res_0x7f140277);
        PD2 pd2 = AbstractC4249cY1.f;
        Resources resources2 = context.getResources();
        String string = resources2.getString(R.string.0_resource_name_obfuscated_res_0x7f140276);
        String string2 = resources2.getString(R.string.0_resource_name_obfuscated_res_0x7f140275);
        SpannableString spannableString = new SpannableString(string2);
        spannableString.setSpan(this.j, 0, string2.length(), 17);
        bd2.e(pd2, TextUtils.expandTemplate(string, spannableString));
        bd2.d(AbstractC4249cY1.j, resources, R.string.0_resource_name_obfuscated_res_0x7f140274);
        bd2.d(AbstractC4249cY1.n, resources, R.string.0_resource_name_obfuscated_res_0x7f1402f4);
        bd2.b(AbstractC4249cY1.r, true);
        bd2.b(AbstractC4249cY1.y, true);
        PropertyModel a = bd2.a();
        this.i = a;
        if (z) {
            this.k.post(new Runnable() { // from class: P7
                @Override // java.lang.Runnable
                public final void run() {
                    AdsBlockedDialog adsBlockedDialog = AdsBlockedDialog.this;
                    adsBlockedDialog.h.l(adsBlockedDialog.i, 0, false);
                }
            });
        } else {
            this.h.l(a, 0, false);
        }
    }

    public void dismiss() {
        this.h.c(4, this.i);
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void c(int i, PropertyModel propertyModel) {
        if (i == 0) {
            N.M2x3Xdzi(this.a);
        }
        this.h.c(i == 0 ? 1 : 2, propertyModel);
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void a(int i) {
        this.k.removeCallbacksAndMessages(null);
        N.MY4uokTa(this.a);
        this.a = 0L;
    }
}
