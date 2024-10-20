package defpackage;

import android.animation.Animator;
import android.app.Dialog;
import android.content.Context;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jh2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class DialogC6707jh2 extends Dialog {
    public final /* synthetic */ C7739mh2 a;

    /* JADX WARN: Type inference failed for: r1v1, types: [hh2] */
    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        C7739mh2 c7739mh2 = this.a;
        if (!c7739mh2.i) {
            C7739mh2.a(c7739mh2, false, new Runnable() { // from class: hh2
                @Override // java.lang.Runnable
                public final void run() {
                    final DialogC6707jh2 dialogC6707jh2 = DialogC6707jh2.this;
                    dialogC6707jh2.a.b.postDelayed(new Runnable() { // from class: ih2
                        @Override // java.lang.Runnable
                        public final void run() {
                            DialogC6707jh2.a(DialogC6707jh2.this);
                        }
                    }, 10L);
                }
            }).start();
            return;
        }
        Animator animator = c7739mh2.h;
        if (animator != null && animator.isRunning()) {
            c7739mh2.h.cancel();
        }
        c7739mh2.b.removeCallbacks(null);
        super.dismiss();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC6707jh2(C7739mh2 c7739mh2, Context context) {
        super(context);
        this.a = c7739mh2;
    }

    public static void a(DialogC6707jh2 dialogC6707jh2) {
        super.dismiss();
    }
}
