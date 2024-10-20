package defpackage;

import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class HL1 extends Fl4 {
    public final /* synthetic */ JL1 g;

    @Override // defpackage.Fl4
    public final void wasHidden() {
        this.g.f = false;
    }

    @Override // defpackage.Fl4
    public final void wasShown() {
        JL1 jl1 = this.g;
        jl1.f = true;
        C12044zE c12044zE = jl1.e;
        if (c12044zE != null) {
            c12044zE.c(c12044zE.i);
        }
        int[] iArr = JL1.h;
        for (int i = 0; i < 3; i++) {
            int i2 = iArr[i];
            if (jl1.c.get(i2, null) != null) {
                XD2 xd2 = jl1.a(i2).a;
                if (xd2 instanceof C12044zE) {
                    C12044zE c12044zE2 = (C12044zE) xd2;
                    c12044zE2.c(c12044zE2.i);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HL1(JL1 jl1, WebContents webContents) {
        super(webContents);
        this.g = jl1;
    }
}
