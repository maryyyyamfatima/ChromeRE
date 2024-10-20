package defpackage;

import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class HM0 extends RM0 {
    public final Callback d;
    public final /* synthetic */ SM0 e;

    @Override // defpackage.RM0
    public final int b() {
        return 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HM0(SM0 sm0, int i, String str) {
        super(i, str);
        DM0 dm0 = SM0.d;
        this.e = sm0;
        this.d = dm0;
    }

    @Override // defpackage.RM0
    public final AbstractC0185Bl a() {
        return new GM0(this);
    }

    @Override // defpackage.RM0
    public final boolean equals(Object obj) {
        if (obj instanceof HM0) {
            return super.equals(obj);
        }
        return false;
    }
}
