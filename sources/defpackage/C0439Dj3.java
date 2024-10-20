package defpackage;

import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Dj3 */
/* loaded from: classes2.dex */
public final class C0439Dj3 implements GC {
    public final /* synthetic */ ViewOnClickListenerC0699Fj3 a;

    @Override // defpackage.GC
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.GC
    public final /* synthetic */ void r() {
    }

    @Override // defpackage.GC
    public final void b(boolean z, int i, int i2, int i3) {
        ViewOnClickListenerC0699Fj3 viewOnClickListenerC0699Fj3 = this.a;
        int i4 = viewOnClickListenerC0699Fj3.w;
        JC jc = viewOnClickListenerC0699Fj3.C;
        if (i4 == 1) {
            viewOnClickListenerC0699Fj3.D(((CC) jc).u);
        } else if (i4 == 2) {
            viewOnClickListenerC0699Fj3.D(((CC) jc).t);
        } else {
            viewOnClickListenerC0699Fj3.D(0);
        }
    }

    @Override // defpackage.GC
    public final void k(int i) {
        ViewOnClickListenerC0699Fj3 viewOnClickListenerC0699Fj3 = this.a;
        int i2 = viewOnClickListenerC0699Fj3.w;
        ND2 nd2 = AbstractC0829Gj3.a;
        PropertyModel propertyModel = viewOnClickListenerC0699Fj3.i;
        if (i2 == 1) {
            propertyModel.m(nd2, i);
        } else {
            propertyModel.m(nd2, 0);
        }
    }

    public C0439Dj3(ViewOnClickListenerC0699Fj3 viewOnClickListenerC0699Fj3) {
        this.a = viewOnClickListenerC0699Fj3;
    }
}
