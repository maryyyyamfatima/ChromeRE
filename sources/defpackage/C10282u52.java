package defpackage;

import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: u52 */
/* loaded from: classes.dex */
public final class C10282u52 implements InterfaceC3906bY1 {
    public final /* synthetic */ C10625v52 a;

    public C10282u52(C10625v52 c10625v52) {
        this.a = c10625v52;
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void c(int i, PropertyModel propertyModel) {
        C10625v52 c10625v52 = this.a;
        if (i == 0) {
            c10625v52.a.c(1, c10625v52.b);
        } else {
            if (i != 1) {
                return;
            }
            c10625v52.a.c(2, c10625v52.b);
        }
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void a(int i) {
        C10625v52 c10625v52 = this.a;
        if (i == 1) {
            c10625v52.c.onResult(Boolean.TRUE);
        } else {
            c10625v52.c.onResult(Boolean.FALSE);
        }
        c10625v52.a.b();
    }
}
