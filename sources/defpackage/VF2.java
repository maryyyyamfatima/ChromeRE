package defpackage;

import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class VF2 implements TD2 {
    @Override // defpackage.TD2
    public final void d(WD2 wd2, Object obj, Object obj2) {
        CF cf;
        PropertyModel propertyModel = (PropertyModel) wd2;
        UF2 uf2 = (UF2) obj;
        FD2 fd2 = (FD2) obj2;
        LD2 ld2 = WF2.a;
        if (ld2 == fd2) {
            Boolean valueOf = Boolean.valueOf(propertyModel.j(ld2));
            if (uf2.d && valueOf.booleanValue()) {
                return;
            }
            uf2.d = valueOf.booleanValue();
            uf2.b();
            return;
        }
        LD2 ld22 = WF2.c;
        if (ld22 == fd2) {
            Boolean valueOf2 = Boolean.valueOf(propertyModel.j(ld22));
            uf2.getClass();
            boolean booleanValue = valueOf2.booleanValue();
            uf2.f = booleanValue;
            if (!booleanValue && (cf = uf2.g) != null) {
                cf.b();
                return;
            } else {
                uf2.b();
                return;
            }
        }
        LD2 ld23 = WF2.b;
        if (ld23 == fd2) {
            Boolean valueOf3 = Boolean.valueOf(propertyModel.j(ld23));
            uf2.getClass();
            uf2.e = valueOf3.booleanValue();
            uf2.b();
        }
    }
}
