package org.chromium.chrome.browser.download;

import J.N;
import android.app.Activity;
import com.android.chrome.R;
import defpackage.AbstractC4249cY1;
import defpackage.AbstractC6091ht0;
import defpackage.C7928nE;
import defpackage.DD2;
import defpackage.EI2;
import defpackage.GD2;
import defpackage.GX1;
import defpackage.ID2;
import defpackage.InterfaceC3562aY1;
import defpackage.JD2;
import defpackage.M41;
import defpackage.PD2;
import defpackage.UN;
import defpackage.ZX1;
import java.util.HashMap;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.download.MixedContentDownloadDialogBridge;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class MixedContentDownloadDialogBridge {
    public long a;

    public MixedContentDownloadDialogBridge(long j) {
        this.a = j;
    }

    public static MixedContentDownloadDialogBridge create(long j) {
        return new MixedContentDownloadDialogBridge(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [HX1] */
    public final void showDialog(WindowAndroid windowAndroid, String str, long j, boolean z, final long j2) {
        Activity activity = (Activity) windowAndroid.k().get();
        if (activity == 0) {
            N.ML6jeh7K(this.a, j2, false);
            return;
        }
        ZX1 N = ((InterfaceC3562aY1) activity).N();
        ?? r2 = new Callback() { // from class: HX1
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                MixedContentDownloadDialogBridge mixedContentDownloadDialogBridge = MixedContentDownloadDialogBridge.this;
                mixedContentDownloadDialogBridge.getClass();
                N.ML6jeh7K(mixedContentDownloadDialogBridge.a, j2, ((Boolean) obj).booleanValue());
            }
        };
        if (j > 0) {
            StringBuilder a = M41.a(str, " (");
            a.append(AbstractC6091ht0.b(j, activity));
            a.append(")");
            str = a.toString();
        }
        HashMap e = PropertyModel.e(AbstractC4249cY1.B);
        JD2 jd2 = AbstractC4249cY1.a;
        GX1 gx1 = new GX1(r2, N);
        GD2 gd2 = new GD2();
        gd2.a = gx1;
        e.put(jd2, gd2);
        PD2 pd2 = AbstractC4249cY1.c;
        String string = activity.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f140664);
        GD2 gd22 = new GD2();
        gd22.a = string;
        e.put(pd2, gd22);
        PD2 pd22 = AbstractC4249cY1.f;
        GD2 gd23 = new GD2();
        gd23.a = str;
        e.put(pd22, gd23);
        PD2 pd23 = AbstractC4249cY1.j;
        String string2 = activity.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f140662);
        GD2 gd24 = new GD2();
        gd24.a = string2;
        e.put(pd23, gd24);
        PD2 pd24 = AbstractC4249cY1.n;
        String string3 = activity.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f140663);
        GD2 gd25 = new GD2();
        gd25.a = string3;
        e.put(pd24, gd25);
        ID2 id2 = AbstractC4249cY1.v;
        DD2 dd2 = new DD2();
        dd2.a = 0;
        e.put(id2, dd2);
        PropertyModel propertyModel = new PropertyModel(e);
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("IncognitoDownloadsWarning") && z) {
            propertyModel.o(AbstractC4249cY1.g, activity.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f14041c));
        }
        N.l(propertyModel, 0, false);
        EI2.h(0, 4, "Download.MixedContentDialog.Events");
    }

    public final void destroy() {
        this.a = 0L;
    }
}
