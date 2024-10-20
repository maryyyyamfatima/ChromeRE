package defpackage;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vi1 */
/* loaded from: classes.dex */
public final class C10832vi1 implements InterfaceC10534up4, InterfaceC0186Bl0 {
    public final Activity a;
    public final E5 g;
    public final Handler h;
    public final RunnableC10146ti1 i;
    public boolean j;
    public boolean k;

    /* JADX WARN: Type inference failed for: r1v1, types: [ti1] */
    public C10832vi1(I5 i5, Activity activity, WindowAndroid windowAndroid) {
        E5 e5 = new E5();
        this.g = e5;
        this.h = new Handler();
        this.i = new Runnable() { // from class: ti1
            @Override // java.lang.Runnable
            public final void run() {
                C10832vi1.this.d();
            }
        };
        this.a = activity;
        i5.b(this);
        e5.q(windowAndroid.t);
    }

    public final void a(int i, boolean z) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.k = z;
        Window window = this.a.getWindow();
        window.getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: ui1
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public final void onSystemUiVisibilityChange(int i2) {
                C10832vi1.this.b(3000);
            }
        });
        if (Build.VERSION.SDK_INT >= 28) {
            window.getAttributes().layoutInDisplayCutoutMode = i;
            this.g.p(Integer.valueOf(i));
        }
        b(0);
    }

    public final void b(int i) {
        if (this.j) {
            Handler handler = this.h;
            RunnableC10146ti1 runnableC10146ti1 = this.i;
            handler.removeCallbacks(runnableC10146ti1);
            handler.postDelayed(runnableC10146ti1, i);
        }
    }

    public final void d() {
        AbstractC8826pq4 c6420iq4;
        AbstractC8826pq4 abstractC8826pq4;
        int i = Build.VERSION.SDK_INT;
        Activity activity = this.a;
        if (i == 30) {
            View decorView = activity.getWindow().getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            int i2 = this.k ? 5895 : 3847;
            int i3 = this.j ? i2 | systemUiVisibility : (~i2) & systemUiVisibility;
            if (systemUiVisibility != i3) {
                decorView.setSystemUiVisibility(i3);
            }
        } else {
            Window window = activity.getWindow();
            View decorView2 = window.getDecorView();
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 30) {
                abstractC8826pq4 = new C8483oq4(window);
            } else {
                if (i4 >= 26) {
                    c6420iq4 = new C6763jq4(window, decorView2);
                } else {
                    c6420iq4 = new C6420iq4(window, decorView2);
                }
                abstractC8826pq4 = c6420iq4;
            }
            if (this.k) {
                abstractC8826pq4.b(2);
            } else {
                abstractC8826pq4.b(1);
            }
            if (!this.j) {
                abstractC8826pq4.c(7);
            } else {
                abstractC8826pq4.a(7);
            }
        }
        Window window2 = activity.getWindow();
        boolean z = true ^ this.j;
        if (i < 30) {
            View decorView3 = window2.getDecorView();
            int systemUiVisibility2 = decorView3.getSystemUiVisibility();
            decorView3.setSystemUiVisibility(z ? systemUiVisibility2 & (-1793) : systemUiVisibility2 | 1792);
            return;
        }
        window2.setDecorFitsSystemWindows(z);
    }

    @Override // defpackage.InterfaceC10534up4
    public final void onWindowFocusChanged(boolean z) {
        if (z && this.j) {
            b(300);
        }
    }

    @Override // defpackage.InterfaceC0186Bl0
    public final void onDestroy() {
        this.h.removeCallbacks(this.i);
        this.g.s();
    }
}
