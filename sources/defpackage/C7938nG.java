package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7938nG implements InterfaceC1151Iw0 {
    public final /* synthetic */ C9310rG a;

    @Override // defpackage.InterfaceC1151Iw0
    public final boolean a(CharSequence charSequence) {
        return false;
    }

    @Override // defpackage.InterfaceC1151Iw0
    public final boolean isValid(CharSequence charSequence) {
        C9310rG c9310rG = this.a;
        CharSequence charSequence2 = c9310rG.s.s;
        if (charSequence == null || charSequence2 == null) {
            return false;
        }
        int parseInt = Integer.parseInt(charSequence.toString());
        int parseInt2 = Integer.parseInt(charSequence2.toString());
        int i = c9310rG.A;
        return parseInt2 > i || (parseInt2 == i && parseInt >= c9310rG.z);
    }

    public C7938nG(C9310rG c9310rG) {
        this.a = c9310rG;
    }
}
