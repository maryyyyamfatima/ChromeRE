package defpackage;

import android.app.Activity;
import org.chromium.base.ApplicationStatus;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Jb2 */
/* loaded from: classes.dex */
public final class C1178Jb2 implements InterfaceC11179wj {
    @Override // defpackage.InterfaceC11179wj
    public final void o(Activity activity, int i) {
        if (i == 6) {
            ((C1697Nb2) AbstractC2217Rb2.b.remove(activity)).a();
            ApplicationStatus.h(this);
        }
    }
}
