package defpackage;

import java.util.HashMap;
import org.chromium.base.Callback;
import org.chromium.components.messages.MessageContainer;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fV1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5265fV1 implements InterfaceC3497aL1 {
    public final CV1 a;
    public final MessageContainer g;
    public final InterfaceC0079Ap3 h;
    public final C12094zO i;
    public final Callback j;
    public final WindowAndroid k;

    @Override // defpackage.H14
    public final /* synthetic */ void t() {
    }

    @Override // defpackage.H14
    public final /* synthetic */ void x() {
    }

    public C5265fV1(MessageContainer messageContainer, RQ2 rq2, C12094zO c12094zO, SQ2 sq2, C10285u6 c10285u6) {
        CV1 cv1 = new CV1();
        this.g = messageContainer;
        this.h = rq2;
        this.j = sq2;
        this.i = c12094zO;
        this.k = c10285u6;
        this.a = cv1;
    }

    public final void b(PropertyModel propertyModel, WebContents webContents, int i, boolean z) {
        this.a.b(propertyModel, new C9426rc3(this.g, propertyModel, new C4921eV1(this), this.h, this.i, this.j), new C5276fX2(webContents, i), z);
    }

    public final void c(PropertyModel propertyModel, boolean z) {
        this.a.b(propertyModel, new C9426rc3(this.g, propertyModel, new C4921eV1(this), this.h, this.i, this.j), new C5276fX2(this.k), z);
    }

    public final void a(int i, PropertyModel propertyModel) {
        CV1 cv1 = this.a;
        HashMap hashMap = cv1.c;
        BV1 bv1 = (BV1) hashMap.get(propertyModel);
        if (bv1 == null) {
            return;
        }
        hashMap.remove(propertyModel);
        cv1.a(bv1, i);
    }
}
