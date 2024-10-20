package defpackage;

import android.app.Activity;
import android.os.Process;
import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lN */
/* loaded from: classes.dex */
public final class C7285lN implements InterfaceC11179wj {
    public final /* synthetic */ C7629mN a;

    @Override // defpackage.InterfaceC11179wj
    public final void o(Activity activity, int i) {
        if ((i != 1 && i != 6) || C6132i01.d.c || this.a.a.equals(Locale.getDefault())) {
            return;
        }
        AbstractC4851eH1.a("BrowserInitializer", "Killing process because of locale change.", new Object[0]);
        Process.killProcess(Process.myPid());
    }

    public C7285lN(C7629mN c7629mN) {
        this.a = c7629mN;
    }
}
