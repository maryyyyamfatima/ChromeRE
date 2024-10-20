package defpackage;

import android.os.Bundle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Nb3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1698Nb3 implements InterfaceC3999bo0 {
    public final String a;

    public abstract boolean c();

    public abstract void d();

    public AbstractC1698Nb3(String str) {
        this.a = str;
    }

    @Override // defpackage.InterfaceC3999bo0
    public final void b(C3185Yn0 c3185Yn0) {
        if (c()) {
            c3185Yn0.a(this.a);
        }
    }

    @Override // defpackage.InterfaceC3999bo0
    public final boolean a(String str, Bundle bundle, C2925Wn0 c2925Wn0) {
        if (!this.a.equals(str) || !c()) {
            return false;
        }
        d();
        c2925Wn0.onResult(Bundle.EMPTY);
        return true;
    }
}
