package defpackage;

import java.util.Calendar;
import java.util.Date;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Th0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2505Th0 extends AbstractC1992Pi2 {
    public final EnumC2375Sh0 c;

    public C2505Th0(int i, C7655mS0 c7655mS0, EnumC2375Sh0 enumC2375Sh0) {
        super(c7655mS0, i);
        this.c = enumC2375Sh0;
        StringBuilder sb = new StringBuilder("%");
        c7655mS0.a(sb);
        sb.append((c7655mS0.a & 128) != 0 ? 'T' : 't');
        sb.append(enumC2375Sh0.a);
    }

    @Override // defpackage.AbstractC1992Pi2
    public final void a(C1275Jv c1275Jv, Object obj) {
        boolean z = obj instanceof Date;
        EnumC2375Sh0 enumC2375Sh0 = this.c;
        StringBuilder sb = c1275Jv.e;
        if (z || (obj instanceof Calendar) || (obj instanceof Long)) {
            StringBuilder sb2 = new StringBuilder("%");
            C7655mS0 c7655mS0 = this.b;
            c7655mS0.a(sb2);
            sb2.append((c7655mS0.a & 128) != 0 ? 'T' : 't');
            sb2.append(enumC2375Sh0.a);
            sb.append(String.format(OV1.a, sb2.toString(), obj));
            return;
        }
        C1275Jv.a(obj, "%t" + enumC2375Sh0.a, sb);
    }
}
