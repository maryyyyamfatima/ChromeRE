package org.chromium.chrome.browser.download;

import J.N;
import android.app.Activity;
import com.android.chrome.R;
import defpackage.AbstractC4249cY1;
import defpackage.AbstractC5266fV2;
import defpackage.C1530Lu0;
import defpackage.C1790Nu0;
import defpackage.C1920Ou0;
import defpackage.C2050Pu0;
import defpackage.C7928nE;
import defpackage.GD2;
import defpackage.InterfaceC3562aY1;
import defpackage.JD2;
import defpackage.PD2;
import defpackage.UN;
import defpackage.ZX1;
import java.io.File;
import java.util.HashMap;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.download.DuplicateDownloadDialogBridge;
import org.chromium.chrome.browser.profiles.OTRProfileID;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class DuplicateDownloadDialogBridge {
    public long a;

    public DuplicateDownloadDialogBridge(long j) {
        this.a = j;
    }

    public static DuplicateDownloadDialogBridge create(long j) {
        return new DuplicateDownloadDialogBridge(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [Qu0] */
    public void showDialog(WindowAndroid windowAndroid, String str, String str2, long j, boolean z, OTRProfileID oTRProfileID, final long j2) {
        CharSequence d;
        Activity activity = (Activity) windowAndroid.k().get();
        if (activity == 0) {
            N.MQbifKYb(this.a, j2, false);
            return;
        }
        final C2050Pu0 c2050Pu0 = new C2050Pu0();
        ZX1 N = ((InterfaceC3562aY1) activity).N();
        ?? r1 = new Callback() { // from class: Qu0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                DuplicateDownloadDialogBridge duplicateDownloadDialogBridge = DuplicateDownloadDialogBridge.this;
                duplicateDownloadDialogBridge.getClass();
                N.MQbifKYb(duplicateDownloadDialogBridge.a, j2, ((Boolean) obj).booleanValue());
            }
        };
        c2050Pu0.a = N;
        HashMap e = PropertyModel.e(AbstractC4249cY1.B);
        JD2 jd2 = AbstractC4249cY1.a;
        C1790Nu0 c1790Nu0 = new C1790Nu0(r1, N, str2, activity);
        GD2 gd2 = new GD2();
        gd2.a = c1790Nu0;
        e.put(jd2, gd2);
        PD2 pd2 = AbstractC4249cY1.c;
        String string = activity.getResources().getString(str2.isEmpty() ? R.string.0_resource_name_obfuscated_res_0x7f14045f : R.string.0_resource_name_obfuscated_res_0x7f140463);
        GD2 gd22 = new GD2();
        gd22.a = string;
        e.put(pd2, gd22);
        PD2 pd22 = AbstractC4249cY1.f;
        if (str2.isEmpty()) {
            d = DownloadUtils.d(activity.getString(R.string.0_resource_name_obfuscated_res_0x7f14045e), new File(str).getName(), true, j, new C1530Lu0(str, new Runnable() { // from class: Mu0
                @Override // java.lang.Runnable
                public final void run() {
                    C2050Pu0 c2050Pu02 = C2050Pu0.this;
                    c2050Pu02.a.c(3, c2050Pu02.b);
                    C2050Pu0.a(3, false);
                }
            }, oTRProfileID, 14));
        } else {
            d = DownloadUtils.d(activity.getString(z ? R.string.0_resource_name_obfuscated_res_0x7f140462 : R.string.0_resource_name_obfuscated_res_0x7f140461), str, false, 0L, new C1920Ou0(c2050Pu0, activity, str));
        }
        GD2 gd23 = new GD2();
        gd23.a = d;
        e.put(pd22, gd23);
        PD2 pd23 = AbstractC4249cY1.j;
        String string2 = activity.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f14045d);
        GD2 gd24 = new GD2();
        gd24.a = string2;
        e.put(pd23, gd24);
        PD2 pd24 = AbstractC4249cY1.n;
        String string3 = activity.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f1402f4);
        GD2 gd25 = new GD2();
        gd25.a = string3;
        c2050Pu0.b = AbstractC5266fV2.a(e, pd24, gd25, e);
        OTRProfileID oTRProfileID2 = OTRProfileID.b;
        boolean z2 = oTRProfileID != null;
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("IncognitoDownloadsWarning") && z2) {
            c2050Pu0.b.o(AbstractC4249cY1.g, activity.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f14041c));
        }
        N.l(c2050Pu0.b, 0, false);
        C2050Pu0.a(0, true ^ str2.isEmpty());
    }

    public final void destroy() {
        this.a = 0L;
    }
}
