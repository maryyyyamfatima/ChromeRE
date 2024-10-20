package org.chromium.chrome.browser.password_manager;

import J.N;
import android.content.res.Resources;
import com.android.chrome.R;
import defpackage.AbstractC0193Bm2;
import defpackage.AbstractC2884Wf;
import defpackage.AbstractC4249cY1;
import defpackage.BD2;
import defpackage.C2657Ul2;
import defpackage.C2787Vl2;
import defpackage.C2917Wl2;
import defpackage.PD2;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.password_manager.PasswordGenerationDialogBridge;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PasswordGenerationDialogBridge {
    public long a;
    public final C2657Ul2 b;
    public String c;

    public PasswordGenerationDialogBridge(long j, WindowAndroid windowAndroid) {
        this.a = j;
        this.b = new C2657Ul2(windowAndroid);
    }

    public static PasswordGenerationDialogBridge create(WindowAndroid windowAndroid, long j) {
        return new PasswordGenerationDialogBridge(j, windowAndroid);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Tl2] */
    public void showDialog(String str, String str2) {
        this.c = str;
        ?? r0 = new Callback() { // from class: Tl2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                PasswordGenerationDialogBridge passwordGenerationDialogBridge = PasswordGenerationDialogBridge.this;
                long j = passwordGenerationDialogBridge.a;
                if (j == 0) {
                    return;
                }
                if (booleanValue) {
                    N.M1W3B6UT(j, passwordGenerationDialogBridge, passwordGenerationDialogBridge.c);
                } else {
                    N.Ml5BeqqW(j, passwordGenerationDialogBridge);
                }
                C2657Ul2 c2657Ul2 = passwordGenerationDialogBridge.b;
                c2657Ul2.a.c(3, c2657Ul2.d);
            }
        };
        PD2 pd2 = C2917Wl2.c;
        C2657Ul2 c2657Ul2 = this.b;
        C2917Wl2 c2917Wl2 = c2657Ul2.b;
        c2917Wl2.o(pd2, str);
        PD2 pd22 = C2917Wl2.d;
        c2917Wl2.o(pd22, str2);
        String str3 = (String) c2917Wl2.i(pd2);
        PasswordGenerationDialogCustomView passwordGenerationDialogCustomView = c2657Ul2.c;
        passwordGenerationDialogCustomView.a.setText(str3);
        passwordGenerationDialogCustomView.a.setInputType(131217);
        passwordGenerationDialogCustomView.g.setText((String) c2917Wl2.i(pd22));
        Resources resources = passwordGenerationDialogCustomView.getResources();
        BD2 bd2 = new BD2(AbstractC4249cY1.B);
        bd2.e(AbstractC4249cY1.a, new C2787Vl2(r0));
        bd2.e(AbstractC4249cY1.h, passwordGenerationDialogCustomView);
        bd2.d(AbstractC4249cY1.j, resources, R.string.f80630_resource_name_obfuscated_res_0x7f1407cb);
        bd2.d(AbstractC4249cY1.n, resources, R.string.f80600_resource_name_obfuscated_res_0x7f1407c8);
        boolean l = AbstractC0193Bm2.l();
        PD2 pd23 = AbstractC4249cY1.c;
        if (l) {
            bd2.e(AbstractC4249cY1.e, AbstractC2884Wf.a(passwordGenerationDialogCustomView.getContext(), R.drawable.f49900_resource_name_obfuscated_res_0x7f0902f3));
            bd2.d(pd23, resources, R.string.f80620_resource_name_obfuscated_res_0x7f1407ca);
        } else {
            bd2.d(pd23, resources, R.string.f80610_resource_name_obfuscated_res_0x7f1407c9);
        }
        PropertyModel a = bd2.a();
        c2657Ul2.d = a;
        c2657Ul2.a.l(a, 1, false);
    }

    public final void destroy() {
        this.a = 0L;
        C2657Ul2 c2657Ul2 = this.b;
        c2657Ul2.a.c(4, c2657Ul2.d);
    }
}
