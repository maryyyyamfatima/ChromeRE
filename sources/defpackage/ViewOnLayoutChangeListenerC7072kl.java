package defpackage;

import android.view.View;
import android.view.WindowManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kl */
/* loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC7072kl implements View.OnLayoutChangeListener {
    public final /* synthetic */ AbstractActivityC7416ll a;

    public ViewOnLayoutChangeListenerC7072kl(AbstractActivityC7416ll abstractActivityC7416ll) {
        this.a = abstractActivityC7416ll;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        AbstractActivityC7416ll abstractActivityC7416ll = this.a;
        WindowManager windowManager = abstractActivityC7416ll.getWindowManager();
        if (windowManager == null || windowManager.getDefaultDisplay() == null) {
            return;
        }
        int i9 = abstractActivityC7416ll.getResources().getConfiguration().orientation;
    }
}
