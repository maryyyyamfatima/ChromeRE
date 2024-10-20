package defpackage;

import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class EO implements XX1 {
    public int a = -1;
    public final /* synthetic */ HO g;

    @Override // defpackage.XX1
    public final /* synthetic */ void n() {
    }

    public EO(HO ho) {
        this.g = ho;
    }

    @Override // defpackage.XX1
    public final void d(PropertyModel propertyModel) {
        if (this.a == -1) {
            this.a = this.g.b();
        }
    }

    @Override // defpackage.XX1
    public final void b() {
        int i = this.a;
        if (i != -1) {
            ((C5265fV1) this.g.a).a.a.c(i);
            this.a = -1;
        }
    }
}
