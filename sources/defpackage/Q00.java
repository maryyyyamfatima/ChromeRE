package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Q00 extends AbstractC6726jk3 {

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    int a;

    @SY(type = 13)
    C0766Fx0 b;

    @Override // defpackage.AbstractC6726jk3
    public final void a(C6383ik3 c6383ik3) {
        Object[] objArr = c6383ik3.b;
        if (c6383ik3.a != 0) {
            return;
        }
        Integer valueOf = Integer.valueOf(this.a);
        C0070Ao c0070Ao = AbstractC11971z10.a;
        this.a = Integer.valueOf((valueOf == null ? 0 : valueOf.intValue()) + 1).intValue();
    }
}
