package defpackage;

import android.app.Activity;
import org.chromium.base.ApplicationStatus;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9464rj implements InterfaceC12208zj {
    @Override // defpackage.InterfaceC12208zj
    public final void d(Activity activity, boolean z) {
        int c;
        if (!z || activity == ApplicationStatus.c || (c = ApplicationStatus.c(activity)) == 6 || c == 5) {
            return;
        }
        ApplicationStatus.c = activity;
    }
}
