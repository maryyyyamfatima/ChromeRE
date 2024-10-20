package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.EditText;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Cw0 */
/* loaded from: classes.dex */
public final class C0371Cw0 extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewOnClickListenerC0501Dw0 a;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        final ViewOnClickListenerC0501Dw0 viewOnClickListenerC0501Dw0 = this.a;
        int i = 0;
        viewOnClickListenerC0501Dw0.p.setLayerType(0, null);
        while (true) {
            ArrayList arrayList = viewOnClickListenerC0501Dw0.k;
            if (i >= arrayList.size()) {
                viewOnClickListenerC0501Dw0.y = null;
                viewOnClickListenerC0501Dw0.g.post(new Runnable() { // from class: uw0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewOnClickListenerC0501Dw0 viewOnClickListenerC0501Dw02 = ViewOnClickListenerC0501Dw0.this;
                        viewOnClickListenerC0501Dw02.getClass();
                        if (!C10021tL.f().c()) {
                            ArrayList c = viewOnClickListenerC0501Dw02.c(false);
                            if (!c.isEmpty()) {
                                ((InterfaceC1411Kw0) c.get(0)).a();
                            } else {
                                viewOnClickListenerC0501Dw02.p.requestFocus();
                            }
                        }
                        if (viewOnClickListenerC0501Dw02.getCurrentFocus() != null) {
                            C11939yv1.g.i(viewOnClickListenerC0501Dw02.getCurrentFocus());
                            if (viewOnClickListenerC0501Dw02.getCurrentFocus() instanceof EditText) {
                                EditText editText = (EditText) viewOnClickListenerC0501Dw02.getCurrentFocus();
                                editText.setSelection(editText.getText().length());
                            }
                        }
                    }
                });
                return;
            } else {
                ((EditText) arrayList.get(i)).setEnabled(true);
                i++;
            }
        }
    }

    public C0371Cw0(ViewOnClickListenerC0501Dw0 viewOnClickListenerC0501Dw0) {
        this.a = viewOnClickListenerC0501Dw0;
    }
}
