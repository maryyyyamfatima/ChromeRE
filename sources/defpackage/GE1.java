package defpackage;

import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class GE1 {
    public final JE1 a;

    public GE1(InterfaceC7697ma2 interfaceC7697ma2, QQ3 qq3, boolean z) {
        PropertyModel propertyModel = new PropertyModel(KE1.c);
        this.a = new JE1(interfaceC7697ma2, propertyModel, z);
        final NE1 ne1 = new NE1();
        UD2.a(propertyModel, qq3, new TD2() { // from class: FE1
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj, Object obj2) {
                PropertyModel propertyModel2 = (PropertyModel) wd2;
                QQ3 qq32 = (QQ3) obj;
                FD2 fd2 = (FD2) obj2;
                NE1.this.getClass();
                ND2 nd2 = KE1.a;
                if (fd2 == nd2) {
                    int h = propertyModel2.h(nd2);
                    if (h != 0) {
                        qq32.d(h == 1);
                        return;
                    } else {
                        qq32.h();
                        return;
                    }
                }
                MD2 md2 = KE1.b;
                if (fd2 == md2) {
                    qq32.a(propertyModel2.g(md2));
                }
            }
        });
    }
}
