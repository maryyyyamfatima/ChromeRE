package defpackage;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wf */
/* loaded from: classes.dex */
public final class WindowCallbackC11155wf implements Window.Callback {
    public final Window.Callback a;
    public IO3 g;
    public boolean h;
    public boolean i;
    public boolean j;
    public final /* synthetic */ LayoutInflaterFactory2C0545Ef k;

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    public final boolean c(KeyEvent keyEvent) {
        return this.a.dispatchKeyEvent(keyEvent);
    }

    public final boolean d(KeyEvent keyEvent) {
        return this.a.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    /* renamed from: f */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    /* renamed from: g */
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    /* renamed from: b */
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    /* renamed from: e */
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public final View l(int i) {
        return this.a.onCreatePanelView(i);
    }

    public final boolean k(int i, Menu menu) {
        return this.a.onCreatePanelMenu(i, menu);
    }

    public final boolean r(int i, View view, Menu menu) {
        return this.a.onPreparePanel(i, view, menu);
    }

    public final boolean o(int i, Menu menu) {
        return this.a.onMenuOpened(i, menu);
    }

    @Override // android.view.Window.Callback
    /* renamed from: n */
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.a.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    /* renamed from: v */
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    /* renamed from: w */
    public final void onWindowFocusChanged(boolean z) {
        this.a.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    /* renamed from: j */
    public final void onAttachedToWindow() {
        this.a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    /* renamed from: m */
    public final void onDetachedFromWindow() {
        this.a.onDetachedFromWindow();
    }

    public final void p(int i, Menu menu) {
        this.a.onPanelClosed(i, menu);
    }

    @Override // android.view.Window.Callback
    /* renamed from: t */
    public final boolean onSearchRequested() {
        return this.a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    /* renamed from: i */
    public final void onActionModeStarted(ActionMode actionMode) {
        this.a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    /* renamed from: h */
    public final void onActionModeFinished(ActionMode actionMode) {
        this.a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    /* renamed from: u */
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return this.a.onSearchRequested(searchEvent);
    }

    public final ActionMode x(ActionMode.Callback callback, int i) {
        return this.a.onWindowStartingActionMode(callback, i);
    }

    public final void s(List list, Menu menu, int i) {
        this.a.onProvideKeyboardShortcuts(list, menu, i);
    }

    @Override // android.view.Window.Callback
    /* renamed from: q */
    public final void onPointerCaptureChanged(boolean z) {
        this.a.onPointerCaptureChanged(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0140, code lost:            if (r10.isLaidOut() != false) goto L400;     */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r10, int r11) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.WindowCallbackC11155wf.onWindowStartingActionMode(android.view.ActionMode$Callback, int):android.view.ActionMode");
    }

    public WindowCallbackC11155wf(LayoutInflaterFactory2C0545Ef layoutInflaterFactory2C0545Ef, Window.Callback callback) {
        this.k = layoutInflaterFactory2C0545Ef;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.a = callback;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.i) {
            return this.a.dispatchKeyEvent(keyEvent);
        }
        return this.k.u(keyEvent) || c(keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:            if (r6 != false) goto L132;     */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004e  */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = r5.d(r6)
            r1 = 1
            if (r0 != 0) goto L4f
            int r0 = r6.getKeyCode()
            Ef r2 = r5.k
            r2.B()
            J4 r3 = r2.n
            r4 = 0
            if (r3 == 0) goto L1c
            boolean r0 = r3.j(r0, r6)
            if (r0 == 0) goto L1c
            goto L48
        L1c:
            Cf r0 = r2.M
            if (r0 == 0) goto L31
            int r3 = r6.getKeyCode()
            boolean r0 = r2.E(r0, r3, r6)
            if (r0 == 0) goto L31
            Cf r6 = r2.M
            if (r6 == 0) goto L48
            r6.l = r1
            goto L48
        L31:
            Cf r0 = r2.M
            if (r0 != 0) goto L4a
            Cf r0 = r2.z(r4)
            r2.F(r0, r6)
            int r3 = r6.getKeyCode()
            boolean r6 = r2.E(r0, r3, r6)
            r0.k = r4
            if (r6 == 0) goto L4a
        L48:
            r6 = r1
            goto L4b
        L4a:
            r6 = r4
        L4b:
            if (r6 == 0) goto L4e
            goto L4f
        L4e:
            r1 = r4
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.WindowCallbackC11155wf.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof BS1)) {
            return k(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        IO3 io3 = this.g;
        if (io3 != null) {
            View view = i == 0 ? new View(io3.a.a.a.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return l(i);
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.h) {
            this.a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        BS1 bs1 = menu instanceof BS1 ? (BS1) menu : null;
        if (i == 0 && bs1 == null) {
            return false;
        }
        if (bs1 != null) {
            bs1.x = true;
        }
        IO3 io3 = this.g;
        if (io3 != null) {
            if (i == 0) {
                JO3 jo3 = io3.a;
                if (!jo3.d) {
                    jo3.a.l = true;
                    jo3.d = true;
                }
            } else {
                io3.getClass();
            }
        }
        boolean r = r(i, view, menu);
        if (bs1 != null) {
            bs1.x = false;
        }
        return r;
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        o(i, menu);
        LayoutInflaterFactory2C0545Ef layoutInflaterFactory2C0545Ef = this.k;
        if (i == 108) {
            layoutInflaterFactory2C0545Ef.B();
            J4 j4 = layoutInflaterFactory2C0545Ef.n;
            if (j4 != null) {
                j4.c(true);
            }
        } else {
            layoutInflaterFactory2C0545Ef.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.j) {
            this.a.onPanelClosed(i, menu);
            return;
        }
        p(i, menu);
        LayoutInflaterFactory2C0545Ef layoutInflaterFactory2C0545Ef = this.k;
        if (i == 108) {
            layoutInflaterFactory2C0545Ef.B();
            J4 j4 = layoutInflaterFactory2C0545Ef.n;
            if (j4 != null) {
                j4.c(false);
                return;
            }
            return;
        }
        if (i == 0) {
            C0285Cf z = layoutInflaterFactory2C0545Ef.z(i);
            if (z.m) {
                layoutInflaterFactory2C0545Ef.s(z, false);
                return;
            }
            return;
        }
        layoutInflaterFactory2C0545Ef.getClass();
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        BS1 bs1 = this.k.z(0).h;
        if (bs1 != null) {
            s(list, bs1, i);
        } else {
            s(list, menu, i);
        }
    }

    public final void a(Window.Callback callback) {
        try {
            this.h = true;
            callback.onContentChanged();
        } finally {
            this.h = false;
        }
    }
}
