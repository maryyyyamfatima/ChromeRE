package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Tb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2474Tb extends AbstractC6726jk3 {

    @SY(type = 0)
    float a;

    @SY(type = 13)
    C8737pc b;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    int c;

    @Override // defpackage.AbstractC6726jk3
    public final void a(C6383ik3 c6383ik3) {
        Object[] objArr = c6383ik3.b;
        int i = c6383ik3.a;
        if (i == 0) {
            this.a = Float.valueOf(((Float) objArr[0]).floatValue()).floatValue();
            return;
        }
        if (i == 1) {
            this.c = Integer.valueOf(((Integer) objArr[0]).intValue()).intValue();
            return;
        }
        if (i == 2) {
            this.b = (C8737pc) objArr[0];
            return;
        }
        switch (i) {
            case Integer.MIN_VALUE:
                this.a = ((Float) objArr[0]).floatValue();
                return;
            case -2147483647:
                this.b = (C8737pc) objArr[0];
                return;
            case -2147483646:
                this.c = ((Integer) objArr[0]).intValue();
                return;
            default:
                return;
        }
    }
}
