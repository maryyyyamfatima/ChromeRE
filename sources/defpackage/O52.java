package defpackage;

import android.content.ComponentName;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class O52 implements InterfaceC6518j73 {
    public final /* synthetic */ P52 a;

    @Override // defpackage.InterfaceC6518j73
    public final void a(ComponentName componentName) {
        P52 p52 = this.a;
        p52.getClass();
        EI2.k(System.currentTimeMillis() - p52.i, "NoteCreation.TimeTo.ShareCreation");
        EI2.b("NoteCreation.NoteShared", true);
        EI2.h(2, 3, "NoteCreation.Funnel");
        EI2.h(!componentName.equals(CP.q) ? 1 : 0, 2, "NoteCreation.ShareDestination");
    }

    @Override // defpackage.InterfaceC6518j73
    public final void onCancel() {
        P52 p52 = this.a;
        p52.getClass();
        EI2.k(System.currentTimeMillis() - p52.i, "NoteCreation.TimeTo.DismissShare");
        EI2.b("NoteCreation.NoteShared", false);
    }

    public O52(P52 p52) {
        this.a = p52;
    }
}
