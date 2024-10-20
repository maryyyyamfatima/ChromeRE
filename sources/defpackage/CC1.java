package defpackage;

import android.widget.ListView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class CC1 implements Runnable {
    public final /* synthetic */ EC1 a;

    public CC1(EC1 ec1) {
        this.a = ec1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListView listView = this.a.f0;
        listView.focusableViewAvailable(listView);
    }
}
