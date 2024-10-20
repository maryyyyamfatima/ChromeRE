package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.os.SystemClock;
import java.util.ArrayList;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Jn3 */
/* loaded from: classes.dex */
public final class C1239Jn3 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ C5720go3 g;
    public final /* synthetic */ Tab h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ C1758Nn3 j;

    public C1239Jn3(C1758Nn3 c1758Nn3, boolean z, C5720go3 c5720go3, Tab tab, boolean z2) {
        this.j = c1758Nn3;
        this.a = z;
        this.g = c5720go3;
        this.h = tab;
        this.i = z2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        boolean z = this.a;
        final C1758Nn3 c1758Nn3 = this.j;
        if (!z) {
            c1758Nn3.U = false;
            if (!this.i) {
                c1758Nn3.r(true);
                return;
            } else {
                c1758Nn3.e(true, false);
                return;
            }
        }
        c1758Nn3.h();
        final int i = this.g.a;
        ArrayList arrayList = new ArrayList();
        ArrayList e = c1758Nn3.e(true, true);
        if (e != null) {
            arrayList.addAll(e);
        }
        c1758Nn3.F();
        c1758Nn3.f();
        for (C5720go3 c5720go3 : c1758Nn3.i) {
            arrayList.add(C4424d20.d(((C9897sy1) c1758Nn3.a).H, c5720go3, C5720go3.F, c5720go3.s, c5720go3.o, 250L));
        }
        C4424d20 C = c1758Nn3.C(true);
        if (C != null) {
            arrayList.add(C);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.addListener(new C1369Kn3(c1758Nn3));
        c1758Nn3.n = animatorSet;
        animatorSet.start();
        final Tab tab = this.h;
        if (tab != null) {
            PostTask.b(AbstractC5103f04.a, new Runnable() { // from class: Gn3
                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = i;
                    C1758Nn3 c1758Nn32 = c1758Nn3;
                    c1758Nn32.getClass();
                    c1758Nn32.A(SystemClock.uptimeMillis(), tab.getId(), i2, true);
                }
            }, 150L);
        }
    }
}
