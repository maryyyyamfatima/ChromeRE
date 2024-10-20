package defpackage;

import android.app.Activity;
import android.hardware.Camera;
import android.view.View;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class KF2 implements GF2 {
    public final UF2 a;
    public final PF2 b;

    @Override // defpackage.GF2
    public final void b(WindowAndroid windowAndroid) {
    }

    public KF2(Activity activity, EF2 ef2, WindowAndroid windowAndroid) {
        PropertyModel propertyModel = new PropertyModel(WF2.d);
        PF2 pf2 = new PF2(activity, propertyModel, ef2, windowAndroid);
        this.b = pf2;
        UF2 uf2 = new UF2(activity, new Camera.PreviewCallback() { // from class: IF2
            public /* synthetic */ IF2() {
            }

            @Override // android.hardware.Camera.PreviewCallback
            public final void onPreviewFrame(byte[] bArr, Camera camera) {
                PF2.this.onPreviewFrame(bArr, camera);
            }
        }, new JF2(pf2));
        this.a = uf2;
        UD2.a(propertyModel, uf2, new VF2());
    }

    @Override // defpackage.GF2
    public final void onResume() {
        FI2.a("SharingQRCode.TabVisible.Scan");
        PF2 pf2 = this.b;
        pf2.a();
        pf2.b.k(WF2.c, true);
    }

    @Override // defpackage.GF2
    public final void onPause() {
        this.b.b.k(WF2.c, false);
    }

    @Override // defpackage.GF2
    public final View a() {
        return this.a.b;
    }

    @Override // defpackage.GF2
    public final void onDestroy() {
        UF2 uf2 = this.a;
        CF cf = uf2.g;
        if (cf != null) {
            cf.b();
            uf2.g = null;
        }
    }
}
