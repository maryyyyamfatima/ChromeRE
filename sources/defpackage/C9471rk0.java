package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rk0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9471rk0 {
    public InterfaceC7687mY2 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;

    public final void a(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            if (!this.d) {
                this.c = false;
                this.e = true;
                return;
            } else {
                this.b = false;
                this.c = false;
                this.d = false;
                return;
            }
        }
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && !this.c && this.b && !this.d) {
            this.d = true;
            InterfaceC7687mY2 interfaceC7687mY2 = this.a;
            if (interfaceC7687mY2 != null) {
                interfaceC7687mY2.a(view, 1);
            }
        }
    }
}
