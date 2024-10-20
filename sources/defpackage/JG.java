package defpackage;

import java.util.Calendar;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class JG extends AbstractC0185Bl {
    public final /* synthetic */ KG h;

    public JG(KG kg) {
        this.h = kg;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        Calendar calendar = (Calendar) obj;
        int i = calendar.get(1);
        KG kg = this.h;
        kg.A = i;
        kg.B = calendar.get(2) + 1;
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        return Calendar.getInstance();
    }
}
