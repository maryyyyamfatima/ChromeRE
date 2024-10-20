package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.android.chrome.R;
import org.chromium.chrome.browser.share.qrcode.QRCodeGenerationRequest;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dG2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4504dG2 {
    public final Context a;
    public final PropertyModel b;
    public WindowAndroid c;
    public int d;
    public boolean e;
    public final String f;
    public final Runnable g;

    public C4504dG2(Activity activity, PropertyModel propertyModel, DF2 df2, String str, WindowAndroid windowAndroid) {
        this.a = activity;
        this.b = propertyModel;
        this.g = df2;
        this.f = str;
        C7629mN.a().f(new Runnable() { // from class: aG2
            @Override // java.lang.Runnable
            public final void run() {
                C4504dG2 c4504dG2 = C4504dG2.this;
                String str2 = c4504dG2.f;
                if (TextUtils.isEmpty(str2)) {
                    c4504dG2.b.o(AbstractC5879hG2.b, c4504dG2.a.getResources().getString(R.string.f83880_resource_name_obfuscated_res_0x7f140915));
                    return;
                }
                new QRCodeGenerationRequest(str2, new C3817bG2(c4504dG2, str2));
            }
        });
        this.c = windowAndroid;
        a();
    }

    public final void a() {
        Boolean valueOf;
        Boolean valueOf2;
        LD2 ld2 = AbstractC5879hG2.d;
        if (Boolean.valueOf(!AbstractC6205iD.a()).booleanValue()) {
            WindowAndroid windowAndroid = this.c;
            valueOf = windowAndroid == null ? Boolean.FALSE : Boolean.valueOf(windowAndroid.canRequestPermission("android.permission.WRITE_EXTERNAL_STORAGE"));
        } else {
            valueOf = Boolean.FALSE;
        }
        boolean booleanValue = valueOf.booleanValue();
        PropertyModel propertyModel = this.b;
        propertyModel.k(ld2, booleanValue);
        LD2 ld22 = AbstractC5879hG2.c;
        if (Boolean.valueOf(!AbstractC6205iD.a()).booleanValue()) {
            valueOf2 = Boolean.valueOf(this.a.checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", Process.myPid(), Process.myUid()) == 0);
        } else {
            valueOf2 = Boolean.TRUE;
        }
        propertyModel.k(ld22, valueOf2.booleanValue());
    }
}
