package defpackage;

import android.content.Intent;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class C42 implements InterfaceC4352cp4 {
    public final /* synthetic */ PropertyModel a;
    public final /* synthetic */ D42 g;

    @Override // defpackage.InterfaceC4352cp4
    public final void b(Intent intent, int i) {
        this.g.a.c(1, this.a);
    }

    public C42(D42 d42, PropertyModel propertyModel) {
        this.g = d42;
        this.a = propertyModel;
    }
}
