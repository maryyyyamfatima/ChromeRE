package defpackage;

import android.R;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hq4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6077hq4 extends AbstractC8826pq4 {
    public final Window a;
    public final View b;

    public AbstractC6077hq4(Window window, View view) {
        this.a = window;
        this.b = view;
    }

    @Override // defpackage.AbstractC8826pq4
    public final void c(int i) {
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                Window window = this.a;
                if (i2 == 1) {
                    e(4);
                    window.clearFlags(1024);
                } else if (i2 == 2) {
                    e(2);
                } else if (i2 == 8) {
                    final View view = this.b;
                    if (view.isInEditMode() || view.onCheckIsTextEditor()) {
                        view.requestFocus();
                    } else {
                        view = window.getCurrentFocus();
                    }
                    if (view == null) {
                        view = window.findViewById(R.id.content);
                    }
                    if (view != null && view.hasWindowFocus()) {
                        view.post(new Runnable() { // from class: gq4
                            @Override // java.lang.Runnable
                            public final void run() {
                                View view2 = view;
                                ((InputMethodManager) view2.getContext().getSystemService("input_method")).showSoftInput(view2, 0);
                            }
                        });
                    }
                }
            }
        }
    }

    @Override // defpackage.AbstractC8826pq4
    public final void a(int i) {
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 == 1) {
                    d(4);
                } else if (i2 == 2) {
                    d(2);
                } else if (i2 == 8) {
                    Window window = this.a;
                    ((InputMethodManager) window.getContext().getSystemService("input_method")).hideSoftInputFromWindow(window.getDecorView().getWindowToken(), 0);
                }
            }
        }
    }

    public final void d(int i) {
        View decorView = this.a.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public final void e(int i) {
        View decorView = this.a.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    @Override // defpackage.AbstractC8826pq4
    public final void b(int i) {
        if (i == 0) {
            e(6144);
            return;
        }
        if (i == 1) {
            e(4096);
            d(2048);
        } else {
            if (i != 2) {
                return;
            }
            e(2048);
            d(4096);
        }
    }
}
