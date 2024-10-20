package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class RJ2 extends AbstractC6726jk3 {

    @SY(type = 13)
    InterfaceC2194Qx a;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    boolean b;

    @SY(type = 13)
    YJ2 c;

    @SY(type = 13)
    InterfaceC4058by1 d;

    @SY(type = 13)
    UJ2 e;

    @SY(type = 13)
    VJ2 f;

    @SY(type = 13)
    A13 g;

    @SY(type = 13)
    AbstractC2368Sf3 h;

    @Override // defpackage.AbstractC6726jk3
    public final void a(C6383ik3 c6383ik3) {
        Object[] objArr = c6383ik3.b;
        int i = c6383ik3.a;
        if (i == Integer.MIN_VALUE) {
            this.b = ((Boolean) objArr[0]).booleanValue();
        } else {
            if (i != 0) {
                return;
            }
            UJ2 uj2 = (UJ2) objArr[0];
            ND1 nd1 = XJ2.a;
            this.e = uj2;
        }
    }
}
