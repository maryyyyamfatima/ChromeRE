package defpackage;

import android.accounts.Account;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class V2 extends AbstractC0185Bl {
    public final /* synthetic */ Account h;
    public final /* synthetic */ Q2 i;
    public final /* synthetic */ Y2 j;

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        C5756gu3 c5756gu3 = (C5756gu3) this.j.a;
        c5756gu3.getClass();
        return Boolean.valueOf(c5756gu3.d(this.h, new String[]{"service_usm"}));
    }

    public V2(Y2 y2, Account account, Q2 q2) {
        this.j = y2;
        this.h = account;
        this.i = q2;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        Boolean bool = (Boolean) obj;
        this.i.a(bool.booleanValue(), bool.booleanValue() ? this.h : null);
    }
}
