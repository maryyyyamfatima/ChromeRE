package defpackage;

import android.content.Context;
import android.view.View;
import com.android.chrome.R;
import org.chromium.base.Callback;
import org.chromium.components.permissions.AndroidPermissionRequester;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class QF2 implements View.OnClickListener {
    public final /* synthetic */ JF2 a;

    public QF2(JF2 jf2) {
        this.a = jf2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [LF2, org.chromium.base.Callback] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        final PF2 pf2 = this.a.a;
        pf2.getClass();
        final ?? r0 = new Callback() { // from class: LF2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                PF2 pf22 = PF2.this;
                pf22.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                LD2 ld2 = WF2.a;
                PropertyModel propertyModel = pf22.b;
                if (booleanValue) {
                    propertyModel.k(ld2, true);
                    return;
                }
                if (!pf22.d.canRequestPermission("android.permission.CAMERA")) {
                    propertyModel.k(WF2.b, false);
                }
                propertyModel.k(ld2, false);
            }
        };
        final WindowAndroid windowAndroid = pf2.g;
        if (windowAndroid.hasPermission("android.permission.CAMERA")) {
            r0.onResult(Boolean.TRUE);
            return;
        }
        Context context = pf2.a;
        if (context == null) {
            r0.onResult(Boolean.FALSE);
            return;
        }
        InterfaceC11646y40 interfaceC11646y40 = new InterfaceC11646y40() { // from class: MF2
            @Override // defpackage.InterfaceC11646y40
            public final void accept(Object obj) {
                final PropertyModel propertyModel = (PropertyModel) obj;
                final WindowAndroid windowAndroid2 = WindowAndroid.this;
                final Callback callback = r0;
                InterfaceC0218Br2 interfaceC0218Br2 = new InterfaceC0218Br2() { // from class: NF2
                    @Override // defpackage.InterfaceC0218Br2
                    public final void b(int[] iArr, String[] strArr) {
                        PropertyModel propertyModel2;
                        ZX1 s = WindowAndroid.this.s();
                        if (s != null && (propertyModel2 = propertyModel) != null) {
                            s.c(1, propertyModel2);
                        }
                        callback.onResult(Boolean.valueOf(iArr.length > 0 && iArr[0] == 0));
                    }
                };
                windowAndroid.b(new String[]{"android.permission.CAMERA"}, interfaceC0218Br2);
            }
        };
        if (windowAndroid.s() != null) {
            AndroidPermissionRequester.b(windowAndroid, context.getString(R.string.0_resource_name_obfuscated_res_0x7f140531, AbstractC6547jD.a.a), interfaceC11646y40, new ZE(r0, Boolean.FALSE));
        }
    }
}
