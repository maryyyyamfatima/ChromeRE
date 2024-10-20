package defpackage;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class WS1 implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC11778yT1 {
    public final BS1 a;
    public DialogC5834h8 g;
    public C4831eD1 h;

    @Override // defpackage.InterfaceC11778yT1
    public final boolean d(BS1 bs1) {
        return false;
    }

    public WS1(BS1 bs1) {
        this.a = bs1;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        BS1 bs1 = this.a;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.g.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.g.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                bs1.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return bs1.performShortcut(i, keyEvent, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.h.c(this.a, true);
    }

    @Override // defpackage.InterfaceC11778yT1
    public final void c(BS1 bs1, boolean z) {
        DialogC5834h8 dialogC5834h8;
        if ((z || bs1 == this.a) && (dialogC5834h8 = this.g) != null) {
            dialogC5834h8.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C4831eD1 c4831eD1 = this.h;
        if (c4831eD1.k == null) {
            c4831eD1.k = new C4488dD1(c4831eD1);
        }
        this.a.q(c4831eD1.k.getItem(i), null, 0);
    }
}
