package defpackage;

import org.chromium.base.Callback;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: im2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6394im2 implements InterfaceC3906bY1 {
    public final Callback a;

    public C6394im2(Callback callback) {
        this.a = callback;
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void c(int i, PropertyModel propertyModel) {
        Callback callback = this.a;
        if (i == 0) {
            callback.onResult(1);
        } else {
            if (i != 1) {
                return;
            }
            callback.onResult(2);
        }
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void a(int i) {
        this.a.onResult(Integer.valueOf(i));
    }
}
